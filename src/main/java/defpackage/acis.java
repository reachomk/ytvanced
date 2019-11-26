package defpackage;

import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: acis */
final class acis {
    public final ByteBuffer a = ByteBuffer.allocate(11);
    public Thread b;
    public volatile boolean c;
    public final SparseArray d = new SparseArray();
    public int e = 128;
    public ByteBuffer f = ByteBuffer.allocate(128);
    public acjb g;
    public volatile Handler h;
    public int i;
    public int j;
    public final Object k = new Object();
    public final Runnable l = new aciu(this);
    private final ExecutorService m = Executors.newCachedThreadPool();
    private final SocketChannel n;
    private final ByteBuffer o;
    private final SparseArray p = new SparseArray();
    private volatile int q;
    private boolean r;

    acis(SocketChannel socketChannel) {
        this.n = socketChannel;
        this.o = ByteBuffer.allocate(8);
        this.o.order(ByteOrder.BIG_ENDIAN);
    }

    public final byte a() {
        this.o.clear();
        this.o.limit(1);
        a(this.o);
        this.o.flip();
        return this.o.get();
    }

    private final void a(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() > 0) {
            if (!this.n.isConnected() || this.n.read(byteBuffer) < 0) {
                throw new IOException("socket closed");
            }
        }
    }

    public final int b() {
        this.o.clear();
        this.o.limit(4);
        a(this.o);
        this.o.flip();
        return this.o.getInt();
    }

    public final void a(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        byteBuffer.limit(i + i2);
        a(byteBuffer);
    }

    public final synchronized void a(int i) {
        this.q = i;
        this.r = false;
        d(0);
    }

    public final Future b(int i) {
        acjd acjd = (acjd) this.p.get(i);
        if (acjd == null || acjd.a != null) {
            acjd = new acjd();
            acjd.b = new CountDownLatch(1);
            this.p.put(i, acjd);
            return this.m.submit(new aciv(acjd));
        }
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("Transaction already in progress: ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void c(int i) {
        this.p.remove(i);
    }

    public final int a(acja acja) {
        String str = "RtmpInputStream";
        if (acja.g == 0) {
            acja.g = acja.b;
        }
        byte[] bArr = acja.i;
        if (bArr == null || bArr.length < acja.b) {
            acja.i = new byte[acja.b];
            acja.j = ByteBuffer.wrap(acja.i);
            acja.k = new ByteArrayInputStream(acja.i);
            acja.l = new DataInputStream(acja.k);
        }
        int min = Math.min(acja.g, this.e);
        if (min > 0) {
            a(acja.j, acja.b - acja.g, min);
        }
        int i = acja.g - min;
        acja.g = i;
        if (i <= 0) {
            Object readUTF;
            acja.g = 0;
            acja.k.reset();
            acil acil = new acil(acja.l);
            try {
                acil.a(2);
                readUTF = acil.a.readUTF();
            } catch (ProtocolException unused) {
                Log.e(str, "Skipping AMF message without a command");
                readUTF = null;
            }
            String str2 = "status";
            String str3 = "code";
            String str4 = "level";
            Object c;
            Map map;
            acjd acjd;
            if ("_result".equals(readUTF)) {
                int a = (int) acil.a();
                acjd acjd2 = (acjd) this.p.get(a);
                if (acjd2 == null) {
                    StringBuilder stringBuilder = new StringBuilder(35);
                    stringBuilder.append("No pending transaction: ");
                    stringBuilder.append(a);
                    Log.e(str, stringBuilder.toString());
                } else {
                    acjd2.a = new acjc();
                    acjd2.a.a = 0;
                    Object c2 = acil.c();
                    c = acil.c();
                    if (c2 == null && (c instanceof Double)) {
                        acjd2.a.c = ((Double) c).intValue();
                    } else if ((c2 instanceof Map) && (c instanceof Map)) {
                        map = (Map) c;
                        c2 = map.get(str4);
                        c = map.get(str3);
                        if ((c2 instanceof String) && str2.equals(c2) && (c instanceof String)) {
                            acjd2.a.b = (String) c;
                        }
                    }
                    acjd2.b.countDown();
                }
            } else if ("onStatus".equals(readUTF)) {
                acjd = (acjd) this.p.get(2);
                if (acjd == null) {
                    Log.e(str, "No pending transaction: 2");
                } else {
                    acjd.a = new acjc();
                    acjd.a.a = 0;
                    acil.a();
                    acil.a(5);
                    acil.a(3);
                    map = acil.b();
                    Object obj = map.get(str4);
                    c = map.get(str3);
                    if ((obj instanceof String) && str2.equals(obj) && (c instanceof String)) {
                        acjd.a.b = (String) c;
                    }
                    acjd.b.countDown();
                }
            } else if ("_error".equals(readUTF)) {
                acjd = (acjd) this.p.get((int) acil.a());
                if (acjd != null) {
                    acjd.a = new acjc();
                    acjd.a.a = 1;
                    acjd.b.countDown();
                }
            } else {
                String valueOf = String.valueOf(readUTF);
                String str5 = "Ignoring unrecognized AMF command: ";
                Log.e(str, valueOf.length() == 0 ? new String(str5) : str5.concat(valueOf));
            }
        }
        return min;
    }

    public final int b(acja acja) {
        amqw.b(this.f.capacity() == this.e);
        int i = acja.g;
        if (i == 0) {
            i = acja.b;
            acja.g = i;
            acja.f = true;
        }
        i = Math.min(i, this.e);
        if (i > 0) {
            a(this.f, 0, i);
        }
        int i2 = acja.g - i;
        acja.g = i2;
        if (i2 <= 0) {
            acja.g = 0;
            acja.f = false;
        }
        return i;
    }

    public final synchronized void a(Throwable th) {
        if (this.h != null) {
            this.h.post(new acix(this, th));
        }
    }

    public final synchronized void d(int i) {
        int i2 = this.i + i;
        this.i = i2;
        if (i2 - this.q >= this.j && !this.r) {
            this.r = true;
            if (this.h != null) {
                this.h.post(new aciw(this));
            }
        }
    }

    public final synchronized void e(int i) {
        if (this.h != null) {
            this.h.post(new aciz(this, i));
        }
    }

    public final synchronized void a(int i, int i2) {
        if (this.h != null) {
            this.h.post(new aciy(this, i, i2));
        }
    }
}

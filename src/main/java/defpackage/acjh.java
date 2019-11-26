package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.NetworkInfo;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: acjh */
final class acjh {
    public final ByteBuffer a;
    public final acin b = new acin();
    public final acim c;
    public final acjl d;
    public final achn e;
    public int f = 128;
    public long g;
    public long h;
    public final String i;
    public boolean j;
    public boolean k;
    public Thread l;
    public volatile boolean m;
    public acji n;
    public Handler o;
    public boolean p;
    public boolean q;
    public int r;
    public final Object s;
    private final SocketChannel t;
    private final acip u;
    private int v;
    private int w;
    private byte[] x;
    private final byte[] y;

    acjh(Context context, SocketChannel socketChannel, achn achn, boolean z, long j, acjl acjl, acip acip, acim acim) {
        String str;
        String typeName;
        ByteBuffer.allocate(128);
        this.v = 256;
        this.w = 0;
        this.j = true;
        this.s = new Object();
        this.x = new byte[3];
        this.y = new byte[8192];
        this.u = acip;
        this.c = acim;
        this.e = (achn) amqw.a((Object) achn);
        this.k = z;
        this.t = (SocketChannel) amqw.a((Object) socketChannel);
        this.d = (acjl) amqw.a((Object) acjl);
        this.a = ByteBuffer.allocate(36);
        this.a.order(ByteOrder.BIG_ENDIAN);
        this.q = false;
        boolean z2 = (acim == null || acip == null) ? false : true;
        this.p = z2;
        HashMap hashMap = new HashMap();
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            str = "unknown";
        }
        Builder builder = new Builder();
        String str2 = "osVersion";
        str2 = "resetBackendPipelineDelayMs";
        String str3 = "speedTestBitsPerSecond";
        builder.appendQueryParameter("manufacturer", Build.MANUFACTURER).appendQueryParameter("model", Build.MODEL).appendQueryParameter(str2, VERSION.RELEASE).appendQueryParameter("protocol", "RTMP").appendQueryParameter("resetBackendPipeline", "0").appendQueryParameter(str2, Integer.toString(0)).appendQueryParameter(str3, Long.toString(j));
        for (Entry entry : hashMap.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        acdy acdy = new acdy(context);
        String valueOf = String.valueOf(builder.build().getQuery());
        String str4 = "extras?";
        if (valueOf.length() == 0) {
            valueOf = new String(str4);
        } else {
            valueOf = str4.concat(valueOf);
        }
        NetworkInfo activeNetworkInfo = acdy.a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                typeName = activeNetworkInfo.getTypeName();
            } else if (type == 0) {
                typeName = activeNetworkInfo.getSubtypeName();
            }
            this.i = TextUtils.join(":", Arrays.asList(new String[]{r7, str, typeName, valueOf}));
        }
        typeName = "UNKNOWN";
        this.i = TextUtils.join(":", Arrays.asList(new String[]{r7, str, typeName, valueOf}));
    }

    public final void a() {
        String str = "Exception closing piped input: ";
        String str2 = "RtmpOutputStream";
        byte[] bArr = new byte[8192];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (!this.m) {
            try {
                int read = this.c.read(bArr, 0, 8192);
                if (read >= 0) {
                    wrap.position(0);
                    wrap.limit(read);
                    this.r += read;
                    while (this.t.isConnected() && !this.m && wrap.remaining() > 0) {
                        this.t.write(wrap);
                    }
                }
            } catch (InterruptedIOException | ClosedByInterruptException e) {
                if (!this.m) {
                    Log.e(str2, "IO exception in network thread: ", e);
                }
                Thread.interrupted();
                try {
                    this.c.close();
                    return;
                } catch (Exception e2) {
                    Log.w(str2, str, e2);
                    return;
                }
            } catch (Throwable e3) {
                try {
                    this.c.close();
                } catch (Exception e4) {
                    Log.w(str2, str, e4);
                }
                throw e3;
            }
        }
        try {
            this.c.close();
        } catch (Exception e22) {
            Log.w(str2, str, e22);
        }
    }

    public final void a(int i, int i2) {
        String str = "RtmpOutputStream";
        if (i < 256) {
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("Ignoring small window size: ");
            stringBuilder.append(i);
            Log.e(str, stringBuilder.toString());
            return;
        }
        if (i2 == 2) {
            if (this.w == 0) {
                i2 = 0;
            } else {
                return;
            }
        }
        if (i2 == 0) {
            this.v = i;
        } else if (i2 == 1) {
            this.v = Math.min(this.v, i);
        } else {
            Log.e(str, "Ignoring unrecognized window size limit type");
            return;
        }
        this.w = i2;
        amqw.a(true);
        this.a.clear();
        acjh.a(this.a, 2, 0, 4, 5, 0);
        this.a.putInt(i);
        this.a.flip();
        b(this.a);
        b(4);
    }

    public final void b() {
        if (this.t.socket() != null) {
            OutputStream outputStream = this.t.socket().getOutputStream();
            if (outputStream != null) {
                outputStream.flush();
            }
        }
    }

    public final void a(int i) {
        this.a.clear();
        this.a.putInt(i);
        this.a.flip();
        b(this.a);
    }

    private final synchronized void a(Throwable th) {
        Handler handler = this.o;
        if (handler != null) {
            handler.post(new acjg(this, th));
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        byteBuffer.get(this.x, 0, 3);
        byte[] bArr = this.x;
        if (bArr[0] == (byte) 0 && bArr[1] == (byte) 0) {
            byte b = bArr[2];
            if (b == (byte) 1) {
                return;
            }
            if (b != (byte) 0) {
                byteBuffer.position(0);
                return;
            } else if (byteBuffer.get() != (byte) 1) {
                throw new ProtocolException("Unexpected value in NALU header");
            } else {
                return;
            }
        }
        byteBuffer.position(0);
    }

    public final void a(ByteBuffer byteBuffer, byte[] bArr, int i, int i2, int i3) {
        int remaining = byteBuffer.remaining();
        int length = bArr.length;
        remaining += length;
        if (byteBuffer.position() != 0) {
            remaining += 4;
        }
        this.a.clear();
        acjh.a(this.a, i, i3, remaining, i2, 1);
        i2 = length + 4;
        if (this.f > i2) {
            this.a.put(bArr);
            int remaining2 = byteBuffer.remaining();
            if (byteBuffer.position() != 0) {
                this.a.putInt(remaining2);
            } else {
                i2 = length;
            }
            this.a.flip();
            b(this.a);
            this.a.clear();
            acjh.a(this.a, 3, i);
            while (remaining2 > 0) {
                i2 = Math.min(remaining2, this.f - i2);
                byteBuffer.limit(byteBuffer.position() + i2);
                b(byteBuffer);
                remaining2 -= i2;
                if (remaining2 > 0) {
                    this.a.flip();
                    b(this.a);
                }
                i2 = 0;
            }
            b(remaining);
            return;
        }
        throw new ProtocolException("Chunk size is too small to hold FLV control tag and size");
    }

    public final void b(int i) {
        this.g += (long) i;
    }

    /* Access modifiers changed, original: final */
    public final void b(ByteBuffer byteBuffer) {
        if (this.q && this.p) {
            while (!this.m && byteBuffer.remaining() > 0) {
                int min = Math.min(byteBuffer.remaining(), this.y.length);
                byteBuffer.get(this.y, 0, min);
                this.u.write(this.y, 0, min);
            }
            return;
        }
        while (!this.m && byteBuffer.remaining() > 0) {
            if (this.t.isConnected()) {
                this.t.write(byteBuffer);
            } else {
                throw new IOException("socket closed");
            }
        }
    }

    static void a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        acjh.a(byteBuffer, 0, i);
        boolean a = acjf.a(i2);
        if (a) {
            byteBuffer.put((byte) -1);
            byteBuffer.put((byte) -1);
            byteBuffer.put((byte) -1);
        } else {
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) i2);
        }
        if (acjf.b(i3)) {
            byteBuffer.put((byte) (i3 >> 16));
            byteBuffer.put((byte) (i3 >> 8));
            byteBuffer.put((byte) i3);
            acjf.c();
            byteBuffer.put((byte) i4);
            acjf.d();
            byteBuffer.put((byte) i5);
            byteBuffer.put((byte) 0);
            byteBuffer.put((byte) 0);
            byteBuffer.put((byte) 0);
            if (a) {
                byteBuffer.putInt(i2);
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("Invalid length for RTMP message: ");
        stringBuilder.append(i3);
        throw new ProtocolException(stringBuilder.toString());
    }

    private static void a(ByteBuffer byteBuffer, int i, int i2) {
        acjf.a();
        acjf.b();
        byteBuffer.put(acjf.a(i, i2));
    }
}

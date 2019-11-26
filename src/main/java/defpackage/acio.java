package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;

/* renamed from: acio */
public final class acio implements acjb, acji {
    public SocketChannel a;
    public acir b;
    public int c = -1;
    public int d = -1;
    public acis e;
    public acjh f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public MediaFormat j;
    public MediaFormat k;
    private final Context l;
    private final achn m;
    private final Handler n;
    private final boolean o;
    private int p = 10;
    private final long q;

    acio(Context context, String str, int i, achn achn, boolean z, boolean z2, int i2, long j) {
        Object obj = (SocketChannel) SocketChannel.open().configureBlocking(false);
        amqw.a(obj);
        xvd.a(str);
        this.l = context;
        this.o = z;
        this.g = z2;
        this.q = j;
        this.a = obj;
        this.m = achn;
        if (Looper.myLooper() != null) {
            this.n = new Handler(Looper.myLooper());
        } else {
            this.n = new Handler(Looper.getMainLooper());
        }
        Socket socket = obj.socket();
        if (socket != null) {
            try {
                socket.setTcpNoDelay(true);
                socket.setTrafficClass(16);
                if (i2 > 0) {
                    socket.setSendBufferSize(i2 << 13);
                }
            } catch (Exception e) {
                Log.e("RtmpConnection", "Could not set socket options", e);
            }
            socket.getTrafficClass();
            socket.getTcpNoDelay();
            socket.getReceiveBufferSize();
            socket.getSendBufferSize();
            socket.getSoTimeout();
        }
        if (i < 0) {
            i = 1935;
        }
        this.a.connect(new InetSocketAddress(str, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0133  */
    public final synchronized void a() {
        /*
        r14 = this;
        monitor-enter(r14);
        r0 = r14.h;	 Catch:{ all -> 0x028a }
        if (r0 != 0) goto L_0x0288;
    L_0x0005:
        r0 = r14.a;	 Catch:{ all -> 0x028a }
        r0 = r0.isConnected();	 Catch:{ all -> 0x028a }
        r1 = 8;
        r2 = 1;
        if (r0 != 0) goto L_0x004d;
    L_0x0010:
        r0 = java.nio.channels.Selector.open();	 Catch:{ all -> 0x028a }
        r3 = r14.a;	 Catch:{ all -> 0x028a }
        r3.register(r0, r1);	 Catch:{ all -> 0x028a }
        r3 = 8000; // 0x1f40 float:1.121E-41 double:3.9525E-320;
        r3 = r0.select(r3);	 Catch:{ all -> 0x028a }
        r0.close();	 Catch:{ all -> 0x028a }
        if (r3 != r2) goto L_0x0045;
    L_0x0024:
        r0 = r14.a;	 Catch:{ all -> 0x028a }
        r0 = r0.finishConnect();	 Catch:{ all -> 0x028a }
        if (r0 == 0) goto L_0x003d;
    L_0x002c:
        r0 = r14.a;	 Catch:{ all -> 0x028a }
        r0 = r0.isConnected();	 Catch:{ all -> 0x028a }
        if (r0 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x004d;
    L_0x0035:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x028a }
        r1 = "RTMP connect failed";
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x003d:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x028a }
        r1 = "RTMP finish connect failed";
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x0045:
        r0 = new java.util.concurrent.TimeoutException;	 Catch:{ all -> 0x028a }
        r1 = "RTMP connect timed out";
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x004d:
        r0 = new acis;	 Catch:{ all -> 0x028a }
        r3 = r14.a;	 Catch:{ all -> 0x028a }
        r0.<init>(r3);	 Catch:{ all -> 0x028a }
        r14.e = r0;	 Catch:{ all -> 0x028a }
        r0 = r14.e;	 Catch:{ all -> 0x028a }
        r3 = r14.n;	 Catch:{ all -> 0x028a }
        r0.g = r14;	 Catch:{ all -> 0x028a }
        if (r3 != 0) goto L_0x006e;
    L_0x005e:
        r3 = android.os.Looper.myLooper();	 Catch:{ all -> 0x028a }
        if (r3 != 0) goto L_0x0068;
    L_0x0064:
        r3 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x028a }
    L_0x0068:
        r4 = new android.os.Handler;	 Catch:{ all -> 0x028a }
        r4.<init>(r3);	 Catch:{ all -> 0x028a }
        r3 = r4;
    L_0x006e:
        r0.h = r3;	 Catch:{ all -> 0x028a }
        r0 = r14.o;	 Catch:{ all -> 0x028a }
        r3 = 0;
        if (r0 == 0) goto L_0x007c;
    L_0x0075:
        r0 = r14.g;	 Catch:{ all -> 0x028a }
        if (r0 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x007c;
    L_0x007a:
        r0 = 1;
        goto L_0x007d;
    L_0x007c:
        r0 = 0;
    L_0x007d:
        r5 = r14.l;	 Catch:{ all -> 0x028a }
        r6 = r14.a;	 Catch:{ all -> 0x028a }
        r7 = r14.m;	 Catch:{ all -> 0x028a }
        r8 = r14.g;	 Catch:{ all -> 0x028a }
        r9 = r14.q;	 Catch:{ all -> 0x028a }
        r11 = defpackage.aciq.a(r5);	 Catch:{ all -> 0x028a }
        r4 = 0;
        if (r0 == 0) goto L_0x0095;
    L_0x008e:
        r12 = new acim;	 Catch:{ all -> 0x028a }
        r12.<init>();	 Catch:{ all -> 0x028a }
        r13 = r12;
        goto L_0x0096;
    L_0x0095:
        r13 = r4;
    L_0x0096:
        if (r0 == 0) goto L_0x009f;
    L_0x0098:
        r0 = new acip;	 Catch:{ all -> 0x028a }
        r0.<init>(r13);	 Catch:{ all -> 0x028a }
        r12 = r0;
        goto L_0x00a0;
    L_0x009f:
        r12 = r4;
    L_0x00a0:
        r0 = new acjh;	 Catch:{ all -> 0x028a }
        r4 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r11, r12, r13);	 Catch:{ all -> 0x028a }
        r14.f = r0;	 Catch:{ all -> 0x028a }
        r0 = r14.f;	 Catch:{ all -> 0x028a }
        r4 = r14.n;	 Catch:{ all -> 0x028a }
        r0.n = r14;	 Catch:{ all -> 0x028a }
        if (r4 != 0) goto L_0x00c0;
    L_0x00b0:
        r4 = android.os.Looper.myLooper();	 Catch:{ all -> 0x028a }
        if (r4 != 0) goto L_0x00ba;
    L_0x00b6:
        r4 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x028a }
    L_0x00ba:
        r5 = new android.os.Handler;	 Catch:{ all -> 0x028a }
        r5.<init>(r4);	 Catch:{ all -> 0x028a }
        r4 = r5;
    L_0x00c0:
        r0.o = r4;	 Catch:{ all -> 0x028a }
        r0 = r14.a;	 Catch:{ all -> 0x028a }
        r0.configureBlocking(r2);	 Catch:{ all -> 0x028a }
        r0 = r14.f;	 Catch:{ all -> 0x028a }
        r4 = r0.a;	 Catch:{ all -> 0x028a }
        r4.clear();	 Catch:{ all -> 0x028a }
        r4 = r0.a;	 Catch:{ all -> 0x028a }
        r5 = 3;
        r4.put(r5);	 Catch:{ all -> 0x028a }
        r4 = r0.a;	 Catch:{ all -> 0x028a }
        r4.flip();	 Catch:{ all -> 0x028a }
        r4 = r0.a;	 Catch:{ all -> 0x028a }
        r0.b(r4);	 Catch:{ all -> 0x028a }
        r0 = 1528; // 0x5f8 float:2.141E-42 double:7.55E-321;
        r4 = new byte[r0];	 Catch:{ all -> 0x028a }
        r6 = r14.f;	 Catch:{ all -> 0x028a }
        defpackage.amqw.a(r4);	 Catch:{ all -> 0x028a }
        defpackage.amqw.a(r2);	 Catch:{ all -> 0x028a }
        r7 = r6.a;	 Catch:{ all -> 0x028a }
        r7.clear();	 Catch:{ all -> 0x028a }
        r7 = r6.a;	 Catch:{ all -> 0x028a }
        r7.putInt(r3);	 Catch:{ all -> 0x028a }
        r7 = r6.a;	 Catch:{ all -> 0x028a }
        r7.putInt(r3);	 Catch:{ all -> 0x028a }
        r7 = r6.a;	 Catch:{ all -> 0x028a }
        r7.flip();	 Catch:{ all -> 0x028a }
        r7 = r6.a;	 Catch:{ all -> 0x028a }
        r6.b(r7);	 Catch:{ all -> 0x028a }
        r7 = new java.util.Random;	 Catch:{ all -> 0x028a }
        r8 = r6.e;	 Catch:{ all -> 0x028a }
        r8 = r8.e();	 Catch:{ all -> 0x028a }
        r7.<init>(r8);	 Catch:{ all -> 0x028a }
        r7.nextBytes(r4);	 Catch:{ all -> 0x028a }
        r7 = java.nio.ByteBuffer.wrap(r4);	 Catch:{ all -> 0x028a }
        r6.b(r7);	 Catch:{ all -> 0x028a }
        r6 = r14.f;	 Catch:{ all -> 0x028a }
        r6.b();	 Catch:{ all -> 0x028a }
        r6 = r14.a;	 Catch:{ all -> 0x028a }
        r6.configureBlocking(r3);	 Catch:{ all -> 0x028a }
        r6 = java.nio.channels.Selector.open();	 Catch:{ all -> 0x028a }
        r7 = r14.a;	 Catch:{ all -> 0x028a }
        r7.register(r6, r2);	 Catch:{ all -> 0x028a }
        r7 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r9 = r6.select(r7);	 Catch:{ all -> 0x028a }
        if (r9 != r2) goto L_0x0280;
    L_0x0133:
        r6.close();	 Catch:{ all -> 0x028a }
        r6 = r14.a;	 Catch:{ all -> 0x028a }
        r6.configureBlocking(r2);	 Catch:{ all -> 0x028a }
        r6 = r14.e;	 Catch:{ all -> 0x028a }
        r6 = r6.a();	 Catch:{ all -> 0x028a }
        if (r6 != r5) goto L_0x0267;
    L_0x0143:
        r5 = r14.a;	 Catch:{ all -> 0x028a }
        r5.configureBlocking(r3);	 Catch:{ all -> 0x028a }
        r5 = java.nio.channels.Selector.open();	 Catch:{ all -> 0x028a }
        r6 = r14.a;	 Catch:{ all -> 0x028a }
        r6.register(r5, r2);	 Catch:{ all -> 0x028a }
        r6 = r5.select(r7);	 Catch:{ all -> 0x028a }
        if (r6 != r2) goto L_0x025f;
    L_0x0157:
        r5.close();	 Catch:{ all -> 0x028a }
        r5 = r14.a;	 Catch:{ all -> 0x028a }
        r5.configureBlocking(r2);	 Catch:{ all -> 0x028a }
        r5 = r14.e;	 Catch:{ all -> 0x028a }
        r5 = r5.b();	 Catch:{ all -> 0x028a }
        r6 = r14.m;	 Catch:{ all -> 0x028a }
        r9 = r6.e();	 Catch:{ all -> 0x028a }
        r6 = r14.f;	 Catch:{ all -> 0x028a }
        r6.a(r5);	 Catch:{ all -> 0x028a }
        r5 = r14.f;	 Catch:{ all -> 0x028a }
        r6 = (int) r9;	 Catch:{ all -> 0x028a }
        r5.a(r6);	 Catch:{ all -> 0x028a }
        r5 = r14.e;	 Catch:{ all -> 0x028a }
        r5 = r5.b();	 Catch:{ all -> 0x028a }
    L_0x017c:
        r5 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r1 >= r5) goto L_0x018e;
    L_0x0180:
        r5 = r14.e;	 Catch:{ all -> 0x028a }
        r5 = r5.b();	 Catch:{ all -> 0x028a }
        r6 = r14.f;	 Catch:{ all -> 0x028a }
        r6.a(r5);	 Catch:{ all -> 0x028a }
        r1 = r1 + 4;
        goto L_0x017c;
    L_0x018e:
        r1 = r14.f;	 Catch:{ all -> 0x028a }
        r1.b();	 Catch:{ all -> 0x028a }
        r1 = r14.a;	 Catch:{ all -> 0x028a }
        r1.configureBlocking(r3);	 Catch:{ all -> 0x028a }
        r1 = java.nio.channels.Selector.open();	 Catch:{ all -> 0x028a }
        r5 = r14.a;	 Catch:{ all -> 0x028a }
        r5.register(r1, r2);	 Catch:{ all -> 0x028a }
        r5 = r1.select(r7);	 Catch:{ all -> 0x028a }
        if (r5 != r2) goto L_0x0257;
    L_0x01a7:
        r1.close();	 Catch:{ all -> 0x028a }
        r1 = r14.a;	 Catch:{ all -> 0x028a }
        r1.configureBlocking(r2);	 Catch:{ all -> 0x028a }
        r1 = r14.e;	 Catch:{ all -> 0x028a }
        defpackage.amqw.a(r4);	 Catch:{ all -> 0x028a }
        defpackage.amqw.a(r2);	 Catch:{ all -> 0x028a }
        r5 = r1.b();	 Catch:{ all -> 0x028a }
        if (r5 != 0) goto L_0x0239;
    L_0x01bd:
        r1.b();	 Catch:{ all -> 0x028a }
        r5 = 0;
    L_0x01c1:
        if (r5 >= r0) goto L_0x01ef;
    L_0x01c3:
        r6 = r1.a();	 Catch:{ all -> 0x028a }
        r7 = r4[r5];	 Catch:{ all -> 0x028a }
        if (r6 != r7) goto L_0x01ce;
    L_0x01cb:
        r5 = r5 + 1;
        goto L_0x01c1;
    L_0x01ce:
        r0 = new java.net.ProtocolException;	 Catch:{ all -> 0x028a }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x028a }
        r2 = 33;
        r1.<init>(r2);	 Catch:{ all -> 0x028a }
        r2 = "Data mismatch in S2: ";
        r1.append(r2);	 Catch:{ all -> 0x028a }
        r1.append(r6);	 Catch:{ all -> 0x028a }
        r2 = " != ";
        r1.append(r2);	 Catch:{ all -> 0x028a }
        r1.append(r7);	 Catch:{ all -> 0x028a }
        r1 = r1.toString();	 Catch:{ all -> 0x028a }
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x01ef:
        r0 = r14.e;	 Catch:{ all -> 0x028a }
        r1 = r0.k;	 Catch:{ all -> 0x028a }
        monitor-enter(r1);	 Catch:{ all -> 0x028a }
        r4 = r0.b;	 Catch:{ all -> 0x0236 }
        if (r4 == 0) goto L_0x01fa;
    L_0x01f8:
        monitor-exit(r1);	 Catch:{ all -> 0x0236 }
        goto L_0x020d;
    L_0x01fa:
        r0.c = r3;	 Catch:{ all -> 0x0236 }
        r4 = new java.lang.Thread;	 Catch:{ all -> 0x0236 }
        r5 = r0.l;	 Catch:{ all -> 0x0236 }
        r6 = "rtmpInput";
        r4.<init>(r5, r6);	 Catch:{ all -> 0x0236 }
        r0.b = r4;	 Catch:{ all -> 0x0236 }
        r0 = r0.b;	 Catch:{ all -> 0x0236 }
        r0.start();	 Catch:{ all -> 0x0236 }
        monitor-exit(r1);	 Catch:{ all -> 0x0236 }
    L_0x020d:
        r0 = r14.f;	 Catch:{ all -> 0x028a }
        r1 = r0.s;	 Catch:{ all -> 0x028a }
        monitor-enter(r1);	 Catch:{ all -> 0x028a }
        r4 = r0.l;	 Catch:{ all -> 0x0233 }
        if (r4 == 0) goto L_0x0218;
    L_0x0216:
        monitor-exit(r1);	 Catch:{ all -> 0x0233 }
        goto L_0x022f;
    L_0x0218:
        r4 = r0.p;	 Catch:{ all -> 0x0233 }
        if (r4 == 0) goto L_0x022c;
    L_0x021c:
        r4 = new acjj;	 Catch:{ all -> 0x0233 }
        r5 = "rtmpOutput";
        r4.<init>(r0, r5);	 Catch:{ all -> 0x0233 }
        r0.l = r4;	 Catch:{ all -> 0x0233 }
        r4 = r0.l;	 Catch:{ all -> 0x0233 }
        r4.start();	 Catch:{ all -> 0x0233 }
        r0.q = r2;	 Catch:{ all -> 0x0233 }
    L_0x022c:
        r0.m = r3;	 Catch:{ all -> 0x0233 }
        monitor-exit(r1);	 Catch:{ all -> 0x0233 }
    L_0x022f:
        r14.h = r2;	 Catch:{ all -> 0x028a }
        monitor-exit(r14);
        return;
    L_0x0233:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0233 }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x0236:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0236 }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x0239:
        r0 = new java.net.ProtocolException;	 Catch:{ all -> 0x028a }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x028a }
        r2 = 42;
        r1.<init>(r2);	 Catch:{ all -> 0x028a }
        r2 = "Timestamp mismatch in S2: ";
        r1.append(r2);	 Catch:{ all -> 0x028a }
        r1.append(r5);	 Catch:{ all -> 0x028a }
        r2 = " != 0";
        r1.append(r2);	 Catch:{ all -> 0x028a }
        r1 = r1.toString();	 Catch:{ all -> 0x028a }
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x0257:
        r0 = new java.util.concurrent.TimeoutException;	 Catch:{ all -> 0x028a }
        r1 = "RTMP handshake S0/S1 timed out";
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x025f:
        r0 = new java.util.concurrent.TimeoutException;	 Catch:{ all -> 0x028a }
        r1 = "RTMP handshake S0/S1 timed out";
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x0267:
        r0 = new java.net.ProtocolException;	 Catch:{ all -> 0x028a }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x028a }
        r2 = 26;
        r1.<init>(r2);	 Catch:{ all -> 0x028a }
        r2 = "Unknown RTMP version: ";
        r1.append(r2);	 Catch:{ all -> 0x028a }
        r1.append(r6);	 Catch:{ all -> 0x028a }
        r1 = r1.toString();	 Catch:{ all -> 0x028a }
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x0280:
        r0 = new java.util.concurrent.TimeoutException;	 Catch:{ all -> 0x028a }
        r1 = "RTMP handshake S0/S1 timed out";
        r0.<init>(r1);	 Catch:{ all -> 0x028a }
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x0288:
        monitor-exit(r14);
        return;
    L_0x028a:
        r0 = move-exception;
        monitor-exit(r14);
        goto L_0x028e;
    L_0x028d:
        throw r0;
    L_0x028e:
        goto L_0x028d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acio.a():void");
    }

    public final int b() {
        int i = this.p;
        this.p = i + 1;
        return i;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized int c() {
        int i;
        acjh acjh = this.f;
        if (acjh == null) {
            return -1;
        }
        i = 0;
        if (acjh.p) {
            try {
                i = acjh.c.available();
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                String str = "Could not determine bytes available in buffer: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                Log.e("RtmpOutputStream", valueOf);
            }
        }
        return i;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Pair d() {
        acjh acjh = this.f;
        if (acjh == null) {
            return null;
        }
        Pair pair;
        if (acjh.p) {
            pair = new Pair(Integer.valueOf((int) (acjh.g - acjh.h)), Integer.valueOf(acjh.r));
            acjh.r = 0;
        } else {
            int i = (int) (acjh.g - acjh.h);
            acjh.r = i;
            pair = new Pair(Integer.valueOf(i), Integer.valueOf(acjh.r));
        }
        acjh.h = acjh.g;
        return pair;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i) {
        acjh acjh = this.f;
        if (acjh != null) {
            if (acjh.p) {
                acjh.c.a(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0076 A:{LOOP_START, SYNTHETIC, Splitter:B:56:0x0076, LOOP:3: B:56:0x0076->B:57:?} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0076 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0062 A:{LOOP_START, SYNTHETIC, Splitter:B:48:0x0062, LOOP:2: B:48:0x0062->B:49:?} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A:{LOOP_START, SYNTHETIC, Splitter:B:31:0x0040, LOOP:1: B:31:0x0040->B:32:?} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002c A:{LOOP_START, SYNTHETIC, Splitter:B:23:0x002c, LOOP:0: B:23:0x002c->B:24:?} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x002c */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:23|24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:31|32|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:48|49|50) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:56|57|58) */
    public final synchronized void e() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.h;	 Catch:{ all -> 0x009f }
        if (r0 == 0) goto L_0x009d;
    L_0x0005:
        r0 = r6.e;	 Catch:{ all -> 0x009f }
        r1 = r0.k;	 Catch:{ all -> 0x009f }
        monitor-enter(r1);	 Catch:{ all -> 0x009f }
        r2 = 1;
        r0.c = r2;	 Catch:{ all -> 0x009a }
        monitor-exit(r1);	 Catch:{ all -> 0x009a }
        r0 = r6.f;	 Catch:{ all -> 0x009f }
        r1 = r0.s;	 Catch:{ all -> 0x009f }
        monitor-enter(r1);	 Catch:{ all -> 0x009f }
        r0.m = r2;	 Catch:{ all -> 0x0097 }
        monitor-exit(r1);	 Catch:{ all -> 0x0097 }
        r0 = r6.a;	 Catch:{ all -> 0x009f }
        r0.close();	 Catch:{ all -> 0x009f }
        r0 = r6.e;	 Catch:{ all -> 0x009f }
        r1 = r0.c;	 Catch:{ all -> 0x009f }
        defpackage.amqw.b(r1);	 Catch:{ all -> 0x009f }
        r1 = r0.k;	 Catch:{ all -> 0x009f }
        monitor-enter(r1);	 Catch:{ all -> 0x009f }
        r2 = r0.b;	 Catch:{ all -> 0x0094 }
        r3 = 0;
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 == 0) goto L_0x0053;
    L_0x002c:
        r2 = r0.b;	 Catch:{ InterruptedException -> 0x002c }
        r2.join(r4);	 Catch:{ InterruptedException -> 0x002c }
        r2 = r0.b;	 Catch:{ all -> 0x0094 }
        if (r2 == 0) goto L_0x0051;
    L_0x0035:
        r2 = r2.isAlive();	 Catch:{ all -> 0x0094 }
        if (r2 == 0) goto L_0x0051;
    L_0x003b:
        r2 = r0.b;	 Catch:{ all -> 0x0094 }
        r2.interrupt();	 Catch:{ all -> 0x0094 }
    L_0x0040:
        r2 = r0.b;	 Catch:{ InterruptedException -> 0x0040 }
        r2.join(r4);	 Catch:{ InterruptedException -> 0x0040 }
        r2 = r0.b;	 Catch:{ all -> 0x0094 }
        if (r2 == 0) goto L_0x0051;
    L_0x0049:
        r2 = r2.isAlive();	 Catch:{ all -> 0x0094 }
        if (r2 != 0) goto L_0x0051;
    L_0x004f:
        r0.b = r3;	 Catch:{ all -> 0x0094 }
    L_0x0051:
        monitor-exit(r1);	 Catch:{ all -> 0x0094 }
        goto L_0x0054;
    L_0x0053:
        monitor-exit(r1);	 Catch:{ all -> 0x0094 }
    L_0x0054:
        r0 = r6.f;	 Catch:{ all -> 0x009f }
        r1 = r0.m;	 Catch:{ all -> 0x009f }
        defpackage.amqw.b(r1);	 Catch:{ all -> 0x009f }
        r1 = r0.s;	 Catch:{ all -> 0x009f }
        monitor-enter(r1);	 Catch:{ all -> 0x009f }
        r2 = r0.l;	 Catch:{ all -> 0x0091 }
        if (r2 == 0) goto L_0x0089;
    L_0x0062:
        r2 = r0.l;	 Catch:{ InterruptedException -> 0x0062 }
        r2.join(r4);	 Catch:{ InterruptedException -> 0x0062 }
        r2 = r0.l;	 Catch:{ all -> 0x0091 }
        if (r2 == 0) goto L_0x0087;
    L_0x006b:
        r2 = r2.isAlive();	 Catch:{ all -> 0x0091 }
        if (r2 == 0) goto L_0x0087;
    L_0x0071:
        r2 = r0.l;	 Catch:{ all -> 0x0091 }
        r2.interrupt();	 Catch:{ all -> 0x0091 }
    L_0x0076:
        r2 = r0.l;	 Catch:{ InterruptedException -> 0x0076 }
        r2.join(r4);	 Catch:{ InterruptedException -> 0x0076 }
        r2 = r0.l;	 Catch:{ all -> 0x0091 }
        if (r2 == 0) goto L_0x0087;
    L_0x007f:
        r2 = r2.isAlive();	 Catch:{ all -> 0x0091 }
        if (r2 != 0) goto L_0x0087;
    L_0x0085:
        r0.l = r3;	 Catch:{ all -> 0x0091 }
    L_0x0087:
        monitor-exit(r1);	 Catch:{ all -> 0x0091 }
        goto L_0x008a;
    L_0x0089:
        monitor-exit(r1);	 Catch:{ all -> 0x0091 }
    L_0x008a:
        r0 = 0;
        r6.h = r0;	 Catch:{ all -> 0x009f }
        r6.i = r0;	 Catch:{ all -> 0x009f }
        monitor-exit(r6);
        return;
    L_0x0091:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x0094:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0094 }
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0097 }
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x009a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x009a }
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x009d:
        monitor-exit(r6);
        return;
    L_0x009f:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acio.e():void");
    }

    public final synchronized void f() {
        if (this.h) {
            e();
        }
        this.a = null;
        this.e = null;
        this.f = null;
    }

    public final void a(Throwable th) {
        Log.e("RtmpConnection", "RTMP output stream experienced an error", th);
        acir acir = this.b;
        if (acir != null) {
            acir.k();
        }
    }

    public final void b(Throwable th) {
        Log.e("RtmpConnection", "RTMP input stream experienced an error", th);
        acir acir = this.b;
        if (acir != null) {
            acir.k();
        }
    }

    public final void g() {
        acjh acjh = this.f;
        if (acjh != null) {
            acjh.b(0);
        }
    }

    public final void b(int i) {
        acjh acjh = this.f;
        if (acjh != null) {
            try {
                amqw.a(true);
                acjh.a.clear();
                acjh.a(acjh.a, 2, 0, 4, 3, 0);
                acjh.a.putInt(i);
                acjh.a.flip();
                acjh.b(acjh.a);
                acjh.b(4);
                acis acis = this.e;
                if (acis != null) {
                    acis.a(i);
                }
            } catch (Exception e) {
                Log.e("RtmpConnection", "Error sending acknowledgment", e);
                acir acir = this.b;
                if (acir != null) {
                    acir.k();
                }
            }
        }
    }

    public final void a(int i, int i2) {
        acjh acjh = this.f;
        if (acjh != null) {
            try {
                acjh.a(i, i2);
            } catch (Exception e) {
                Log.e("RtmpConnection", "Error setting window size", e);
                acir acir = this.b;
                if (acir != null) {
                    acir.k();
                }
            }
        }
    }
}

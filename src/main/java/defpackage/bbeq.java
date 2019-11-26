package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: bbeq */
public final class bbeq implements bbbw {
    public final bbhy a;
    private final bber b;
    private int c = -1;
    private bbhv d;
    private basn e = baso.a;
    private final boolean f = true;
    private final bbes g = new bbes(this);
    private final byte[] h = new byte[5];
    private final bbho i;
    private boolean j;
    private int k;
    private int l = -1;
    private long m;

    public bbeq(bber bber, bbhy bbhy, bbho bbho) {
        this.b = (bber) amqw.a((Object) bber, (Object) "sink");
        this.a = (bbhy) amqw.a((Object) bbhy, (Object) "bufferAllocator");
        this.i = (bbho) amqw.a((Object) bbho, (Object) "statsTraceCtx");
    }

    public final void a(int i) {
        amqw.b(this.c == -1, (Object) "max size already set");
        this.c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db A:{Catch:{ all -> 0x007e, IOException -> 0x0158, RuntimeException -> 0x0148 }} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085 A:{Catch:{ all -> 0x007e, IOException -> 0x0158, RuntimeException -> 0x0148 }} */
    public final void a(java.io.InputStream r15) {
        /*
        r14 = this;
        r0 = "Failed to frame message";
        r1 = r14.j;
        if (r1 != 0) goto L_0x0168;
    L_0x0006:
        r1 = r14.k;
        r2 = 1;
        r1 = r1 + r2;
        r14.k = r1;
        r1 = r14.l;
        r1 = r1 + r2;
        r14.l = r1;
        r3 = 0;
        r14.m = r3;
        r1 = r14.i;
        r1.a();
        r1 = r14.f;
        r3 = 0;
        if (r1 == 0) goto L_0x0028;
    L_0x001f:
        r1 = r14.e;
        r4 = defpackage.baso.a;
        if (r1 != r4) goto L_0x0026;
    L_0x0025:
        goto L_0x0028;
    L_0x0026:
        r1 = 1;
        goto L_0x0029;
    L_0x0028:
        r1 = 0;
    L_0x0029:
        r4 = r15 instanceof defpackage.batw;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r5 = -1;
        if (r4 != 0) goto L_0x0035;
    L_0x002e:
        r4 = r15 instanceof java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        if (r4 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0035;
    L_0x0033:
        r4 = -1;
        goto L_0x0039;
    L_0x0035:
        r4 = r15.available();	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
    L_0x0039:
        r6 = "message too large %d > %d";
        r7 = 2;
        if (r4 == 0) goto L_0x0083;
    L_0x003e:
        if (r1 != 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0083;
    L_0x0041:
        r1 = new bbep;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1.<init>(r14);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r8 = r14.e;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r8 = r8.a(r1);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = defpackage.bbeq.a(r15, r8);	 Catch:{ all -> 0x007e }
        r8.close();	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r8 = r14.c;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        if (r8 >= 0) goto L_0x0058;
    L_0x0057:
        goto L_0x005a;
    L_0x0058:
        if (r15 > r8) goto L_0x005f;
    L_0x005a:
        r14.a(r1, r2);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        goto L_0x00ee;
    L_0x005f:
        r1 = defpackage.bavx.g;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r4 = new java.lang.Object[r7];	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = java.lang.Integer.valueOf(r15);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r4[r3] = r15;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = r14.c;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = java.lang.Integer.valueOf(r15);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r4[r2] = r15;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = java.lang.String.format(r6, r4);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = r1.a(r15);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = r15.b();	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        throw r15;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
    L_0x007e:
        r15 = move-exception;
        r8.close();	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        throw r15;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
    L_0x0083:
        if (r4 == r5) goto L_0x00db;
    L_0x0085:
        r8 = (long) r4;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r14.m = r8;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1 = r14.c;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        if (r1 >= 0) goto L_0x008d;
    L_0x008c:
        goto L_0x008f;
    L_0x008d:
        if (r4 > r1) goto L_0x00bc;
    L_0x008f:
        r1 = r14.h;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1 = java.nio.ByteBuffer.wrap(r1);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1.put(r3);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1.putInt(r4);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r6 = r14.d;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        if (r6 != 0) goto L_0x00ac;
    L_0x009f:
        r6 = r14.a;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r8 = r1.position();	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r8 = r8 + r4;
        r6 = r6.a(r8);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r14.d = r6;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
    L_0x00ac:
        r6 = r14.h;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1 = r1.position();	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r14.a(r6, r3, r1);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1 = r14.g;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = defpackage.bbeq.a(r15, r1);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        goto L_0x00ee;
    L_0x00bc:
        r15 = defpackage.bavx.g;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1 = new java.lang.Object[r7];	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1[r3] = r4;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r3 = r14.c;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1[r2] = r3;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1 = java.lang.String.format(r6, r1);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = r15.a(r1);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = r15.b();	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        throw r15;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
    L_0x00db:
        r1 = new bbep;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r1.<init>(r14);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = defpackage.bbeq.a(r15, r1);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r8 = r14.c;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        if (r8 >= 0) goto L_0x00e9;
    L_0x00e8:
        goto L_0x00eb;
    L_0x00e9:
        if (r15 > r8) goto L_0x0129;
    L_0x00eb:
        r14.a(r1, r3);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
    L_0x00ee:
        if (r4 != r5) goto L_0x00f1;
    L_0x00f0:
        goto L_0x00f3;
    L_0x00f1:
        if (r15 != r4) goto L_0x010a;
    L_0x00f3:
        r12 = (long) r15;
        r15 = r14.i;
        r15.a(r12);
        r15 = r14.i;
        r0 = r14.m;
        r15.b(r0);
        r8 = r14.i;
        r9 = r14.l;
        r10 = r14.m;
        r8.a(r9, r10, r12);
        return;
    L_0x010a:
        r0 = new java.lang.Object[r7];
        r15 = java.lang.Integer.valueOf(r15);
        r0[r3] = r15;
        r15 = java.lang.Integer.valueOf(r4);
        r0[r2] = r15;
        r15 = "Message length inaccurate %s != %s";
        r15 = java.lang.String.format(r15, r0);
        r0 = defpackage.bavx.i;
        r15 = r0.a(r15);
        r15 = r15.b();
        throw r15;
    L_0x0129:
        r1 = defpackage.bavx.g;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r4 = new java.lang.Object[r7];	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = java.lang.Integer.valueOf(r15);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r4[r3] = r15;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = r14.c;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = java.lang.Integer.valueOf(r15);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r4[r2] = r15;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = java.lang.String.format(r6, r4);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = r1.a(r15);	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        r15 = r15.b();	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
        throw r15;	 Catch:{ IOException -> 0x0158, RuntimeException -> 0x0148 }
    L_0x0148:
        r15 = move-exception;
        r1 = defpackage.bavx.i;
        r0 = r1.a(r0);
        r15 = r0.b(r15);
        r15 = r15.b();
        throw r15;
    L_0x0158:
        r15 = move-exception;
        r1 = defpackage.bavx.i;
        r0 = r1.a(r0);
        r15 = r0.b(r15);
        r15 = r15.b();
        throw r15;
    L_0x0168:
        r15 = new java.lang.IllegalStateException;
        r0 = "Framer already closed";
        r15.<init>(r0);
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbeq.a(java.io.InputStream):void");
    }

    private final void a(bbep bbep, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(this.h);
        wrap.put(z);
        int i = 0;
        for (bbhv b : bbep.a) {
            i += b.b();
        }
        wrap.putInt(i);
        bbhv a = this.a.a(5);
        a.a(this.h, 0, wrap.position());
        if (i == 0) {
            this.d = a;
            return;
        }
        this.b.a(a, false, false);
        this.k = 1;
        List list = bbep.a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            this.b.a((bbhv) list.get(i2), false, false);
        }
        this.d = (bbhv) list.get(list.size() - 1);
        this.m = (long) i;
    }

    private static int a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof bate) {
            return ((bate) inputStream).a(outputStream);
        }
        long a = bbcx.a(inputStream, outputStream);
        amqw.a(a <= 2147483647L, "Message size overflow: %s", a);
        return (int) a;
    }

    public final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            bbhv bbhv = this.d;
            if (bbhv != null && bbhv.a() == 0) {
                a(false, false);
            }
            if (this.d == null) {
                this.d = this.a.a(i2);
            }
            int min = Math.min(i2, this.d.a());
            this.d.a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    public final void a() {
        bbhv bbhv = this.d;
        if (bbhv != null && bbhv.b() > 0) {
            a(false, true);
        }
    }

    public final boolean b() {
        return this.j;
    }

    public final void c() {
        if (!this.j) {
            this.j = true;
            bbhv bbhv = this.d;
            if (bbhv != null && bbhv.b() == 0) {
                bbhv = this.d;
                if (bbhv != null) {
                    bbhv.c();
                    this.d = null;
                }
            }
            a(true, true);
        }
    }

    private final void a(boolean z, boolean z2) {
        bbhv bbhv = this.d;
        this.d = null;
        this.b.a(bbhv, z, z2);
        this.k = 0;
    }
}

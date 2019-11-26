package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* renamed from: nmu */
public class nmu extends nmi {
    private int A;
    private int B;
    private float C;
    public final nmy a;
    public boolean h;
    private final nnm j;
    private final long k;
    private final int l;
    private final int m;
    private Surface n;
    private boolean o;
    private long p;
    private long q;
    private int r;
    private int s;
    private int t;
    private float u;
    private int v;
    private int w;
    private int x;
    private float y;
    private int z;

    public nmu(Context context, nne nne, nmg nmg, Handler handler, nmy nmy) {
        this(context, nne, nmg, 100, null, false, handler, nmy, Integer.MAX_VALUE);
    }

    /* Access modifiers changed, original: protected */
    public boolean b(long j, long j2) {
        return j < -30000;
    }

    public nmu(Context context, nne nne, nmg nmg, long j, npz npz, boolean z, Handler handler, nmy nmy, int i) {
        super(nne, nmg, npz, z, handler, (nml) nmy);
        Context context2 = context;
        this.j = new nnm(context);
        this.l = 1;
        this.k = 1000 * j;
        this.a = nmy;
        this.m = i;
        this.p = -1;
        this.v = -1;
        this.w = -1;
        this.y = -1.0f;
        this.u = -1.0f;
        this.z = -1;
        this.A = -1;
        this.C = -1.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nmg nmg, nmx nmx) {
        String str = nmx.b;
        boolean z = false;
        if (nwt.b(str)) {
            if ("video/x-unknown".equals(str)) {
                z = true;
            } else if (nmg.a(str, false) == null) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, long j, boolean z) {
        super.a(i, j, z);
        if (z && this.k > 0) {
            this.p = (SystemClock.elapsedRealtime() * 1000) + this.k;
        }
        nnm nnm = this.j;
        nnm.h = false;
        if (nnm.b) {
            nnm.a.c.sendEmptyMessage(1);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(long j) {
        super.b(j);
        this.h = false;
        this.s = 0;
        this.p = -1;
    }

    /* Access modifiers changed, original: protected */
    public boolean d() {
        if (super.d() && (this.h || this.e == null || this.f == 2)) {
            this.p = -1;
            return true;
        } else if (this.p == -1) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() * 1000 < this.p) {
                return true;
            }
            this.p = -1;
            return false;
        }
    }

    /* Access modifiers changed, original: protected */
    public void i() {
        this.r = 0;
        this.q = SystemClock.elapsedRealtime();
    }

    /* Access modifiers changed, original: protected */
    public void j() {
        this.p = -1;
        u();
    }

    /* Access modifiers changed, original: protected */
    public void l() {
        this.v = -1;
        this.w = -1;
        this.y = -1.0f;
        this.u = -1.0f;
        this.z = -1;
        this.A = -1;
        this.C = -1.0f;
        nnm nnm = this.j;
        if (nnm.b) {
            nnm.a.c.sendEmptyMessage(2);
        }
        super.l();
    }

    public void a(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.n != surface) {
                this.n = surface;
                this.o = false;
                i = this.i;
                if (i == 2 || i == 3) {
                    q();
                    o();
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean p() {
        if (super.p()) {
            Surface surface = this.n;
            if (surface != null && surface.isValid()) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void a(android.media.MediaCodec r11, boolean r12, android.media.MediaFormat r13, android.media.MediaCrypto r14) {
        /*
        r10 = this;
        r0 = "max-input-size";
        r1 = r13.containsKey(r0);
        r2 = 0;
        if (r1 != 0) goto L_0x00ba;
    L_0x0009:
        r1 = "height";
        r1 = r13.getInteger(r1);
        if (r12 == 0) goto L_0x0021;
    L_0x0011:
        r3 = "max-height";
        r4 = r13.containsKey(r3);
        if (r4 == 0) goto L_0x0021;
    L_0x0019:
        r3 = r13.getInteger(r3);
        r1 = java.lang.Math.max(r1, r3);
    L_0x0021:
        r3 = "width";
        r3 = r13.getInteger(r3);
        if (r12 == 0) goto L_0x0039;
    L_0x0029:
        r12 = "max-width";
        r4 = r13.containsKey(r12);
        if (r4 == 0) goto L_0x0039;
    L_0x0031:
        r12 = r13.getInteger(r12);
        r3 = java.lang.Math.max(r1, r12);
    L_0x0039:
        r12 = "mime";
        r12 = r13.getString(r12);
        r4 = r12.hashCode();
        r5 = 5;
        r6 = 1;
        r7 = 4;
        r8 = 3;
        r9 = 2;
        switch(r4) {
            case -1664118616: goto L_0x007e;
            case -1662541442: goto L_0x0074;
            case 1187890754: goto L_0x006a;
            case 1331836730: goto L_0x0060;
            case 1599127256: goto L_0x0056;
            case 1599127257: goto L_0x004c;
            default: goto L_0x004b;
        };
    L_0x004b:
        goto L_0x0088;
    L_0x004c:
        r4 = "video/x-vnd.on2.vp9";
        r12 = r12.equals(r4);
        if (r12 == 0) goto L_0x0088;
    L_0x0054:
        r12 = 5;
        goto L_0x0089;
    L_0x0056:
        r4 = "video/x-vnd.on2.vp8";
        r12 = r12.equals(r4);
        if (r12 == 0) goto L_0x0088;
    L_0x005e:
        r12 = 3;
        goto L_0x0089;
    L_0x0060:
        r4 = "video/avc";
        r12 = r12.equals(r4);
        if (r12 == 0) goto L_0x0088;
    L_0x0068:
        r12 = 2;
        goto L_0x0089;
    L_0x006a:
        r4 = "video/mp4v-es";
        r12 = r12.equals(r4);
        if (r12 == 0) goto L_0x0088;
    L_0x0072:
        r12 = 1;
        goto L_0x0089;
    L_0x0074:
        r4 = "video/hevc";
        r12 = r12.equals(r4);
        if (r12 == 0) goto L_0x0088;
    L_0x007c:
        r12 = 4;
        goto L_0x0089;
    L_0x007e:
        r4 = "video/3gpp";
        r12 = r12.equals(r4);
        if (r12 == 0) goto L_0x0088;
    L_0x0086:
        r12 = 0;
        goto L_0x0089;
    L_0x0088:
        r12 = -1;
    L_0x0089:
        if (r12 == 0) goto L_0x00b1;
    L_0x008b:
        if (r12 == r6) goto L_0x00b1;
    L_0x008d:
        if (r12 == r9) goto L_0x009a;
    L_0x008f:
        if (r12 == r8) goto L_0x00b1;
    L_0x0091:
        if (r12 == r7) goto L_0x0096;
    L_0x0093:
        if (r12 == r5) goto L_0x0096;
    L_0x0095:
        goto L_0x00ba;
    L_0x0096:
        r3 = r3 * r1;
        r9 = 4;
        goto L_0x00b3;
    L_0x009a:
        r12 = defpackage.nxf.d;
        r4 = "BRAVIA 4K 2015";
        r12 = r4.equals(r12);
        if (r12 != 0) goto L_0x00ba;
    L_0x00a4:
        r3 = r3 + 15;
        r3 = r3 / 16;
        r1 = r1 + 15;
        r1 = r1 / 16;
        r3 = r3 * r1;
        r3 = r3 << 8;
        goto L_0x00b3;
    L_0x00b1:
        r3 = r3 * r1;
    L_0x00b3:
        r3 = r3 * 3;
        r9 = r9 + r9;
        r3 = r3 / r9;
        r13.setInteger(r0, r3);
    L_0x00ba:
        r12 = r10.n;
        r11.configure(r13, r12, r14, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmu.a(android.media.MediaCodec, boolean, android.media.MediaFormat, android.media.MediaCrypto):void");
    }

    /* Access modifiers changed, original: protected */
    public void a(nmz nmz) {
        super.a(nmz);
        nmx nmx = nmz.a;
        float f = nmx.m;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.u = f;
        int i = nmx.l;
        if (i == -1) {
            i = 0;
        }
        this.t = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        String str = "crop-right";
        String str2 = "crop-top";
        String str3 = "crop-bottom";
        String str4 = "crop-left";
        Object obj = null;
        if (mediaFormat.containsKey(str) && mediaFormat.containsKey(str4) && mediaFormat.containsKey(str3) && mediaFormat.containsKey(str2)) {
            obj = 1;
        }
        this.v = obj != null ? (mediaFormat.getInteger(str) - mediaFormat.getInteger(str4)) + 1 : mediaFormat.getInteger("width");
        this.w = obj != null ? (mediaFormat.getInteger(str3) - mediaFormat.getInteger(str2)) + 1 : mediaFormat.getInteger("height");
        this.y = this.u;
        if (nxf.a >= 21) {
            int i = this.t;
            if (i == 90 || i == 270) {
                i = this.v;
                this.v = this.w;
                this.w = i;
                this.y = 1.0f / this.y;
            }
        } else {
            this.x = this.t;
        }
        mediaCodec.setVideoScalingMode(this.l);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(MediaCodec mediaCodec, boolean z, nmx nmx, nmx nmx2) {
        boolean z2 = false;
        if (nmx2.b.equals(nmx.b)) {
            if (!z) {
                return (nmx.h == nmx2.h && nmx.i == nmx2.i) ? true : z2;
            } else {
                z2 = true;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    public boolean a(long r25, long r27, android.media.MediaCodec r29, java.nio.ByteBuffer r30, android.media.MediaCodec.BufferInfo r31, int r32, boolean r33) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r27;
        r3 = r29;
        r4 = r31;
        r5 = r32;
        r6 = 1;
        r7 = 0;
        if (r33 != 0) goto L_0x0138;
    L_0x000e:
        r8 = r0.h;
        r9 = 21;
        if (r8 != 0) goto L_0x0026;
    L_0x0014:
        r1 = defpackage.nxf.a;
        if (r1 < r9) goto L_0x0020;
    L_0x0018:
        r1 = java.lang.System.nanoTime();
        r0.a(r3, r5, r1);
        goto L_0x0023;
    L_0x0020:
        r0.c(r3, r5);
    L_0x0023:
        r0.s = r7;
        return r6;
    L_0x0026:
        r8 = r0.i;
        r10 = 3;
        if (r8 != r10) goto L_0x0136;
    L_0x002b:
        r10 = android.os.SystemClock.elapsedRealtime();
        r12 = r4.presentationTimeUs;
        r14 = java.lang.System.nanoTime();
        r12 = r12 - r25;
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10 = r10 * r16;
        r10 = r10 - r1;
        r12 = r12 - r10;
        r12 = r12 * r16;
        r12 = r12 + r14;
        r8 = r0.j;
        r10 = r4.presentationTimeUs;
        r6 = r10 * r16;
        r4 = r8.h;
        if (r4 == 0) goto L_0x0097;
    L_0x004a:
        r3 = r8.e;
        r18 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r18 == 0) goto L_0x005c;
    L_0x0050:
        r3 = r8.k;
        r18 = 1;
        r3 = r3 + r18;
        r8.k = r3;
        r3 = r8.g;
        r8.f = r3;
    L_0x005c:
        r3 = r8.k;
        r18 = 6;
        r20 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1));
        if (r20 < 0) goto L_0x008b;
    L_0x0064:
        r18 = r10;
        r9 = r8.j;
        r9 = r6 - r9;
        r9 = r9 / r3;
        r3 = r8.f;
        r3 = r3 + r9;
        r9 = r8.a(r3, r12);
        if (r9 == 0) goto L_0x007a;
    L_0x0074:
        r9 = 0;
        r8.h = r9;
        r3 = r6;
        r10 = r12;
        goto L_0x0087;
    L_0x007a:
        r9 = 0;
        r10 = r8.i;
        r10 = r10 + r3;
        r25 = r3;
        r3 = r8.j;
        r3 = r10 - r3;
        r10 = r3;
        r3 = r25;
    L_0x0087:
        r20 = r10;
        r9 = r3;
        goto L_0x009c;
    L_0x008b:
        r18 = r10;
        r9 = 0;
        r3 = r8.a(r6, r12);
        if (r3 == 0) goto L_0x0099;
    L_0x0094:
        r8.h = r9;
        goto L_0x0099;
    L_0x0097:
        r18 = r10;
    L_0x0099:
        r9 = r6;
        r20 = r12;
    L_0x009c:
        r3 = r8.h;
        r4 = 0;
        if (r3 != 0) goto L_0x00ab;
    L_0x00a2:
        r8.j = r6;
        r8.i = r12;
        r8.k = r4;
        r3 = 1;
        r8.h = r3;
    L_0x00ab:
        r6 = r18;
        r8.e = r6;
        r8.g = r9;
        r3 = r8.a;
        if (r3 == 0) goto L_0x00e2;
    L_0x00b5:
        r6 = r3.a;
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 == 0) goto L_0x00e2;
    L_0x00bb:
        r3 = r8.a;
        r3 = r3.a;
        r5 = r8.c;
        r9 = r20 - r3;
        r9 = r9 / r5;
        r9 = r9 * r5;
        r3 = r3 + r9;
        r7 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1));
        if (r7 > 0) goto L_0x00ce;
    L_0x00cb:
        r5 = r3 - r5;
        goto L_0x00d4;
    L_0x00ce:
        r5 = r5 + r3;
        r22 = r3;
        r3 = r5;
        r5 = r22;
    L_0x00d4:
        r9 = r3 - r20;
        r20 = r20 - r5;
        r7 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1));
        if (r7 >= 0) goto L_0x00dd;
    L_0x00dc:
        goto L_0x00de;
    L_0x00dd:
        r3 = r5;
    L_0x00de:
        r5 = r8.d;
        r20 = r3 - r5;
    L_0x00e2:
        r3 = r20;
        r5 = r3 - r14;
        r5 = r5 / r16;
        r1 = r0.b(r5, r1);
        if (r1 == 0) goto L_0x00f7;
    L_0x00ee:
        r1 = r29;
        r2 = r32;
        r0.b(r1, r2);
        r7 = 1;
        return r7;
    L_0x00f7:
        r1 = r29;
        r2 = r32;
        r7 = 1;
        r8 = defpackage.nxf.a;
        r9 = 21;
        if (r8 < r9) goto L_0x0110;
    L_0x0102:
        r8 = 50000; // 0xc350 float:7.0065E-41 double:2.47033E-319;
        r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x0134;
    L_0x0109:
        r0.a(r1, r2, r3);
        r1 = 0;
        r0.s = r1;
        return r7;
    L_0x0110:
        r7 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 >= 0) goto L_0x0134;
    L_0x0116:
        r7 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 <= 0) goto L_0x012c;
    L_0x011c:
        r7 = -10000; // 0xffffffffffffd8f0 float:NaN double:NaN;
        r5 = r5 + r7;
        r5 = r5 / r16;
        java.lang.Thread.sleep(r5);	 Catch:{ InterruptedException -> 0x0125 }
        goto L_0x012c;
    L_0x0125:
        r3 = java.lang.Thread.currentThread();
        r3.interrupt();
    L_0x012c:
        r0.c(r1, r2);
        r3 = 0;
        r0.s = r3;
        r4 = 1;
        return r4;
    L_0x0134:
        r3 = 0;
        return r3;
    L_0x0136:
        r3 = 0;
        return r3;
    L_0x0138:
        r1 = r3;
        r2 = r5;
        r3 = 0;
        r4 = 1;
        r0.a(r1, r2);
        r0.s = r3;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmu.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo, int, boolean):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, int i) {
        mediaCodec.releaseOutputBuffer(i, false);
        nxd.a();
        nlk nlk = this.b;
        nlk.g++;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(MediaCodec mediaCodec, int i) {
        mediaCodec.releaseOutputBuffer(i, false);
        nxd.a();
        nlk nlk = this.b;
        nlk.h++;
        this.r++;
        i = this.s + 1;
        this.s = i;
        nlk.i = Math.max(i, nlk.i);
        if (this.r == this.m) {
            u();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(MediaCodec mediaCodec, int i) {
        k();
        mediaCodec.releaseOutputBuffer(i, true);
        nxd.a();
        nlk nlk = this.b;
        nlk.f++;
        this.h = true;
        n();
    }

    private final void a(MediaCodec mediaCodec, int i, long j) {
        k();
        mediaCodec.releaseOutputBuffer(i, j);
        nxd.a();
        nlk nlk = this.b;
        nlk.f++;
        this.h = true;
        n();
    }

    private final void k() {
        Handler handler = this.d;
        if (handler != null && this.a != null) {
            int i = this.z;
            int i2 = this.v;
            if (i != i2 || this.A != this.w || this.B != this.x || this.C != this.y) {
                i = this.w;
                int i3 = this.x;
                float f = this.y;
                handler.post(new nmt(this, i2, i, i3, f));
                this.z = i2;
                this.A = i;
                this.B = i3;
                this.C = f;
            }
        }
    }

    private final void n() {
        Handler handler = this.d;
        if (handler != null && this.a != null && !this.o) {
            handler.post(new nmw(this, this.n));
            this.o = true;
        }
    }

    private final void u() {
        if (this.d != null && this.a != null && this.r != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.d.post(new nmv(this, this.r, elapsedRealtime - this.q));
            this.r = 0;
            this.q = elapsedRealtime;
        }
    }
}

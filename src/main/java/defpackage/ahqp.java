package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: ahqp */
public final class ahqp extends ahrn {
    private static final float m = (-ahsg.a);
    private int A;
    private int B;
    public final ahpx a;
    public final ahsf b;
    public boolean c;
    public aaju d = aaju.NOOP;
    public boolean e;
    public boolean f = true;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public ahwl k;
    private final ahpn n;
    private final ahpn o = ahpn.a();
    private final ahpn p;
    private final ahpn q;
    private final ahqo r;
    private final ahwk s;
    private final float[] t;
    private ahsr u;
    private ahrn v;
    private ahqn w = ahqn.RECTANGULAR;
    private afkm x;
    private ahsq y;
    private int z;

    ahqp(Handler handler, ahpn ahpn, ahpn ahpn2, ahsi ahsi, ahqo ahqo, ahwk ahwk, ahsq ahsq) {
        this.p = (ahpn) amqw.a((Object) ahpn);
        this.q = (ahpn) amqw.a((Object) ahpn2);
        this.n = ahpn.a();
        this.r = (ahqo) amqw.a((Object) ahqo);
        this.s = (ahwk) amqw.a((Object) ahwk);
        this.y = ahsq;
        this.a = new ahpx((Handler) amqw.a((Object) handler), ahsi);
        this.b = new ahsf(handler);
        this.a.b();
        this.e = true;
        a(aaju.NOOP, ahqn.RECTANGULAR);
        this.t = new float[16];
        this.k = (ahwl) ahwk.a(false).get();
    }

    public final void a(float f) {
        ahrn ahrn = this.v;
        if (ahrn != null) {
            ahrn.a(f);
        }
    }

    public final void b() {
        ahrn ahrn = this.v;
        if (ahrn != null) {
            ahrn.b();
            this.v = null;
        }
    }

    public final void d(ahnj ahnj) {
        ahrn ahrn = this.v;
        if (ahrn != null) {
            ahrn.d(ahnj);
        }
    }

    public final void a(ahse ahse) {
        if (this.f) {
            a(this.d, this.w);
        }
        if (this.e) {
            if (aaju.MESH.equals(this.d)) {
                float[] fArr = ahse.a;
                float[] fArr2 = this.t;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                float[] fArr3 = this.t;
                fArr3[12] = 0.0f;
                fArr3[13] = 0.0f;
                fArr3[14] = 0.0f;
                ahse = new ahse(fArr3, ahse.b, ahse.d, ahse.e, ahse.f);
            }
            ahrn ahrn = this.v;
            if (ahrn != null) {
                ahrn.a(ahse);
            }
        }
    }

    public final void bd_() {
        ahrn ahrn = this.v;
        if (ahrn != null) {
            ahrn.bd_();
        }
        ahpx ahpx = this.a;
        SurfaceTexture surfaceTexture = ahpx.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            ahpx.c = null;
            GLES20.glDeleteTextures(1, new int[]{ahpx.a}, 0);
            ahsl.b();
        }
        this.b.b();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015a  */
    public final void a(defpackage.aaju r13, defpackage.ahqn r14) {
        /*
        r12 = this;
        r0 = 3;
        r1 = new java.lang.Object[r0];
        r2 = 0;
        r1[r2] = r13;
        r3 = 1;
        r1[r3] = r14;
        r4 = r12.i;
        r4 = java.lang.Boolean.valueOf(r4);
        r5 = 2;
        r1[r5] = r4;
        r1 = r12.d;
        if (r13 != r1) goto L_0x0020;
    L_0x0016:
        r1 = r12.w;
        if (r14 != r1) goto L_0x0020;
    L_0x001a:
        r1 = r12.f;
        if (r1 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0020;
    L_0x001f:
        return;
    L_0x0020:
        r12.f = r2;
        r12.d = r13;
        r12.w = r14;
        r14 = r12.v;
        r1 = 0;
        if (r14 == 0) goto L_0x0035;
    L_0x002b:
        r14.bd_();
        r14 = r12.v;
        r14.b();
        r12.v = r1;
    L_0x0035:
        r12.d();
        r14 = r12.n;
        r4 = r14.b;
        android.opengl.Matrix.setIdentityM(r4, r2);
        r14.d();
        r14 = r12.c;
        if (r14 != 0) goto L_0x0049;
    L_0x0046:
        r14 = r12.a;
        goto L_0x004b;
    L_0x0049:
        r14 = r12.b;
    L_0x004b:
        r12.u = r14;
        r13 = r13.ordinal();
        r14 = 0;
        if (r13 == 0) goto L_0x0115;
    L_0x0054:
        if (r13 == r3) goto L_0x0111;
    L_0x0056:
        if (r13 == r5) goto L_0x010d;
    L_0x0058:
        if (r13 == r0) goto L_0x00e2;
    L_0x005a:
        r14 = 4;
        if (r13 == r14) goto L_0x0127;
    L_0x005d:
        r14 = 5;
        if (r13 != r14) goto L_0x00da;
    L_0x0060:
        r13 = r12.x;
        if (r13 != 0) goto L_0x0066;
    L_0x0064:
        goto L_0x0127;
    L_0x0066:
        r13 = r12.s;
        r14 = r12.u;
        r14 = r14.d();
        r13 = r13.a(r14);
        r13 = r13.get();
        r13 = (defpackage.ahwl) r13;
        r12.k = r13;
        r13 = r12.x;
        r13 = r13.b;
        r13 = r13.a();
        r5 = new ahsm;
        r14 = r13.b;
        r0 = r13.c;
        r13 = r13.a;
        r5.<init>(r14, r0, r13);
        r13 = r12.x;
        r14 = r13.c;
        if (r14 == 0) goto L_0x00bf;
    L_0x0093:
        r13 = r14.a();
        r6 = new ahsm;
        r14 = r13.b;
        r0 = r13.c;
        r13 = r13.a;
        r6.<init>(r14, r0, r13);
        r13 = new ahpk;
        r7 = r12.u;
        r14 = r12.x;
        r8 = r14.d;
        r9 = r12.n;
        r14 = r12.s;
        r0 = r7.d();
        r10 = r14.a(r0);
        r11 = r12.y;
        r4 = r13;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11);
        r12.v = r13;
        goto L_0x0127;
    L_0x00bf:
        r14 = new ahpk;
        r6 = r12.u;
        r7 = r13.d;
        r8 = r12.n;
        r13 = r12.s;
        r0 = r6.d();
        r9 = r13.a(r0);
        r10 = r12.y;
        r4 = r14;
        r4.<init>(r5, r6, r7, r8, r9, r10);
        r12.v = r14;
        goto L_0x0127;
    L_0x00da:
        r13 = new java.lang.UnsupportedOperationException;
        r14 = "VideoScene type not supported";
        r13.<init>(r14);
        throw r13;
    L_0x00e2:
        r13 = r12.i;
        if (r13 == 0) goto L_0x00f4;
    L_0x00e6:
        r13 = r12.n;
        r0 = defpackage.ahsg.a;
        r13.b(r14, r14, r0);
        r13 = r12.b(r5);
        r12.v = r13;
        goto L_0x0126;
    L_0x00f4:
        r13 = new ahpu;
        r14 = r12.s;
        r0 = r12.u;
        r0 = r0.d();
        r4 = new ahwq;
        r4.<init>(r14, r0);
        r14 = r12.u;
        r0 = r12.y;
        r13.<init>(r4, r14, r0);
        r12.v = r13;
        goto L_0x0127;
    L_0x010d:
        r12.a(r3);
        goto L_0x0127;
    L_0x0111:
        r12.a(r2);
        goto L_0x0127;
    L_0x0115:
        r13 = r12.i;
        if (r13 == 0) goto L_0x0127;
    L_0x0119:
        r13 = r12.n;
        r0 = defpackage.ahsg.a;
        r13.b(r14, r14, r0);
        r13 = r12.b(r2);
        r12.v = r13;
    L_0x0126:
        r2 = 1;
    L_0x0127:
        r13 = r12.v;
        if (r13 != 0) goto L_0x0156;
    L_0x012b:
        r13 = r12.s;
        r14 = r12.u;
        r14 = r14.d();
        r13 = r13.b(r14);
        r13 = r13.get();
        r13 = (defpackage.ahwl) r13;
        r12.k = r13;
        r13 = new ahpq;
        r14 = r12.s;
        r0 = r12.u;
        r0 = r0.d();
        r14 = r14.b(r0);
        r0 = r12.u;
        r4 = r12.y;
        r13.<init>(r14, r0, r4);
        r12.v = r13;
    L_0x0156:
        r13 = r12.r;
        if (r13 == 0) goto L_0x015d;
    L_0x015a:
        r13.a(r2);
    L_0x015d:
        r13 = r12.k;
        r4 = 0;
        r13.a(r3, r1, r4);
        r13 = r12.k;
        r14 = r12.A;
        r0 = r12.B;
        r1 = r12.z;
        r13.a(r14, r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahqp.a(aaju, ahqn):void");
    }

    public final void a(afkm afkm) {
        this.x = afkm;
        this.f = true;
    }

    public final void a(ahsq ahsq) {
        this.y = ahsq;
        ahrn ahrn = this.v;
        if (ahrn != null) {
            ahrn.a(ahsq);
        }
    }

    public final void c() {
        this.f = true;
        a(this.d, this.w);
    }

    private final void a(int i) {
        this.k = (ahwl) this.s.a(this.u.d()).get();
        ahsm a = ahsm.a(m);
        ahsr ahsr = this.u;
        this.v = new ahpk(a, ahsr, i, this.n, this.s.a(ahsr.d()), this.y);
    }

    private final ahpk b(int i) {
        this.k = (ahwl) this.s.a(this.u.d()).get();
        if (this.j) {
            float f = -ahsg.a;
            double abs = Math.abs(Math.atan((double) ((this.g * 0.5f) / f)));
            float f2 = (float) (abs + abs);
            float f3 = (this.h * f2) / this.g;
            if (f3 >= 1.5707964f) {
                f3 = 1.5707964f;
            }
            if (f2 >= 1.5707964f) {
                f2 = 1.5707964f;
            }
            this.n.b(0.0f, 0.0f, f);
            ahsm a = ahsm.a(f, f2, f3);
            ahsr ahsr = this.u;
            return new ahpk(a, ahsr, i, this.n, this.s.a(ahsr.d()), this.y);
        }
        ahsm a2 = ahsm.a(this.g, this.h, ahsm.a);
        ahsr ahsr2 = this.u;
        return new ahpk(a2, ahsr2, i, this.n, this.s.a(ahsr2.d()), this.y);
    }

    public final void d() {
        ahpn ahpn = this.p;
        int ordinal = this.w.ordinal();
        if (ordinal == 0) {
            ahpn = this.p;
        } else if (ordinal == 1) {
            ahpn = !this.i ? this.o : this.q;
        } else if (ordinal == 2) {
            ahpn = this.o;
        }
        this.n.a(ahpn);
    }

    public final void a(int i, int i2, int i3) {
        this.A = i;
        this.B = i2;
        this.z = i3;
        this.k.a(i, i2, i3);
    }
}

package defpackage;

import android.content.Context;
import android.opengl.Matrix;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView.StereoRenderer;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.Viewport;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.microedition.khronos.egl.EGLConfig;

/* renamed from: ahmz */
public final class ahmz implements ahsi, StereoRenderer {
    public static final GvrViewerParams a = new GvrViewerParams();
    public final ahqe b;
    public bcaa c = ahmy.a;
    public ahsp d;
    public ahnb e;
    public ahor f;
    public ahos g;
    public ahqn h;
    public boolean i;
    public boolean j;
    public volatile boolean k;
    private final ahpm l;
    private final float[] m = new float[16];
    private final float[] n = new float[16];
    private final float[] o = new float[16];
    private final float[] p = new float[16];
    private final Queue q = new ConcurrentLinkedQueue();
    private boolean r;
    private ahsh s;
    private int t = 16;
    private int u = 9;

    public ahmz(Context context) {
        amqw.a((Object) context);
        this.l = new ahpm(context);
        this.b = new ahqe(ampj.a);
        Matrix.setLookAtM(this.m, 0, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015a  */
    public final void onNewFrame(com.google.vr.sdk.base.HeadTransform r23) {
        /*
        r22 = this;
        r0 = r22;
        r22.c();
        defpackage.amqw.a(r23);
        r1 = r0.f;
        if (r1 != 0) goto L_0x0010;
    L_0x000c:
        r1 = r0.g;
        if (r1 == 0) goto L_0x02ae;
    L_0x0010:
        r1 = r0.r;
        r2 = 3;
        r3 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x0020;
    L_0x0017:
        r1 = r0.o;
        r5 = r23;
        r5.getHeadView(r1, r4);
        goto L_0x01dd;
    L_0x0020:
        r1 = r0.j;
        if (r1 != 0) goto L_0x0031;
    L_0x0024:
        r1 = r0.h;
        r5 = defpackage.ahqn.PARTIAL_SPHERICAL;
        if (r1 != r5) goto L_0x0031;
    L_0x002a:
        r1 = r0.o;
        android.opengl.Matrix.setIdentityM(r1, r4);
        goto L_0x01dd;
    L_0x0031:
        r1 = new float[r2];
        r5 = r0.l;
        r6 = r5.e;
        r7 = -1077342245; // 0xffffffffbfc90fdb float:-1.5707964 double:NaN;
        r8 = 1070141403; // 0x3fc90fdb float:1.5707964 double:5.287201034E-315;
        r6 = defpackage.angz.a(r6, r7, r8);
        r1[r4] = r6;
        r6 = r5.f;
        r1[r3] = r6;
        r6 = r5.j;
        if (r6 == 0) goto L_0x004e;
    L_0x004b:
        r5 = r5.g;
        goto L_0x004f;
    L_0x004e:
        r5 = 0;
    L_0x004f:
        r6 = 2;
        r1[r6] = r5;
        r5 = r0.i;
        if (r5 == 0) goto L_0x006c;
    L_0x0056:
        r0.i = r4;
        r5 = r0.b;
        r10 = r1[r4];
        r11 = r1[r3];
        r7 = defpackage.angz.a(r10, r7, r8);
        r10 = -r7;
        r5.f = r10;
        r10 = -r11;
        r5.g = r10;
        r5.h = r7;
        r5.i = r11;
    L_0x006c:
        r5 = r0.b;
        r7 = r1[r4];
        r10 = r1[r3];
        r1 = r1[r6];
        r6 = r0.h;
        r11 = r5.a;
        r11 = r11.a();
        r13 = r5.n;
        r13 = r11 - r13;
        r13 = (float) r13;
        r14 = 814313567; // 0x3089705f float:1.0E-9 double:4.023243584E-315;
        r13 = r13 * r14;
        r15 = r5.b;
        if (r15 != 0) goto L_0x00a3;
    L_0x008a:
        r15 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
        r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));
        if (r15 >= 0) goto L_0x00a3;
    L_0x0090:
        r15 = r5.l;
        r15 = defpackage.ahqe.a(r15);
        if (r15 == 0) goto L_0x00a1;
    L_0x0098:
        r15 = r5.m;
        r15 = defpackage.ahqe.a(r15);
        if (r15 == 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00a3;
    L_0x00a1:
        r15 = 1;
        goto L_0x00a4;
    L_0x00a3:
        r15 = 0;
    L_0x00a4:
        if (r15 == 0) goto L_0x00e3;
    L_0x00a6:
        r8 = r5.o;
        r2 = r5.n;
        r4 = r5.k;
        r4 = -r4;
        r8 = r8 - r2;
        r2 = (float) r8;
        r2 = r2 * r14;
        r4 = r4 * r2;
        r2 = (double) r4;
        r2 = java.lang.Math.exp(r2);
        r4 = r5.k;
        r8 = -r4;
        r8 = r8 * r13;
        r8 = (double) r8;
        r8 = java.lang.Math.exp(r8);
        r8 = (float) r8;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = r9 - r8;
        r13 = r5.k;
        r8 = r8 / r13;
        r2 = (float) r2;
        r3 = r9 - r2;
        r3 = r3 / r4;
        r8 = r8 - r3;
        r2 = r5.f;
        r3 = r5.l;
        r3 = r3 * r8;
        r2 = r2 + r3;
        r5.f = r2;
        r2 = r5.g;
        r3 = r5.m;
        r3 = r3 * r8;
        r2 = r2 + r3;
        r5.g = r2;
        r5.o = r11;
    L_0x00e3:
        r2 = r5.a;
        r2 = r2.a();
        r8 = r5.e;
        r2 = r2 - r8;
        r2 = (float) r2;
        r2 = r2 * r14;
        r3 = r5.d;
        r3 = defpackage.ahqe.a(r3);
        if (r3 != 0) goto L_0x0108;
    L_0x00f7:
        r3 = r5.d;
        r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r4 >= 0) goto L_0x0108;
    L_0x00fd:
        r2 = r2 / r3;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r3 - r2;
        r4 = 0;
        r9 = defpackage.angz.a(r2, r4, r3);
        goto L_0x0109;
    L_0x0108:
        r9 = 0;
    L_0x0109:
        r2 = r5.f;
        r3 = r5.h;
        r4 = r3 - r7;
        r4 = r4 * r9;
        r2 = r2 + r4;
        r5.f = r2;
        if (r15 == 0) goto L_0x0117;
    L_0x0116:
        goto L_0x0150;
    L_0x0117:
        r2 = 0;
        r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x0150;
    L_0x011c:
        r4 = r5.c;
        r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0150;
    L_0x0122:
        r2 = r7 - r3;
        r2 = java.lang.Math.abs(r2);
        r3 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r3 = java.lang.Math.toRadians(r3);
        r3 = (float) r3;
        r2 = java.lang.Math.min(r2, r3);
        r3 = r5.c;
        r2 = r2 * r3;
        r3 = r5.f;
        r3 = java.lang.Math.abs(r3);
        r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1));
        if (r3 >= 0) goto L_0x0145;
    L_0x0141:
        r3 = 0;
        r5.f = r3;
        goto L_0x0150;
    L_0x0145:
        r3 = r5.f;
        r4 = java.lang.Math.signum(r3);
        r4 = r4 * r2;
        r3 = r3 - r4;
        r5.f = r3;
    L_0x0150:
        r5.h = r7;
        r5.i = r10;
        r5.j = r1;
        r1 = defpackage.ahqn.PARTIAL_SPHERICAL;
        if (r6 == r1) goto L_0x0161;
    L_0x015a:
        r1 = 1070141403; // 0x3fc90fdb float:1.5707964 double:5.287201034E-315;
        r5.b(r1);
        goto L_0x0193;
    L_0x0161:
        r1 = r5.i;
        r2 = r5.g;
        r2 = r2 + r1;
        r3 = 1059117436; // 0x3f20d97c float:0.62831855 double:5.2327354E-315;
        r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r4 <= 0) goto L_0x017a;
    L_0x016d:
        r3 = r3 - r1;
        r5.g = r3;
        r1 = r5.m;
        r3 = 0;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 <= 0) goto L_0x018d;
    L_0x0177:
        r5.m = r3;
        goto L_0x018d;
    L_0x017a:
        r3 = 0;
        r4 = -1088366212; // 0xffffffffbf20d97c float:-0.62831855 double:NaN;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x018d;
    L_0x0182:
        r4 = r4 - r1;
        r5.g = r4;
        r1 = r5.m;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x018d;
    L_0x018b:
        r5.m = r3;
    L_0x018d:
        r1 = 1064388155; // 0x3f71463b float:0.9424779 double:5.25877621E-315;
        r5.b(r1);
    L_0x0193:
        r1 = r0.b;
        r2 = r1.h;
        r3 = r1.f;
        r4 = r1.i;
        r5 = r1.g;
        r1 = r1.j;
        r6 = r0.o;
        r7 = 0;
        android.opengl.Matrix.setIdentityM(r6, r7);
        r8 = r0.o;
        r9 = 0;
        r6 = (double) r1;
        r6 = java.lang.Math.toDegrees(r6);
        r10 = (float) r6;
        r11 = 0;
        r12 = 0;
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.opengl.Matrix.rotateM(r8, r9, r10, r11, r12, r13);
        r1 = r0.o;
        r17 = 0;
        r2 = r2 + r3;
        r2 = (double) r2;
        r2 = java.lang.Math.toDegrees(r2);
        r2 = (float) r2;
        r19 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r20 = 0;
        r21 = 0;
        r16 = r1;
        r18 = r2;
        android.opengl.Matrix.rotateM(r16, r17, r18, r19, r20, r21);
        r6 = r0.o;
        r7 = 0;
        r4 = r4 + r5;
        r1 = (double) r4;
        r1 = java.lang.Math.toDegrees(r1);
        r8 = (float) r1;
        r9 = 0;
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.opengl.Matrix.rotateM(r6, r7, r8, r9, r10, r11);
    L_0x01dd:
        r1 = r0.o;
        r2 = 0;
        r1 = r1[r2];
        r1 = (double) r1;
        r1 = java.lang.Double.isNaN(r1);
        if (r1 == 0) goto L_0x01f0;
    L_0x01e9:
        r1 = "New frame error: head view has NaN value";
        defpackage.xtl.c(r1);
        goto L_0x02ae;
    L_0x01f0:
        r1 = android.os.SystemClock.uptimeMillis();
        r3 = r0.g;
        if (r3 == 0) goto L_0x028f;
    L_0x01f8:
        r4 = r0.o;
        r5 = r3.g;
        r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r5 + r7;
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 < 0) goto L_0x028f;
    L_0x0203:
        r3.g = r1;
        r5 = r3.b;
        r6 = r3.f;
        r7 = r6 + 1;
        r3.f = r7;
        r7 = 10;
        r6 = r6 % r7;
        r5 = r5[r6];
        defpackage.ahsl.a(r5, r4);
        r4 = r3.f;
        if (r4 < r7) goto L_0x028f;
    L_0x0219:
        r4 = 0;
    L_0x021a:
        r5 = 3;
        if (r4 < r5) goto L_0x0279;
    L_0x021d:
        r6 = 1;
    L_0x021e:
        if (r6 < r7) goto L_0x0250;
    L_0x0220:
        r4 = 0;
    L_0x0221:
        if (r4 >= r5) goto L_0x0243;
    L_0x0223:
        r5 = r3.d;
        r5 = r5[r4];
        r6 = r3.c;
        r6 = r6[r4];
        r5 = r5 - r6;
        r6 = defpackage.ahos.a;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 > 0) goto L_0x0236;
    L_0x0232:
        r4 = r4 + 1;
        r5 = 3;
        goto L_0x0221;
    L_0x0236:
        r4 = r3.h;
        if (r4 != 0) goto L_0x028f;
    L_0x023a:
        r5 = 1;
        r3.h = r5;
        r3 = r3.e;
        r3.a(r5);
        goto L_0x028f;
    L_0x0243:
        r4 = r3.h;
        if (r4 == 0) goto L_0x028f;
    L_0x0247:
        r4 = 0;
        r3.h = r4;
        r3 = r3.e;
        r3.a(r4);
        goto L_0x028f;
    L_0x0250:
        r5 = 1;
        r4 = 0;
        r8 = 3;
    L_0x0253:
        if (r4 < r8) goto L_0x0259;
    L_0x0255:
        r6 = r6 + 1;
        r5 = 3;
        goto L_0x021e;
    L_0x0259:
        r9 = r3.b;
        r9 = r9[r6];
        r10 = r9[r4];
        r11 = r3.c;
        r12 = r11[r4];
        r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r12 >= 0) goto L_0x0269;
    L_0x0267:
        r11[r4] = r10;
    L_0x0269:
        r9 = r9[r4];
        r10 = r3.d;
        r11 = r10[r4];
        r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r11 > 0) goto L_0x0274;
    L_0x0273:
        goto L_0x0276;
    L_0x0274:
        r10[r4] = r9;
    L_0x0276:
        r4 = r4 + 1;
        goto L_0x0253;
    L_0x0279:
        r5 = 1;
        r8 = 3;
        r6 = r3.c;
        r9 = r3.b;
        r10 = 0;
        r9 = r9[r10];
        r10 = r9[r4];
        r6[r4] = r10;
        r6 = r3.d;
        r9 = r9[r4];
        r6[r4] = r9;
        r4 = r4 + 1;
        goto L_0x021a;
    L_0x028f:
        r3 = r0.f;
        if (r3 == 0) goto L_0x02ae;
    L_0x0293:
        r4 = new ahnj;
        r5 = r0.o;
        r4.<init>(r5, r1);
        r1 = r3.d;
        if (r1 == 0) goto L_0x02a4;
    L_0x029e:
        r1 = 0;
        r3.d = r1;
        r3.e(r4);
    L_0x02a4:
        r1 = r3.f(r4);
        r3.a(r1, r4);
        r3.d(r4);
    L_0x02ae:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmz.onNewFrame(com.google.vr.sdk.base.HeadTransform):void");
    }

    public final void onDrawEye(Eye eye) {
        amqw.a((Object) eye);
        if (this.f != null) {
            float[] perspective;
            ahsh ahsh;
            float[] fArr;
            Matrix.multiplyMM(this.p, 0, eye.getEyeView(), 0, this.m, 0);
            if (eye.getType() != 0) {
                perspective = eye.getPerspective(0.1f, 20000.0f);
                ahsh = new ahsh(eye.getFov());
            } else {
                perspective = this.n;
                ahsh = this.s;
            }
            float[] fArr2 = perspective;
            ahsh ahsh2 = ahsh;
            if (this.r) {
                fArr = this.p;
            } else {
                fArr = this.o;
            }
            try {
                this.f.a(new ahse(fArr, fArr2, ahsh2, eye, (GvrViewerParams) this.c.get()));
            } catch (ahsj e) {
                a(e);
            }
        }
    }

    public final void onFinishFrame(Viewport viewport) {
        amqw.a((Object) viewport);
        try {
            ahsl.a();
        } catch (ahsj e) {
            a(e);
        }
    }

    public final void onSurfaceChanged(int i, int i2) {
        this.t = i;
        this.u = i2;
        d();
    }

    public final void onSurfaceCreated(EGLConfig eGLConfig) {
        this.k = true;
        try {
            ahnb ahnb = this.e;
            if (ahnb != null) {
                ahnb.a();
            }
        } catch (ahsj e) {
            a(e);
        }
        c();
    }

    public final void a() {
        this.l.a();
    }

    public final void onRendererShutdown() {
        ahor ahor = this.f;
        if (ahor != null) {
            ahor.bd_();
            this.f = null;
        }
        this.l.a();
    }

    public final void a(Runnable runnable) {
        this.q.add(runnable);
    }

    public final void a(boolean z) {
        this.r = z;
        b();
    }

    private final void c() {
        while (!this.q.isEmpty()) {
            ((Runnable) this.q.remove()).run();
        }
    }

    private final void a(ahsj ahsj) {
        ahsp ahsp = this.d;
        if (ahsp != null) {
            ahsp.a(ahsj);
        }
    }

    private final void d() {
        int i = this.t;
        int i2 = this.u;
        float f = 1.1917f;
        float f2 = i <= i2 ? (((float) i) * 1.1917f) / ((float) i2) : 1.1917f;
        if (i >= i2) {
            f = (((float) i2) * 1.1917f) / ((float) i);
        }
        Matrix.frustumM(this.n, 0, (-f2) * 0.1f, f2 * 0.1f, (-f) * 0.1f, f * 0.1f, 0.1f, 20000.0f);
        this.s = new ahsh(f2, f, f2, f);
    }

    public final void b() {
        Object obj = (this.h == ahqn.FULL_SPHERICAL || (this.j && this.h == ahqn.PARTIAL_SPHERICAL)) ? 1 : null;
        if (this.r || obj == null) {
            ahpm ahpm = this.l;
            if (ahpm.c) {
                ahpm.a();
            }
            if (obj == null) {
                return;
            }
        }
        if (!this.r) {
            ahpm ahpm2 = this.l;
            if (!ahpm2.c) {
                ahpm2.k = -1;
                ahpm2.e = 0.0f;
                ahpm2.f = 0.0f;
                ahpm2.g = 0.0f;
                ahpm2.h = 0;
                ahpm2.i = -1.0f;
                synchronized (ahpm2.n) {
                    ahpm2.o.reset();
                }
                if (ahpm2.b == null) {
                    ahpm2.b = new ahpp(ahpm2);
                }
                Thread thread = new Thread(new ahpo(ahpm2), "glOrientationSensor");
                ahpm2.a(true);
                ahpm2.c = true;
                thread.start();
                this.l.j = true;
            }
        }
    }
}

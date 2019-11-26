package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Display;
import android.view.WindowManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Set;

/* renamed from: acab */
public final class acab implements abzm, OnFrameAvailableListener, zkr, zku, zmg {
    private static final FloatBuffer F = acab.a(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer G = acab.a(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private volatile boolean A;
    private boolean B;
    private int C;
    private SurfaceTexture D;
    private int E;
    private final aceh H = new acaa(this);
    public int b;
    public int c;
    public final EGLContext d;
    public ayx e;
    public zld f;
    public final Object g = new Object();
    public boolean h;
    public abzx i;
    private final abzy j;
    private final acaf k;
    private final acaf l;
    private final abzb m;
    private boolean n;
    private final float[] o = new float[16];
    private final float[] p = new float[16];
    private final float[] q = new float[16];
    private final float[] r = new float[16];
    private SurfaceTexture s;
    private int t;
    private acac u;
    private acac v;
    private boolean w;
    private boolean x;
    private final float y = 1.0f;
    private final float z = 1.0f;

    public acab(abzy abzy, acaf acaf, acaf acaf2, abzb abzb, int i, EGLContext eGLContext) {
        this.j = (abzy) amqw.a((Object) abzy);
        this.k = acaf;
        this.l = acaf2;
        this.m = abzb;
        this.d = eGLContext;
        Matrix.setIdentityM(this.q, 0);
        a(i);
        acef.a().a(auhl.class, acab.class, this.H);
    }

    public final synchronized void c() {
        if (this.s != null) {
            this.j.a(null);
            this.j.c();
            this.s.release();
            this.s = null;
        }
        if (this.t != 0) {
            GLES20.glDeleteTextures(1, new int[]{this.t}, 0);
            this.t = 0;
        }
        acac acac = this.u;
        if (acac != null) {
            acac.b();
            this.u = null;
        }
        acac = this.v;
        if (acac != null) {
            acac.b();
            this.v = null;
        }
        zld zld = this.f;
        if (zld != null) {
            zld.j();
            this.f = null;
        }
        ayx ayx = this.e;
        if (ayx != null) {
            ayx.b();
            this.e = null;
        }
        synchronized (this.g) {
            this.h = true;
            this.g.notify();
        }
        abzx abzx = this.i;
        if (abzx != null) {
            abzx.f();
        }
        acef.a().a(auhl.class, acab.class, null);
    }

    public final void a(boolean z) {
        boolean z2;
        synchronized (this) {
            this.A = z;
            z2 = true;
            if (!z) {
                this.w = true;
            }
            zld zld = this.f;
            if (zld == null) {
                z2 = false;
            } else if (z) {
                zld.i();
            } else {
                zld.k();
            }
            abzx abzx = this.i;
            if (abzx != null) {
                if (z) {
                    abzx.d();
                } else {
                    abzx.e();
                }
            }
        }
        if (z2) {
            this.m.a();
        }
    }

    public final synchronized void d() {
        zld zld = this.f;
        if (zld != null) {
            zld.i();
        }
        abzx abzx = this.i;
        if (abzx != null) {
            abzx.d();
        }
    }

    public final synchronized void e() {
        if (!(this.f == null || this.A)) {
            this.f.k();
        }
        abzx abzx = this.i;
        if (abzx != null) {
            abzx.e();
        }
    }

    public final synchronized void a(int i) {
        this.b = i;
        zld zld = this.f;
        if (zld != null) {
            zld.a(i);
            this.f.a(g());
        }
    }

    /* JADX WARNING: Missing block: B:79:0x026c, code skipped:
            return;
     */
    public final synchronized void a(boolean r25, int r26, int r27, java.util.Set r28) {
        /*
        r24 = this;
        r9 = r24;
        r0 = r27;
        monitor-enter(r24);
        r10 = 1;
        r11 = 0;
        if (r25 != 0) goto L_0x0011;
    L_0x0009:
        r1 = r9.t;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x000f;
    L_0x000d:
        goto L_0x00a0;
    L_0x000f:
        monitor-exit(r24);
        return;
    L_0x0011:
        r1 = r9.t;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x0016;
    L_0x0015:
        goto L_0x008d;
    L_0x0016:
        r1 = new int[r10];	 Catch:{ all -> 0x028b }
        android.opengl.GLES20.glGenTextures(r10, r1, r11);	 Catch:{ all -> 0x028b }
        r2 = r1[r11];	 Catch:{ all -> 0x028b }
        r3 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        android.opengl.GLES20.glBindTexture(r3, r2);	 Catch:{ all -> 0x028b }
        r2 = 10241; // 0x2801 float:1.435E-41 double:5.0597E-320;
        r4 = 1175979008; // 0x46180400 float:9729.0 double:5.81010828E-315;
        android.opengl.GLES20.glTexParameterf(r3, r2, r4);	 Catch:{ all -> 0x028b }
        r2 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        android.opengl.GLES20.glTexParameterf(r3, r2, r4);	 Catch:{ all -> 0x028b }
        r2 = 10242; // 0x2802 float:1.4352E-41 double:5.06E-320;
        r4 = 33071; // 0x812f float:4.6342E-41 double:1.6339E-319;
        android.opengl.GLES20.glTexParameteri(r3, r2, r4);	 Catch:{ all -> 0x028b }
        r2 = 10243; // 0x2803 float:1.4354E-41 double:5.0607E-320;
        r4 = 33071; // 0x812f float:4.6342E-41 double:1.6339E-319;
        android.opengl.GLES20.glTexParameteri(r3, r2, r4);	 Catch:{ all -> 0x028b }
        r2 = "glTexParameter";
        defpackage.abyx.a(r2);	 Catch:{ all -> 0x028b }
        r1 = r1[r11];	 Catch:{ all -> 0x028b }
        r9.t = r1;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x004d;
    L_0x004b:
        r1 = 1;
        goto L_0x004e;
    L_0x004d:
        r1 = 0;
    L_0x004e:
        defpackage.amqw.b(r1);	 Catch:{ all -> 0x028b }
        r1 = new android.graphics.SurfaceTexture;	 Catch:{ all -> 0x028b }
        r2 = r9.t;	 Catch:{ all -> 0x028b }
        r1.<init>(r2);	 Catch:{ all -> 0x028b }
        r9.s = r1;	 Catch:{ all -> 0x028b }
        r1 = r9.s;	 Catch:{ all -> 0x028b }
        r1.setOnFrameAvailableListener(r9);	 Catch:{ all -> 0x028b }
        r1 = r9.j;	 Catch:{ all -> 0x028b }
        r2 = r9.s;	 Catch:{ all -> 0x028b }
        r1.a(r2);	 Catch:{ all -> 0x028b }
        r1 = r9.g;	 Catch:{ all -> 0x028b }
        monitor-enter(r1);	 Catch:{ all -> 0x028b }
        r2 = defpackage.ayx.a();	 Catch:{ all -> 0x0288 }
        r9.e = r2;	 Catch:{ all -> 0x0288 }
        r2 = r9.g;	 Catch:{ all -> 0x0288 }
        r2.notify();	 Catch:{ all -> 0x0288 }
        monitor-exit(r1);	 Catch:{ all -> 0x0288 }
        r1 = r9.e;	 Catch:{ all -> 0x028b }
        r1 = r1.a;	 Catch:{ all -> 0x028b }
        r9.C = r1;	 Catch:{ all -> 0x028b }
        r1 = r9.k;	 Catch:{ all -> 0x028b }
        r1 = defpackage.acab.a(r1);	 Catch:{ all -> 0x028b }
        r9.u = r1;	 Catch:{ all -> 0x028b }
        r1 = r9.l;	 Catch:{ all -> 0x028b }
        r1 = defpackage.acab.a(r1);	 Catch:{ all -> 0x028b }
        r9.v = r1;	 Catch:{ all -> 0x028b }
        r9.x = r10;	 Catch:{ all -> 0x028b }
    L_0x008d:
        r1 = r9.w;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x00a0;
    L_0x0091:
        r1 = r9.A;	 Catch:{ all -> 0x028b }
        if (r1 != 0) goto L_0x00a0;
    L_0x0095:
        r1 = r9.B;	 Catch:{ all -> 0x028b }
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r9.s;	 Catch:{ all -> 0x028b }
        r1.updateTexImage();	 Catch:{ all -> 0x028b }
        r9.w = r11;	 Catch:{ all -> 0x028b }
    L_0x00a0:
        r1 = r9.x;	 Catch:{ all -> 0x028b }
        if (r1 != 0) goto L_0x0286;
    L_0x00a4:
        r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r26 < 0) goto L_0x00ab;
    L_0x00a8:
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x00af;
    L_0x00ab:
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r13 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x00af:
        r14 = java.lang.Math.abs(r26);	 Catch:{ all -> 0x028b }
        r1 = r9.B;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x026d;
    L_0x00b7:
        r15 = 0;
        android.opengl.GLES20.glClearColor(r15, r15, r15, r12);	 Catch:{ all -> 0x028b }
        r1 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        android.opengl.GLES20.glClear(r1);	 Catch:{ all -> 0x028b }
        r8 = (float) r14;	 Catch:{ all -> 0x028b }
        r7 = (float) r0;	 Catch:{ all -> 0x028b }
        r6 = r8 / r7;
        r1 = r9.A;	 Catch:{ all -> 0x028b }
        r5 = 1058013184; // 0x3f100000 float:0.5625 double:5.22727967E-315;
        r4 = 1071877689; // 0x3fe38e39 float:1.7777778 double:5.295779427E-315;
        if (r1 == 0) goto L_0x00ed;
    L_0x00cd:
        r1 = r9.n;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x00d4;
    L_0x00d1:
        r1 = r5 / r6;
        goto L_0x00d6;
    L_0x00d4:
        r1 = r4 / r6;
    L_0x00d6:
        r2 = r9.o;	 Catch:{ all -> 0x028b }
        android.opengl.Matrix.setIdentityM(r2, r11);	 Catch:{ all -> 0x028b }
        r2 = r9.y;	 Catch:{ all -> 0x028b }
        r3 = r9.z;	 Catch:{ all -> 0x028b }
        r9.a(r11, r2, r3);	 Catch:{ all -> 0x028b }
        r2 = r12 / r1;
        r2 = java.lang.Math.min(r12, r2);	 Catch:{ all -> 0x028b }
        r1 = java.lang.Math.min(r12, r1);	 Catch:{ all -> 0x028b }
        goto L_0x010d;
    L_0x00ed:
        r1 = r9.n;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x00f4;
    L_0x00f1:
        r2 = r5 / r6;
        goto L_0x00f6;
    L_0x00f4:
        r2 = r6 / r4;
    L_0x00f6:
        r3 = r9.y;	 Catch:{ all -> 0x028b }
        r4 = r9.z;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x00ff;
    L_0x00fc:
        r3 = r3 * r2;
        goto L_0x0101;
    L_0x00ff:
        r4 = r4 * r2;
    L_0x0101:
        r1 = r9.o;	 Catch:{ all -> 0x028b }
        android.opengl.Matrix.setIdentityM(r1, r11);	 Catch:{ all -> 0x028b }
        r9.a(r11, r3, r4);	 Catch:{ all -> 0x028b }
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x010d:
        r3 = r9.p;	 Catch:{ all -> 0x028b }
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        android.opengl.Matrix.translateM(r3, r11, r4, r5, r15);	 Catch:{ all -> 0x028b }
        r3 = r9.p;	 Catch:{ all -> 0x028b }
        r2 = r2 * r13;
        android.opengl.Matrix.scaleM(r3, r11, r2, r1, r12);	 Catch:{ all -> 0x028b }
        r1 = r9.p;	 Catch:{ all -> 0x028b }
        r2 = -1090519040; // 0xffffffffbf000000 float:-0.5 double:NaN;
        r3 = -1090519040; // 0xffffffffbf000000 float:-0.5 double:NaN;
        android.opengl.Matrix.translateM(r1, r11, r2, r3, r15);	 Catch:{ all -> 0x028b }
        r4 = r9.C;	 Catch:{ all -> 0x028b }
        r5 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
        r3 = r9.v;	 Catch:{ all -> 0x028b }
        r16 = G;	 Catch:{ all -> 0x028b }
        r17 = 0;
        r1 = r24;
        r2 = r14;
        r18 = r3;
        r3 = r28;
        r12 = 1071877689; // 0x3fe38e39 float:1.7777778 double:5.295779427E-315;
        r10 = r6;
        r6 = r18;
        r18 = r7;
        r7 = r16;
        r16 = r8;
        r8 = r17;
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x028b }
        r1 = r9.A;	 Catch:{ all -> 0x028b }
        r17 = 7;
        r19 = 6;
        r20 = 5;
        r21 = 4;
        r22 = 3;
        r8 = 8;
        r23 = 2;
        if (r1 != 0) goto L_0x01e1;
    L_0x015a:
        r1 = r9.n;	 Catch:{ all -> 0x028b }
        if (r1 != 0) goto L_0x01e1;
    L_0x015e:
        r1 = defpackage.acab.a(r10, r12);	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x0166;
    L_0x0164:
        goto L_0x01e1;
    L_0x0166:
        r1 = r9.D;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x026b;
    L_0x016a:
        r9.a(r1, r14, r0, r13);	 Catch:{ all -> 0x028b }
        r1 = new android.graphics.Point;	 Catch:{ all -> 0x028b }
        r1.<init>(r14, r0);	 Catch:{ all -> 0x028b }
        r2 = r9.n;	 Catch:{ all -> 0x028b }
        defpackage.acab.a(r1, r2);	 Catch:{ all -> 0x028b }
        r1 = r1.y;	 Catch:{ all -> 0x028b }
        r1 = r0 - r1;
        r10 = r1 / 2;
        r1 = (float) r10;	 Catch:{ all -> 0x028b }
        r12 = r1 / r18;
        android.opengl.GLES20.glViewport(r11, r11, r14, r10);	 Catch:{ all -> 0x028b }
        r1 = new float[r8];	 Catch:{ all -> 0x028b }
        r1[r11] = r15;	 Catch:{ all -> 0x028b }
        r2 = 1;
        r1[r2] = r15;	 Catch:{ all -> 0x028b }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1[r23] = r2;	 Catch:{ all -> 0x028b }
        r1[r22] = r15;	 Catch:{ all -> 0x028b }
        r1[r21] = r15;	 Catch:{ all -> 0x028b }
        r1[r20] = r12;	 Catch:{ all -> 0x028b }
        r1[r19] = r2;	 Catch:{ all -> 0x028b }
        r1[r17] = r12;	 Catch:{ all -> 0x028b }
        r7 = defpackage.acab.a(r1);	 Catch:{ all -> 0x028b }
        r4 = r9.E;	 Catch:{ all -> 0x028b }
        r5 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r6 = r9.u;	 Catch:{ all -> 0x028b }
        r13 = 1;
        r1 = r24;
        r2 = r14;
        r3 = r28;
        r15 = 8;
        r8 = r13;
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x028b }
        r0 = r0 - r10;
        android.opengl.GLES20.glViewport(r11, r0, r14, r10);	 Catch:{ all -> 0x028b }
        r0 = new float[r15];	 Catch:{ all -> 0x028b }
        r1 = 0;
        r0[r11] = r1;	 Catch:{ all -> 0x028b }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r12 = r2 - r12;
        r3 = 1;
        r0[r3] = r12;	 Catch:{ all -> 0x028b }
        r0[r23] = r2;	 Catch:{ all -> 0x028b }
        r0[r22] = r12;	 Catch:{ all -> 0x028b }
        r0[r21] = r1;	 Catch:{ all -> 0x028b }
        r0[r20] = r2;	 Catch:{ all -> 0x028b }
        r0[r19] = r2;	 Catch:{ all -> 0x028b }
        r0[r17] = r2;	 Catch:{ all -> 0x028b }
        r7 = defpackage.acab.a(r0);	 Catch:{ all -> 0x028b }
        r4 = r9.E;	 Catch:{ all -> 0x028b }
        r5 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r6 = r9.u;	 Catch:{ all -> 0x028b }
        r8 = 1;
        r1 = r24;
        r2 = r14;
        r3 = r28;
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x028b }
        monitor-exit(r24);
        return;
    L_0x01e1:
        r15 = 8;
        r1 = r9.A;	 Catch:{ all -> 0x028b }
        if (r1 != 0) goto L_0x026b;
    L_0x01e7:
        r1 = r9.n;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x026b;
    L_0x01eb:
        r1 = 1058013184; // 0x3f100000 float:0.5625 double:5.22727967E-315;
        r1 = defpackage.acab.a(r10, r1);	 Catch:{ all -> 0x028b }
        if (r1 != 0) goto L_0x026b;
    L_0x01f3:
        r1 = r9.D;	 Catch:{ all -> 0x028b }
        if (r1 == 0) goto L_0x026b;
    L_0x01f7:
        r9.a(r1, r14, r0, r13);	 Catch:{ all -> 0x028b }
        r1 = new android.graphics.Point;	 Catch:{ all -> 0x028b }
        r1.<init>(r14, r0);	 Catch:{ all -> 0x028b }
        r2 = r9.n;	 Catch:{ all -> 0x028b }
        defpackage.acab.a(r1, r2);	 Catch:{ all -> 0x028b }
        r1 = r1.x;	 Catch:{ all -> 0x028b }
        r1 = r14 - r1;
        r10 = r1 / 2;
        r1 = (float) r10;	 Catch:{ all -> 0x028b }
        r12 = r1 / r16;
        android.opengl.GLES20.glViewport(r11, r11, r10, r0);	 Catch:{ all -> 0x028b }
        r1 = new float[r15];	 Catch:{ all -> 0x028b }
        r2 = 0;
        r1[r11] = r2;	 Catch:{ all -> 0x028b }
        r3 = 1;
        r1[r3] = r2;	 Catch:{ all -> 0x028b }
        r1[r23] = r12;	 Catch:{ all -> 0x028b }
        r1[r22] = r2;	 Catch:{ all -> 0x028b }
        r1[r21] = r2;	 Catch:{ all -> 0x028b }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1[r20] = r2;	 Catch:{ all -> 0x028b }
        r1[r19] = r12;	 Catch:{ all -> 0x028b }
        r1[r17] = r2;	 Catch:{ all -> 0x028b }
        r7 = defpackage.acab.a(r1);	 Catch:{ all -> 0x028b }
        r4 = r9.E;	 Catch:{ all -> 0x028b }
        r5 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r6 = r9.u;	 Catch:{ all -> 0x028b }
        r8 = 1;
        r1 = r24;
        r2 = r14;
        r3 = r28;
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x028b }
        r1 = r14 - r10;
        android.opengl.GLES20.glViewport(r1, r11, r10, r0);	 Catch:{ all -> 0x028b }
        r0 = new float[r15];	 Catch:{ all -> 0x028b }
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r12 = r1 - r12;
        r0[r11] = r12;	 Catch:{ all -> 0x028b }
        r2 = 1;
        r3 = 0;
        r0[r2] = r3;	 Catch:{ all -> 0x028b }
        r0[r23] = r1;	 Catch:{ all -> 0x028b }
        r0[r22] = r3;	 Catch:{ all -> 0x028b }
        r0[r21] = r12;	 Catch:{ all -> 0x028b }
        r0[r20] = r1;	 Catch:{ all -> 0x028b }
        r0[r19] = r1;	 Catch:{ all -> 0x028b }
        r0[r17] = r1;	 Catch:{ all -> 0x028b }
        r7 = defpackage.acab.a(r0);	 Catch:{ all -> 0x028b }
        r4 = r9.E;	 Catch:{ all -> 0x028b }
        r5 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r6 = r9.u;	 Catch:{ all -> 0x028b }
        r8 = 1;
        r1 = r24;
        r2 = r14;
        r3 = r28;
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x028b }
    L_0x026b:
        monitor-exit(r24);
        return;
    L_0x026d:
        r1 = r9.s;	 Catch:{ all -> 0x028b }
        r9.a(r1, r14, r0, r13);	 Catch:{ all -> 0x028b }
        r4 = r9.t;	 Catch:{ all -> 0x028b }
        r5 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r6 = r9.u;	 Catch:{ all -> 0x028b }
        r7 = G;	 Catch:{ all -> 0x028b }
        r8 = 0;
        r1 = r24;
        r2 = r14;
        r3 = r28;
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x028b }
        monitor-exit(r24);
        return;
    L_0x0286:
        monitor-exit(r24);
        return;
    L_0x0288:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0288 }
        throw r0;	 Catch:{ all -> 0x028b }
    L_0x028b:
        r0 = move-exception;
        monitor-exit(r24);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acab.a(boolean, int, int, java.util.Set):void");
    }

    public final void a(Context context, zos zos, znq znq, boolean z, String str) {
        this.n = z;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        this.i = new abzx(zos);
        new acad(this, context, str, point, z, znq, zos).execute(new Void[0]);
    }

    public final synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.c++;
        this.w = true;
        this.x = false;
        this.B = false;
        this.m.a();
    }

    public final void a() {
        this.x = false;
        this.B = true;
        this.m.a();
        this.i.a();
    }

    public final void a(SurfaceTexture surfaceTexture, int i) {
        this.E = i;
        this.D = surfaceTexture;
        this.j.a(surfaceTexture);
    }

    public final void b() {
        this.c++;
        this.i.b();
    }

    public final void f() {
        zld zld = this.f;
        if (zld != null) {
            zld.a(g());
        }
    }

    private final void a(SurfaceTexture surfaceTexture, int i, int i2, float f) {
        float g = (g() / (((float) i) / ((float) i2))) * (this.z / this.y);
        surfaceTexture.getTransformMatrix(this.o);
        a(this.b, this.y, this.z);
        Matrix.translateM(this.p, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(this.p, 0, f * Math.min(1.0f, 1.0f / g), Math.min(1.0f, g), 1.0f);
        Matrix.translateM(this.p, 0, -0.5f, -0.5f, 0.0f);
    }

    private final void a(int i, Set set, int i2, int i3, acac acac, FloatBuffer floatBuffer, boolean z) {
        acac.b(i3, i2);
        acac.a(i3, i2);
        acac.a("u_MVPMatrix", this.q);
        acac.a("u_TextureMatrix", this.p);
        acac.a("u_Grayscale", !set.contains(abzp.a) ? 0.0f : 1.0f);
        acac.a("u_Darken", !z ? 0.0f : 0.65f);
        String str = "a_Position";
        acac.a(str, F);
        String str2 = "a_TextureCoord";
        acac.a(str2, floatBuffer);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glGetError();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(3089);
        GLES20.glScissor(0, 0, i, 1);
        GLES20.glClear(16384);
        GLES20.glDisable(3089);
        acac.a(str);
        acac.a(str2);
        acac.a();
    }

    public final float g() {
        int d = this.j.d();
        int e = this.j.e();
        return (this.b + this.j.f()) % 180 == 0 ? ((float) d) / ((float) e) : ((float) e) / ((float) d);
    }

    private final void a(int i, float f, float f2) {
        Matrix.setIdentityM(this.r, 0);
        Matrix.translateM(this.r, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.r, 0, (float) i, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(this.r, 0, -0.5f, -0.5f, 0.0f);
        Matrix.setIdentityM(this.q, 0);
        Matrix.translateM(this.q, 0, 0.0f, 0.0f, 0.0f);
        Matrix.scaleM(this.q, 0, f, f2, 1.0f);
        Matrix.multiplyMM(this.p, 0, this.o, 0, this.r, 0);
    }

    private static acac a(acaf acaf) {
        return new acac(acaf);
    }

    private static FloatBuffer a(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).rewind();
        return asFloatBuffer;
    }

    public static void a(Point point, boolean z) {
        float f = ((float) point.x) / ((float) point.y);
        if (!z && acab.a(f, 1.7777778f)) {
            return;
        }
        if (!z || !acab.a(f, 0.5625f)) {
            String str = ", ";
            float f2;
            int i;
            int i2;
            StringBuilder stringBuilder;
            if ((z || (point.x > point.y && f > 1.7777778f)) && (!z || point.x >= point.y || f >= 0.5625f)) {
                if (z) {
                    f2 = ((float) point.y) / 1.7777778f;
                } else {
                    f2 = ((float) point.y) * 1.7777778f;
                }
                i = (int) (f2 + 0.5f);
                if (i <= point.x) {
                    point.set(i, point.y);
                    return;
                }
                i2 = point.x;
                stringBuilder = new StringBuilder(66);
                stringBuilder.append("New width is greater than original width: ");
                stringBuilder.append(i);
                stringBuilder.append(str);
                stringBuilder.append(i2);
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (z) {
                f2 = ((float) point.x) * 1.7777778f;
            } else {
                f2 = ((float) point.x) / 1.7777778f;
            }
            i = (int) (f2 + 0.5f);
            if (i <= point.y) {
                point.set(point.x, i);
                return;
            }
            i2 = point.y;
            stringBuilder = new StringBuilder(68);
            stringBuilder.append("New height is greater than original height: ");
            stringBuilder.append(i);
            stringBuilder.append(str);
            stringBuilder.append(i2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.01f;
    }
}

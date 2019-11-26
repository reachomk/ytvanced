package defpackage;

import java.util.ArrayList;

/* renamed from: dh */
public class dh {
    private static float ah = 0.5f;
    public int A = 0;
    public int B = 0;
    public int C = 0;
    public int D;
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public float Z;
    private final df a = new df(this, 8);
    public float aa;
    public dh ab;
    public dh ac;
    public int ad;
    public int ae;
    private int af = 0;
    private int ag = 0;
    private final df b = new df(this, 9);
    private final df c = new df(this, 7);
    public int d = -1;
    public int e = -1;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public final df l = new df(this, 2);
    public final df m = new df(this, 3);
    public final df n = new df(this, 4);
    public final df o = new df(this, 5);
    public final df p = new df(this, 6);
    public final ArrayList q = new ArrayList();
    public dh r = null;
    public int s = 0;
    public int t = 0;
    public float u = 0.0f;
    public int v = -1;
    public int w = 0;
    public int x = 0;
    public int y = 0;
    public int z = 0;

    public void a() {
        this.l.c();
        this.m.c();
        this.n.c();
        this.o.c();
        this.p.c();
        this.a.c();
        this.b.c();
        this.c.c();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        float f = ah;
        this.H = f;
        this.I = f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.d = -1;
        this.e = -1;
    }

    public dh() {
        float f = ah;
        this.H = f;
        this.I = f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        this.q.add(this.l);
        this.q.add(this.m);
        this.q.add(this.n);
        this.q.add(this.o);
        this.q.add(this.a);
        this.q.add(this.b);
        this.q.add(this.p);
    }

    public void a(cz czVar) {
        this.l.a();
        this.m.a();
        this.n.a();
        this.o.a();
        this.p.a();
        this.c.a();
        this.a.a();
        this.b.a();
    }

    public final boolean c() {
        return this.r == null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append(this.w);
        stringBuilder.append(", ");
        stringBuilder.append(this.x);
        stringBuilder.append(") - (");
        stringBuilder.append(this.s);
        String str = " x ";
        stringBuilder.append(str);
        stringBuilder.append(this.t);
        stringBuilder.append(") wrap: (");
        stringBuilder.append(this.F);
        stringBuilder.append(str);
        stringBuilder.append(this.G);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public final int e() {
        int i = this.s;
        if (this.ad == 3) {
            if (this.f == 1) {
                i = Math.max(this.h, i);
            } else {
                i = this.h;
                if (i <= 0) {
                    i = 0;
                } else {
                    this.s = i;
                }
            }
            int i2 = this.i;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int f() {
        int i = this.t;
        if (this.ae == 3) {
            if (this.g == 1) {
                i = Math.max(this.j, i);
            } else {
                i = this.j;
                if (i <= 0) {
                    i = 0;
                } else {
                    this.t = i;
                }
            }
            int i2 = this.k;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int g() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int h() {
        return this.af + this.A;
    }

    public final int i() {
        return this.ag + this.B;
    }

    public final int j() {
        return this.w + this.s;
    }

    public final int k() {
        return this.x + this.t;
    }

    public final boolean l() {
        return this.C > 0;
    }

    public void a(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public void m() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s;
        int i4 = this.t;
        this.af = i;
        this.ag = i2;
        this.y = (i3 + i) - i;
        this.z = (i4 + i2) - i2;
    }

    public final void a(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public final void b(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void c(int i) {
        if (i >= 0) {
            this.D = i;
        } else {
            this.D = 0;
        }
    }

    public final void d(int i) {
        if (i >= 0) {
            this.E = i;
        } else {
            this.E = 0;
        }
    }

    public final void b(int i, int i2) {
        this.w = i;
        i2 -= i;
        this.s = i2;
        i = this.D;
        if (i2 < i) {
            this.s = i;
        }
    }

    public final void c(int i, int i2) {
        this.x = i;
        i2 -= i;
        this.t = i2;
        i = this.E;
        if (i2 < i) {
            this.t = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02f9  */
    /* JADX WARNING: Missing block: B:98:0x0173, code skipped:
            if (r8.b != null) goto L_0x0178;
     */
    public void a(defpackage.db r43) {
        /*
        r42 = this;
        r15 = r42;
        r14 = r43;
        r0 = r15.l;
        r13 = r14.a(r0);
        r0 = r15.n;
        r12 = r14.a(r0);
        r0 = r15.m;
        r11 = r14.a(r0);
        r0 = r15.o;
        r10 = r14.a(r0);
        r0 = r15.p;
        r9 = r14.a(r0);
        r0 = r15.r;
        r8 = 2;
        r7 = 1;
        r6 = 0;
        if (r0 == 0) goto L_0x0117;
    L_0x0029:
        r1 = r15.l;
        r2 = r1.b;
        if (r2 != 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0034;
    L_0x0030:
        r2 = r2.b;
        if (r2 == r1) goto L_0x0041;
    L_0x0034:
        r1 = r15.n;
        r2 = r1.b;
        if (r2 == 0) goto L_0x003f;
    L_0x003a:
        r2 = r2.b;
        if (r2 != r1) goto L_0x003f;
    L_0x003e:
        goto L_0x0041;
    L_0x003f:
        r0 = 0;
        goto L_0x0047;
    L_0x0041:
        r0 = (defpackage.dg) r0;
        r0.a(r15, r6);
        r0 = 1;
    L_0x0047:
        r1 = r15.m;
        r2 = r1.b;
        if (r2 != 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0052;
    L_0x004e:
        r2 = r2.b;
        if (r2 == r1) goto L_0x005f;
    L_0x0052:
        r1 = r15.o;
        r2 = r1.b;
        if (r2 == 0) goto L_0x005d;
    L_0x0058:
        r2 = r2.b;
        if (r2 != r1) goto L_0x005d;
    L_0x005c:
        goto L_0x005f;
    L_0x005d:
        r1 = 0;
        goto L_0x0067;
    L_0x005f:
        r1 = r15.r;
        r1 = (defpackage.dg) r1;
        r1.a(r15, r7);
        r1 = 1;
    L_0x0067:
        r2 = r15.r;
        r3 = r2.ad;
        if (r3 == r8) goto L_0x006e;
    L_0x006d:
        goto L_0x00bc;
    L_0x006e:
        if (r0 != 0) goto L_0x00bc;
    L_0x0070:
        r3 = r15.l;
        r4 = r3.b;
        if (r4 == 0) goto L_0x0080;
    L_0x0076:
        r4 = r4.a;
        if (r4 == r2) goto L_0x007b;
    L_0x007a:
        goto L_0x0080;
    L_0x007b:
        if (r4 != r2) goto L_0x0094;
    L_0x007d:
        r3.h = r8;
        goto L_0x0094;
    L_0x0080:
        r2 = r2.l;
        r2 = r14.a(r2);
        r3 = r43.b();
        r4 = r43.c();
        r3.a(r13, r2, r4, r6);
        r14.a(r3);
    L_0x0094:
        r2 = r15.n;
        r3 = r2.b;
        if (r3 == 0) goto L_0x00a6;
    L_0x009a:
        r3 = r3.a;
        r4 = r15.r;
        if (r3 == r4) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00a6;
    L_0x00a1:
        if (r3 != r4) goto L_0x00bc;
    L_0x00a3:
        r2.h = r8;
        goto L_0x00bc;
    L_0x00a6:
        r2 = r15.r;
        r2 = r2.n;
        r2 = r14.a(r2);
        r3 = r43.b();
        r4 = r43.c();
        r3.a(r2, r12, r4, r6);
        r14.a(r3);
    L_0x00bc:
        r2 = r15.r;
        r3 = r2.ae;
        if (r3 == r8) goto L_0x00c3;
    L_0x00c2:
        goto L_0x0112;
    L_0x00c3:
        if (r1 != 0) goto L_0x0112;
    L_0x00c5:
        r3 = r15.m;
        r4 = r3.b;
        if (r4 == 0) goto L_0x00d5;
    L_0x00cb:
        r4 = r4.a;
        if (r4 == r2) goto L_0x00d0;
    L_0x00cf:
        goto L_0x00d5;
    L_0x00d0:
        if (r4 != r2) goto L_0x00e9;
    L_0x00d2:
        r3.h = r8;
        goto L_0x00e9;
    L_0x00d5:
        r2 = r2.m;
        r2 = r14.a(r2);
        r3 = r43.b();
        r4 = r43.c();
        r3.a(r11, r2, r4, r6);
        r14.a(r3);
    L_0x00e9:
        r2 = r15.o;
        r3 = r2.b;
        if (r3 == 0) goto L_0x00fc;
    L_0x00ef:
        r3 = r3.a;
        r4 = r15.r;
        if (r3 == r4) goto L_0x00f6;
    L_0x00f5:
        goto L_0x00fc;
    L_0x00f6:
        if (r3 == r4) goto L_0x00f9;
    L_0x00f8:
        goto L_0x0112;
    L_0x00f9:
        r2.h = r8;
        goto L_0x0112;
    L_0x00fc:
        r2 = r15.r;
        r2 = r2.o;
        r2 = r14.a(r2);
        r3 = r43.b();
        r4 = r43.c();
        r3.a(r2, r10, r4, r6);
        r14.a(r3);
    L_0x0112:
        r16 = r0;
        r17 = r1;
        goto L_0x011b;
    L_0x0117:
        r16 = 0;
        r17 = 0;
    L_0x011b:
        r0 = r15.s;
        r5 = r15.D;
        if (r0 >= r5) goto L_0x0123;
    L_0x0121:
        r1 = r5;
        goto L_0x0124;
    L_0x0123:
        r1 = r0;
    L_0x0124:
        r2 = r15.t;
        r3 = r15.E;
        if (r2 >= r3) goto L_0x012b;
    L_0x012a:
        goto L_0x012c;
    L_0x012b:
        r3 = r2;
    L_0x012c:
        r4 = r15.ad;
        r8 = 3;
        if (r4 == r8) goto L_0x0134;
    L_0x0131:
        r19 = 1;
        goto L_0x0136;
    L_0x0134:
        r19 = 0;
    L_0x0136:
        r6 = r15.ae;
        if (r6 == r8) goto L_0x013d;
    L_0x013a:
        r21 = 1;
        goto L_0x013f;
    L_0x013d:
        r21 = 0;
    L_0x013f:
        if (r19 != 0) goto L_0x0154;
    L_0x0141:
        r7 = r15.l;
        if (r7 == 0) goto L_0x0154;
    L_0x0145:
        r8 = r15.n;
        if (r8 == 0) goto L_0x0154;
    L_0x0149:
        r7 = r7.b;
        if (r7 == 0) goto L_0x0152;
    L_0x014d:
        r7 = r8.b;
        if (r7 == 0) goto L_0x0152;
    L_0x0151:
        goto L_0x0154;
    L_0x0152:
        r19 = 1;
    L_0x0154:
        if (r21 != 0) goto L_0x0178;
    L_0x0156:
        r7 = r15.m;
        if (r7 == 0) goto L_0x0178;
    L_0x015a:
        r8 = r15.o;
        if (r8 == 0) goto L_0x0178;
    L_0x015e:
        r7 = r7.b;
        if (r7 == 0) goto L_0x0166;
    L_0x0162:
        r8 = r8.b;
        if (r8 != 0) goto L_0x0178;
    L_0x0166:
        r8 = r15.C;
        if (r8 == 0) goto L_0x0176;
    L_0x016a:
        r8 = r15.p;
        if (r8 != 0) goto L_0x016f;
    L_0x016e:
        goto L_0x0178;
    L_0x016f:
        if (r7 == 0) goto L_0x0176;
    L_0x0171:
        r7 = r8.b;
        if (r7 == 0) goto L_0x0176;
    L_0x0175:
        goto L_0x0178;
    L_0x0176:
        r21 = 1;
    L_0x0178:
        r7 = r15.v;
        r8 = r15.u;
        r24 = 0;
        r25 = r13;
        r24 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1));
        if (r24 > 0) goto L_0x018f;
    L_0x0184:
        r13 = r7;
        r26 = r8;
        r8 = r1;
        r7 = r3;
        r3 = r19;
        r19 = 0;
        goto L_0x01f6;
    L_0x018f:
        r13 = r15.K;
        r26 = r1;
        r1 = 8;
        if (r13 == r1) goto L_0x01ea;
    L_0x0197:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r13 = 3;
        if (r4 != r13) goto L_0x01c7;
    L_0x019c:
        if (r6 != r13) goto L_0x01c7;
    L_0x019e:
        if (r19 == 0) goto L_0x01a8;
    L_0x01a0:
        if (r21 == 0) goto L_0x01a3;
    L_0x01a2:
        goto L_0x01a8;
    L_0x01a3:
        r7 = r3;
        r3 = r19;
        r13 = 0;
        goto L_0x01c4;
    L_0x01a8:
        if (r19 != 0) goto L_0x01c0;
    L_0x01aa:
        if (r21 == 0) goto L_0x01c0;
    L_0x01ac:
        r0 = -1;
        if (r7 == r0) goto L_0x01b4;
    L_0x01af:
        r7 = r3;
        r3 = r19;
        r13 = 1;
        goto L_0x01c4;
    L_0x01b4:
        r1 = r1 / r8;
        r7 = r3;
        r3 = r19;
        r8 = r26;
        r13 = 1;
        r19 = 1;
        r26 = r1;
        goto L_0x01f6;
    L_0x01c0:
        r13 = r7;
        r7 = r3;
        r3 = r19;
    L_0x01c4:
        r19 = 1;
        goto L_0x01f0;
    L_0x01c7:
        if (r4 != r13) goto L_0x01d6;
    L_0x01c9:
        r0 = (float) r2;
        r0 = r0 * r8;
        r0 = (int) r0;
        r7 = r3;
        r26 = r8;
        r3 = 1;
        r13 = 0;
        r19 = 0;
        r8 = r0;
        goto L_0x01f6;
    L_0x01d6:
        if (r6 != r13) goto L_0x01ea;
    L_0x01d8:
        r2 = -1;
        if (r7 != r2) goto L_0x01dd;
    L_0x01db:
        r8 = r1 / r8;
    L_0x01dd:
        r0 = (float) r0;
        r0 = r0 * r8;
        r0 = (int) r0;
        r7 = r0;
        r3 = r19;
        r13 = 1;
        r19 = 0;
        r21 = 1;
        goto L_0x01f0;
    L_0x01ea:
        r13 = r7;
        r7 = r3;
        r3 = r19;
        r19 = 0;
    L_0x01f0:
        r41 = r26;
        r26 = r8;
        r8 = r41;
    L_0x01f6:
        if (r19 != 0) goto L_0x01fd;
    L_0x01f8:
        r2 = 2;
        r6 = -1;
    L_0x01fa:
        r18 = 0;
        goto L_0x0209;
    L_0x01fd:
        if (r13 == 0) goto L_0x0205;
    L_0x01ff:
        r6 = -1;
        if (r13 != r6) goto L_0x0203;
    L_0x0202:
        goto L_0x0206;
    L_0x0203:
        r2 = 2;
        goto L_0x01fa;
    L_0x0205:
        r6 = -1;
    L_0x0206:
        r2 = 2;
        r18 = 1;
    L_0x0209:
        if (r4 != r2) goto L_0x0212;
    L_0x020b:
        r0 = r15 instanceof defpackage.dg;
        if (r0 != 0) goto L_0x0210;
    L_0x020f:
        goto L_0x0212;
    L_0x0210:
        r4 = 1;
        goto L_0x0213;
    L_0x0212:
        r4 = 0;
    L_0x0213:
        r0 = r15.d;
        if (r0 != r2) goto L_0x0229;
    L_0x0217:
        r34 = r7;
        r35 = r9;
        r36 = r10;
        r37 = r11;
        r18 = r12;
        r38 = r13;
        r16 = r25;
        r24 = 0;
        goto L_0x02f4;
    L_0x0229:
        if (r18 != 0) goto L_0x0235;
    L_0x022b:
        r20 = -1;
        r23 = 2;
        r24 = 0;
        r27 = 3;
        goto L_0x02ab;
    L_0x0235:
        r0 = r15.l;
        r1 = r0.b;
        if (r1 == 0) goto L_0x022b;
    L_0x023b:
        r1 = r15.n;
        r1 = r1.b;
        if (r1 == 0) goto L_0x022b;
    L_0x0241:
        r1 = r14.a(r0);
        r0 = r15.n;
        r8 = r14.a(r0);
        r0 = r15.l;
        r0 = r0.b;
        r3 = r14.a(r0);
        r0 = r15.n;
        r0 = r0.b;
        r5 = r14.a(r0);
        r0 = r15.l;
        r0 = r0.b();
        r4 = 3;
        r14.a(r1, r3, r0, r4);
        r0 = r15.n;
        r0 = r0.b();
        r0 = -r0;
        r14.b(r8, r5, r0, r4);
        if (r16 != 0) goto L_0x029a;
    L_0x0271:
        r0 = r15.l;
        r16 = r0.b();
        r0 = r15.H;
        r2 = r15.n;
        r18 = r2.b();
        r24 = r0;
        r0 = r43;
        r23 = 2;
        r2 = r3;
        r3 = r16;
        r27 = 3;
        r4 = r24;
        r20 = -1;
        r24 = 0;
        r6 = r8;
        r8 = r7;
        r7 = r18;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
        r34 = r8;
        goto L_0x029e;
    L_0x029a:
        r24 = 0;
        r34 = r7;
    L_0x029e:
        r35 = r9;
        r36 = r10;
        r37 = r11;
        r18 = r12;
        r38 = r13;
        r16 = r25;
        goto L_0x02f4;
    L_0x02ab:
        r6 = r15.l;
        r2 = r15.n;
        r1 = r15.w;
        r22 = r1 + r8;
        r0 = r15.H;
        r28 = r13;
        r13 = r15.f;
        r14 = r15.h;
        r29 = r14;
        r14 = r15.i;
        r30 = r0;
        r0 = r42;
        r31 = r1;
        r1 = r43;
        r32 = r2;
        r2 = r4;
        r4 = r6;
        r33 = r5;
        r5 = r32;
        r6 = r31;
        r34 = r7;
        r7 = r22;
        r35 = r9;
        r9 = r33;
        r36 = r10;
        r10 = r30;
        r37 = r11;
        r11 = r18;
        r18 = r12;
        r12 = r16;
        r16 = r25;
        r38 = r28;
        r20 = r14;
        r14 = r29;
        r15 = r20;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        r15 = r42;
    L_0x02f4:
        r0 = r15.e;
        r1 = 2;
        if (r0 == r1) goto L_0x04d4;
    L_0x02f9:
        r0 = r15.ae;
        if (r0 != r1) goto L_0x0304;
    L_0x02fd:
        r0 = r15 instanceof defpackage.dg;
        if (r0 != 0) goto L_0x0302;
    L_0x0301:
        goto L_0x0304;
    L_0x0302:
        r2 = 1;
        goto L_0x0305;
    L_0x0304:
        r2 = 0;
    L_0x0305:
        if (r19 != 0) goto L_0x030c;
    L_0x0307:
        r14 = r38;
        r11 = 0;
        r13 = 1;
        goto L_0x0317;
    L_0x030c:
        r14 = r38;
        r13 = 1;
        if (r14 == r13) goto L_0x0316;
    L_0x0311:
        r0 = -1;
        if (r14 == r0) goto L_0x0316;
    L_0x0314:
        r11 = 0;
        goto L_0x0317;
    L_0x0316:
        r11 = 1;
    L_0x0317:
        r0 = r15.C;
        if (r0 <= 0) goto L_0x03d1;
    L_0x031b:
        r1 = r15.o;
        r12 = 5;
        r10 = r43;
        r3 = r35;
        r9 = r37;
        r10.c(r3, r9, r0, r12);
        r0 = r15.p;
        r3 = r0.b;
        if (r3 == 0) goto L_0x0332;
    L_0x032d:
        r1 = r15.C;
        r5 = r0;
        r8 = r1;
        goto L_0x0335;
    L_0x0332:
        r5 = r1;
        r8 = r34;
    L_0x0335:
        if (r11 == 0) goto L_0x038c;
    L_0x0337:
        r0 = r15.m;
        r1 = r0.b;
        if (r1 == 0) goto L_0x038c;
    L_0x033d:
        r1 = r15.o;
        r1 = r1.b;
        if (r1 == 0) goto L_0x038c;
    L_0x0343:
        r1 = r10.a(r0);
        r0 = r15.o;
        r6 = r10.a(r0);
        r0 = r15.m;
        r0 = r0.b;
        r2 = r10.a(r0);
        r0 = r15.o;
        r0 = r0.b;
        r5 = r10.a(r0);
        r0 = r15.m;
        r0 = r0.b();
        r8 = 3;
        r10.a(r1, r2, r0, r8);
        r0 = r15.o;
        r0 = r0.b();
        r0 = -r0;
        r10.b(r6, r5, r0, r8);
        if (r17 != 0) goto L_0x0386;
    L_0x0373:
        r0 = r15.m;
        r3 = r0.b();
        r4 = r15.I;
        r0 = r15.o;
        r7 = r0.b();
        r0 = r43;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
    L_0x0386:
        r37 = r9;
        r40 = r14;
        goto L_0x0461;
    L_0x038c:
        r7 = 3;
        r4 = r15.m;
        r6 = r15.x;
        r20 = r6 + r8;
        r3 = r15.E;
        r1 = r15.I;
        r0 = r15.g;
        r38 = r14;
        r14 = r15.j;
        r22 = r14;
        r14 = r15.k;
        r23 = r0;
        r0 = r42;
        r24 = r1;
        r1 = r43;
        r25 = r3;
        r3 = r21;
        r7 = r20;
        r39 = r9;
        r9 = r25;
        r10 = r24;
        r12 = r17;
        r13 = r23;
        r17 = r14;
        r40 = r38;
        r14 = r22;
        r15 = r17;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        r15 = r43;
        r8 = r34;
        r13 = r36;
        r14 = r39;
        r0 = 5;
        r15.c(r13, r14, r8, r0);
        goto L_0x0430;
    L_0x03d1:
        r15 = r43;
        r40 = r14;
        r8 = r34;
        r13 = r36;
        r14 = r37;
        r12 = r42;
        if (r11 == 0) goto L_0x0433;
    L_0x03df:
        r0 = r12.m;
        r1 = r0.b;
        if (r1 == 0) goto L_0x0433;
    L_0x03e5:
        r1 = r12.o;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0433;
    L_0x03eb:
        r1 = r15.a(r0);
        r0 = r12.o;
        r6 = r15.a(r0);
        r0 = r12.m;
        r0 = r0.b;
        r2 = r15.a(r0);
        r0 = r12.o;
        r0 = r0.b;
        r5 = r15.a(r0);
        r0 = r12.m;
        r0 = r0.b();
        r10 = 3;
        r15.a(r1, r2, r0, r10);
        r0 = r12.o;
        r0 = r0.b();
        r0 = -r0;
        r15.b(r6, r5, r0, r10);
        if (r17 != 0) goto L_0x042e;
    L_0x041b:
        r0 = r12.m;
        r3 = r0.b();
        r4 = r12.I;
        r0 = r12.o;
        r7 = r0.b();
        r0 = r43;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
    L_0x042e:
        r36 = r13;
    L_0x0430:
        r37 = r14;
        goto L_0x0461;
    L_0x0433:
        r10 = 3;
        r4 = r12.m;
        r5 = r12.o;
        r6 = r12.x;
        r7 = r6 + r8;
        r9 = r12.E;
        r3 = r12.I;
        r1 = r12.g;
        r0 = r12.j;
        r15 = r12.k;
        r20 = r0;
        r0 = r42;
        r22 = r1;
        r1 = r43;
        r23 = r3;
        r3 = r21;
        r10 = r23;
        r12 = r17;
        r36 = r13;
        r13 = r22;
        r37 = r14;
        r14 = r20;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
    L_0x0461:
        if (r19 == 0) goto L_0x04d1;
    L_0x0463:
        r0 = r43.b();
        r7 = r40;
        if (r7 != 0) goto L_0x047f;
    L_0x046b:
        r1 = r0;
        r2 = r18;
        r3 = r16;
        r4 = r36;
        r5 = r37;
        r6 = r26;
        r1.a(r2, r3, r4, r5, r6);
        r8 = r43;
        r8.a(r0);
        goto L_0x04d1;
    L_0x047f:
        r8 = r43;
        r1 = 1;
        if (r7 == r1) goto L_0x04bb;
    L_0x0484:
        r7 = r42;
        r1 = r7.h;
        r5 = r16;
        r4 = r18;
        r2 = 3;
        if (r1 <= 0) goto L_0x0492;
    L_0x048f:
        r8.a(r4, r5, r1, r2);
    L_0x0492:
        r1 = r7.j;
        r9 = r36;
        r6 = r37;
        if (r1 <= 0) goto L_0x049d;
    L_0x049a:
        r8.a(r9, r6, r1, r2);
    L_0x049d:
        r1 = r0;
        r2 = r4;
        r3 = r5;
        r4 = r9;
        r5 = r6;
        r6 = r26;
        r1.a(r2, r3, r4, r5, r6);
        r1 = r43.d();
        r2 = r43.d();
        r3 = 4;
        r1.c = r3;
        r2.c = r3;
        r0.a(r1, r2);
        r8.a(r0);
        return;
    L_0x04bb:
        r7 = r42;
        r5 = r16;
        r4 = r18;
        r9 = r36;
        r6 = r37;
        r1 = r0;
        r2 = r9;
        r3 = r6;
        r6 = r26;
        r1.a(r2, r3, r4, r5, r6);
        r8.a(r0);
        return;
    L_0x04d1:
        r7 = r42;
        return;
    L_0x04d4:
        r7 = r15;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh.a(db):void");
    }

    private final void a(db dbVar, boolean z, boolean z2, df dfVar, df dfVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        db dbVar2 = dbVar;
        Object obj = dfVar;
        Object obj2 = dfVar2;
        int i8 = i;
        int i9 = i2;
        int i10 = i4;
        int i11 = i6;
        int i12 = i7;
        dc a = dbVar2.a(obj);
        dc a2 = dbVar2.a(obj2);
        dc a3 = dbVar2.a(obj.b);
        dc a4 = dbVar2.a(obj2.b);
        int b = dfVar.b();
        int b2 = dfVar2.b();
        int i13 = this.K;
        int i14 = i13 != 8 ? i3 : 0;
        boolean z5 = i13 != 8 ? z2 : true;
        cw b3;
        cw b4;
        if (a3 == null && a4 == null) {
            cw b5 = dbVar.b();
            b5.a(a, i8);
            dbVar2.a(b5);
            if (!z3) {
                if (z) {
                    dbVar2.a(db.a(dbVar2, a2, a, i10, true));
                } else if (z5) {
                    dbVar2.a(db.a(dbVar2, a2, a, i14, false));
                } else {
                    b3 = dbVar.b();
                    b3.a(a2, i9);
                    dbVar2.a(b3);
                }
            }
        } else if (a3 != null && a4 == null) {
            cw b6 = dbVar.b();
            b6.a(a, a3, b);
            dbVar2.a(b6);
            if (z) {
                dbVar2.a(db.a(dbVar2, a2, a, i10, true));
            } else if (!z3) {
                if (z5) {
                    b3 = dbVar.b();
                    b3.a(a2, a, i14);
                    dbVar2.a(b3);
                    return;
                }
                b3 = dbVar.b();
                b3.a(a2, i9);
                dbVar2.a(b3);
            }
        } else if (a3 == null && a4 != null) {
            b4 = dbVar.b();
            b4.a(a2, a4, -b2);
            dbVar2.a(b4);
            if (z) {
                dbVar2.a(db.a(dbVar2, a2, a, i10, true));
            } else if (!z3) {
                if (z5) {
                    b3 = dbVar.b();
                    b3.a(a2, a, i14);
                    dbVar2.a(b3);
                    return;
                }
                b3 = dbVar.b();
                b3.a(a, i8);
                dbVar2.a(b3);
            }
        } else if (z5) {
            if (z) {
                dbVar2.a(db.a(dbVar2, a2, a, i10, true));
            } else {
                b4 = dbVar.b();
                b4.a(a2, a, i14);
                dbVar2.a(b4);
            }
            df dfVar3 = dfVar;
            boolean z6 = true;
            i9 = dfVar3.g;
            df dfVar4 = dfVar2;
            if (i9 != dfVar4.g) {
                dc c;
                cw b7;
                if (i9 == 2) {
                    b3 = dbVar.b();
                    b3.a(a, a3, b);
                    dbVar2.a(b3);
                    c = dbVar.c();
                    b7 = dbVar.b();
                    b7.b(a2, a4, c, -b2);
                    dbVar2.a(b7);
                    return;
                }
                c = dbVar.c();
                b7 = dbVar.b();
                b7.a(a, a3, c, b);
                dbVar2.a(b7);
                b3 = dbVar.b();
                b3.a(a2, a4, -b2);
                dbVar2.a(b3);
            } else if (a3 == a4) {
                dbVar2.a(db.a(dbVar, a, a3, 0, 0.5f, a4, a2, 0, true));
            } else if (!z4) {
                dbVar2.a(db.b(dbVar2, a, a3, b, dfVar3.h != 2));
                if (dfVar4.h == 2) {
                    z6 = false;
                }
                dbVar2.a(db.c(dbVar2, a2, a4, -b2, z6));
                dbVar2.a(db.a(dbVar, a, a3, b, f, a4, a2, b2, false));
            }
        } else if (z3) {
            dbVar2.a(a, a3, b, 3);
            dbVar2.b(a2, a4, -b2, 3);
            dbVar2.a(db.a(dbVar, a, a3, b, f, a4, a2, b2, true));
        } else if (!z4) {
            if (i5 == 1) {
                if (i11 > i14) {
                    i14 = i11;
                }
                if (i12 > 0) {
                    if (i12 >= i14) {
                        dbVar2.b(a2, a, i12, 3);
                    } else {
                        i14 = i12;
                    }
                }
                dbVar2.c(a2, a, i14, 3);
                dbVar2.a(a, a3, b, 2);
                dbVar2.b(a2, a4, -b2, 2);
                dbVar.a(a, a3, b, f, a4, a2, b2);
            } else if (i11 == 0 && i12 == 0) {
                b3 = dbVar.b();
                b3.a(a, a3, b);
                dbVar2.a(b3);
                b3 = dbVar.b();
                b3.a(a2, a4, -b2);
                dbVar2.a(b3);
            } else {
                if (i12 > 0) {
                    dbVar2.b(a2, a, i12, 3);
                }
                dbVar2.a(a, a3, b, 2);
                dbVar2.b(a2, a4, -b2, 2);
                dbVar.a(a, a3, b, f, a4, a2, b2);
            }
        }
    }

    /* JADX WARNING: Missing block: B:6:0x0031, code skipped:
            if (r2 >= r0) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:11:0x003a, code skipped:
            if (r3 >= r1) goto L_0x003c;
     */
    public void n() {
        /*
        r4 = this;
        r0 = r4.l;
        r0 = defpackage.db.b(r0);
        r1 = r4.m;
        r1 = defpackage.db.b(r1);
        r2 = r4.n;
        r2 = defpackage.db.b(r2);
        r2 = r2 - r0;
        r3 = r4.o;
        r3 = defpackage.db.b(r3);
        r3 = r3 - r1;
        r4.w = r0;
        r4.x = r1;
        r0 = r4.K;
        r1 = 8;
        if (r0 != r1) goto L_0x002a;
    L_0x0024:
        r0 = 0;
        r4.s = r0;
        r4.t = r0;
        goto L_0x004d;
    L_0x002a:
        r0 = r4.ad;
        r1 = 1;
        if (r0 != r1) goto L_0x0033;
    L_0x002f:
        r0 = r4.s;
        if (r2 < r0) goto L_0x0034;
    L_0x0033:
        r0 = r2;
    L_0x0034:
        r2 = r4.ae;
        if (r2 != r1) goto L_0x003c;
    L_0x0038:
        r1 = r4.t;
        if (r3 < r1) goto L_0x003d;
    L_0x003c:
        r1 = r3;
    L_0x003d:
        r4.s = r0;
        r4.t = r1;
        r2 = r4.E;
        if (r1 >= r2) goto L_0x0047;
    L_0x0045:
        r4.t = r2;
    L_0x0047:
        r1 = r4.D;
        if (r0 >= r1) goto L_0x004d;
    L_0x004b:
        r4.s = r1;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh.n():void");
    }

    public final void a(int i, dh dhVar, int i2, int i3, int i4) {
        e(i).a(dhVar.e(i2), i3, i4, 2, 0, true);
    }

    public df e(int i) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 1:
                    return this.l;
                case 2:
                    return this.m;
                case 3:
                    return this.n;
                case 4:
                    return this.o;
                case 5:
                    return this.p;
                case 6:
                    return this.c;
                case 7:
                    return this.a;
                case 8:
                    return this.b;
                default:
                    return null;
            }
        }
        throw null;
    }

    public final void f(int i) {
        this.ad = i;
        if (i == 2) {
            a(this.F);
        }
    }

    public final void g(int i) {
        this.ae = i;
        if (i == 2) {
            b(this.G);
        }
    }
}

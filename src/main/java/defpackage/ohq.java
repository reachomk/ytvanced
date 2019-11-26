package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ohq */
public final class ohq implements ofm, ofu {
    private static final int a = ozp.f("qt  ");
    private final int b;
    private final oza c;
    private final oza d;
    private final oza e;
    private final oza f;
    private final ArrayDeque g;
    private int h;
    private int i;
    private long j;
    private int k;
    private oza l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private ofo q;
    private oht[] r;
    private long[][] s;
    private int t;
    private long u;
    private boolean v;

    public ohq() {
        this((byte) 0);
    }

    public final boolean aS_() {
        return true;
    }

    public final void c() {
    }

    public ohq(byte b) {
        this.b = 0;
        this.f = new oza(16);
        this.g = new ArrayDeque();
        this.c = new oza(oyw.a);
        this.d = new oza(4);
        this.e = new oza();
        this.m = -1;
    }

    public final boolean a(ofp ofp) {
        return ohu.a(ofp, false);
    }

    public final void a(ofo ofo) {
        this.q = ofo;
    }

    public final void a(long j, long j2) {
        this.g.clear();
        int i = 0;
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = false;
        if (j == 0) {
            d();
            return;
        }
        oht[] ohtArr = this.r;
        if (ohtArr != null) {
            int length = ohtArr.length;
            while (i < length) {
                oht oht = ohtArr[i];
                ohy ohy = oht.b;
                int a = ohy.a(j2);
                if (a == -1) {
                    a = ohy.b(j2);
                }
                oht.d = a;
                i++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x015d  */
    public final int a(defpackage.ofp r36, defpackage.ofv r37) {
        /*
        r35 = this;
        r0 = r35;
        r1 = r36;
        r2 = r37;
    L_0x0006:
        r3 = r0.h;
        r4 = 0;
        r7 = -1;
        r8 = 8;
        r9 = 1;
        if (r3 == 0) goto L_0x021d;
    L_0x0010:
        r11 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r13 = 2;
        if (r3 == r9) goto L_0x01a0;
    L_0x0016:
        if (r3 != r13) goto L_0x019a;
    L_0x0018:
        r3 = r1;
        r3 = (defpackage.ofl) r3;
        r14 = r3.c;
        r3 = r0.m;
        if (r3 == r7) goto L_0x0023;
    L_0x0021:
        goto L_0x00a8;
    L_0x0023:
        r16 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r18 = r16;
        r22 = r18;
        r24 = r22;
        r3 = 0;
        r6 = 1;
        r8 = 1;
        r20 = -1;
        r21 = -1;
    L_0x0035:
        r13 = r0.r;
        r10 = r13.length;
        if (r3 >= r10) goto L_0x007e;
    L_0x003a:
        r10 = r13[r3];
        r13 = r10.d;
        r10 = r10.b;
        r9 = r10.b;
        if (r13 == r9) goto L_0x007a;
    L_0x0044:
        r9 = r10.c;
        r28 = r9[r13];
        r9 = r0.s;
        r9 = r9[r3];
        r30 = r9[r13];
        r9 = r28 - r14;
        r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r13 < 0) goto L_0x005b;
    L_0x0054:
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 < 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r13 = 0;
        goto L_0x005c;
    L_0x005b:
        r13 = 1;
    L_0x005c:
        if (r13 != 0) goto L_0x0061;
    L_0x005e:
        if (r6 == 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0069;
    L_0x0061:
        if (r13 == r6) goto L_0x0064;
    L_0x0063:
        goto L_0x0070;
    L_0x0064:
        r28 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1));
        if (r28 < 0) goto L_0x0069;
    L_0x0068:
        goto L_0x0070;
    L_0x0069:
        r20 = r3;
        r22 = r9;
        r6 = r13;
        r24 = r30;
    L_0x0070:
        r9 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1));
        if (r9 < 0) goto L_0x0075;
    L_0x0074:
        goto L_0x007a;
    L_0x0075:
        r21 = r3;
        r8 = r13;
        r18 = r30;
    L_0x007a:
        r3 = r3 + 1;
        r9 = 1;
        goto L_0x0035;
    L_0x007e:
        r3 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1));
        if (r3 != 0) goto L_0x0083;
    L_0x0082:
        goto L_0x0092;
    L_0x0083:
        if (r8 == 0) goto L_0x0092;
    L_0x0085:
        r8 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r18 = r18 + r8;
        r3 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1));
        if (r3 >= 0) goto L_0x008f;
    L_0x008e:
        goto L_0x0092;
    L_0x008f:
        r3 = r21;
        goto L_0x0094;
    L_0x0092:
        r3 = r20;
    L_0x0094:
        r0.m = r3;
        if (r3 == r7) goto L_0x0197;
    L_0x0098:
        r3 = r13[r3];
        r3 = r3.a;
        r3 = r3.f;
        r3 = r3.i;
        r6 = "audio/ac4";
        r3 = r6.equals(r3);
        r0.p = r3;
    L_0x00a8:
        r3 = r0.r;
        r6 = r0.m;
        r3 = r3[r6];
        r6 = r3.c;
        r8 = r3.d;
        r9 = r3.b;
        r10 = r9.c;
        r11 = r10[r8];
        r9 = r9.d;
        r9 = r9[r8];
        r14 = r11 - r14;
        r10 = r0.n;
        r18 = r8;
        r7 = (long) r10;
        r14 = r14 + r7;
        r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r7 >= 0) goto L_0x00ca;
    L_0x00c8:
        goto L_0x0192;
    L_0x00ca:
        r4 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r7 >= 0) goto L_0x0192;
    L_0x00d1:
        r2 = r3.a;
        r2 = r2.g;
        r4 = 1;
        if (r2 != r4) goto L_0x00dd;
    L_0x00d8:
        r4 = 8;
        r14 = r14 + r4;
        r9 = r9 + -8;
    L_0x00dd:
        r2 = (int) r14;
        r1.a(r2);
        r2 = r3.a;
        r2 = r2.j;
        if (r2 == 0) goto L_0x013e;
    L_0x00e7:
        r4 = r0.d;
        r4 = r4.a;
        r5 = 0;
        r4[r5] = r5;
        r7 = 1;
        r4[r7] = r5;
        r7 = 2;
        r4[r7] = r5;
        r7 = 4;
        r8 = 4 - r2;
    L_0x00f7:
        r7 = r0.n;
        if (r7 >= r9) goto L_0x013b;
    L_0x00fb:
        r7 = r0.o;
        if (r7 != 0) goto L_0x012b;
    L_0x00ff:
        r1.b(r4, r8, r2);
        r7 = r0.d;
        r7.c(r5);
        r7 = r0.d;
        r7 = r7.k();
        if (r7 < 0) goto L_0x0123;
    L_0x010f:
        r0.o = r7;
        r7 = r0.c;
        r7.c(r5);
        r5 = r0.c;
        r7 = 4;
        r6.a(r5, r7);
        r5 = r0.n;
        r5 = r5 + r7;
        r0.n = r5;
        r9 = r9 + r8;
        goto L_0x0139;
    L_0x0123:
        r1 = new oae;
        r2 = "Invalid NAL length";
        r1.<init>(r2);
        throw r1;
    L_0x012b:
        r7 = r6.a(r1, r7, r5);
        r5 = r0.n;
        r5 = r5 + r7;
        r0.n = r5;
        r5 = r0.o;
        r5 = r5 - r7;
        r0.o = r5;
    L_0x0139:
        r5 = 0;
        goto L_0x00f7;
    L_0x013b:
        r32 = r9;
        goto L_0x016e;
    L_0x013e:
        r2 = r0.p;
        if (r2 == 0) goto L_0x0158;
    L_0x0142:
        r2 = r0.e;
        defpackage.obg.a(r9, r2);
        r2 = r0.e;
        r4 = r2.c;
        r6.a(r2, r4);
        r9 = r9 + r4;
        r2 = r0.n;
        r2 = r2 + r4;
        r0.n = r2;
        r2 = 0;
        r0.p = r2;
        goto L_0x0159;
    L_0x0158:
        r2 = 0;
    L_0x0159:
        r4 = r0.n;
        if (r4 >= r9) goto L_0x013b;
    L_0x015d:
        r4 = r9 - r4;
        r4 = r6.a(r1, r4, r2);
        r2 = r0.n;
        r2 = r2 + r4;
        r0.n = r2;
        r2 = r0.o;
        r2 = r2 - r4;
        r0.o = r2;
        goto L_0x0158;
    L_0x016e:
        r1 = r3.b;
        r2 = r1.f;
        r29 = r2[r18];
        r1 = r1.g;
        r31 = r1[r18];
        r33 = 0;
        r34 = 0;
        r28 = r6;
        r28.a(r29, r31, r32, r33, r34);
        r1 = r3.d;
        r2 = 1;
        r1 = r1 + r2;
        r3.d = r1;
        r1 = -1;
        r0.m = r1;
        r1 = 0;
        r0.n = r1;
        r0.o = r1;
        r27 = 0;
        goto L_0x0199;
    L_0x0192:
        r2.a = r11;
        r27 = 1;
        goto L_0x0199;
    L_0x0197:
        r27 = -1;
    L_0x0199:
        return r27;
    L_0x019a:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x01a0:
        r3 = r0.j;
        r5 = r0.k;
        r6 = (long) r5;
        r3 = r3 - r6;
        r6 = r1;
        r6 = (defpackage.ofl) r6;
        r6 = r6.c;
        r6 = r6 + r3;
        r9 = r0.l;
        if (r9 == 0) goto L_0x01ff;
    L_0x01b0:
        r9 = r9.a;
        r4 = (int) r3;
        r1.b(r9, r5, r4);
        r3 = r0.i;
        r4 = defpackage.ogy.a;
        if (r3 != r4) goto L_0x01e2;
    L_0x01bc:
        r3 = r0.l;
        r3.c(r8);
        r4 = r3.k();
        r5 = a;
        if (r4 == r5) goto L_0x01de;
    L_0x01c9:
        r4 = 4;
        r3.d(r4);
    L_0x01cd:
        r4 = r3.b();
        if (r4 <= 0) goto L_0x01dc;
    L_0x01d3:
        r4 = r3.k();
        r5 = a;
        if (r4 != r5) goto L_0x01cd;
    L_0x01db:
        goto L_0x01de;
    L_0x01dc:
        r3 = 0;
        goto L_0x01df;
    L_0x01de:
        r3 = 1;
    L_0x01df:
        r0.v = r3;
        goto L_0x020a;
    L_0x01e2:
        r3 = r0.g;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x020a;
    L_0x01ea:
        r3 = r0.g;
        r3 = r3.peek();
        r3 = (defpackage.ohb) r3;
        r4 = new oha;
        r5 = r0.i;
        r8 = r0.l;
        r4.<init>(r5, r8);
        r3.a(r4);
        goto L_0x020a;
    L_0x01ff:
        r8 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r5 >= 0) goto L_0x020d;
    L_0x0206:
        r4 = (int) r3;
        r1.a(r4);
    L_0x020a:
        r26 = 0;
        goto L_0x0211;
    L_0x020d:
        r2.a = r6;
        r26 = 1;
    L_0x0211:
        r0.b(r6);
        if (r26 == 0) goto L_0x0006;
    L_0x0216:
        r3 = r0.h;
        r4 = 2;
        if (r3 == r4) goto L_0x0006;
    L_0x021b:
        r3 = 1;
        return r3;
    L_0x021d:
        r3 = 1;
        r6 = r0.k;
        if (r6 != 0) goto L_0x0247;
    L_0x0222:
        r6 = r0.f;
        r6 = r6.a;
        r7 = 0;
        r6 = r1.a(r6, r7, r8, r3);
        if (r6 == 0) goto L_0x0245;
    L_0x022d:
        r0.k = r8;
        r3 = r0.f;
        r3.c(r7);
        r3 = r0.f;
        r6 = r3.i();
        r0.j = r6;
        r3 = r0.f;
        r3 = r3.k();
        r0.i = r3;
        goto L_0x0247;
    L_0x0245:
        r3 = -1;
        return r3;
    L_0x0247:
        r6 = r0.j;
        r9 = 1;
        r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r3 != 0) goto L_0x0264;
    L_0x024f:
        r3 = r0.f;
        r3 = r3.a;
        r1.b(r3, r8, r8);
        r3 = r0.k;
        r3 = r3 + r8;
        r0.k = r3;
        r3 = r0.f;
        r3 = r3.q();
        r0.j = r3;
        goto L_0x0292;
    L_0x0264:
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 != 0) goto L_0x0292;
    L_0x0268:
        r3 = r1;
        r3 = (defpackage.ofl) r3;
        r4 = r3.b;
        r6 = -1;
        r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r9 != 0) goto L_0x0285;
    L_0x0273:
        r9 = r0.g;
        r9 = r9.isEmpty();
        if (r9 != 0) goto L_0x0285;
    L_0x027b:
        r4 = r0.g;
        r4 = r4.peek();
        r4 = (defpackage.ohb) r4;
        r4 = r4.bg;
    L_0x0285:
        r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r9 == 0) goto L_0x0292;
    L_0x0289:
        r6 = r3.c;
        r4 = r4 - r6;
        r3 = r0.k;
        r6 = (long) r3;
        r4 = r4 + r6;
        r0.j = r4;
    L_0x0292:
        r3 = r0.j;
        r5 = r0.k;
        r5 = (long) r5;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 < 0) goto L_0x0395;
    L_0x029b:
        r3 = r0.i;
        r4 = defpackage.ogy.Q;
        if (r3 == r4) goto L_0x033f;
    L_0x02a1:
        r4 = defpackage.ogy.S;
        if (r3 == r4) goto L_0x033f;
    L_0x02a5:
        r4 = defpackage.ogy.T;
        if (r3 == r4) goto L_0x033f;
    L_0x02a9:
        r4 = defpackage.ogy.U;
        if (r3 == r4) goto L_0x033f;
    L_0x02ad:
        r4 = defpackage.ogy.V;
        if (r3 == r4) goto L_0x033f;
    L_0x02b1:
        r4 = defpackage.ogy.ac;
        if (r3 == r4) goto L_0x033f;
    L_0x02b5:
        r4 = defpackage.ogy.aN;
        if (r3 == r4) goto L_0x033f;
    L_0x02b9:
        r3 = r0.i;
        r4 = defpackage.ogy.ae;
        if (r3 == r4) goto L_0x030b;
    L_0x02bf:
        r4 = defpackage.ogy.R;
        if (r3 == r4) goto L_0x030b;
    L_0x02c3:
        r4 = defpackage.ogy.af;
        if (r3 == r4) goto L_0x030b;
    L_0x02c7:
        r4 = defpackage.ogy.ag;
        if (r3 == r4) goto L_0x030b;
    L_0x02cb:
        r4 = defpackage.ogy.ay;
        if (r3 == r4) goto L_0x030b;
    L_0x02cf:
        r4 = defpackage.ogy.az;
        if (r3 == r4) goto L_0x030b;
    L_0x02d3:
        r4 = defpackage.ogy.aA;
        if (r3 == r4) goto L_0x030b;
    L_0x02d7:
        r4 = defpackage.ogy.ad;
        if (r3 == r4) goto L_0x030b;
    L_0x02db:
        r4 = defpackage.ogy.aB;
        if (r3 == r4) goto L_0x030b;
    L_0x02df:
        r4 = defpackage.ogy.aC;
        if (r3 == r4) goto L_0x030b;
    L_0x02e3:
        r4 = defpackage.ogy.aD;
        if (r3 == r4) goto L_0x030b;
    L_0x02e7:
        r4 = defpackage.ogy.aE;
        if (r3 == r4) goto L_0x030b;
    L_0x02eb:
        r4 = defpackage.ogy.aF;
        if (r3 == r4) goto L_0x030b;
    L_0x02ef:
        r4 = defpackage.ogy.ab;
        if (r3 == r4) goto L_0x030b;
    L_0x02f3:
        r4 = defpackage.ogy.a;
        if (r3 == r4) goto L_0x030b;
    L_0x02f7:
        r4 = defpackage.ogy.aM;
        if (r3 == r4) goto L_0x030b;
    L_0x02fb:
        r4 = defpackage.ogy.aO;
        if (r3 == r4) goto L_0x030b;
    L_0x02ff:
        r4 = defpackage.ogy.aP;
        if (r3 == r4) goto L_0x030b;
    L_0x0303:
        r3 = 0;
        r0.l = r3;
        r3 = 1;
        r0.h = r3;
        goto L_0x0006;
    L_0x030b:
        r3 = r0.k;
        if (r3 != r8) goto L_0x0311;
    L_0x030f:
        r3 = 1;
        goto L_0x0312;
    L_0x0311:
        r3 = 0;
    L_0x0312:
        defpackage.oxz.b(r3);
        r3 = r0.j;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 > 0) goto L_0x0320;
    L_0x031e:
        r3 = 1;
        goto L_0x0321;
    L_0x0320:
        r3 = 0;
    L_0x0321:
        defpackage.oxz.b(r3);
        r3 = new oza;
        r4 = r0.j;
        r5 = (int) r4;
        r3.<init>(r5);
        r0.l = r3;
        r3 = r0.f;
        r3 = r3.a;
        r4 = r0.l;
        r4 = r4.a;
        r5 = 0;
        java.lang.System.arraycopy(r3, r5, r4, r5, r8);
        r3 = 1;
        r0.h = r3;
        goto L_0x0006;
    L_0x033f:
        r3 = r1;
        r3 = (defpackage.ofl) r3;
        r3 = r3.c;
        r5 = r0.j;
        r3 = r3 + r5;
        r5 = r0.k;
        r5 = (long) r5;
        r3 = r3 - r5;
        r5 = r0.g;
        r6 = new ohb;
        r7 = r0.i;
        r6.<init>(r7, r3);
        r5.push(r6);
        r5 = r0.j;
        r7 = r0.k;
        r9 = (long) r7;
        r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r7 != 0) goto L_0x0365;
    L_0x0360:
        r0.b(r3);
        goto L_0x0006;
    L_0x0365:
        r3 = r0.i;
        r4 = defpackage.ogy.aN;
        if (r3 == r4) goto L_0x036c;
    L_0x036b:
        goto L_0x0390;
    L_0x036c:
        r3 = r0.e;
        r3.a(r8);
        r3 = r0.e;
        r3 = r3.a;
        r4 = 0;
        r1.c(r3, r4, r8);
        r3 = r0.e;
        r4 = 4;
        r3.d(r4);
        r3 = r0.e;
        r3 = r3.k();
        r5 = defpackage.ogy.af;
        if (r3 != r5) goto L_0x038d;
    L_0x0389:
        r36.a();
        goto L_0x0390;
    L_0x038d:
        r1.a(r4);
    L_0x0390:
        r35.d();
        goto L_0x0006;
    L_0x0395:
        r1 = new oae;
        r2 = "Atom size less than header length (unsupported).";
        r1.<init>(r2);
        goto L_0x039e;
    L_0x039d:
        throw r1;
    L_0x039e:
        goto L_0x039d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohq.a(ofp, ofv):int");
    }

    public final long b() {
        return this.u;
    }

    public final ofx a(long j) {
        oht[] ohtArr = this.r;
        if (ohtArr.length == 0) {
            return new ofx(ofz.a);
        }
        long j2;
        long j3;
        long j4;
        int i = this.t;
        long j5 = -1;
        if (i != -1) {
            ohy ohy = ohtArr[i].b;
            i = ohq.a(ohy, j);
            if (i == -1) {
                return new ofx(ofz.a);
            }
            j2 = ohy.f[i];
            j3 = ohy.c[i];
            if (j2 < j && i < ohy.b - 1) {
                int b = ohy.b(j);
                if (!(b == -1 || b == i)) {
                    j4 = ohy.f[b];
                    j5 = ohy.c[b];
                    j = j2;
                }
            }
            j4 = -9223372036854775807L;
            j = j2;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            oht[] ohtArr2 = this.r;
            if (i2 >= ohtArr2.length) {
                break;
            }
            if (i2 != this.t) {
                ohy ohy2 = ohtArr2[i2].b;
                j2 = ohq.a(ohy2, j, j3);
                if (j4 != -9223372036854775807L) {
                    j5 = ohq.a(ohy2, j4, j5);
                }
                j3 = j2;
            }
            i2++;
        }
        ofz ofz = new ofz(j, j3);
        if (j4 == -9223372036854775807L) {
            return new ofx(ofz);
        }
        return new ofx(ofz, new ofz(j4, j5));
    }

    private final void d() {
        this.h = 0;
        this.k = 0;
    }

    private final void b(long j) {
        while (!this.g.isEmpty() && ((ohb) this.g.peek()).bg == j) {
            ohb ohb = (ohb) this.g.pop();
            if (ohb.bf == ogy.Q) {
                olj a;
                long j2;
                int i;
                ArrayList arrayList = new ArrayList();
                ofq ofq = new ofq();
                oha d = ohb.d(ogy.aM);
                olj olj = null;
                if (d != null) {
                    a = ohd.a(d, this.v);
                    if (a != null) {
                        ofq.a(a);
                    }
                } else {
                    a = null;
                }
                ohb e = ohb.e(ogy.aN);
                if (e != null) {
                    olj = ohd.a(e);
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < ohb.bi.size(); i2++) {
                    ohb ohb2 = (ohb) ohb.bi.get(i2);
                    if (ohb2.bf == ogy.S) {
                        ohx a2 = ohd.a(ohb2, ohb.d(ogy.R), -9223372036854775807L, null, false, this.v);
                        if (a2 != null) {
                            ohy a3 = ohd.a(a2, ohb2.e(ogy.T).e(ogy.U).e(ogy.V), ofq);
                            if (a3.b != 0) {
                                arrayList2.add(a3);
                            }
                        }
                    }
                }
                int size = arrayList2.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    nzw a4;
                    ohy ohy = (ohy) arrayList2.get(i3);
                    ohx ohx = ohy.a;
                    List list = arrayList;
                    long j5 = ohx.e;
                    if (j5 == j3) {
                        j5 = ohy.h;
                    }
                    j4 = Math.max(j4, j5);
                    int i5 = size;
                    oht oht = new oht(ohx, ohy, this.q.a(i3, ohx.b));
                    size = ohy.e;
                    nzw nzw = ohx.f;
                    ArrayList arrayList3 = arrayList2;
                    long j6 = j4;
                    nzw nzw2 = new nzw(nzw.a, nzw.b, nzw.c, nzw.d, nzw.e, nzw.f, nzw.g, nzw.h, nzw.i, size + 30, nzw.k, nzw.l, nzw.m, nzw.n, nzw.o, nzw.p, nzw.q, nzw.r, nzw.t, nzw.s, nzw.u, nzw.v, nzw.w, nzw.x, nzw.y, nzw.z, nzw.A, nzw.B);
                    if (ohx.b == 2 && j5 > 0) {
                        size = ohy.b;
                        if (size > 1) {
                            a4 = nzw2.a(((float) size) / (((float) j5) / 1000000.0f));
                        }
                    }
                    oht.c.a(ohr.a(ohx.b, a4, a, olj, ofq));
                    if (ohx.b == 2) {
                        if (i4 == -1) {
                            i4 = list.size();
                        }
                    }
                    List list2 = list;
                    list2.add(oht);
                    i3++;
                    List arrayList4 = list2;
                    size = i5;
                    arrayList2 = arrayList3;
                    j4 = j6;
                    j3 = -9223372036854775807L;
                }
                ArrayList arrayList5 = arrayList4;
                this.t = i4;
                this.u = j4;
                this.r = (oht[]) arrayList5.toArray(new oht[0]);
                oht[] ohtArr = this.r;
                int length = ohtArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (i = 0; i < ohtArr.length; i++) {
                    jArr[i] = new long[ohtArr[i].b.b];
                    jArr2[i] = ohtArr[i].b.f[0];
                }
                i = 0;
                while (i < ohtArr.length) {
                    int i6;
                    long j7 = Long.MAX_VALUE;
                    int i7 = -1;
                    for (i6 = 0; i6 < ohtArr.length; i6++) {
                        if (!zArr[i6]) {
                            long j8 = jArr2[i6];
                            if (j8 <= j7) {
                                i7 = i6;
                                j7 = j8;
                            }
                        }
                    }
                    i6 = iArr[i7];
                    long[] jArr3 = jArr[i7];
                    jArr3[i6] = j2;
                    ohy ohy2 = ohtArr[i7].b;
                    j2 += (long) ohy2.d[i6];
                    i6++;
                    iArr[i7] = i6;
                    if (i6 < jArr3.length) {
                        jArr2[i7] = ohy2.f[i6];
                    } else {
                        zArr[i7] = true;
                        i++;
                    }
                }
                this.s = jArr;
                this.q.a();
                this.q.a(this);
                this.g.clear();
                this.h = 2;
            } else if (!this.g.isEmpty()) {
                ((ohb) this.g.peek()).a(ohb);
            }
        }
        if (this.h != 2) {
            d();
        }
    }

    private static long a(ohy ohy, long j, long j2) {
        int a = ohq.a(ohy, j);
        return a != -1 ? Math.min(ohy.c[a], j2) : j2;
    }

    private static int a(ohy ohy, long j) {
        int a = ohy.a(j);
        return a == -1 ? ohy.b(j) : a;
    }
}

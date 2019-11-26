package defpackage;

import java.util.Arrays;

/* renamed from: dg */
public final class dg extends dn {
    public int a = 2;
    private final db ag = new db();
    private dl ah;
    private int ai;
    private int aj;
    private int ak = 0;
    private int al = 0;
    private dh[] am = new dh[4];
    private dh[] an = new dh[4];
    private dh[] ao = new dh[4];
    private final boolean[] ap = new boolean[3];
    private final dh[] aq = new dh[4];
    public boolean b = false;
    public boolean c = false;

    public final void a() {
        this.ag.a();
        super.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:239:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06f3 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06f3 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06f3 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06f1  */
    /* JADX WARNING: Missing block: B:232:0x06cc, code skipped:
            if (r6.K == 8) goto L_0x06ce;
     */
    private final boolean b(defpackage.db r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r19.a(r20);
        r2 = r0.af;
        r2 = r2.size();
        r3 = r0.a;
        r4 = 4;
        r5 = 8;
        r6 = 0;
        r7 = 1;
        r8 = 2;
        if (r3 != r8) goto L_0x0018;
    L_0x0017:
        goto L_0x001c;
    L_0x0018:
        if (r3 == r4) goto L_0x001c;
    L_0x001a:
        r3 = 1;
        goto L_0x0073;
    L_0x001c:
        r3 = r0.af;
        r3 = r3.size();
        r9 = 0;
    L_0x0023:
        r10 = 3;
        r11 = -1;
        if (r9 >= r3) goto L_0x0043;
    L_0x0027:
        r12 = r0.af;
        r12 = r12.get(r9);
        r12 = (defpackage.dh) r12;
        r12.d = r11;
        r12.e = r11;
        r11 = r12.ad;
        if (r11 == r10) goto L_0x003c;
    L_0x0037:
        r11 = r12.ae;
        if (r11 == r10) goto L_0x003c;
    L_0x003b:
        goto L_0x0040;
    L_0x003c:
        r12.d = r7;
        r12.e = r7;
    L_0x0040:
        r9 = r9 + 1;
        goto L_0x0023;
    L_0x0043:
        r9 = 0;
        r12 = 0;
        r13 = 0;
    L_0x0046:
        if (r9 == 0) goto L_0x0144;
    L_0x0048:
        r9 = 0;
        r10 = 0;
        r12 = 0;
    L_0x004b:
        if (r9 >= r3) goto L_0x006c;
    L_0x004d:
        r13 = r0.af;
        r13 = r13.get(r9);
        r13 = (defpackage.dh) r13;
        r14 = r13.d;
        if (r14 != r7) goto L_0x005a;
    L_0x0059:
        goto L_0x005d;
    L_0x005a:
        if (r14 == r11) goto L_0x005d;
    L_0x005c:
        goto L_0x005f;
    L_0x005d:
        r10 = r10 + 1;
    L_0x005f:
        r13 = r13.e;
        if (r13 != r7) goto L_0x0064;
    L_0x0063:
        goto L_0x0067;
    L_0x0064:
        if (r13 == r11) goto L_0x0067;
    L_0x0066:
        goto L_0x0069;
    L_0x0067:
        r12 = r12 + 1;
    L_0x0069:
        r9 = r9 + 1;
        goto L_0x004b;
    L_0x006c:
        if (r10 == 0) goto L_0x0070;
    L_0x006e:
        r3 = 0;
        goto L_0x0073;
    L_0x0070:
        if (r12 == 0) goto L_0x0143;
    L_0x0072:
        goto L_0x006e;
    L_0x0073:
        if (r6 < r2) goto L_0x0084;
    L_0x0075:
        r2 = r0.ak;
        if (r2 <= 0) goto L_0x007c;
    L_0x0079:
        r19.c(r20);
    L_0x007c:
        r2 = r0.al;
        if (r2 <= 0) goto L_0x0083;
    L_0x0080:
        r19.d(r20);
    L_0x0083:
        return r7;
    L_0x0084:
        r9 = r0.af;
        r9 = r9.get(r6);
        r9 = (defpackage.dh) r9;
        r10 = r9 instanceof defpackage.dg;
        if (r10 == 0) goto L_0x00af;
    L_0x0090:
        r10 = r9.ad;
        r11 = r9.ae;
        if (r10 != r8) goto L_0x0099;
    L_0x0096:
        r9.f(r7);
    L_0x0099:
        if (r11 != r8) goto L_0x009e;
    L_0x009b:
        r9.g(r7);
    L_0x009e:
        r9.a(r1);
        if (r10 != r8) goto L_0x00a6;
    L_0x00a3:
        r9.f(r8);
    L_0x00a6:
        if (r11 == r8) goto L_0x00aa;
    L_0x00a8:
        goto L_0x013f;
    L_0x00aa:
        r9.g(r8);
        goto L_0x013f;
    L_0x00af:
        if (r3 == 0) goto L_0x013c;
    L_0x00b1:
        r10 = r0.ad;
        if (r10 == r8) goto L_0x00e9;
    L_0x00b5:
        r10 = r9.ad;
        if (r10 != r4) goto L_0x00e9;
    L_0x00b9:
        r10 = r9.l;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r9.n;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r9.l;
        r10 = r10.c;
        r11 = r19.d();
        r12 = r9.n;
        r12 = r12.c;
        r11 = r11 - r12;
        r12 = r9.l;
        r12 = r12.e;
        r1.a(r12, r10);
        r12 = r9.n;
        r12 = r12.e;
        r1.a(r12, r11);
        r9.b(r10, r11);
        r9.d = r8;
    L_0x00e9:
        r10 = r0.ae;
        if (r10 == r8) goto L_0x013c;
    L_0x00ed:
        r10 = r9.ae;
        if (r10 != r4) goto L_0x013c;
    L_0x00f1:
        r10 = r9.m;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r9.o;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r9.m;
        r10 = r10.c;
        r11 = r19.g();
        r12 = r9.o;
        r12 = r12.c;
        r11 = r11 - r12;
        r12 = r9.m;
        r12 = r12.e;
        r1.a(r12, r10);
        r12 = r9.o;
        r12 = r12.e;
        r1.a(r12, r11);
        r12 = r9.C;
        if (r12 <= 0) goto L_0x0121;
    L_0x0120:
        goto L_0x0125;
    L_0x0121:
        r12 = r9.K;
        if (r12 != r5) goto L_0x0137;
    L_0x0125:
        r12 = r9.p;
        r13 = r1.a(r12);
        r12.e = r13;
        r12 = r9.p;
        r12 = r12.e;
        r13 = r9.C;
        r13 = r13 + r10;
        r1.a(r12, r13);
    L_0x0137:
        r9.c(r10, r11);
        r9.e = r8;
    L_0x013c:
        r9.a(r1);
    L_0x013f:
        r6 = r6 + 1;
        goto L_0x0073;
    L_0x0143:
        return r6;
    L_0x0144:
        r5 = 0;
        r14 = 0;
        r15 = 0;
    L_0x0147:
        if (r14 < r3) goto L_0x015a;
    L_0x0149:
        if (r15 != 0) goto L_0x014f;
    L_0x014b:
        if (r5 != 0) goto L_0x014f;
    L_0x014d:
        r9 = 1;
        goto L_0x0154;
    L_0x014f:
        if (r12 == r15) goto L_0x0152;
    L_0x0151:
        goto L_0x0154;
    L_0x0152:
        if (r13 == r5) goto L_0x014d;
    L_0x0154:
        r13 = r5;
        r12 = r15;
        r5 = 8;
        goto L_0x0046;
    L_0x015a:
        r6 = r0.af;
        r6 = r6.get(r14);
        r6 = (defpackage.dh) r6;
        r4 = r6.d;
        r16 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r4 != r11) goto L_0x0390;
    L_0x0168:
        r4 = r0.ad;
        if (r4 != r8) goto L_0x0170;
    L_0x016c:
        r6.d = r7;
        goto L_0x0390;
    L_0x0170:
        r11 = r6.ad;
        if (r11 != r10) goto L_0x0178;
    L_0x0174:
        r6.d = r7;
        goto L_0x0390;
    L_0x0178:
        if (r4 != r8) goto L_0x017b;
    L_0x017a:
        goto L_0x01b0;
    L_0x017b:
        r4 = 4;
        if (r11 != r4) goto L_0x01b0;
    L_0x017e:
        r4 = r6.l;
        r11 = r1.a(r4);
        r4.e = r11;
        r4 = r6.n;
        r11 = r1.a(r4);
        r4.e = r11;
        r4 = r6.l;
        r4 = r4.c;
        r11 = r19.d();
        r7 = r6.n;
        r7 = r7.c;
        r11 = r11 - r7;
        r7 = r6.l;
        r7 = r7.e;
        r1.a(r7, r4);
        r7 = r6.n;
        r7 = r7.e;
        r1.a(r7, r11);
        r6.b(r4, r11);
        r6.d = r8;
        goto L_0x0390;
    L_0x01b0:
        r4 = r6.l;
        r7 = r4.b;
        if (r7 == 0) goto L_0x021f;
    L_0x01b6:
        r11 = r6.n;
        r11 = r11.b;
        if (r11 == 0) goto L_0x021f;
    L_0x01bc:
        r7 = r7.a;
        if (r7 != r0) goto L_0x021a;
    L_0x01c0:
        r7 = r11.a;
        if (r7 != r0) goto L_0x021a;
    L_0x01c4:
        r4 = r4.b();
        r7 = r6.n;
        r7 = r7.b();
        r11 = r0.ad;
        if (r11 != r10) goto L_0x01d8;
    L_0x01d2:
        r11 = r19.d();
        r11 = r11 - r7;
        goto L_0x01f5;
    L_0x01d8:
        r11 = r6.d();
        r17 = r19.d();
        r17 = r17 - r4;
        r17 = r17 - r7;
        r7 = r17 - r11;
        r7 = (float) r7;
        r11 = r6.H;
        r7 = r7 * r11;
        r7 = r7 + r16;
        r7 = (int) r7;
        r4 = r4 + r7;
        r7 = r6.d();
        r11 = r4 + r7;
    L_0x01f5:
        r7 = r6.l;
        r10 = r1.a(r7);
        r7.e = r10;
        r7 = r6.n;
        r10 = r1.a(r7);
        r7.e = r10;
        r7 = r6.l;
        r7 = r7.e;
        r1.a(r7, r4);
        r7 = r6.n;
        r7 = r7.e;
        r1.a(r7, r11);
        r6.d = r8;
        r6.b(r4, r11);
        goto L_0x0390;
    L_0x021a:
        r4 = 1;
        r6.d = r4;
        goto L_0x0390;
    L_0x021f:
        if (r7 == 0) goto L_0x0253;
    L_0x0221:
        r10 = r7.a;
        if (r10 != r0) goto L_0x0253;
    L_0x0225:
        r4 = r4.b();
        r7 = r6.d();
        r7 = r7 + r4;
        r10 = r6.l;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.n;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.l;
        r10 = r10.e;
        r1.a(r10, r4);
        r10 = r6.n;
        r10 = r10.e;
        r1.a(r10, r7);
        r6.d = r8;
        r6.b(r4, r7);
        goto L_0x0390;
    L_0x0253:
        r10 = r6.n;
        r10 = r10.b;
        if (r10 == 0) goto L_0x0291;
    L_0x0259:
        r11 = r10.a;
        if (r11 != r0) goto L_0x0291;
    L_0x025d:
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r6.n;
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r19.d();
        r7 = r6.n;
        r7 = r7.b();
        r4 = r4 - r7;
        r7 = r6.d();
        r7 = r4 - r7;
        r10 = r6.l;
        r10 = r10.e;
        r1.a(r10, r7);
        r10 = r6.n;
        r10 = r10.e;
        r1.a(r10, r4);
        r6.d = r8;
        r6.b(r7, r4);
        goto L_0x0390;
    L_0x0291:
        if (r7 == 0) goto L_0x02d0;
    L_0x0293:
        r11 = r7.a;
        r11 = r11.d;
        if (r11 != r8) goto L_0x02d0;
    L_0x0299:
        r7 = r7.e;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r6.n;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r7.d;
        r7 = r6.l;
        r7 = r7.b();
        r7 = (float) r7;
        r4 = r4 + r7;
        r4 = r4 + r16;
        r4 = (int) r4;
        r7 = r6.d();
        r7 = r7 + r4;
        r10 = r6.l;
        r10 = r10.e;
        r1.a(r10, r4);
        r10 = r6.n;
        r10 = r10.e;
        r1.a(r10, r7);
        r6.d = r8;
        r6.b(r4, r7);
        goto L_0x0390;
    L_0x02d0:
        if (r10 == 0) goto L_0x0310;
    L_0x02d2:
        r11 = r10.a;
        r11 = r11.d;
        if (r11 != r8) goto L_0x0310;
    L_0x02d8:
        r7 = r10.e;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r6.n;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r7.d;
        r7 = r6.n;
        r7 = r7.b();
        r7 = (float) r7;
        r4 = r4 - r7;
        r4 = r4 + r16;
        r4 = (int) r4;
        r7 = r6.d();
        r7 = r4 - r7;
        r10 = r6.l;
        r10 = r10.e;
        r1.a(r10, r7);
        r10 = r6.n;
        r10 = r10.e;
        r1.a(r10, r4);
        r6.d = r8;
        r6.b(r7, r4);
        goto L_0x0390;
    L_0x0310:
        if (r7 != 0) goto L_0x0390;
    L_0x0312:
        if (r10 != 0) goto L_0x0390;
    L_0x0314:
        r7 = r6 instanceof defpackage.dj;
        if (r7 == 0) goto L_0x036b;
    L_0x0318:
        r7 = r6;
        r7 = (defpackage.dj) r7;
        r10 = r7.af;
        r11 = 1;
        if (r10 != r11) goto L_0x0390;
    L_0x0320:
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r6.n;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r7.b;
        r10 = -1;
        if (r4 == r10) goto L_0x0335;
    L_0x0333:
        r4 = (float) r4;
        goto L_0x034a;
    L_0x0335:
        r4 = r7.c;
        if (r4 == r10) goto L_0x0341;
    L_0x0339:
        r4 = r19.d();
        r7 = r7.c;
        r4 = r4 - r7;
        goto L_0x0333;
    L_0x0341:
        r4 = r19.d();
        r4 = (float) r4;
        r7 = r7.a;
        r4 = r4 * r7;
    L_0x034a:
        r4 = r4 + r16;
        r4 = (int) r4;
        r7 = r6.l;
        r7 = r7.e;
        r1.a(r7, r4);
        r7 = r6.n;
        r7 = r7.e;
        r1.a(r7, r4);
        r6.d = r8;
        r6.e = r8;
        r6.b(r4, r4);
        r4 = r19.g();
        r7 = 0;
        r6.c(r7, r4);
        goto L_0x0390;
    L_0x036b:
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r6.n;
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r6.w;
        r7 = r6.d();
        r10 = r6.l;
        r10 = r10.e;
        r1.a(r10, r4);
        r10 = r6.n;
        r10 = r10.e;
        r4 = r4 + r7;
        r1.a(r10, r4);
        r6.d = r8;
    L_0x0390:
        r4 = r6.e;
        r7 = -1;
        if (r4 != r7) goto L_0x06e3;
    L_0x0395:
        r4 = r0.ae;
        if (r4 != r8) goto L_0x039e;
    L_0x0399:
        r7 = 1;
        r6.e = r7;
        goto L_0x06e3;
    L_0x039e:
        r7 = 1;
        r10 = r6.ae;
        r11 = 3;
        if (r10 != r11) goto L_0x03a8;
    L_0x03a4:
        r6.e = r7;
        goto L_0x06e3;
    L_0x03a8:
        if (r4 != r8) goto L_0x03ab;
    L_0x03aa:
        goto L_0x03fd;
    L_0x03ab:
        r4 = 4;
        if (r10 != r4) goto L_0x03fd;
    L_0x03ae:
        r7 = r6.m;
        r10 = r1.a(r7);
        r7.e = r10;
        r7 = r6.o;
        r10 = r1.a(r7);
        r7.e = r10;
        r7 = r6.m;
        r7 = r7.c;
        r10 = r19.g();
        r11 = r6.o;
        r11 = r11.c;
        r10 = r10 - r11;
        r11 = r6.m;
        r11 = r11.e;
        r1.a(r11, r7);
        r11 = r6.o;
        r11 = r11.e;
        r1.a(r11, r10);
        r11 = r6.C;
        if (r11 <= 0) goto L_0x03de;
    L_0x03dd:
        goto L_0x03e4;
    L_0x03de:
        r11 = r6.K;
        r4 = 8;
        if (r11 != r4) goto L_0x03f6;
    L_0x03e4:
        r4 = r6.p;
        r11 = r1.a(r4);
        r4.e = r11;
        r4 = r6.p;
        r4 = r4.e;
        r11 = r6.C;
        r11 = r11 + r7;
        r1.a(r4, r11);
    L_0x03f6:
        r6.c(r7, r10);
        r6.e = r8;
        goto L_0x06e3;
    L_0x03fd:
        r4 = r6.m;
        r7 = r4.b;
        if (r7 == 0) goto L_0x0489;
    L_0x0403:
        r10 = r6.o;
        r10 = r10.b;
        if (r10 == 0) goto L_0x0489;
    L_0x0409:
        r7 = r7.a;
        if (r7 != r0) goto L_0x0484;
    L_0x040d:
        r7 = r10.a;
        if (r7 != r0) goto L_0x0484;
    L_0x0411:
        r4 = r4.b();
        r7 = r6.o;
        r7 = r7.b();
        r10 = r0.ae;
        r11 = 3;
        if (r10 != r11) goto L_0x0425;
    L_0x0420:
        r7 = r6.g();
        goto L_0x0441;
    L_0x0425:
        r10 = r6.g();
        r11 = (float) r4;
        r18 = r19.g();
        r18 = r18 - r4;
        r18 = r18 - r7;
        r4 = r18 - r10;
        r4 = (float) r4;
        r7 = r6.I;
        r4 = r4 * r7;
        r11 = r11 + r4;
        r11 = r11 + r16;
        r4 = (int) r11;
        r7 = r6.g();
    L_0x0441:
        r7 = r7 + r4;
        r10 = r6.m;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.o;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.m;
        r10 = r10.e;
        r1.a(r10, r4);
        r10 = r6.o;
        r10 = r10.e;
        r1.a(r10, r7);
        r10 = r6.C;
        if (r10 <= 0) goto L_0x0465;
    L_0x0464:
        goto L_0x046b;
    L_0x0465:
        r10 = r6.K;
        r11 = 8;
        if (r10 != r11) goto L_0x047d;
    L_0x046b:
        r10 = r6.p;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.p;
        r10 = r10.e;
        r11 = r6.C;
        r11 = r11 + r4;
        r1.a(r10, r11);
    L_0x047d:
        r6.e = r8;
        r6.c(r4, r7);
        goto L_0x06e3;
    L_0x0484:
        r10 = 1;
        r6.e = r10;
        goto L_0x06e3;
    L_0x0489:
        r10 = 1;
        if (r7 == 0) goto L_0x04db;
    L_0x048c:
        r11 = r7.a;
        if (r11 != r0) goto L_0x04db;
    L_0x0490:
        r4 = r4.b();
        r7 = r6.g();
        r7 = r7 + r4;
        r11 = r6.m;
        r10 = r1.a(r11);
        r11.e = r10;
        r10 = r6.o;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.m;
        r10 = r10.e;
        r1.a(r10, r4);
        r10 = r6.o;
        r10 = r10.e;
        r1.a(r10, r7);
        r10 = r6.C;
        if (r10 <= 0) goto L_0x04bc;
    L_0x04bb:
        goto L_0x04c2;
    L_0x04bc:
        r10 = r6.K;
        r11 = 8;
        if (r10 != r11) goto L_0x04d4;
    L_0x04c2:
        r10 = r6.p;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.p;
        r10 = r10.e;
        r11 = r6.C;
        r11 = r11 + r4;
        r1.a(r10, r11);
    L_0x04d4:
        r6.e = r8;
        r6.c(r4, r7);
        goto L_0x06e3;
    L_0x04db:
        r10 = r6.o;
        r10 = r10.b;
        if (r10 == 0) goto L_0x0536;
    L_0x04e1:
        r11 = r10.a;
        if (r11 != r0) goto L_0x0536;
    L_0x04e5:
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r6.o;
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r19.g();
        r7 = r6.o;
        r7 = r7.b();
        r4 = r4 - r7;
        r7 = r6.g();
        r7 = r4 - r7;
        r10 = r6.m;
        r10 = r10.e;
        r1.a(r10, r7);
        r10 = r6.o;
        r10 = r10.e;
        r1.a(r10, r4);
        r10 = r6.C;
        if (r10 <= 0) goto L_0x0517;
    L_0x0516:
        goto L_0x051d;
    L_0x0517:
        r10 = r6.K;
        r11 = 8;
        if (r10 != r11) goto L_0x052f;
    L_0x051d:
        r10 = r6.p;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.p;
        r10 = r10.e;
        r11 = r6.C;
        r11 = r11 + r7;
        r1.a(r10, r11);
    L_0x052f:
        r6.e = r8;
        r6.c(r7, r4);
        goto L_0x06e3;
    L_0x0536:
        if (r7 != 0) goto L_0x0539;
    L_0x0538:
        goto L_0x0593;
    L_0x0539:
        r11 = r7.a;
        r11 = r11.e;
        if (r11 != r8) goto L_0x0593;
    L_0x053f:
        r7 = r7.e;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r6.o;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r7.d;
        r7 = r6.m;
        r7 = r7.b();
        r7 = (float) r7;
        r4 = r4 + r7;
        r4 = r4 + r16;
        r4 = (int) r4;
        r7 = r6.g();
        r7 = r7 + r4;
        r10 = r6.m;
        r10 = r10.e;
        r1.a(r10, r4);
        r10 = r6.o;
        r10 = r10.e;
        r1.a(r10, r7);
        r10 = r6.C;
        if (r10 <= 0) goto L_0x0574;
    L_0x0573:
        goto L_0x057a;
    L_0x0574:
        r10 = r6.K;
        r11 = 8;
        if (r10 != r11) goto L_0x058c;
    L_0x057a:
        r10 = r6.p;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.p;
        r10 = r10.e;
        r11 = r6.C;
        r11 = r11 + r4;
        r1.a(r10, r11);
    L_0x058c:
        r6.e = r8;
        r6.c(r4, r7);
        goto L_0x06e3;
    L_0x0593:
        if (r10 == 0) goto L_0x05f0;
    L_0x0595:
        r11 = r10.a;
        r11 = r11.e;
        if (r11 != r8) goto L_0x05f0;
    L_0x059b:
        r7 = r10.e;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r6.o;
        r10 = r1.a(r4);
        r4.e = r10;
        r4 = r7.d;
        r7 = r6.o;
        r7 = r7.b();
        r7 = (float) r7;
        r4 = r4 - r7;
        r4 = r4 + r16;
        r4 = (int) r4;
        r7 = r6.g();
        r7 = r4 - r7;
        r10 = r6.m;
        r10 = r10.e;
        r1.a(r10, r7);
        r10 = r6.o;
        r10 = r10.e;
        r1.a(r10, r4);
        r10 = r6.C;
        if (r10 <= 0) goto L_0x05d1;
    L_0x05d0:
        goto L_0x05d7;
    L_0x05d1:
        r10 = r6.K;
        r11 = 8;
        if (r10 != r11) goto L_0x05e9;
    L_0x05d7:
        r10 = r6.p;
        r11 = r1.a(r10);
        r10.e = r11;
        r10 = r6.p;
        r10 = r10.e;
        r11 = r6.C;
        r11 = r11 + r7;
        r1.a(r10, r11);
    L_0x05e9:
        r6.e = r8;
        r6.c(r7, r4);
        goto L_0x06e3;
    L_0x05f0:
        r11 = r6.p;
        r11 = r11.b;
        if (r11 == 0) goto L_0x0641;
    L_0x05f6:
        r0 = r11.a;
        r0 = r0.e;
        if (r0 != r8) goto L_0x0641;
    L_0x05fc:
        r0 = r11.e;
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r6.o;
        r7 = r1.a(r4);
        r4.e = r7;
        r0 = r0.d;
        r4 = r6.C;
        r4 = (float) r4;
        r0 = r0 - r4;
        r0 = r0 + r16;
        r0 = (int) r0;
        r4 = r6.g();
        r4 = r4 + r0;
        r7 = r6.m;
        r7 = r7.e;
        r1.a(r7, r0);
        r7 = r6.o;
        r7 = r7.e;
        r1.a(r7, r4);
        r7 = r6.p;
        r10 = r1.a(r7);
        r7.e = r10;
        r7 = r6.p;
        r7 = r7.e;
        r10 = r6.C;
        r10 = r10 + r0;
        r1.a(r7, r10);
        r6.e = r8;
        r6.c(r0, r4);
        goto L_0x06e3;
    L_0x0641:
        if (r11 != 0) goto L_0x06e3;
    L_0x0643:
        if (r7 != 0) goto L_0x06e3;
    L_0x0645:
        if (r10 != 0) goto L_0x06e3;
    L_0x0647:
        r0 = r6 instanceof defpackage.dj;
        if (r0 == 0) goto L_0x069d;
    L_0x064b:
        r0 = r6;
        r0 = (defpackage.dj) r0;
        r7 = r0.af;
        if (r7 != 0) goto L_0x06e3;
    L_0x0652:
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r6.o;
        r7 = r1.a(r4);
        r4.e = r7;
        r4 = r0.b;
        r7 = -1;
        if (r4 == r7) goto L_0x0667;
    L_0x0665:
        r0 = (float) r4;
        goto L_0x067c;
    L_0x0667:
        r4 = r0.c;
        if (r4 == r7) goto L_0x0673;
    L_0x066b:
        r4 = r19.g();
        r0 = r0.c;
        r4 = r4 - r0;
        goto L_0x0665;
    L_0x0673:
        r4 = r19.g();
        r4 = (float) r4;
        r0 = r0.a;
        r0 = r0 * r4;
    L_0x067c:
        r0 = r0 + r16;
        r0 = (int) r0;
        r4 = r6.m;
        r4 = r4.e;
        r1.a(r4, r0);
        r4 = r6.o;
        r4 = r4.e;
        r1.a(r4, r0);
        r6.e = r8;
        r6.d = r8;
        r6.c(r0, r0);
        r0 = r19.d();
        r7 = 0;
        r6.b(r7, r0);
        goto L_0x06e4;
    L_0x069d:
        r7 = 0;
        r0 = r1.a(r4);
        r4.e = r0;
        r0 = r6.o;
        r4 = r1.a(r0);
        r0.e = r4;
        r0 = r6.x;
        r4 = r6.g();
        r10 = r6.m;
        r10 = r10.e;
        r1.a(r10, r0);
        r10 = r6.o;
        r10 = r10.e;
        r4 = r4 + r0;
        r1.a(r10, r4);
        r4 = r6.C;
        if (r4 <= 0) goto L_0x06c8;
    L_0x06c5:
        r10 = 8;
        goto L_0x06ce;
    L_0x06c8:
        r4 = r6.K;
        r10 = 8;
        if (r4 != r10) goto L_0x06e0;
    L_0x06ce:
        r4 = r6.p;
        r11 = r1.a(r4);
        r4.e = r11;
        r4 = r6.p;
        r4 = r4.e;
        r11 = r6.C;
        r0 = r0 + r11;
        r1.a(r4, r0);
    L_0x06e0:
        r6.e = r8;
        goto L_0x06e6;
    L_0x06e3:
        r7 = 0;
    L_0x06e4:
        r10 = 8;
    L_0x06e6:
        r0 = r6.e;
        r4 = -1;
        if (r0 != r4) goto L_0x06ed;
    L_0x06eb:
        r15 = r15 + 1;
    L_0x06ed:
        r0 = r6.d;
        if (r0 != r4) goto L_0x06f3;
    L_0x06f1:
        r5 = r5 + 1;
    L_0x06f3:
        r14 = r14 + 1;
        r4 = 4;
        r6 = 0;
        r7 = 1;
        r10 = 3;
        r11 = -1;
        r0 = r19;
        goto L_0x0147;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg.b(db):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:262:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x051c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x051c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0192 A:{SYNTHETIC} */
    private final void c(defpackage.db r31) {
        /*
        r30 = this;
        r6 = r30;
        r15 = r31;
        r14 = 0;
        r13 = 0;
    L_0x0006:
        r0 = r6.ak;
        if (r13 >= r0) goto L_0x0575;
    L_0x000a:
        r0 = r6.ao;
        r12 = r0[r13];
        r2 = r6.aq;
        r4 = 0;
        r5 = r6.ap;
        r0 = r30;
        r1 = r31;
        r3 = r12;
        r0 = r0.a(r1, r2, r3, r4, r5);
        r1 = r6.aq;
        r2 = 2;
        r1 = r1[r2];
        if (r1 == 0) goto L_0x056b;
    L_0x0023:
        r3 = r6.ap;
        r4 = 1;
        r5 = r3[r4];
        if (r5 == 0) goto L_0x004e;
    L_0x002a:
        r0 = r12.h();
    L_0x002e:
        if (r1 == 0) goto L_0x056b;
    L_0x0030:
        r2 = r1.l;
        r2 = r2.e;
        r15.a(r2, r0);
        r2 = r1.ab;
        r3 = r1.l;
        r3 = r3.b();
        r4 = r1.d();
        r3 = r3 + r4;
        r1 = r1.n;
        r1 = r1.b();
        r3 = r3 + r1;
        r0 = r0 + r3;
        r1 = r2;
        goto L_0x002e;
    L_0x004e:
        r5 = r12.V;
        if (r5 == 0) goto L_0x0055;
    L_0x0052:
        r16 = 0;
        goto L_0x0057;
    L_0x0055:
        r16 = 1;
    L_0x0057:
        if (r5 == r2) goto L_0x005c;
    L_0x0059:
        r17 = 0;
        goto L_0x005e;
    L_0x005c:
        r17 = 1;
    L_0x005e:
        r7 = r6.ad;
        r8 = r6.a;
        r9 = 8;
        r10 = 0;
        r11 = 3;
        r18 = 0;
        if (r8 != r2) goto L_0x006b;
    L_0x006a:
        goto L_0x006d;
    L_0x006b:
        if (r8 != r9) goto L_0x0196;
    L_0x006d:
        r3 = r3[r14];
        if (r3 == 0) goto L_0x0196;
    L_0x0071:
        r3 = r12.X;
        if (r3 == 0) goto L_0x0196;
    L_0x0075:
        if (r5 == r2) goto L_0x0196;
    L_0x0077:
        if (r7 == r2) goto L_0x0196;
    L_0x0079:
        if (r5 == 0) goto L_0x007d;
    L_0x007b:
        goto L_0x0196;
    L_0x007d:
        r1 = r12;
        r2 = r18;
        r3 = 0;
        r4 = 0;
        r5 = 0;
    L_0x0083:
        if (r1 == 0) goto L_0x00d2;
    L_0x0085:
        r2 = r1.K;
        if (r2 == r9) goto L_0x00b2;
    L_0x0089:
        r4 = r4 + 1;
        r2 = r1.ad;
        if (r2 == r11) goto L_0x00af;
    L_0x008f:
        r2 = r1.d();
        r5 = r5 + r2;
        r2 = r1.l;
        r7 = r2.b;
        if (r7 == 0) goto L_0x009f;
    L_0x009a:
        r2 = r2.b();
        goto L_0x00a0;
    L_0x009f:
        r2 = 0;
    L_0x00a0:
        r5 = r5 + r2;
        r2 = r1.n;
        r7 = r2.b;
        if (r7 == 0) goto L_0x00ac;
    L_0x00a7:
        r2 = r2.b();
        goto L_0x00ad;
    L_0x00ac:
        r2 = 0;
    L_0x00ad:
        r5 = r5 + r2;
        goto L_0x00b2;
    L_0x00af:
        r2 = r1.Z;
        r3 = r3 + r2;
    L_0x00b2:
        r2 = r1.n;
        r2 = r2.b;
        if (r2 == 0) goto L_0x00bb;
    L_0x00b8:
        r2 = r2.a;
        goto L_0x00bd;
    L_0x00bb:
        r2 = r18;
    L_0x00bd:
        if (r2 == 0) goto L_0x00cc;
    L_0x00bf:
        r7 = r2.l;
        r7 = r7.b;
        if (r7 == 0) goto L_0x00ca;
    L_0x00c5:
        r7 = r7.a;
        if (r7 != r1) goto L_0x00ca;
    L_0x00c9:
        goto L_0x00cc;
    L_0x00ca:
        r2 = r18;
    L_0x00cc:
        r29 = r2;
        r2 = r1;
        r1 = r29;
        goto L_0x0083;
    L_0x00d2:
        if (r2 == 0) goto L_0x00ee;
    L_0x00d4:
        r1 = r2.n;
        r1 = r1.b;
        if (r1 == 0) goto L_0x00df;
    L_0x00da:
        r2 = r1.a;
        r2 = r2.w;
        goto L_0x00e0;
    L_0x00df:
        r2 = 0;
    L_0x00e0:
        if (r1 != 0) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00ec;
    L_0x00e3:
        r1 = r1.a;
        if (r1 != r6) goto L_0x00ec;
    L_0x00e7:
        r1 = r30.j();
        goto L_0x00ef;
    L_0x00ec:
        r1 = r2;
        goto L_0x00ef;
    L_0x00ee:
        r1 = 0;
    L_0x00ef:
        r1 = (float) r1;
        r2 = (float) r5;
        r1 = r1 - r2;
        r4 = r4 + 1;
        r2 = (float) r4;
        r2 = r1 / r2;
        if (r0 == 0) goto L_0x00ff;
    L_0x00f9:
        r2 = (float) r0;
        r2 = r1 / r2;
        r4 = r2;
        r2 = 0;
        goto L_0x0100;
    L_0x00ff:
        r4 = r2;
    L_0x0100:
        if (r12 == 0) goto L_0x056b;
    L_0x0102:
        r5 = r12.l;
        r7 = r5.b;
        if (r7 == 0) goto L_0x010d;
    L_0x0108:
        r5 = r5.b();
        goto L_0x010e;
    L_0x010d:
        r5 = 0;
    L_0x010e:
        r7 = r12.n;
        r8 = r7.b;
        if (r8 == 0) goto L_0x0119;
    L_0x0114:
        r7 = r7.b();
        goto L_0x011a;
    L_0x0119:
        r7 = 0;
    L_0x011a:
        r8 = r12.K;
        r16 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r8 == r9) goto L_0x015a;
    L_0x0120:
        r5 = (float) r5;
        r2 = r2 + r5;
        r8 = r12.l;
        r8 = r8.e;
        r9 = r2 + r16;
        r9 = (int) r9;
        r15.a(r8, r9);
        r8 = r12.ad;
        if (r8 == r11) goto L_0x0137;
    L_0x0130:
        r5 = r12.d();
        r5 = (float) r5;
    L_0x0135:
        r2 = r2 + r5;
        goto L_0x014a;
    L_0x0137:
        r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r8 == 0) goto L_0x0145;
    L_0x013b:
        r8 = r12.Z;
        r8 = r8 * r1;
        r8 = r8 / r3;
        r8 = r8 - r5;
        r5 = (float) r7;
        r8 = r8 - r5;
        r2 = r2 + r8;
        goto L_0x014a;
    L_0x0145:
        r5 = r4 - r5;
        r8 = (float) r7;
        r5 = r5 - r8;
        goto L_0x0135;
    L_0x014a:
        r5 = r12.n;
        r5 = r5.e;
        r8 = r2 + r16;
        r8 = (int) r8;
        r15.a(r5, r8);
        if (r0 != 0) goto L_0x0157;
    L_0x0156:
        r2 = r2 + r4;
    L_0x0157:
        r5 = (float) r7;
        r2 = r2 + r5;
        goto L_0x0171;
    L_0x015a:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r4 / r5;
        r5 = r2 - r5;
        r5 = r5 + r16;
        r5 = (int) r5;
        r7 = r12.l;
        r7 = r7.e;
        r15.a(r7, r5);
        r7 = r12.n;
        r7 = r7.e;
        r15.a(r7, r5);
    L_0x0171:
        r5 = r12.n;
        r5 = r5.b;
        if (r5 == 0) goto L_0x017a;
    L_0x0177:
        r5 = r5.a;
        goto L_0x017c;
    L_0x017a:
        r5 = r18;
    L_0x017c:
        if (r5 == 0) goto L_0x018c;
    L_0x017e:
        r7 = r5.l;
        r7 = r7.b;
        if (r7 == 0) goto L_0x018c;
    L_0x0184:
        r7 = r7.a;
        if (r7 != r12) goto L_0x0189;
    L_0x0188:
        goto L_0x018c;
    L_0x0189:
        r12 = r18;
        goto L_0x018d;
    L_0x018c:
        r12 = r5;
    L_0x018d:
        if (r12 == r6) goto L_0x0190;
    L_0x018f:
        goto L_0x0192;
    L_0x0190:
        r12 = r18;
    L_0x0192:
        r9 = 8;
        goto L_0x0100;
    L_0x0196:
        if (r0 != 0) goto L_0x019e;
    L_0x0198:
        r0 = r1;
        r2 = r18;
        r3 = r2;
        goto L_0x03da;
    L_0x019e:
        if (r17 != 0) goto L_0x03d5;
    L_0x01a0:
        r3 = r18;
    L_0x01a2:
        if (r1 == 0) goto L_0x023e;
    L_0x01a4:
        r5 = r1.ad;
        if (r5 == r11) goto L_0x01fc;
    L_0x01a8:
        r5 = r1.l;
        r5 = r5.b();
        if (r3 == 0) goto L_0x01b7;
    L_0x01b0:
        r3 = r3.n;
        r3 = r3.b();
        r5 = r5 + r3;
    L_0x01b7:
        r3 = r1.l;
        r7 = r3.b;
        r8 = r7.a;
        r8 = r8.ad;
        if (r8 == r11) goto L_0x01c3;
    L_0x01c1:
        r8 = 3;
        goto L_0x01c4;
    L_0x01c3:
        r8 = 2;
    L_0x01c4:
        r3 = r3.e;
        r7 = r7.e;
        r15.a(r3, r7, r5, r8);
        r3 = r1.n;
        r3 = r3.b();
        r5 = r1.n;
        r5 = r5.b;
        r5 = r5.a;
        r5 = r5.l;
        r7 = r5.b;
        if (r7 == 0) goto L_0x01e6;
    L_0x01dd:
        r7 = r7.a;
        if (r7 != r1) goto L_0x01e6;
    L_0x01e1:
        r5 = r5.b();
        r3 = r3 + r5;
    L_0x01e6:
        r5 = r1.n;
        r7 = r5.b;
        r8 = r7.a;
        r8 = r8.ad;
        if (r8 == r11) goto L_0x01f2;
    L_0x01f0:
        r8 = 3;
        goto L_0x01f3;
    L_0x01f2:
        r8 = 2;
    L_0x01f3:
        r5 = r5.e;
        r7 = r7.e;
        r3 = -r3;
        r15.b(r5, r7, r3, r8);
        goto L_0x0235;
    L_0x01fc:
        r3 = r1.Z;
        r10 = r10 + r3;
        r3 = r1.n;
        r5 = r3.b;
        if (r5 == 0) goto L_0x021d;
    L_0x0205:
        r3 = r3.b();
        r5 = r6.aq;
        r5 = r5[r11];
        if (r1 == r5) goto L_0x021e;
    L_0x020f:
        r5 = r1.n;
        r5 = r5.b;
        r5 = r5.a;
        r5 = r5.l;
        r5 = r5.b();
        r3 = r3 + r5;
        goto L_0x021e;
    L_0x021d:
        r3 = 0;
    L_0x021e:
        r5 = r1.n;
        r5 = r5.e;
        r7 = r1.l;
        r7 = r7.e;
        r15.a(r5, r7, r14, r4);
        r5 = r1.n;
        r7 = r5.e;
        r5 = r5.b;
        r5 = r5.e;
        r3 = -r3;
        r15.b(r7, r5, r3, r4);
    L_0x0235:
        r3 = r1.ab;
        r29 = r3;
        r3 = r1;
        r1 = r29;
        goto L_0x01a2;
    L_0x023e:
        if (r0 != r4) goto L_0x02b7;
    L_0x0240:
        r0 = r6.am;
        r0 = r0[r14];
        r1 = r0.l;
        r1 = r1.b();
        r3 = r0.l;
        r3 = r3.b;
        if (r3 == 0) goto L_0x0255;
    L_0x0250:
        r3 = r3.b();
        r1 = r1 + r3;
    L_0x0255:
        r3 = r0.n;
        r3 = r3.b();
        r5 = r0.n;
        r5 = r5.b;
        if (r5 == 0) goto L_0x0266;
    L_0x0261:
        r5 = r5.b();
        r3 = r3 + r5;
    L_0x0266:
        r5 = r12.n;
        r5 = r5.b;
        r5 = r5.e;
        r7 = r6.aq;
        r8 = r7[r11];
        if (r0 != r8) goto L_0x027a;
    L_0x0272:
        r5 = r7[r4];
        r5 = r5.n;
        r5 = r5.b;
        r5 = r5.e;
    L_0x027a:
        r7 = r0.f;
        if (r7 != r4) goto L_0x02a2;
    L_0x027e:
        r0 = r12.l;
        r7 = r0.e;
        r0 = r0.b;
        r0 = r0.e;
        r15.a(r7, r0, r1, r4);
        r0 = r12.n;
        r0 = r0.e;
        r1 = -r3;
        r15.b(r0, r5, r1, r4);
        r0 = r12.n;
        r0 = r0.e;
        r1 = r12.l;
        r1 = r1.e;
        r3 = r12.d();
        r15.c(r0, r1, r3, r2);
        goto L_0x056b;
    L_0x02a2:
        r2 = r0.l;
        r7 = r2.e;
        r2 = r2.b;
        r2 = r2.e;
        r15.c(r7, r2, r1, r4);
        r0 = r0.n;
        r0 = r0.e;
        r1 = -r3;
        r15.c(r0, r5, r1, r4);
        goto L_0x056b;
    L_0x02b7:
        r1 = 0;
    L_0x02b8:
        r3 = r0 + -1;
        if (r1 >= r3) goto L_0x056b;
    L_0x02bc:
        r5 = r6.am;
        r7 = r5[r1];
        r1 = r1 + 1;
        r5 = r5[r1];
        r8 = r7.l;
        r9 = r8.e;
        r14 = r7.n;
        r14 = r14.e;
        r2 = r5.l;
        r2 = r2.e;
        r4 = r5.n;
        r4 = r4.e;
        r28 = r0;
        r0 = r6.aq;
        r16 = r4;
        r4 = r0[r11];
        if (r5 != r4) goto L_0x02e6;
    L_0x02de:
        r4 = 1;
        r0 = r0[r4];
        r0 = r0.n;
        r0 = r0.e;
        goto L_0x02e8;
    L_0x02e6:
        r0 = r16;
    L_0x02e8:
        r4 = r8.b();
        r8 = r7.l;
        r8 = r8.b;
        if (r8 == 0) goto L_0x0303;
    L_0x02f2:
        r8 = r8.a;
        r8 = r8.n;
        r11 = r8.b;
        if (r11 == 0) goto L_0x0303;
    L_0x02fa:
        r11 = r11.a;
        if (r11 != r7) goto L_0x0303;
    L_0x02fe:
        r8 = r8.b();
        r4 = r4 + r8;
    L_0x0303:
        r8 = r7.l;
        r8 = r8.b;
        r8 = r8.e;
        r11 = 2;
        r15.a(r9, r8, r4, r11);
        r4 = r7.n;
        r4 = r4.b();
        r8 = r7.n;
        r8 = r8.b;
        if (r8 == 0) goto L_0x032a;
    L_0x0319:
        r8 = r7.ab;
        if (r8 == 0) goto L_0x032a;
    L_0x031d:
        r8 = r8.l;
        r11 = r8.b;
        if (r11 == 0) goto L_0x0328;
    L_0x0323:
        r8 = r8.b();
        goto L_0x0329;
    L_0x0328:
        r8 = 0;
    L_0x0329:
        r4 = r4 + r8;
    L_0x032a:
        r8 = r7.n;
        r8 = r8.b;
        r8 = r8.e;
        r4 = -r4;
        r11 = 2;
        r15.b(r14, r8, r4, r11);
        if (r1 != r3) goto L_0x038f;
    L_0x0337:
        r3 = r5.l;
        r3 = r3.b();
        r4 = r5.l;
        r4 = r4.b;
        if (r4 == 0) goto L_0x0354;
    L_0x0343:
        r4 = r4.a;
        r4 = r4.n;
        r8 = r4.b;
        if (r8 == 0) goto L_0x0354;
    L_0x034b:
        r8 = r8.a;
        if (r8 != r5) goto L_0x0354;
    L_0x034f:
        r4 = r4.b();
        r3 = r3 + r4;
    L_0x0354:
        r4 = r5.l;
        r4 = r4.b;
        r4 = r4.e;
        r8 = 2;
        r15.a(r2, r4, r3, r8);
        r3 = r5.n;
        r4 = r6.aq;
        r8 = 3;
        r11 = r4[r8];
        if (r5 != r11) goto L_0x036c;
    L_0x0367:
        r8 = 1;
        r3 = r4[r8];
        r3 = r3.n;
    L_0x036c:
        r4 = r3.b();
        r8 = r3.b;
        if (r8 == 0) goto L_0x0385;
    L_0x0374:
        r8 = r8.a;
        r8 = r8.l;
        r11 = r8.b;
        if (r11 == 0) goto L_0x0385;
    L_0x037c:
        r11 = r11.a;
        if (r11 != r5) goto L_0x0385;
    L_0x0380:
        r8 = r8.b();
        r4 = r4 + r8;
    L_0x0385:
        r3 = r3.b;
        r3 = r3.e;
        r4 = -r4;
        r8 = 2;
        r15.b(r0, r3, r4, r8);
        goto L_0x0390;
    L_0x038f:
        r8 = 2;
    L_0x0390:
        r3 = r12.i;
        if (r3 <= 0) goto L_0x0397;
    L_0x0394:
        r15.b(r14, r9, r3, r8);
    L_0x0397:
        r3 = r31.b();
        r4 = r7.Z;
        r11 = r5.Z;
        r8 = r7.l;
        r21 = r8.b();
        r7 = r7.n;
        r23 = r7.b();
        r7 = r5.l;
        r25 = r7.b();
        r5 = r5.n;
        r27 = r5.b();
        r16 = r3;
        r17 = r4;
        r18 = r10;
        r19 = r11;
        r20 = r9;
        r22 = r14;
        r24 = r2;
        r26 = r0;
        r16.a(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
        r15.a(r3);
        r0 = r28;
        r2 = 2;
        r4 = 1;
        r11 = 3;
        r14 = 0;
        goto L_0x02b8;
    L_0x03d5:
        r0 = r1;
        r2 = r18;
        r3 = r2;
        r14 = 0;
    L_0x03da:
        if (r0 == 0) goto L_0x0529;
    L_0x03dc:
        r4 = r0.ab;
        if (r4 != 0) goto L_0x03e8;
    L_0x03e0:
        r2 = r6.aq;
        r7 = 1;
        r2 = r2[r7];
        r14 = r2;
        r2 = 1;
        goto L_0x03ed;
    L_0x03e8:
        r29 = r14;
        r14 = r2;
        r2 = r29;
    L_0x03ed:
        if (r17 == 0) goto L_0x0440;
    L_0x03ef:
        r7 = r0.l;
        r8 = r7.b();
        if (r3 == 0) goto L_0x03fe;
    L_0x03f7:
        r3 = r3.n;
        r3 = r3.b();
        r8 = r8 + r3;
    L_0x03fe:
        if (r1 != r0) goto L_0x0402;
    L_0x0400:
        r3 = 1;
        goto L_0x0403;
    L_0x0402:
        r3 = 3;
    L_0x0403:
        r9 = r7.e;
        r10 = r7.b;
        r10 = r10.e;
        r15.a(r9, r10, r8, r3);
        r3 = r0.ad;
        r11 = 3;
        if (r3 != r11) goto L_0x0496;
    L_0x0411:
        r3 = r0.n;
        r8 = r0.f;
        r9 = 1;
        if (r8 != r9) goto L_0x042b;
    L_0x0418:
        r8 = r0.h;
        r9 = r0.d();
        r8 = java.lang.Math.max(r8, r9);
        r3 = r3.e;
        r7 = r7.e;
        r15.c(r3, r7, r8, r11);
        goto L_0x0496;
    L_0x042b:
        r8 = r7.e;
        r9 = r7.b;
        r9 = r9.e;
        r10 = r7.c;
        r15.a(r8, r9, r10, r11);
        r3 = r3.e;
        r7 = r7.e;
        r8 = r0.h;
        r15.b(r3, r7, r8, r11);
        goto L_0x0496;
    L_0x0440:
        r11 = 3;
        r7 = 5;
        if (r5 == 0) goto L_0x046e;
    L_0x0444:
        if (r2 == 0) goto L_0x046e;
    L_0x0446:
        if (r3 == 0) goto L_0x046e;
    L_0x0448:
        r3 = r0.n;
        r8 = r3.b;
        if (r8 != 0) goto L_0x045b;
    L_0x044e:
        r3 = r3.e;
        r7 = r0.h();
        r8 = r0.y;
        r7 = r7 + r8;
        r15.a(r3, r7);
        goto L_0x0496;
    L_0x045b:
        r3 = r3.b();
        r8 = r0.n;
        r8 = r8.e;
        r9 = r14.n;
        r9 = r9.b;
        r9 = r9.e;
        r3 = -r3;
        r15.c(r8, r9, r3, r7);
        goto L_0x0496;
    L_0x046e:
        if (r16 == 0) goto L_0x0471;
    L_0x0470:
        goto L_0x04a1;
    L_0x0471:
        if (r2 != 0) goto L_0x04a1;
    L_0x0473:
        if (r3 != 0) goto L_0x04a1;
    L_0x0475:
        r3 = r0.l;
        r8 = r3.b;
        if (r8 != 0) goto L_0x0485;
    L_0x047b:
        r3 = r3.e;
        r7 = r0.h();
        r15.a(r3, r7);
        goto L_0x0496;
    L_0x0485:
        r3 = r3.b();
        r8 = r0.l;
        r8 = r8.e;
        r9 = r12.l;
        r9 = r9.b;
        r9 = r9.e;
        r15.c(r8, r9, r3, r7);
    L_0x0496:
        r19 = r0;
        r20 = r5;
    L_0x049a:
        r0 = r12;
        r3 = r13;
        r6 = r14;
        r21 = 0;
        goto L_0x0517;
    L_0x04a1:
        r7 = r0.l;
        r8 = r0.n;
        r10 = r7.b();
        r9 = r8.b();
        r11 = r7.e;
        r19 = r0;
        r0 = r7.b;
        r0 = r0.e;
        r20 = r5;
        r5 = 1;
        r15.a(r11, r0, r10, r5);
        r0 = r8.e;
        r11 = r8.b;
        r11 = r11.e;
        r6 = -r9;
        r15.b(r0, r11, r6, r5);
        r0 = r7.b;
        if (r0 == 0) goto L_0x04cc;
    L_0x04c9:
        r0 = r0.e;
        goto L_0x04ce;
    L_0x04cc:
        r0 = r18;
    L_0x04ce:
        if (r3 != 0) goto L_0x04db;
    L_0x04d0:
        r0 = r12.l;
        r0 = r0.b;
        if (r0 == 0) goto L_0x04d9;
    L_0x04d6:
        r0 = r0.e;
        goto L_0x04db;
    L_0x04d9:
        r0 = r18;
    L_0x04db:
        if (r4 != 0) goto L_0x04e9;
    L_0x04dd:
        r3 = r14.n;
        r3 = r3.b;
        if (r3 == 0) goto L_0x04e7;
    L_0x04e3:
        r3 = r3.a;
        r4 = r3;
        goto L_0x04e9;
    L_0x04e7:
        r4 = r18;
    L_0x04e9:
        if (r4 == 0) goto L_0x049a;
    L_0x04eb:
        r3 = r4.l;
        r3 = r3.e;
        if (r2 == 0) goto L_0x04fc;
    L_0x04f1:
        r3 = r14.n;
        r3 = r3.b;
        if (r3 == 0) goto L_0x04fa;
    L_0x04f7:
        r3 = r3.e;
        goto L_0x04fc;
    L_0x04fa:
        r3 = r18;
    L_0x04fc:
        if (r0 == 0) goto L_0x049a;
    L_0x04fe:
        if (r3 == 0) goto L_0x049a;
    L_0x0500:
        r5 = r7.e;
        r11 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = r8.e;
        r7 = r31;
        r8 = r5;
        r5 = r9;
        r9 = r0;
        r0 = 3;
        r0 = r12;
        r12 = r3;
        r3 = r13;
        r13 = r6;
        r6 = r14;
        r21 = 0;
        r14 = r5;
        r7.a(r8, r9, r10, r11, r12, r13, r14);
    L_0x0517:
        if (r2 != 0) goto L_0x051a;
    L_0x0519:
        goto L_0x051c;
    L_0x051a:
        r4 = r18;
    L_0x051c:
        r12 = r0;
        r14 = r2;
        r13 = r3;
        r0 = r4;
        r2 = r6;
        r3 = r19;
        r5 = r20;
        r6 = r30;
        goto L_0x03da;
    L_0x0529:
        r0 = r12;
        r3 = r13;
        r21 = 0;
        if (r17 == 0) goto L_0x056e;
    L_0x052f:
        r1 = r1.l;
        r4 = r2.n;
        r10 = r1.b();
        r14 = r4.b();
        r5 = r0.l;
        r5 = r5.b;
        if (r5 == 0) goto L_0x0545;
    L_0x0541:
        r5 = r5.e;
        r9 = r5;
        goto L_0x0547;
    L_0x0545:
        r9 = r18;
    L_0x0547:
        r2 = r2.n;
        r2 = r2.b;
        if (r2 == 0) goto L_0x0551;
    L_0x054d:
        r2 = r2.e;
        r12 = r2;
        goto L_0x0553;
    L_0x0551:
        r12 = r18;
    L_0x0553:
        if (r9 != 0) goto L_0x0556;
    L_0x0555:
        goto L_0x056e;
    L_0x0556:
        if (r12 == 0) goto L_0x056e;
    L_0x0558:
        r2 = r4.e;
        r5 = -r14;
        r6 = 1;
        r15.b(r2, r12, r5, r6);
        r8 = r1.e;
        r11 = r0.H;
        r13 = r4.e;
        r7 = r31;
        r7.a(r8, r9, r10, r11, r12, r13, r14);
        goto L_0x056e;
    L_0x056b:
        r3 = r13;
        r21 = 0;
    L_0x056e:
        r13 = r3 + 1;
        r14 = 0;
        r6 = r30;
        goto L_0x0006;
    L_0x0575:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg.c(db):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:272:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x053c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x053c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0192 A:{SYNTHETIC} */
    private final void d(defpackage.db r31) {
        /*
        r30 = this;
        r6 = r30;
        r15 = r31;
        r14 = 0;
        r13 = 0;
    L_0x0006:
        r0 = r6.al;
        if (r13 >= r0) goto L_0x0595;
    L_0x000a:
        r0 = r6.an;
        r12 = r0[r13];
        r2 = r6.aq;
        r4 = 1;
        r5 = r6.ap;
        r0 = r30;
        r1 = r31;
        r3 = r12;
        r0 = r0.a(r1, r2, r3, r4, r5);
        r1 = r6.aq;
        r2 = 2;
        r1 = r1[r2];
        if (r1 == 0) goto L_0x058b;
    L_0x0023:
        r3 = r6.ap;
        r4 = 1;
        r5 = r3[r4];
        if (r5 == 0) goto L_0x004e;
    L_0x002a:
        r0 = r12.i();
    L_0x002e:
        if (r1 == 0) goto L_0x058b;
    L_0x0030:
        r2 = r1.m;
        r2 = r2.e;
        r15.a(r2, r0);
        r2 = r1.ac;
        r3 = r1.m;
        r3 = r3.b();
        r4 = r1.g();
        r3 = r3 + r4;
        r1 = r1.o;
        r1 = r1.b();
        r3 = r3 + r1;
        r0 = r0 + r3;
        r1 = r2;
        goto L_0x002e;
    L_0x004e:
        r5 = r12.W;
        if (r5 == 0) goto L_0x0055;
    L_0x0052:
        r16 = 0;
        goto L_0x0057;
    L_0x0055:
        r16 = 1;
    L_0x0057:
        if (r5 == r2) goto L_0x005c;
    L_0x0059:
        r17 = 0;
        goto L_0x005e;
    L_0x005c:
        r17 = 1;
    L_0x005e:
        r7 = r6.ae;
        r8 = r6.a;
        r9 = 8;
        r10 = 0;
        r11 = 3;
        r18 = 0;
        if (r8 != r2) goto L_0x006b;
    L_0x006a:
        goto L_0x006d;
    L_0x006b:
        if (r8 != r9) goto L_0x0196;
    L_0x006d:
        r3 = r3[r14];
        if (r3 == 0) goto L_0x0196;
    L_0x0071:
        r3 = r12.Y;
        if (r3 == 0) goto L_0x0196;
    L_0x0075:
        if (r5 == r2) goto L_0x0196;
    L_0x0077:
        if (r7 == r2) goto L_0x0196;
    L_0x0079:
        if (r5 == 0) goto L_0x007d;
    L_0x007b:
        goto L_0x0196;
    L_0x007d:
        r1 = r12;
        r2 = r18;
        r3 = 0;
        r4 = 0;
        r5 = 0;
    L_0x0083:
        if (r1 == 0) goto L_0x00d2;
    L_0x0085:
        r2 = r1.K;
        if (r2 == r9) goto L_0x00b2;
    L_0x0089:
        r4 = r4 + 1;
        r2 = r1.ae;
        if (r2 == r11) goto L_0x00af;
    L_0x008f:
        r2 = r1.g();
        r5 = r5 + r2;
        r2 = r1.m;
        r7 = r2.b;
        if (r7 == 0) goto L_0x009f;
    L_0x009a:
        r2 = r2.b();
        goto L_0x00a0;
    L_0x009f:
        r2 = 0;
    L_0x00a0:
        r5 = r5 + r2;
        r2 = r1.o;
        r7 = r2.b;
        if (r7 == 0) goto L_0x00ac;
    L_0x00a7:
        r2 = r2.b();
        goto L_0x00ad;
    L_0x00ac:
        r2 = 0;
    L_0x00ad:
        r5 = r5 + r2;
        goto L_0x00b2;
    L_0x00af:
        r2 = r1.aa;
        r3 = r3 + r2;
    L_0x00b2:
        r2 = r1.o;
        r2 = r2.b;
        if (r2 == 0) goto L_0x00bb;
    L_0x00b8:
        r2 = r2.a;
        goto L_0x00bd;
    L_0x00bb:
        r2 = r18;
    L_0x00bd:
        if (r2 == 0) goto L_0x00cc;
    L_0x00bf:
        r7 = r2.m;
        r7 = r7.b;
        if (r7 == 0) goto L_0x00ca;
    L_0x00c5:
        r7 = r7.a;
        if (r7 != r1) goto L_0x00ca;
    L_0x00c9:
        goto L_0x00cc;
    L_0x00ca:
        r2 = r18;
    L_0x00cc:
        r29 = r2;
        r2 = r1;
        r1 = r29;
        goto L_0x0083;
    L_0x00d2:
        if (r2 == 0) goto L_0x00ee;
    L_0x00d4:
        r1 = r2.o;
        r1 = r1.b;
        if (r1 == 0) goto L_0x00df;
    L_0x00da:
        r2 = r1.a;
        r2 = r2.w;
        goto L_0x00e0;
    L_0x00df:
        r2 = 0;
    L_0x00e0:
        if (r1 != 0) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00ec;
    L_0x00e3:
        r1 = r1.a;
        if (r1 != r6) goto L_0x00ec;
    L_0x00e7:
        r1 = r30.k();
        goto L_0x00ef;
    L_0x00ec:
        r1 = r2;
        goto L_0x00ef;
    L_0x00ee:
        r1 = 0;
    L_0x00ef:
        r1 = (float) r1;
        r2 = (float) r5;
        r1 = r1 - r2;
        r4 = r4 + 1;
        r2 = (float) r4;
        r2 = r1 / r2;
        if (r0 == 0) goto L_0x00ff;
    L_0x00f9:
        r2 = (float) r0;
        r2 = r1 / r2;
        r4 = r2;
        r2 = 0;
        goto L_0x0100;
    L_0x00ff:
        r4 = r2;
    L_0x0100:
        if (r12 == 0) goto L_0x058b;
    L_0x0102:
        r5 = r12.m;
        r7 = r5.b;
        if (r7 == 0) goto L_0x010d;
    L_0x0108:
        r5 = r5.b();
        goto L_0x010e;
    L_0x010d:
        r5 = 0;
    L_0x010e:
        r7 = r12.o;
        r8 = r7.b;
        if (r8 == 0) goto L_0x0119;
    L_0x0114:
        r7 = r7.b();
        goto L_0x011a;
    L_0x0119:
        r7 = 0;
    L_0x011a:
        r8 = r12.K;
        r16 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r8 == r9) goto L_0x015a;
    L_0x0120:
        r5 = (float) r5;
        r2 = r2 + r5;
        r8 = r12.m;
        r8 = r8.e;
        r9 = r2 + r16;
        r9 = (int) r9;
        r15.a(r8, r9);
        r8 = r12.ae;
        if (r8 == r11) goto L_0x0137;
    L_0x0130:
        r5 = r12.g();
        r5 = (float) r5;
    L_0x0135:
        r2 = r2 + r5;
        goto L_0x014a;
    L_0x0137:
        r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r8 == 0) goto L_0x0145;
    L_0x013b:
        r8 = r12.aa;
        r8 = r8 * r1;
        r8 = r8 / r3;
        r8 = r8 - r5;
        r5 = (float) r7;
        r8 = r8 - r5;
        r2 = r2 + r8;
        goto L_0x014a;
    L_0x0145:
        r5 = r4 - r5;
        r8 = (float) r7;
        r5 = r5 - r8;
        goto L_0x0135;
    L_0x014a:
        r5 = r12.o;
        r5 = r5.e;
        r8 = r2 + r16;
        r8 = (int) r8;
        r15.a(r5, r8);
        if (r0 != 0) goto L_0x0157;
    L_0x0156:
        r2 = r2 + r4;
    L_0x0157:
        r5 = (float) r7;
        r2 = r2 + r5;
        goto L_0x0171;
    L_0x015a:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r4 / r5;
        r5 = r2 - r5;
        r5 = r5 + r16;
        r5 = (int) r5;
        r7 = r12.m;
        r7 = r7.e;
        r15.a(r7, r5);
        r7 = r12.o;
        r7 = r7.e;
        r15.a(r7, r5);
    L_0x0171:
        r5 = r12.o;
        r5 = r5.b;
        if (r5 == 0) goto L_0x017a;
    L_0x0177:
        r5 = r5.a;
        goto L_0x017c;
    L_0x017a:
        r5 = r18;
    L_0x017c:
        if (r5 == 0) goto L_0x018c;
    L_0x017e:
        r7 = r5.m;
        r7 = r7.b;
        if (r7 == 0) goto L_0x018c;
    L_0x0184:
        r7 = r7.a;
        if (r7 != r12) goto L_0x0189;
    L_0x0188:
        goto L_0x018c;
    L_0x0189:
        r12 = r18;
        goto L_0x018d;
    L_0x018c:
        r12 = r5;
    L_0x018d:
        if (r12 == r6) goto L_0x0190;
    L_0x018f:
        goto L_0x0192;
    L_0x0190:
        r12 = r18;
    L_0x0192:
        r9 = 8;
        goto L_0x0100;
    L_0x0196:
        if (r0 != 0) goto L_0x019e;
    L_0x0198:
        r0 = r1;
        r2 = r18;
        r3 = r2;
        goto L_0x03da;
    L_0x019e:
        if (r17 != 0) goto L_0x03d5;
    L_0x01a0:
        r3 = r18;
    L_0x01a2:
        if (r1 == 0) goto L_0x023e;
    L_0x01a4:
        r5 = r1.ae;
        if (r5 == r11) goto L_0x01fc;
    L_0x01a8:
        r5 = r1.m;
        r5 = r5.b();
        if (r3 == 0) goto L_0x01b7;
    L_0x01b0:
        r3 = r3.o;
        r3 = r3.b();
        r5 = r5 + r3;
    L_0x01b7:
        r3 = r1.m;
        r7 = r3.b;
        r8 = r7.a;
        r8 = r8.ae;
        if (r8 == r11) goto L_0x01c3;
    L_0x01c1:
        r8 = 3;
        goto L_0x01c4;
    L_0x01c3:
        r8 = 2;
    L_0x01c4:
        r3 = r3.e;
        r7 = r7.e;
        r15.a(r3, r7, r5, r8);
        r3 = r1.o;
        r3 = r3.b();
        r5 = r1.o;
        r5 = r5.b;
        r5 = r5.a;
        r5 = r5.m;
        r7 = r5.b;
        if (r7 == 0) goto L_0x01e6;
    L_0x01dd:
        r7 = r7.a;
        if (r7 != r1) goto L_0x01e6;
    L_0x01e1:
        r5 = r5.b();
        r3 = r3 + r5;
    L_0x01e6:
        r5 = r1.o;
        r7 = r5.b;
        r8 = r7.a;
        r8 = r8.ae;
        if (r8 == r11) goto L_0x01f2;
    L_0x01f0:
        r8 = 3;
        goto L_0x01f3;
    L_0x01f2:
        r8 = 2;
    L_0x01f3:
        r5 = r5.e;
        r7 = r7.e;
        r3 = -r3;
        r15.b(r5, r7, r3, r8);
        goto L_0x0235;
    L_0x01fc:
        r3 = r1.aa;
        r10 = r10 + r3;
        r3 = r1.o;
        r5 = r3.b;
        if (r5 == 0) goto L_0x021d;
    L_0x0205:
        r3 = r3.b();
        r5 = r6.aq;
        r5 = r5[r11];
        if (r1 == r5) goto L_0x021e;
    L_0x020f:
        r5 = r1.o;
        r5 = r5.b;
        r5 = r5.a;
        r5 = r5.m;
        r5 = r5.b();
        r3 = r3 + r5;
        goto L_0x021e;
    L_0x021d:
        r3 = 0;
    L_0x021e:
        r5 = r1.o;
        r5 = r5.e;
        r7 = r1.m;
        r7 = r7.e;
        r15.a(r5, r7, r14, r4);
        r5 = r1.o;
        r7 = r5.e;
        r5 = r5.b;
        r5 = r5.e;
        r3 = -r3;
        r15.b(r7, r5, r3, r4);
    L_0x0235:
        r3 = r1.ac;
        r29 = r3;
        r3 = r1;
        r1 = r29;
        goto L_0x01a2;
    L_0x023e:
        if (r0 != r4) goto L_0x02b7;
    L_0x0240:
        r0 = r6.am;
        r0 = r0[r14];
        r1 = r0.m;
        r1 = r1.b();
        r3 = r0.m;
        r3 = r3.b;
        if (r3 == 0) goto L_0x0255;
    L_0x0250:
        r3 = r3.b();
        r1 = r1 + r3;
    L_0x0255:
        r3 = r0.o;
        r3 = r3.b();
        r5 = r0.o;
        r5 = r5.b;
        if (r5 == 0) goto L_0x0266;
    L_0x0261:
        r5 = r5.b();
        r3 = r3 + r5;
    L_0x0266:
        r5 = r12.o;
        r5 = r5.b;
        r5 = r5.e;
        r7 = r6.aq;
        r8 = r7[r11];
        if (r0 != r8) goto L_0x027a;
    L_0x0272:
        r5 = r7[r4];
        r5 = r5.o;
        r5 = r5.b;
        r5 = r5.e;
    L_0x027a:
        r7 = r0.g;
        if (r7 != r4) goto L_0x02a2;
    L_0x027e:
        r0 = r12.m;
        r7 = r0.e;
        r0 = r0.b;
        r0 = r0.e;
        r15.a(r7, r0, r1, r4);
        r0 = r12.o;
        r0 = r0.e;
        r1 = -r3;
        r15.b(r0, r5, r1, r4);
        r0 = r12.o;
        r0 = r0.e;
        r1 = r12.m;
        r1 = r1.e;
        r3 = r12.g();
        r15.c(r0, r1, r3, r2);
        goto L_0x058b;
    L_0x02a2:
        r2 = r0.m;
        r7 = r2.e;
        r2 = r2.b;
        r2 = r2.e;
        r15.c(r7, r2, r1, r4);
        r0 = r0.o;
        r0 = r0.e;
        r1 = -r3;
        r15.c(r0, r5, r1, r4);
        goto L_0x058b;
    L_0x02b7:
        r1 = 0;
    L_0x02b8:
        r3 = r0 + -1;
        if (r1 >= r3) goto L_0x058b;
    L_0x02bc:
        r5 = r6.am;
        r7 = r5[r1];
        r1 = r1 + 1;
        r5 = r5[r1];
        r8 = r7.m;
        r9 = r8.e;
        r14 = r7.o;
        r14 = r14.e;
        r2 = r5.m;
        r2 = r2.e;
        r4 = r5.o;
        r4 = r4.e;
        r28 = r0;
        r0 = r6.aq;
        r16 = r4;
        r4 = r0[r11];
        if (r5 != r4) goto L_0x02e6;
    L_0x02de:
        r4 = 1;
        r0 = r0[r4];
        r0 = r0.o;
        r0 = r0.e;
        goto L_0x02e8;
    L_0x02e6:
        r0 = r16;
    L_0x02e8:
        r4 = r8.b();
        r8 = r7.m;
        r8 = r8.b;
        if (r8 == 0) goto L_0x0303;
    L_0x02f2:
        r8 = r8.a;
        r8 = r8.o;
        r11 = r8.b;
        if (r11 == 0) goto L_0x0303;
    L_0x02fa:
        r11 = r11.a;
        if (r11 != r7) goto L_0x0303;
    L_0x02fe:
        r8 = r8.b();
        r4 = r4 + r8;
    L_0x0303:
        r8 = r7.m;
        r8 = r8.b;
        r8 = r8.e;
        r11 = 2;
        r15.a(r9, r8, r4, r11);
        r4 = r7.o;
        r4 = r4.b();
        r8 = r7.o;
        r8 = r8.b;
        if (r8 == 0) goto L_0x032a;
    L_0x0319:
        r8 = r7.ac;
        if (r8 == 0) goto L_0x032a;
    L_0x031d:
        r8 = r8.m;
        r11 = r8.b;
        if (r11 == 0) goto L_0x0328;
    L_0x0323:
        r8 = r8.b();
        goto L_0x0329;
    L_0x0328:
        r8 = 0;
    L_0x0329:
        r4 = r4 + r8;
    L_0x032a:
        r8 = r7.o;
        r8 = r8.b;
        r8 = r8.e;
        r4 = -r4;
        r11 = 2;
        r15.b(r14, r8, r4, r11);
        if (r1 != r3) goto L_0x038f;
    L_0x0337:
        r3 = r5.m;
        r3 = r3.b();
        r4 = r5.m;
        r4 = r4.b;
        if (r4 == 0) goto L_0x0354;
    L_0x0343:
        r4 = r4.a;
        r4 = r4.o;
        r8 = r4.b;
        if (r8 == 0) goto L_0x0354;
    L_0x034b:
        r8 = r8.a;
        if (r8 != r5) goto L_0x0354;
    L_0x034f:
        r4 = r4.b();
        r3 = r3 + r4;
    L_0x0354:
        r4 = r5.m;
        r4 = r4.b;
        r4 = r4.e;
        r8 = 2;
        r15.a(r2, r4, r3, r8);
        r3 = r5.o;
        r4 = r6.aq;
        r8 = 3;
        r11 = r4[r8];
        if (r5 != r11) goto L_0x036c;
    L_0x0367:
        r8 = 1;
        r3 = r4[r8];
        r3 = r3.o;
    L_0x036c:
        r4 = r3.b();
        r8 = r3.b;
        if (r8 == 0) goto L_0x0385;
    L_0x0374:
        r8 = r8.a;
        r8 = r8.m;
        r11 = r8.b;
        if (r11 == 0) goto L_0x0385;
    L_0x037c:
        r11 = r11.a;
        if (r11 != r5) goto L_0x0385;
    L_0x0380:
        r8 = r8.b();
        r4 = r4 + r8;
    L_0x0385:
        r3 = r3.b;
        r3 = r3.e;
        r4 = -r4;
        r8 = 2;
        r15.b(r0, r3, r4, r8);
        goto L_0x0390;
    L_0x038f:
        r8 = 2;
    L_0x0390:
        r3 = r12.k;
        if (r3 <= 0) goto L_0x0397;
    L_0x0394:
        r15.b(r14, r9, r3, r8);
    L_0x0397:
        r3 = r31.b();
        r4 = r7.aa;
        r11 = r5.aa;
        r8 = r7.m;
        r21 = r8.b();
        r7 = r7.o;
        r23 = r7.b();
        r7 = r5.m;
        r25 = r7.b();
        r5 = r5.o;
        r27 = r5.b();
        r16 = r3;
        r17 = r4;
        r18 = r10;
        r19 = r11;
        r20 = r9;
        r22 = r14;
        r24 = r2;
        r26 = r0;
        r16.a(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
        r15.a(r3);
        r0 = r28;
        r2 = 2;
        r4 = 1;
        r11 = 3;
        r14 = 0;
        goto L_0x02b8;
    L_0x03d5:
        r0 = r1;
        r2 = r18;
        r3 = r2;
        r14 = 0;
    L_0x03da:
        if (r0 == 0) goto L_0x0549;
    L_0x03dc:
        r4 = r0.ac;
        if (r4 != 0) goto L_0x03e8;
    L_0x03e0:
        r2 = r6.aq;
        r7 = 1;
        r2 = r2[r7];
        r14 = r2;
        r2 = 1;
        goto L_0x03ed;
    L_0x03e8:
        r29 = r14;
        r14 = r2;
        r2 = r29;
    L_0x03ed:
        if (r17 == 0) goto L_0x0460;
    L_0x03ef:
        r7 = r0.m;
        r8 = r7.b();
        if (r3 == 0) goto L_0x03fe;
    L_0x03f7:
        r3 = r3.o;
        r3 = r3.b();
        r8 = r8 + r3;
    L_0x03fe:
        if (r1 != r0) goto L_0x0402;
    L_0x0400:
        r3 = 1;
        goto L_0x0403;
    L_0x0402:
        r3 = 3;
    L_0x0403:
        r9 = r7.b;
        if (r9 == 0) goto L_0x0411;
    L_0x0407:
        r10 = r7.e;
        r9 = r9.e;
        r29 = r10;
        r10 = r9;
        r9 = r29;
        goto L_0x0424;
    L_0x0411:
        r9 = r0.p;
        r10 = r9.b;
        if (r10 == 0) goto L_0x0421;
    L_0x0417:
        r9 = r9.e;
        r10 = r10.e;
        r11 = r7.b();
        r8 = r8 - r11;
        goto L_0x0424;
    L_0x0421:
        r9 = r18;
        r10 = r9;
    L_0x0424:
        if (r9 != 0) goto L_0x0427;
    L_0x0426:
        goto L_0x042c;
    L_0x0427:
        if (r10 == 0) goto L_0x042c;
    L_0x0429:
        r15.a(r9, r10, r8, r3);
    L_0x042c:
        r3 = r0.ae;
        r11 = 3;
        if (r3 != r11) goto L_0x04b6;
    L_0x0431:
        r3 = r0.o;
        r8 = r0.g;
        r9 = 1;
        if (r8 != r9) goto L_0x044b;
    L_0x0438:
        r8 = r0.j;
        r9 = r0.g();
        r8 = java.lang.Math.max(r8, r9);
        r3 = r3.e;
        r7 = r7.e;
        r15.c(r3, r7, r8, r11);
        goto L_0x04b6;
    L_0x044b:
        r8 = r7.e;
        r9 = r7.b;
        r9 = r9.e;
        r10 = r7.c;
        r15.a(r8, r9, r10, r11);
        r3 = r3.e;
        r7 = r7.e;
        r8 = r0.j;
        r15.b(r3, r7, r8, r11);
        goto L_0x04b6;
    L_0x0460:
        r11 = 3;
        r7 = 5;
        if (r5 == 0) goto L_0x048e;
    L_0x0464:
        if (r2 == 0) goto L_0x048e;
    L_0x0466:
        if (r3 == 0) goto L_0x048e;
    L_0x0468:
        r3 = r0.o;
        r8 = r3.b;
        if (r8 != 0) goto L_0x047b;
    L_0x046e:
        r3 = r3.e;
        r7 = r0.i();
        r8 = r0.z;
        r7 = r7 + r8;
        r15.a(r3, r7);
        goto L_0x04b6;
    L_0x047b:
        r3 = r3.b();
        r8 = r0.o;
        r8 = r8.e;
        r9 = r14.o;
        r9 = r9.b;
        r9 = r9.e;
        r3 = -r3;
        r15.c(r8, r9, r3, r7);
        goto L_0x04b6;
    L_0x048e:
        if (r16 == 0) goto L_0x0491;
    L_0x0490:
        goto L_0x04c1;
    L_0x0491:
        if (r2 != 0) goto L_0x04c1;
    L_0x0493:
        if (r3 != 0) goto L_0x04c1;
    L_0x0495:
        r3 = r0.m;
        r8 = r3.b;
        if (r8 != 0) goto L_0x04a5;
    L_0x049b:
        r3 = r3.e;
        r7 = r0.i();
        r15.a(r3, r7);
        goto L_0x04b6;
    L_0x04a5:
        r3 = r3.b();
        r8 = r0.m;
        r8 = r8.e;
        r9 = r12.m;
        r9 = r9.b;
        r9 = r9.e;
        r15.c(r8, r9, r3, r7);
    L_0x04b6:
        r19 = r0;
        r20 = r5;
    L_0x04ba:
        r0 = r12;
        r3 = r13;
        r6 = r14;
        r21 = 0;
        goto L_0x0537;
    L_0x04c1:
        r7 = r0.m;
        r8 = r0.o;
        r10 = r7.b();
        r9 = r8.b();
        r11 = r7.e;
        r19 = r0;
        r0 = r7.b;
        r0 = r0.e;
        r20 = r5;
        r5 = 1;
        r15.a(r11, r0, r10, r5);
        r0 = r8.e;
        r11 = r8.b;
        r11 = r11.e;
        r6 = -r9;
        r15.b(r0, r11, r6, r5);
        r0 = r7.b;
        if (r0 == 0) goto L_0x04ec;
    L_0x04e9:
        r0 = r0.e;
        goto L_0x04ee;
    L_0x04ec:
        r0 = r18;
    L_0x04ee:
        if (r3 != 0) goto L_0x04fb;
    L_0x04f0:
        r0 = r12.m;
        r0 = r0.b;
        if (r0 == 0) goto L_0x04f9;
    L_0x04f6:
        r0 = r0.e;
        goto L_0x04fb;
    L_0x04f9:
        r0 = r18;
    L_0x04fb:
        if (r4 != 0) goto L_0x0509;
    L_0x04fd:
        r3 = r14.o;
        r3 = r3.b;
        if (r3 == 0) goto L_0x0507;
    L_0x0503:
        r3 = r3.a;
        r4 = r3;
        goto L_0x0509;
    L_0x0507:
        r4 = r18;
    L_0x0509:
        if (r4 == 0) goto L_0x04ba;
    L_0x050b:
        r3 = r4.m;
        r3 = r3.e;
        if (r2 == 0) goto L_0x051c;
    L_0x0511:
        r3 = r14.o;
        r3 = r3.b;
        if (r3 == 0) goto L_0x051a;
    L_0x0517:
        r3 = r3.e;
        goto L_0x051c;
    L_0x051a:
        r3 = r18;
    L_0x051c:
        if (r0 == 0) goto L_0x04ba;
    L_0x051e:
        if (r3 == 0) goto L_0x04ba;
    L_0x0520:
        r5 = r7.e;
        r11 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = r8.e;
        r7 = r31;
        r8 = r5;
        r5 = r9;
        r9 = r0;
        r0 = 3;
        r0 = r12;
        r12 = r3;
        r3 = r13;
        r13 = r6;
        r6 = r14;
        r21 = 0;
        r14 = r5;
        r7.a(r8, r9, r10, r11, r12, r13, r14);
    L_0x0537:
        if (r2 != 0) goto L_0x053a;
    L_0x0539:
        goto L_0x053c;
    L_0x053a:
        r4 = r18;
    L_0x053c:
        r12 = r0;
        r14 = r2;
        r13 = r3;
        r0 = r4;
        r2 = r6;
        r3 = r19;
        r5 = r20;
        r6 = r30;
        goto L_0x03da;
    L_0x0549:
        r0 = r12;
        r3 = r13;
        r21 = 0;
        if (r17 == 0) goto L_0x058e;
    L_0x054f:
        r1 = r1.m;
        r4 = r2.o;
        r10 = r1.b();
        r14 = r4.b();
        r5 = r0.m;
        r5 = r5.b;
        if (r5 == 0) goto L_0x0565;
    L_0x0561:
        r5 = r5.e;
        r9 = r5;
        goto L_0x0567;
    L_0x0565:
        r9 = r18;
    L_0x0567:
        r2 = r2.o;
        r2 = r2.b;
        if (r2 == 0) goto L_0x0571;
    L_0x056d:
        r2 = r2.e;
        r12 = r2;
        goto L_0x0573;
    L_0x0571:
        r12 = r18;
    L_0x0573:
        if (r9 != 0) goto L_0x0576;
    L_0x0575:
        goto L_0x058e;
    L_0x0576:
        if (r12 == 0) goto L_0x058e;
    L_0x0578:
        r2 = r4.e;
        r5 = -r14;
        r6 = 1;
        r15.b(r2, r12, r5, r6);
        r8 = r1.e;
        r11 = r0.I;
        r13 = r4.e;
        r7 = r31;
        r7.a(r8, r9, r10, r11, r12, r13, r14);
        goto L_0x058e;
    L_0x058b:
        r3 = r13;
        r21 = 0;
    L_0x058e:
        r13 = r3 + 1;
        r14 = 0;
        r6 = r30;
        goto L_0x0006;
    L_0x0595:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg.d(db):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:223:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0545  */
    public final void b() {
        /*
        r31 = this;
        r1 = r31;
        r2 = r1.w;
        r3 = r1.x;
        r0 = r31.d();
        r4 = 0;
        r5 = java.lang.Math.max(r4, r0);
        r0 = r31.g();
        r6 = java.lang.Math.max(r4, r0);
        r1.b = r4;
        r1.c = r4;
        r0 = r1.r;
        r7 = 0;
        r8 = 2;
        if (r0 == 0) goto L_0x00a4;
    L_0x0021:
        r0 = r1.ah;
        if (r0 != 0) goto L_0x002c;
    L_0x0025:
        r0 = new dl;
        r0.<init>(r1);
        r1.ah = r0;
    L_0x002c:
        r0 = r1.ah;
        r9 = r1.w;
        r0.a = r9;
        r9 = r1.x;
        r0.b = r9;
        r9 = r31.d();
        r0.c = r9;
        r9 = r31.g();
        r0.d = r9;
        r9 = r0.e;
        r9 = r9.size();
        r10 = 0;
    L_0x0049:
        if (r10 >= r9) goto L_0x0081;
    L_0x004b:
        r11 = r0.e;
        r11 = r11.get(r10);
        r11 = (defpackage.dk) r11;
        r12 = r11.a;
        r12 = r12.f;
        r12 = r1.e(r12);
        r11.a = r12;
        r12 = r11.a;
        if (r12 != 0) goto L_0x006a;
    L_0x0061:
        r11.b = r7;
        r11.c = r4;
        r11.e = r8;
        r11.d = r4;
        goto L_0x007e;
    L_0x006a:
        r13 = r12.b;
        r11.b = r13;
        r12 = r12.b();
        r11.c = r12;
        r12 = r11.a;
        r13 = r12.g;
        r11.e = r13;
        r12 = r12.d;
        r11.d = r12;
    L_0x007e:
        r10 = r10 + 1;
        goto L_0x0049;
    L_0x0081:
        r1.w = r4;
        r1.x = r4;
        r0 = r1.q;
        r0 = r0.size();
        r9 = 0;
    L_0x008c:
        if (r9 >= r0) goto L_0x009c;
    L_0x008e:
        r10 = r1.q;
        r10 = r10.get(r9);
        r10 = (defpackage.df) r10;
        r10.c();
        r9 = r9 + 1;
        goto L_0x008c;
    L_0x009c:
        r0 = r1.ag;
        r0 = r0.f;
        r1.a(r0);
        goto L_0x00a8;
    L_0x00a4:
        r1.w = r4;
        r1.x = r4;
    L_0x00a8:
        r9 = r1.ae;
        r10 = r1.ad;
        r0 = r1.a;
        r12 = 1;
        if (r0 == r8) goto L_0x00b8;
    L_0x00b1:
        r23 = r2;
        r25 = r3;
    L_0x00b5:
        r2 = 0;
        goto L_0x0237;
    L_0x00b8:
        if (r9 != r8) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00be;
    L_0x00bb:
        if (r10 == r8) goto L_0x00be;
    L_0x00bd:
        goto L_0x00b1;
    L_0x00be:
        r0 = r1.af;
        r13 = r1.ap;
        r14 = r0.size();
        r13[r4] = r12;
        r7 = 0;
        r8 = 0;
        r12 = 0;
        r15 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
    L_0x00d2:
        if (r15 >= r14) goto L_0x019a;
    L_0x00d4:
        r21 = r0.get(r15);
        r11 = r21;
        r11 = (defpackage.dh) r11;
        r21 = r11.c();
        if (r21 == 0) goto L_0x00ea;
    L_0x00e2:
        r23 = r2;
        r25 = r3;
        r22 = r13;
        goto L_0x018a;
    L_0x00ea:
        r4 = r11.T;
        if (r4 != 0) goto L_0x00f1;
    L_0x00ee:
        r1.a(r11, r13);
    L_0x00f1:
        r4 = r11.U;
        if (r4 != 0) goto L_0x00f8;
    L_0x00f5:
        r1.b(r11, r13);
    L_0x00f8:
        r4 = 0;
        r22 = r13[r4];
        if (r22 == 0) goto L_0x0195;
    L_0x00fd:
        r4 = r11.M;
        r22 = r13;
        r13 = r11.N;
        r4 = r4 + r13;
        r13 = r11.d();
        r4 = r4 - r13;
        r13 = r11.L;
        r23 = r4;
        r4 = r11.O;
        r13 = r13 + r4;
        r4 = r11.g();
        r13 = r13 - r4;
        r4 = r11.ad;
        r24 = r13;
        r13 = 4;
        if (r4 != r13) goto L_0x012b;
    L_0x011c:
        r4 = r11.d();
        r13 = r11.l;
        r13 = r13.c;
        r4 = r4 + r13;
        r13 = r11.n;
        r13 = r13.c;
        r4 = r4 + r13;
        goto L_0x012d;
    L_0x012b:
        r4 = r23;
    L_0x012d:
        r13 = r11.ae;
        r23 = r4;
        r4 = 4;
        if (r13 != r4) goto L_0x0143;
    L_0x0134:
        r4 = r11.g();
        r13 = r11.m;
        r13 = r13.c;
        r4 = r4 + r13;
        r13 = r11.o;
        r13 = r13.c;
        r4 = r4 + r13;
        goto L_0x0145;
    L_0x0143:
        r4 = r24;
    L_0x0145:
        r13 = r11.K;
        r24 = r4;
        r4 = 8;
        if (r13 != r4) goto L_0x0151;
    L_0x014d:
        r25 = r3;
        r3 = 0;
        goto L_0x0155;
    L_0x0151:
        r25 = r3;
        r3 = r24;
    L_0x0155:
        if (r13 == r4) goto L_0x015a;
    L_0x0157:
        r4 = r23;
        goto L_0x015b;
    L_0x015a:
        r4 = 0;
    L_0x015b:
        r13 = r11.M;
        r7 = java.lang.Math.max(r7, r13);
        r13 = r11.N;
        r12 = java.lang.Math.max(r12, r13);
        r13 = r11.O;
        r23 = r2;
        r2 = r19;
        r2 = java.lang.Math.max(r2, r13);
        r11 = r11.L;
        r13 = r18;
        r11 = java.lang.Math.max(r13, r11);
        r4 = java.lang.Math.max(r8, r4);
        r8 = r20;
        r3 = java.lang.Math.max(r8, r3);
        r19 = r2;
        r20 = r3;
        r8 = r4;
        r18 = r11;
    L_0x018a:
        r15 = r15 + 1;
        r13 = r22;
        r2 = r23;
        r3 = r25;
        r4 = 0;
        goto L_0x00d2;
    L_0x0195:
        r23 = r2;
        r25 = r3;
        goto L_0x01dd;
    L_0x019a:
        r23 = r2;
        r25 = r3;
        r13 = r18;
        r2 = r19;
        r4 = r20;
        r3 = java.lang.Math.max(r7, r12);
        r7 = r1.D;
        r3 = java.lang.Math.max(r3, r8);
        r3 = java.lang.Math.max(r7, r3);
        r1.ai = r3;
        r2 = java.lang.Math.max(r13, r2);
        r3 = r1.E;
        r2 = java.lang.Math.max(r2, r4);
        r2 = java.lang.Math.max(r3, r2);
        r1.aj = r2;
        r2 = 0;
    L_0x01c5:
        if (r2 >= r14) goto L_0x01dd;
    L_0x01c7:
        r3 = r0.get(r2);
        r3 = (defpackage.dh) r3;
        r4 = 0;
        r3.T = r4;
        r3.U = r4;
        r3.P = r4;
        r3.Q = r4;
        r3.R = r4;
        r3.S = r4;
        r2 = r2 + 1;
        goto L_0x01c5;
    L_0x01dd:
        r4 = 0;
        r0 = r1.ap;
        r0 = r0[r4];
        if (r5 > 0) goto L_0x01e5;
    L_0x01e4:
        goto L_0x01f1;
    L_0x01e5:
        if (r6 <= 0) goto L_0x01f1;
    L_0x01e7:
        r2 = r1.ai;
        if (r2 > r5) goto L_0x01ef;
    L_0x01eb:
        r2 = r1.aj;
        if (r2 <= r6) goto L_0x01f1;
    L_0x01ef:
        r4 = 0;
        goto L_0x01f2;
    L_0x01f1:
        r4 = r0;
    L_0x01f2:
        if (r4 != 0) goto L_0x01f6;
    L_0x01f4:
        goto L_0x00b5;
    L_0x01f6:
        r0 = r1.ad;
        r2 = 2;
        if (r0 != r2) goto L_0x0215;
    L_0x01fb:
        r2 = 1;
        r1.ad = r2;
        if (r5 <= 0) goto L_0x020a;
    L_0x0200:
        r0 = r1.ai;
        if (r5 >= r0) goto L_0x020a;
    L_0x0204:
        r1.b = r2;
        r1.a(r5);
        goto L_0x0215;
    L_0x020a:
        r0 = r1.D;
        r2 = r1.ai;
        r0 = java.lang.Math.max(r0, r2);
        r1.a(r0);
    L_0x0215:
        r0 = r1.ae;
        r2 = 2;
        if (r0 != r2) goto L_0x00b5;
    L_0x021a:
        r2 = 1;
        r1.ae = r2;
        if (r6 <= 0) goto L_0x022a;
    L_0x021f:
        r0 = r1.aj;
        if (r6 >= r0) goto L_0x022a;
    L_0x0223:
        r1.c = r2;
        r1.b(r6);
        goto L_0x00b5;
    L_0x022a:
        r0 = r1.E;
        r2 = r1.aj;
        r0 = java.lang.Math.max(r0, r2);
        r1.b(r0);
        goto L_0x00b5;
    L_0x0237:
        r1.ak = r2;
        r1.al = r2;
        r0 = r1.af;
        r2 = r0.size();
        r0 = 0;
    L_0x0242:
        if (r0 >= r2) goto L_0x0259;
    L_0x0244:
        r3 = r1.af;
        r3 = r3.get(r0);
        r3 = (defpackage.dh) r3;
        r7 = r3 instanceof defpackage.dn;
        if (r7 != 0) goto L_0x0251;
    L_0x0250:
        goto L_0x0256;
    L_0x0251:
        r3 = (defpackage.dn) r3;
        r3.b();
    L_0x0256:
        r0 = r0 + 1;
        goto L_0x0242;
    L_0x0259:
        r12 = r4;
        r0 = 0;
        r3 = 1;
    L_0x025c:
        if (r3 == 0) goto L_0x0585;
    L_0x025e:
        r4 = 1;
        r7 = r0 + 1;
        r0 = r1.ag;	 Catch:{ Exception -> 0x040c }
        r0.a();	 Catch:{ Exception -> 0x040c }
        r0 = r1.ag;	 Catch:{ Exception -> 0x040c }
        r3 = r1.b(r0);	 Catch:{ Exception -> 0x040c }
        if (r3 != 0) goto L_0x026f;
    L_0x026e:
        goto L_0x0294;
    L_0x026f:
        r4 = r1.ag;	 Catch:{ Exception -> 0x03fe }
        r8 = r4.a;	 Catch:{ Exception -> 0x03fe }
        r8.a(r4);	 Catch:{ Exception -> 0x03fe }
        r4.a(r8);	 Catch:{ Exception -> 0x03fe }
        r0 = 0;
    L_0x027a:
        r11 = r4.d;	 Catch:{ Exception -> 0x03fe }
        if (r0 < r11) goto L_0x03df;
    L_0x027e:
        r0 = 0;
        r11 = 0;
    L_0x0280:
        if (r0 == 0) goto L_0x029e;
    L_0x0282:
        r0 = 0;
    L_0x0283:
        r8 = r4.e;	 Catch:{ Exception -> 0x03fe }
        if (r0 >= r8) goto L_0x0294;
    L_0x0287:
        r8 = r4.b;	 Catch:{ Exception -> 0x03fe }
        r8 = r8[r0];	 Catch:{ Exception -> 0x03fe }
        r11 = r8.a;	 Catch:{ Exception -> 0x03fe }
        r8 = r8.b;	 Catch:{ Exception -> 0x03fe }
        r11.d = r8;	 Catch:{ Exception -> 0x03fe }
        r0 = r0 + 1;
        goto L_0x0283;
    L_0x0294:
        r28 = r5;
        r27 = r6;
        r29 = r9;
        r26 = r12;
        goto L_0x0418;
    L_0x029e:
        r13 = r8.a;	 Catch:{ Exception -> 0x03fe }
        r13 = r13.size();	 Catch:{ Exception -> 0x03fe }
        r14 = 0;
        r15 = 0;
        r18 = 0;
    L_0x02a8:
        r19 = 0;
        if (r14 >= r13) goto L_0x02f4;
    L_0x02ac:
        r20 = r0;
        r0 = r8.a;	 Catch:{ Exception -> 0x03fe }
        r0 = r0.get(r14);	 Catch:{ Exception -> 0x03fe }
        r0 = (defpackage.dc) r0;	 Catch:{ Exception -> 0x03fe }
        r22 = 5;
        r22 = r15;
        r15 = 5;
        r30 = r18;
        r18 = r3;
        r3 = r30;
    L_0x02c1:
        if (r15 >= 0) goto L_0x02d0;
    L_0x02c3:
        r14 = r14 + 1;
        r0 = r20;
        r15 = r22;
        r30 = r18;
        r18 = r3;
        r3 = r30;
        goto L_0x02a8;
    L_0x02d0:
        r24 = r13;
        r13 = r0.e;	 Catch:{ Exception -> 0x03dd }
        r13 = r13[r15];	 Catch:{ Exception -> 0x03dd }
        if (r22 == 0) goto L_0x02d9;
    L_0x02d8:
        goto L_0x02e4;
    L_0x02d9:
        r26 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1));
        if (r26 < 0) goto L_0x02de;
    L_0x02dd:
        goto L_0x02e4;
    L_0x02de:
        if (r15 >= r3) goto L_0x02e1;
    L_0x02e0:
        goto L_0x02e4;
    L_0x02e1:
        r22 = r0;
        r3 = r15;
    L_0x02e4:
        r13 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1));
        if (r13 > 0) goto L_0x02e9;
    L_0x02e8:
        goto L_0x02ef;
    L_0x02e9:
        if (r15 > r3) goto L_0x02ec;
    L_0x02eb:
        goto L_0x02ef;
    L_0x02ec:
        r3 = r15;
        r22 = 0;
    L_0x02ef:
        r15 = r15 + -1;
        r13 = r24;
        goto L_0x02c1;
    L_0x02f4:
        r20 = r0;
        r18 = r3;
        if (r15 != 0) goto L_0x02fb;
    L_0x02fa:
        goto L_0x0311;
    L_0x02fb:
        r0 = r4.c;	 Catch:{ Exception -> 0x03dd }
        r3 = r15.a;	 Catch:{ Exception -> 0x03dd }
        r13 = r0[r3];	 Catch:{ Exception -> 0x03dd }
        if (r13 != 0) goto L_0x0310;
    L_0x0303:
        r13 = 1;
        r0[r3] = r13;	 Catch:{ Exception -> 0x03dd }
        r11 = r11 + 1;
        r0 = r4.d;	 Catch:{ Exception -> 0x03dd }
        if (r11 >= r0) goto L_0x030d;
    L_0x030c:
        goto L_0x0311;
    L_0x030d:
        r20 = 1;
        goto L_0x0311;
    L_0x0310:
        r15 = 0;
    L_0x0311:
        if (r15 == 0) goto L_0x03c4;
    L_0x0313:
        r0 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r0 = 0;
        r13 = -1;
        r14 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
    L_0x031b:
        r3 = r4.e;	 Catch:{ Exception -> 0x03dd }
        if (r0 >= r3) goto L_0x038a;
    L_0x031f:
        r3 = r4.b;	 Catch:{ Exception -> 0x03dd }
        r3 = r3[r0];	 Catch:{ Exception -> 0x03dd }
        r24 = r11;
        r11 = r3.a;	 Catch:{ Exception -> 0x03dd }
        r11 = r11.h;	 Catch:{ Exception -> 0x03dd }
        r26 = r12;
        r12 = 1;
        if (r11 != r12) goto L_0x0335;
    L_0x032e:
        r28 = r5;
        r27 = r6;
    L_0x0332:
        r29 = r9;
        goto L_0x0372;
    L_0x0335:
        r11 = r3.d;	 Catch:{ Exception -> 0x0381 }
        r12 = r11.f;	 Catch:{ Exception -> 0x0381 }
        r27 = r6;
        r6 = -1;
        r28 = r5;
        if (r12 != r6) goto L_0x0341;
    L_0x0340:
        goto L_0x0332;
    L_0x0341:
        r5 = 0;
    L_0x0342:
        if (r12 != r6) goto L_0x0345;
    L_0x0344:
        goto L_0x0332;
    L_0x0345:
        r6 = r11.a;	 Catch:{ Exception -> 0x037f }
        if (r5 >= r6) goto L_0x0332;
    L_0x0349:
        r6 = r11.c;	 Catch:{ Exception -> 0x037f }
        r6 = r6[r12];	 Catch:{ Exception -> 0x037f }
        r29 = r9;
        r9 = r15.a;	 Catch:{ Exception -> 0x03fc }
        if (r6 == r9) goto L_0x035d;
    L_0x0353:
        r6 = r11.d;	 Catch:{ Exception -> 0x03fc }
        r12 = r6[r12];	 Catch:{ Exception -> 0x03fc }
        r5 = r5 + 1;
        r9 = r29;
        r6 = -1;
        goto L_0x0342;
    L_0x035d:
        r5 = r3.d;	 Catch:{ Exception -> 0x03fc }
        r5 = r5.b(r15);	 Catch:{ Exception -> 0x03fc }
        r6 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1));
        if (r6 >= 0) goto L_0x0372;
    L_0x0367:
        r3 = r3.b;	 Catch:{ Exception -> 0x03fc }
        r3 = -r3;
        r3 = r3 / r5;
        r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));
        if (r5 < 0) goto L_0x0370;
    L_0x036f:
        goto L_0x0372;
    L_0x0370:
        r13 = r0;
        r14 = r3;
    L_0x0372:
        r0 = r0 + 1;
        r11 = r24;
        r12 = r26;
        r6 = r27;
        r5 = r28;
        r9 = r29;
        goto L_0x031b;
    L_0x037f:
        r0 = move-exception;
        goto L_0x0386;
    L_0x0381:
        r0 = move-exception;
        r28 = r5;
        r27 = r6;
    L_0x0386:
        r29 = r9;
        goto L_0x0409;
    L_0x038a:
        r28 = r5;
        r27 = r6;
        r29 = r9;
        r24 = r11;
        r26 = r12;
        if (r13 < 0) goto L_0x03ce;
    L_0x0396:
        r0 = r4.b;	 Catch:{ Exception -> 0x03fc }
        r0 = r0[r13];	 Catch:{ Exception -> 0x03fc }
        r3 = r0.a;	 Catch:{ Exception -> 0x03fc }
        r5 = -1;
        r3.b = r5;	 Catch:{ Exception -> 0x03fc }
        r0.a(r15);	 Catch:{ Exception -> 0x03fc }
        r3 = r0.a;	 Catch:{ Exception -> 0x03fc }
        r3.b = r13;	 Catch:{ Exception -> 0x03fc }
        r3 = 0;
    L_0x03a7:
        r5 = r4.e;	 Catch:{ Exception -> 0x03fc }
        if (r3 >= r5) goto L_0x03b5;
    L_0x03ab:
        r5 = r4.b;	 Catch:{ Exception -> 0x03fc }
        r5 = r5[r3];	 Catch:{ Exception -> 0x03fc }
        r5.a(r0);	 Catch:{ Exception -> 0x03fc }
        r3 = r3 + 1;
        goto L_0x03a7;
    L_0x03b5:
        r8.a(r4);	 Catch:{ Exception -> 0x03fc }
        r4.a(r8);	 Catch:{ Exception -> 0x03bc }
        goto L_0x03c1;
    L_0x03bc:
        r0 = move-exception;
        r3 = r0;
        defpackage.ankx.a(r3);	 Catch:{ Exception -> 0x03fc }
    L_0x03c1:
        r0 = r20;
        goto L_0x03cf;
    L_0x03c4:
        r28 = r5;
        r27 = r6;
        r29 = r9;
        r24 = r11;
        r26 = r12;
    L_0x03ce:
        r0 = 1;
    L_0x03cf:
        r3 = r18;
        r11 = r24;
        r12 = r26;
        r6 = r27;
        r5 = r28;
        r9 = r29;
        goto L_0x0280;
    L_0x03dd:
        r0 = move-exception;
        goto L_0x0401;
    L_0x03df:
        r18 = r3;
        r28 = r5;
        r27 = r6;
        r29 = r9;
        r26 = r12;
        r3 = r4.c;	 Catch:{ Exception -> 0x03fc }
        r5 = 0;
        r3[r0] = r5;	 Catch:{ Exception -> 0x03fc }
        r0 = r0 + 1;
        r3 = r18;
        r12 = r26;
        r6 = r27;
        r5 = r28;
        r9 = r29;
        goto L_0x027a;
    L_0x03fc:
        r0 = move-exception;
        goto L_0x0409;
    L_0x03fe:
        r0 = move-exception;
        r18 = r3;
    L_0x0401:
        r28 = r5;
        r27 = r6;
        r29 = r9;
        r26 = r12;
    L_0x0409:
        r3 = r18;
        goto L_0x0415;
    L_0x040c:
        r0 = move-exception;
        r28 = r5;
        r27 = r6;
        r29 = r9;
        r26 = r12;
    L_0x0415:
        defpackage.ankx.a(r0);
    L_0x0418:
        r0 = 3;
        if (r3 == 0) goto L_0x0461;
    L_0x041b:
        r3 = r1.ap;
        r4 = 2;
        r5 = 0;
        r3[r4] = r5;
        r31.n();
        r4 = r1.af;
        r4 = r4.size();
        r6 = 0;
    L_0x042b:
        if (r6 >= r4) goto L_0x045d;
    L_0x042d:
        r8 = r1.af;
        r8 = r8.get(r6);
        r8 = (defpackage.dh) r8;
        r8.n();
        r9 = r8.ad;
        if (r9 != r0) goto L_0x0449;
    L_0x043c:
        r9 = r8.d();
        r11 = r8.F;
        if (r9 >= r11) goto L_0x0449;
    L_0x0444:
        r9 = 2;
        r11 = 1;
        r3[r9] = r11;
        goto L_0x044b;
    L_0x0449:
        r9 = 2;
        r11 = 1;
    L_0x044b:
        r12 = r8.ae;
        if (r12 == r0) goto L_0x0450;
    L_0x044f:
        goto L_0x045a;
    L_0x0450:
        r12 = r8.g();
        r8 = r8.G;
        if (r12 >= r8) goto L_0x045a;
    L_0x0458:
        r3[r9] = r11;
    L_0x045a:
        r6 = r6 + 1;
        goto L_0x042b;
    L_0x045d:
        r3 = 8;
        r6 = 2;
        goto L_0x049d;
    L_0x0461:
        r5 = 0;
        r31.n();
        r3 = 0;
    L_0x0466:
        if (r3 >= r2) goto L_0x049a;
    L_0x0468:
        r4 = r1.af;
        r4 = r4.get(r3);
        r4 = (defpackage.dh) r4;
        r6 = r4.ad;
        if (r6 != r0) goto L_0x0483;
    L_0x0474:
        r6 = r4.d();
        r8 = r4.F;
        if (r6 >= r8) goto L_0x0483;
    L_0x047c:
        r0 = r1.ap;
        r6 = 2;
        r8 = 1;
        r0[r6] = r8;
        goto L_0x049b;
    L_0x0483:
        r6 = 2;
        r8 = 1;
        r9 = r4.ae;
        if (r9 == r0) goto L_0x048a;
    L_0x0489:
        goto L_0x0497;
    L_0x048a:
        r9 = r4.g();
        r4 = r4.G;
        if (r9 >= r4) goto L_0x0497;
    L_0x0492:
        r0 = r1.ap;
        r0[r6] = r8;
        goto L_0x049b;
    L_0x0497:
        r3 = r3 + 1;
        goto L_0x0466;
    L_0x049a:
        r6 = 2;
    L_0x049b:
        r3 = 8;
    L_0x049d:
        if (r7 >= r3) goto L_0x0503;
    L_0x049f:
        r0 = r1.ap;
        r0 = r0[r6];
        if (r0 == 0) goto L_0x0503;
    L_0x04a5:
        r0 = 0;
        r4 = 0;
        r6 = 0;
    L_0x04a8:
        if (r0 >= r2) goto L_0x04cb;
    L_0x04aa:
        r8 = r1.af;
        r8 = r8.get(r0);
        r8 = (defpackage.dh) r8;
        r9 = r8.w;
        r11 = r8.d();
        r9 = r9 + r11;
        r4 = java.lang.Math.max(r4, r9);
        r9 = r8.x;
        r8 = r8.g();
        r9 = r9 + r8;
        r6 = java.lang.Math.max(r6, r9);
        r0 = r0 + 1;
        goto L_0x04a8;
    L_0x04cb:
        r0 = r1.D;
        r0 = java.lang.Math.max(r0, r4);
        r4 = r1.E;
        r4 = java.lang.Math.max(r4, r6);
        r6 = 2;
        if (r10 == r6) goto L_0x04de;
    L_0x04da:
        r8 = r29;
        r0 = 0;
        goto L_0x04ef;
    L_0x04de:
        r8 = r31.d();
        if (r8 < r0) goto L_0x04e5;
    L_0x04e4:
        goto L_0x04da;
    L_0x04e5:
        r1.a(r0);
        r1.ad = r6;
        r8 = r29;
        r0 = 1;
        r26 = 1;
    L_0x04ef:
        if (r8 == r6) goto L_0x04f2;
    L_0x04f1:
        goto L_0x0501;
    L_0x04f2:
        r9 = r31.g();
        if (r9 >= r4) goto L_0x0501;
    L_0x04f8:
        r1.b(r4);
        r1.ae = r6;
        r12 = 1;
        r26 = 1;
        goto L_0x0506;
    L_0x0501:
        r12 = r0;
        goto L_0x0506;
    L_0x0503:
        r8 = r29;
        r12 = 0;
    L_0x0506:
        r0 = r1.D;
        r4 = r31.d();
        r0 = java.lang.Math.max(r0, r4);
        r4 = r31.d();
        if (r0 <= r4) goto L_0x0520;
    L_0x0516:
        r1.a(r0);
        r4 = 1;
        r1.ad = r4;
        r12 = 1;
        r26 = 1;
        goto L_0x0521;
    L_0x0520:
        r4 = 1;
    L_0x0521:
        r0 = r1.E;
        r6 = r31.g();
        r0 = java.lang.Math.max(r0, r6);
        r6 = r31.g();
        if (r0 <= r6) goto L_0x0539;
    L_0x0531:
        r1.b(r0);
        r1.ae = r4;
        r0 = 1;
        r12 = 1;
        goto L_0x053c;
    L_0x0539:
        r0 = r12;
        r12 = r26;
    L_0x053c:
        if (r12 == 0) goto L_0x0545;
    L_0x053e:
        r13 = r27;
        r6 = r28;
        r4 = 1;
        r11 = 2;
        goto L_0x057e;
    L_0x0545:
        r4 = r1.ad;
        r6 = 2;
        if (r4 == r6) goto L_0x054e;
    L_0x054a:
        r6 = r28;
    L_0x054c:
        r4 = 1;
        goto L_0x0563;
    L_0x054e:
        if (r28 <= 0) goto L_0x054a;
    L_0x0550:
        r4 = r31.d();
        r6 = r28;
        if (r4 > r6) goto L_0x0559;
    L_0x0558:
        goto L_0x054c;
    L_0x0559:
        r4 = 1;
        r1.b = r4;
        r1.ad = r4;
        r1.a(r6);
        r0 = 1;
        r12 = 1;
    L_0x0563:
        r9 = r1.ae;
        r11 = 2;
        if (r9 != r11) goto L_0x057c;
    L_0x0568:
        if (r27 <= 0) goto L_0x057c;
    L_0x056a:
        r9 = r31.g();
        r13 = r27;
        if (r9 <= r13) goto L_0x057e;
    L_0x0572:
        r1.c = r4;
        r1.ae = r4;
        r1.b(r13);
        r0 = 1;
        r12 = 1;
        goto L_0x057e;
    L_0x057c:
        r13 = r27;
    L_0x057e:
        r3 = r0;
        r5 = r6;
        r0 = r7;
        r9 = r8;
        r6 = r13;
        goto L_0x025c;
    L_0x0585:
        r8 = r9;
        r26 = r12;
        r5 = 0;
        r0 = r1.r;
        if (r0 == 0) goto L_0x05e7;
    L_0x058d:
        r0 = r1.D;
        r2 = r31.d();
        r0 = java.lang.Math.max(r0, r2);
        r2 = r1.E;
        r3 = r31.g();
        r2 = java.lang.Math.max(r2, r3);
        r3 = r1.ah;
        r4 = r3.a;
        r1.w = r4;
        r4 = r3.b;
        r1.x = r4;
        r4 = r3.c;
        r1.a(r4);
        r4 = r3.d;
        r1.b(r4);
        r4 = r3.e;
        r4 = r4.size();
    L_0x05bb:
        if (r5 >= r4) goto L_0x05e0;
    L_0x05bd:
        r6 = r3.e;
        r6 = r6.get(r5);
        r6 = (defpackage.dk) r6;
        r7 = r6.a;
        r7 = r7.f;
        r11 = r1.e(r7);
        r12 = r6.b;
        r13 = r6.c;
        r14 = -1;
        r15 = r6.e;
        r6 = r6.d;
        r17 = 0;
        r16 = r6;
        r11.a(r12, r13, r14, r15, r16, r17);
        r5 = r5 + 1;
        goto L_0x05bb;
    L_0x05e0:
        r1.a(r0);
        r1.b(r2);
        goto L_0x05ef;
    L_0x05e7:
        r2 = r23;
        r1.w = r2;
        r2 = r25;
        r1.x = r2;
    L_0x05ef:
        if (r26 == 0) goto L_0x05f5;
    L_0x05f1:
        r1.ad = r10;
        r1.ae = r8;
    L_0x05f5:
        r0 = r1.ag;
        r0 = r0.f;
        r1.a(r0);
        r0 = r1.r;
        r2 = r1;
    L_0x05ff:
        if (r0 == 0) goto L_0x060c;
    L_0x0601:
        r3 = r0.r;
        r4 = r0 instanceof defpackage.dg;
        if (r4 == 0) goto L_0x060a;
    L_0x0607:
        r2 = r0;
        r2 = (defpackage.dg) r2;
    L_0x060a:
        r0 = r3;
        goto L_0x05ff;
    L_0x060c:
        if (r1 != r2) goto L_0x0611;
    L_0x060e:
        r31.m();
    L_0x0611:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg.b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARNING: Missing block: B:41:0x0078, code skipped:
            if (r7 != r11.r) goto L_0x007b;
     */
    private final void a(defpackage.dh r11, boolean[] r12) {
        /*
        r10 = this;
        r0 = r11.ad;
        r1 = 0;
        r2 = 3;
        r3 = 0;
        if (r0 != r2) goto L_0x0015;
    L_0x0007:
        r0 = r11.ae;
        if (r0 != r2) goto L_0x0015;
    L_0x000b:
        r0 = r11.u;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 > 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0015;
    L_0x0012:
        r12[r3] = r3;
        return;
    L_0x0015:
        r0 = r11.e();
        r4 = r11.ad;
        if (r4 != r2) goto L_0x002b;
    L_0x001d:
        r4 = r11.ae;
        if (r4 == r2) goto L_0x002b;
    L_0x0021:
        r4 = r11.u;
        r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r1 > 0) goto L_0x0028;
    L_0x0027:
        goto L_0x002b;
    L_0x0028:
        r12[r3] = r3;
        return;
    L_0x002b:
        r1 = 1;
        r11.T = r1;
        r4 = r11 instanceof defpackage.dj;
        if (r4 == 0) goto L_0x004a;
    L_0x0032:
        r12 = r11;
        r12 = (defpackage.dj) r12;
        r2 = r12.af;
        if (r2 != r1) goto L_0x0046;
    L_0x0039:
        r0 = r12.b;
        r1 = -1;
        if (r0 == r1) goto L_0x003f;
    L_0x003e:
        goto L_0x0047;
    L_0x003f:
        r12 = r12.c;
        if (r12 == r1) goto L_0x0044;
    L_0x0043:
        r3 = r12;
    L_0x0044:
        r0 = 0;
        goto L_0x0047;
    L_0x0046:
        r3 = r0;
    L_0x0047:
        r4 = r3;
        goto L_0x014f;
    L_0x004a:
        r4 = r11.n;
        r4 = r4.d();
        if (r4 != 0) goto L_0x0062;
    L_0x0052:
        r4 = r11.l;
        r4 = r4.d();
        if (r4 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0062;
    L_0x005b:
        r12 = r11.w;
        r12 = r12 + r0;
        r4 = r0;
        r0 = r12;
        goto L_0x014f;
    L_0x0062:
        r4 = r11.n;
        r5 = r4.b;
        if (r5 == 0) goto L_0x007e;
    L_0x0068:
        r6 = r11.l;
        r6 = r6.b;
        if (r6 == 0) goto L_0x007e;
    L_0x006e:
        if (r5 == r6) goto L_0x007b;
    L_0x0070:
        r7 = r5.a;
        r6 = r6.a;
        if (r7 != r6) goto L_0x007e;
    L_0x0076:
        r6 = r11.r;
        if (r7 != r6) goto L_0x007b;
    L_0x007a:
        goto L_0x007e;
    L_0x007b:
        r12[r3] = r3;
        return;
    L_0x007e:
        r6 = 0;
        if (r5 == 0) goto L_0x0098;
    L_0x0081:
        r5 = r5.a;
        r4 = r4.b();
        r4 = r4 + r0;
        r7 = r5.c();
        if (r7 == 0) goto L_0x008f;
    L_0x008e:
        goto L_0x009a;
    L_0x008f:
        r7 = r5.T;
        if (r7 == 0) goto L_0x0094;
    L_0x0093:
        goto L_0x009a;
    L_0x0094:
        r10.a(r5, r12);
        goto L_0x009a;
    L_0x0098:
        r4 = r0;
        r5 = r6;
    L_0x009a:
        r7 = r11.l;
        r8 = r7.b;
        if (r8 == 0) goto L_0x00b6;
    L_0x00a0:
        r6 = r8.a;
        r7 = r7.b();
        r0 = r0 + r7;
        r7 = r6.c();
        if (r7 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00b6;
    L_0x00ae:
        r7 = r6.T;
        if (r7 == 0) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00b6;
    L_0x00b3:
        r10.a(r6, r12);
    L_0x00b6:
        r12 = r11.n;
        r12 = r12.b;
        r7 = 2;
        r8 = 4;
        if (r12 == 0) goto L_0x0105;
    L_0x00be:
        r12 = r5.c();
        if (r12 != 0) goto L_0x0105;
    L_0x00c4:
        r12 = r11.n;
        r12 = r12.b;
        r12 = r12.f;
        if (r12 != r8) goto L_0x00d5;
    L_0x00cc:
        r12 = r5.N;
        r9 = r5.e();
        r12 = r12 - r9;
    L_0x00d3:
        r4 = r4 + r12;
        goto L_0x00da;
    L_0x00d5:
        if (r12 != r7) goto L_0x00da;
    L_0x00d7:
        r12 = r5.N;
        goto L_0x00d3;
    L_0x00da:
        r12 = r5.Q;
        if (r12 != 0) goto L_0x00f1;
    L_0x00de:
        r12 = r5.l;
        r12 = r12.b;
        if (r12 == 0) goto L_0x00ef;
    L_0x00e4:
        r12 = r5.n;
        r12 = r12.b;
        if (r12 == 0) goto L_0x00ef;
    L_0x00ea:
        r12 = r5.ad;
        if (r12 == r2) goto L_0x00ef;
    L_0x00ee:
        goto L_0x00f1;
    L_0x00ef:
        r12 = 0;
        goto L_0x00f2;
    L_0x00f1:
        r12 = 1;
    L_0x00f2:
        r11.Q = r12;
        if (r12 == 0) goto L_0x0105;
    L_0x00f6:
        r12 = r5.l;
        r12 = r12.b;
        if (r12 == 0) goto L_0x0100;
    L_0x00fc:
        r12 = r12.a;
        if (r12 == r11) goto L_0x0105;
    L_0x0100:
        r12 = r5.N;
        r12 = r4 - r12;
        r4 = r4 + r12;
    L_0x0105:
        r12 = r11.l;
        r12 = r12.b;
        if (r12 == 0) goto L_0x014f;
    L_0x010b:
        r12 = r6.c();
        if (r12 != 0) goto L_0x014f;
    L_0x0111:
        r12 = r11.l;
        r12 = r12.b;
        r12 = r12.f;
        if (r12 != r7) goto L_0x0122;
    L_0x0119:
        r12 = r6.M;
        r5 = r6.e();
        r12 = r12 - r5;
    L_0x0120:
        r0 = r0 + r12;
        goto L_0x0127;
    L_0x0122:
        if (r12 != r8) goto L_0x0127;
    L_0x0124:
        r12 = r6.M;
        goto L_0x0120;
    L_0x0127:
        r12 = r6.P;
        if (r12 != 0) goto L_0x013b;
    L_0x012b:
        r12 = r6.l;
        r12 = r12.b;
        if (r12 == 0) goto L_0x013c;
    L_0x0131:
        r12 = r6.n;
        r12 = r12.b;
        if (r12 == 0) goto L_0x013c;
    L_0x0137:
        r12 = r6.ad;
        if (r12 == r2) goto L_0x013c;
    L_0x013b:
        r3 = 1;
    L_0x013c:
        r11.P = r3;
        if (r3 == 0) goto L_0x014f;
    L_0x0140:
        r12 = r6.n;
        r12 = r12.b;
        if (r12 == 0) goto L_0x014a;
    L_0x0146:
        r12 = r12.a;
        if (r12 == r11) goto L_0x014f;
    L_0x014a:
        r12 = r6.M;
        r12 = r0 - r12;
        r0 = r0 + r12;
    L_0x014f:
        r12 = r11.K;
        r1 = 8;
        if (r12 != r1) goto L_0x0159;
    L_0x0155:
        r12 = r11.s;
        r0 = r0 - r12;
        r4 = r4 - r12;
    L_0x0159:
        r11.M = r0;
        r11.N = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg.a(dh, boolean[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x019a  */
    /* JADX WARNING: Missing block: B:36:0x006c, code skipped:
            if (r6 != r11.r) goto L_0x006e;
     */
    /* JADX WARNING: Missing block: B:86:0x012b, code skipped:
            if (r7.ae != 3) goto L_0x0130;
     */
    /* JADX WARNING: Missing block: B:117:0x0180, code skipped:
            if (r6.ae != 3) goto L_0x0182;
     */
    private final void b(defpackage.dh r11, boolean[] r12) {
        /*
        r10 = this;
        r0 = r11.ae;
        r1 = 3;
        r2 = 0;
        if (r0 != r1) goto L_0x0015;
    L_0x0006:
        r0 = r11.ad;
        if (r0 == r1) goto L_0x0015;
    L_0x000a:
        r0 = r11.u;
        r3 = 0;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 > 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0015;
    L_0x0012:
        r12[r2] = r2;
        return;
    L_0x0015:
        r0 = r11.f();
        r3 = 1;
        r11.U = r3;
        r4 = r11 instanceof defpackage.dj;
        r5 = 8;
        if (r4 == 0) goto L_0x003c;
    L_0x0022:
        r12 = r11;
        r12 = (defpackage.dj) r12;
        r1 = r12.af;
        if (r1 != 0) goto L_0x0038;
    L_0x0029:
        r0 = r12.b;
        r1 = -1;
        if (r0 == r1) goto L_0x0030;
    L_0x002e:
        r2 = r0;
        goto L_0x0036;
    L_0x0030:
        r12 = r12.c;
        if (r12 == r1) goto L_0x0036;
    L_0x0034:
        r0 = r12;
        goto L_0x0039;
    L_0x0036:
        r0 = 0;
        goto L_0x0039;
    L_0x0038:
        r2 = r0;
    L_0x0039:
        r4 = r2;
        goto L_0x0196;
    L_0x003c:
        r4 = r11.p;
        r6 = r4.b;
        if (r6 != 0) goto L_0x0054;
    L_0x0042:
        r6 = r11.m;
        r6 = r6.b;
        if (r6 != 0) goto L_0x0054;
    L_0x0048:
        r6 = r11.o;
        r6 = r6.b;
        if (r6 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0054;
    L_0x004f:
        r12 = r11.x;
        r2 = r0 + r12;
        goto L_0x0039;
    L_0x0054:
        r6 = r11.o;
        r6 = r6.b;
        if (r6 == 0) goto L_0x0071;
    L_0x005a:
        r7 = r11.m;
        r7 = r7.b;
        if (r7 != 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0071;
    L_0x0061:
        if (r6 != r7) goto L_0x0064;
    L_0x0063:
        goto L_0x006e;
    L_0x0064:
        r6 = r6.a;
        r7 = r7.a;
        if (r6 != r7) goto L_0x0071;
    L_0x006a:
        r7 = r11.r;
        if (r6 == r7) goto L_0x0071;
    L_0x006e:
        r12[r2] = r2;
        return;
    L_0x0071:
        r4 = r4.d();
        if (r4 == 0) goto L_0x00a5;
    L_0x0077:
        r1 = r11.p;
        r1 = r1.b;
        r1 = r1.a;
        r2 = r1.U;
        if (r2 != 0) goto L_0x0084;
    L_0x0081:
        r10.b(r1, r12);
    L_0x0084:
        r12 = r1.L;
        r2 = r1.t;
        r12 = r12 - r2;
        r12 = r12 + r0;
        r12 = java.lang.Math.max(r12, r0);
        r2 = r1.O;
        r1 = r1.t;
        r2 = r2 - r1;
        r2 = r2 + r0;
        r0 = java.lang.Math.max(r2, r0);
        r1 = r11.K;
        if (r1 != r5) goto L_0x00a0;
    L_0x009c:
        r1 = r11.t;
        r12 = r12 - r1;
        r0 = r0 - r1;
    L_0x00a0:
        r11.L = r12;
        r11.O = r0;
        return;
    L_0x00a5:
        r4 = r11.m;
        r4 = r4.d();
        r6 = 0;
        if (r4 == 0) goto L_0x00c9;
    L_0x00ae:
        r4 = r11.m;
        r7 = r4.b;
        r7 = r7.a;
        r4 = r4.b();
        r4 = r4 + r0;
        r8 = r7.c();
        if (r8 == 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00cb;
    L_0x00c0:
        r8 = r7.U;
        if (r8 == 0) goto L_0x00c5;
    L_0x00c4:
        goto L_0x00cb;
    L_0x00c5:
        r10.b(r7, r12);
        goto L_0x00cb;
    L_0x00c9:
        r4 = r0;
        r7 = r6;
    L_0x00cb:
        r8 = r11.o;
        r8 = r8.d();
        if (r8 == 0) goto L_0x00ee;
    L_0x00d3:
        r6 = r11.o;
        r8 = r6.b;
        r8 = r8.a;
        r6 = r6.b();
        r0 = r0 + r6;
        r6 = r8.c();
        if (r6 == 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00ed;
    L_0x00e5:
        r6 = r8.U;
        if (r6 == 0) goto L_0x00ea;
    L_0x00e9:
        goto L_0x00ed;
    L_0x00ea:
        r10.b(r8, r12);
    L_0x00ed:
        r6 = r8;
    L_0x00ee:
        r12 = r11.m;
        r12 = r12.b;
        r8 = 5;
        if (r12 == 0) goto L_0x0144;
    L_0x00f5:
        r12 = r7.c();
        if (r12 != 0) goto L_0x0144;
    L_0x00fb:
        r12 = r11.m;
        r12 = r12.b;
        r12 = r12.f;
        if (r12 != r1) goto L_0x010c;
    L_0x0103:
        r12 = r7.L;
        r9 = r7.f();
        r12 = r12 - r9;
    L_0x010a:
        r4 = r4 + r12;
        goto L_0x0111;
    L_0x010c:
        if (r12 != r8) goto L_0x0111;
    L_0x010e:
        r12 = r7.L;
        goto L_0x010a;
    L_0x0111:
        r12 = r7.R;
        if (r12 != 0) goto L_0x0130;
    L_0x0115:
        r12 = r7.m;
        r12 = r12.b;
        if (r12 == 0) goto L_0x012e;
    L_0x011b:
        r12 = r12.a;
        if (r12 == r11) goto L_0x012e;
    L_0x011f:
        r12 = r7.o;
        r12 = r12.b;
        if (r12 == 0) goto L_0x012e;
    L_0x0125:
        r12 = r12.a;
        if (r12 == r11) goto L_0x012e;
    L_0x0129:
        r12 = r7.ae;
        if (r12 == r1) goto L_0x012e;
    L_0x012d:
        goto L_0x0130;
    L_0x012e:
        r12 = 0;
        goto L_0x0131;
    L_0x0130:
        r12 = 1;
    L_0x0131:
        r11.R = r12;
        if (r12 == 0) goto L_0x0144;
    L_0x0135:
        r12 = r7.o;
        r12 = r12.b;
        if (r12 == 0) goto L_0x013f;
    L_0x013b:
        r12 = r12.a;
        if (r12 == r11) goto L_0x0144;
    L_0x013f:
        r12 = r7.L;
        r12 = r4 - r12;
        r4 = r4 + r12;
    L_0x0144:
        r12 = r11.o;
        r12 = r12.b;
        if (r12 == 0) goto L_0x0196;
    L_0x014a:
        r12 = r6.c();
        if (r12 != 0) goto L_0x0196;
    L_0x0150:
        r12 = r11.o;
        r12 = r12.b;
        r12 = r12.f;
        if (r12 != r8) goto L_0x0161;
    L_0x0158:
        r12 = r6.O;
        r7 = r6.f();
        r12 = r12 - r7;
    L_0x015f:
        r0 = r0 + r12;
        goto L_0x0166;
    L_0x0161:
        if (r12 != r1) goto L_0x0166;
    L_0x0163:
        r12 = r6.O;
        goto L_0x015f;
    L_0x0166:
        r12 = r6.S;
        if (r12 != 0) goto L_0x0182;
    L_0x016a:
        r12 = r6.m;
        r12 = r12.b;
        if (r12 == 0) goto L_0x0183;
    L_0x0170:
        r12 = r12.a;
        if (r12 == r11) goto L_0x0183;
    L_0x0174:
        r12 = r6.o;
        r12 = r12.b;
        if (r12 == 0) goto L_0x0183;
    L_0x017a:
        r12 = r12.a;
        if (r12 == r11) goto L_0x0183;
    L_0x017e:
        r12 = r6.ae;
        if (r12 == r1) goto L_0x0183;
    L_0x0182:
        r2 = 1;
    L_0x0183:
        r11.S = r2;
        if (r2 == 0) goto L_0x0196;
    L_0x0187:
        r12 = r6.m;
        r12 = r12.b;
        if (r12 == 0) goto L_0x0191;
    L_0x018d:
        r12 = r12.a;
        if (r12 == r11) goto L_0x0196;
    L_0x0191:
        r12 = r6.O;
        r12 = r0 - r12;
        r0 = r0 + r12;
    L_0x0196:
        r12 = r11.K;
        if (r12 != r5) goto L_0x019e;
    L_0x019a:
        r12 = r11.t;
        r4 = r4 - r12;
        r0 = r0 - r12;
    L_0x019e:
        r11.L = r4;
        r11.O = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg.b(dh, boolean[]):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(dh dhVar, int i) {
        int i2 = 0;
        df dfVar;
        df dfVar2;
        dh dhVar2;
        df dfVar3;
        dh[] dhVarArr;
        int length;
        dh[] dhVarArr2;
        if (i == 0) {
            while (true) {
                dfVar = dhVar.l;
                dfVar2 = dfVar.b;
                if (dfVar2 == null) {
                    break;
                }
                dhVar2 = dfVar2.a;
                dfVar3 = dhVar2.n.b;
                if (dfVar3 == null || dfVar3 != dfVar || dhVar2 == dhVar) {
                    break;
                }
                dhVar = dhVar2;
            }
            while (true) {
                i = this.ak;
                if (i2 < i) {
                    if (this.ao[i2] == dhVar) {
                        break;
                    }
                    i2++;
                } else {
                    dhVarArr = this.ao;
                    length = dhVarArr.length;
                    if (i + 1 >= length) {
                        this.ao = (dh[]) Arrays.copyOf(dhVarArr, length + length);
                    }
                    dhVarArr2 = this.ao;
                    i2 = this.ak;
                    dhVarArr2[i2] = dhVar;
                    this.ak = i2 + 1;
                    return;
                }
            }
        }
        while (true) {
            dfVar = dhVar.m;
            dfVar2 = dfVar.b;
            if (dfVar2 == null) {
                break;
            }
            dhVar2 = dfVar2.a;
            dfVar3 = dhVar2.o.b;
            if (dfVar3 == null || dfVar3 != dfVar || dhVar2 == dhVar) {
                break;
            }
            dhVar = dhVar2;
        }
        while (true) {
            i = this.al;
            if (i2 < i) {
                if (this.an[i2] == dhVar) {
                    break;
                }
                i2++;
            } else {
                dhVarArr = this.an;
                length = dhVarArr.length;
                if (i + 1 >= length) {
                    this.an = (dh[]) Arrays.copyOf(dhVarArr, length + length);
                }
                dhVarArr2 = this.an;
                i2 = this.al;
                dhVarArr2[i2] = dhVar;
                this.al = i2 + 1;
                return;
            }
        }
    }

    private final int a(db dbVar, dh[] dhVarArr, dh dhVar, int i, boolean[] zArr) {
        db dbVar2 = dbVar;
        dh dhVar2 = dhVar;
        zArr[0] = true;
        zArr[1] = false;
        dh dhVar3 = null;
        dhVarArr[0] = null;
        dhVarArr[2] = null;
        dhVarArr[1] = null;
        dhVarArr[3] = null;
        float f = 0.0f;
        int i2 = 5;
        dh dhVar4;
        dh dhVar5;
        df dfVar;
        int length;
        df dfVar2;
        df dfVar3;
        int i3;
        if (i == 0) {
            df dfVar4 = dhVar2.l.b;
            boolean z = dfVar4 == null || dfVar4.a == this;
            dhVar2.ab = null;
            dhVar4 = null;
            dh dhVar6 = dhVar2.K == 8 ? null : dhVar2;
            dh dhVar7 = dhVar6;
            int i4 = 0;
            dhVar5 = dhVar2;
            while (dhVar5.n.b != null) {
                dhVar5.ab = dhVar3;
                if (dhVar5.K == 8) {
                    dfVar = dhVar5.l;
                    dbVar2.c(dfVar.e, dfVar.b.e, 0, 5);
                    dbVar2.c(dhVar5.n.e, dhVar5.l.e, 0, 5);
                } else {
                    if (dhVar6 == null) {
                        dhVar6 = dhVar5;
                    }
                    if (!(dhVar7 == null || dhVar7 == dhVar5)) {
                        dhVar7.ab = dhVar5;
                    }
                    dhVar7 = dhVar5;
                }
                if (dhVar5.K != 8 && dhVar5.ad == 3) {
                    if (dhVar5.ae == 3) {
                        zArr[0] = false;
                    }
                    if (dhVar5.u <= f) {
                        zArr[0] = false;
                        int i5 = i4 + 1;
                        dh[] dhVarArr2 = this.am;
                        length = dhVarArr2.length;
                        if (i5 >= length) {
                            this.am = (dh[]) Arrays.copyOf(dhVarArr2, length + length);
                        }
                        this.am[i4] = dhVar5;
                        i4 = i5;
                    }
                }
                dh dhVar8 = dhVar5.n.b.a;
                dfVar2 = dhVar8.l.b;
                if (dfVar2 == null || dfVar2.a != dhVar5 || dhVar8 == dhVar5) {
                    break;
                }
                dhVar4 = dhVar8;
                dhVar5 = dhVar4;
                dhVar3 = null;
                f = 0.0f;
            }
            dfVar3 = dhVar5.n.b;
            if (!(dfVar3 == null || dfVar3.a == this)) {
                z = false;
            }
            if (dhVar2.l.b == null || dhVar4.n.b == null) {
                i3 = 1;
                zArr[1] = true;
            } else {
                i3 = 1;
            }
            dhVar2.X = z;
            dhVar4.ab = null;
            dhVarArr[0] = dhVar2;
            dhVarArr[2] = dhVar6;
            dhVarArr[i3] = dhVar4;
            dhVarArr[3] = dhVar7;
            return i4;
        }
        dfVar = dhVar2.m.b;
        boolean z2 = dfVar == null || dfVar.a == this;
        dhVar3 = null;
        dhVar2.ac = null;
        dh dhVar9 = null;
        dh dhVar10 = dhVar2.K == 8 ? null : dhVar2;
        dhVar5 = dhVar10;
        length = 0;
        dhVar4 = dhVar2;
        while (dhVar4.o.b != null) {
            dhVar4.ac = dhVar3;
            if (dhVar4.K == 8) {
                dfVar2 = dhVar4.m;
                dbVar2.c(dfVar2.e, dfVar2.b.e, 0, i2);
                dbVar2.c(dhVar4.o.e, dhVar4.m.e, 0, i2);
            } else {
                if (dhVar10 == null) {
                    dhVar10 = dhVar4;
                }
                if (!(dhVar5 == null || dhVar5 == dhVar4)) {
                    dhVar5.ac = dhVar4;
                }
                dhVar5 = dhVar4;
            }
            if (dhVar4.K != 8 && dhVar4.ae == 3) {
                if (dhVar4.ad == 3) {
                    zArr[0] = false;
                }
                if (dhVar4.u <= 0.0f) {
                    zArr[0] = false;
                    int i6 = length + 1;
                    dh[] dhVarArr3 = this.am;
                    i2 = dhVarArr3.length;
                    if (i6 >= i2) {
                        this.am = (dh[]) Arrays.copyOf(dhVarArr3, i2 + i2);
                    }
                    this.am[length] = dhVar4;
                    length = i6;
                }
            }
            dhVar3 = dhVar4.o.b.a;
            df dfVar5 = dhVar3.m.b;
            if (dfVar5 == null || dfVar5.a != dhVar4 || dhVar3 == dhVar4) {
                break;
            }
            dhVar4 = dhVar3;
            dhVar9 = dhVar4;
            dhVar3 = null;
            i2 = 5;
        }
        dfVar3 = dhVar4.o.b;
        if (!(dfVar3 == null || dfVar3.a == this)) {
            z2 = false;
        }
        if (dhVar2.m.b == null || dhVar9.o.b == null) {
            i3 = 1;
            zArr[1] = true;
        } else {
            i3 = 1;
        }
        dhVar2.Y = z2;
        dhVar9.ac = null;
        dhVarArr[0] = dhVar2;
        dhVarArr[2] = dhVar10;
        dhVarArr[i3] = dhVar9;
        dhVarArr[3] = dhVar5;
        return length;
    }
}

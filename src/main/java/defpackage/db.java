package defpackage;

import java.util.Arrays;

/* renamed from: db */
public final class db {
    private static int g = 1000;
    public final cy a = new cy();
    public cw[] b = null;
    public boolean[] c = new boolean[32];
    public int d = 1;
    public int e = 0;
    public final cz f;
    private int h = 0;
    private int i = 32;
    private int j = 32;
    private int k = 32;
    private dc[] l = new dc[g];
    private int m = 0;
    private cw[] n;

    public db() {
        int i = this.i;
        this.n = new cw[i];
        this.b = new cw[i];
        f();
        this.f = new cz();
    }

    private final void e() {
        int i = this.i;
        i += i;
        this.i = i;
        this.b = (cw[]) Arrays.copyOf(this.b, i);
        cz czVar = this.f;
        czVar.c = (dc[]) Arrays.copyOf(czVar.c, this.i);
        i = this.i;
        this.c = new boolean[i];
        this.j = i;
        this.k = i;
        this.a.a.clear();
    }

    private final void f() {
        int i = 0;
        while (true) {
            cw[] cwVarArr = this.b;
            if (i < cwVarArr.length) {
                Object obj = cwVarArr[i];
                if (obj != null) {
                    this.f.a.a(obj);
                }
                this.b[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    public final void a() {
        cz czVar;
        int i = 0;
        while (true) {
            czVar = this.f;
            dc[] dcVarArr = czVar.c;
            if (i >= dcVarArr.length) {
                break;
            }
            dc dcVar = dcVarArr[i];
            if (dcVar != null) {
                dcVar.a();
            }
            i++;
        }
        czVar.b.a(this.l, this.m);
        this.m = 0;
        Arrays.fill(this.f.c, null);
        this.h = 0;
        this.a.a.clear();
        this.d = 1;
        for (i = 0; i < this.e; i++) {
            this.b[i].c = false;
        }
        f();
        this.e = 0;
    }

    public final dc a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.d + 1 >= this.j) {
            e();
        }
        df dfVar = (df) obj;
        dc dcVar = dfVar.e;
        if (dcVar == null) {
            dfVar.a();
            dcVar = dfVar.e;
        }
        int i = dcVar.a;
        if (i != -1) {
            if (i > this.h || this.f.c[i] == null) {
                if (i != -1) {
                    dcVar.a();
                }
            }
            return dcVar;
        }
        i = this.h + 1;
        this.h = i;
        this.d++;
        dcVar.a = i;
        dcVar.h = 1;
        this.f.c[i] = dcVar;
        return dcVar;
    }

    public final cw b() {
        cw cwVar = (cw) this.f.a.a();
        if (cwVar == null) {
            return new cw(this.f);
        }
        cwVar.a = null;
        cx cxVar = cwVar.d;
        cxVar.f = -1;
        cxVar.g = -1;
        cxVar.h = false;
        cxVar.a = 0;
        cwVar.b = 0.0f;
        cwVar.e = false;
        return cwVar;
    }

    public final dc c() {
        if (this.d + 1 >= this.j) {
            e();
        }
        dc a = a(3);
        int i = this.h + 1;
        this.h = i;
        this.d++;
        a.a = i;
        this.f.c[i] = a;
        return a;
    }

    private final void a(cw cwVar, int i) {
        cwVar.d.a(d(), (float) i);
    }

    public final dc d() {
        if (this.d + 1 >= this.j) {
            e();
        }
        dc a = a(4);
        int i = this.h + 1;
        this.h = i;
        this.d++;
        a.a = i;
        this.f.c[i] = a;
        return a;
    }

    public static int b(Object obj) {
        dc dcVar = ((df) obj).e;
        return dcVar != null ? (int) (dcVar.d + 0.5f) : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0105 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0105 A:{SYNTHETIC} */
    public final void a(defpackage.cw r13) {
        /*
        r12 = this;
        if (r13 == 0) goto L_0x017e;
    L_0x0002:
        r0 = r12.e;
        r1 = 1;
        r0 = r0 + r1;
        r2 = r12.k;
        if (r0 >= r2) goto L_0x0011;
    L_0x000a:
        r0 = r12.d;
        r0 = r0 + r1;
        r2 = r12.j;
        if (r0 < r2) goto L_0x0014;
    L_0x0011:
        r12.e();
    L_0x0014:
        r0 = r13.e;
        r2 = 0;
        if (r0 != 0) goto L_0x012d;
    L_0x0019:
        r0 = r12.e;
        r3 = -1;
        if (r0 <= 0) goto L_0x008d;
    L_0x001e:
        r0 = r13.d;
        r4 = r12.b;
        r5 = r0.f;
    L_0x0024:
        r6 = 0;
    L_0x0025:
        if (r5 == r3) goto L_0x0085;
    L_0x0027:
        r7 = r0.a;
        if (r6 >= r7) goto L_0x0085;
    L_0x002b:
        r7 = r0.b;
        r7 = r7.c;
        r8 = r0.c;
        r8 = r8[r5];
        r7 = r7[r8];
        r8 = r7.b;
        if (r8 == r3) goto L_0x007e;
    L_0x0039:
        r6 = r0.e;
        r5 = r6[r5];
        r0.a(r7);
        r6 = r7.b;
        r6 = r4[r6];
        r7 = r6.e;
        if (r7 != 0) goto L_0x006d;
    L_0x0048:
        r7 = r6.d;
        r8 = r7.f;
        r9 = 0;
    L_0x004d:
        if (r8 == r3) goto L_0x006d;
    L_0x004f:
        r10 = r7.a;
        if (r9 >= r10) goto L_0x006d;
    L_0x0053:
        r10 = r0.b;
        r10 = r10.c;
        r11 = r7.c;
        r11 = r11[r8];
        r10 = r10[r11];
        r11 = r7.e;
        r11 = r11[r8];
        r11 = r11 * r5;
        r0.b(r10, r11);
        r10 = r7.d;
        r8 = r10[r8];
        r9 = r9 + 1;
        goto L_0x004d;
    L_0x006d:
        r7 = r13.b;
        r8 = r6.b;
        r8 = r8 * r5;
        r7 = r7 + r8;
        r13.b = r7;
        r5 = r6.a;
        r5.a(r13);
        r5 = r0.f;
        goto L_0x0024;
    L_0x007e:
        r7 = r0.d;
        r5 = r7[r5];
        r6 = r6 + 1;
        goto L_0x0025;
    L_0x0085:
        r0 = r13.d;
        r0 = r0.a;
        if (r0 != 0) goto L_0x008d;
    L_0x008b:
        r13.e = r1;
    L_0x008d:
        r0 = r13.b;
        r4 = 0;
        r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r5 >= 0) goto L_0x00b0;
    L_0x0094:
        r0 = -r0;
        r13.b = r0;
        r0 = r13.d;
        r5 = r0.f;
        r6 = 0;
    L_0x009c:
        if (r5 == r3) goto L_0x00b0;
    L_0x009e:
        r7 = r0.a;
        if (r6 >= r7) goto L_0x00b0;
    L_0x00a2:
        r7 = r0.e;
        r8 = r7[r5];
        r8 = -r8;
        r7[r5] = r8;
        r7 = r0.d;
        r5 = r7[r5];
        r6 = r6 + 1;
        goto L_0x009c;
    L_0x00b0:
        r0 = r13.d;
        r5 = r0.f;
        r6 = 0;
        r7 = r6;
        r8 = r7;
        r6 = 0;
    L_0x00b8:
        if (r5 == r3) goto L_0x010c;
    L_0x00ba:
        r9 = r0.a;
        if (r6 >= r9) goto L_0x010c;
    L_0x00be:
        r9 = r0.e;
        r10 = r9[r5];
        r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r11 >= 0) goto L_0x00d0;
    L_0x00c6:
        r11 = -1165815185; // 0xffffffffba83126f float:-0.001 double:NaN;
        r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r11 <= 0) goto L_0x00da;
    L_0x00cd:
        r9[r5] = r4;
        goto L_0x00d9;
    L_0x00d0:
        r11 = 981668463; // 0x3a83126f float:0.001 double:4.85008663E-315;
        r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r11 >= 0) goto L_0x00da;
    L_0x00d7:
        r9[r5] = r4;
    L_0x00d9:
        r10 = 0;
    L_0x00da:
        r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r9 == 0) goto L_0x0105;
    L_0x00de:
        r9 = r0.b;
        r9 = r9.c;
        r11 = r0.c;
        r11 = r11[r5];
        r9 = r9[r11];
        r11 = r9.h;
        if (r11 != r1) goto L_0x00f7;
    L_0x00ec:
        r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r10 >= 0) goto L_0x00f2;
    L_0x00f0:
        r7 = r9;
        goto L_0x010f;
    L_0x00f2:
        if (r7 == 0) goto L_0x00f5;
    L_0x00f4:
        goto L_0x0105;
    L_0x00f5:
        r7 = r9;
        goto L_0x0105;
    L_0x00f7:
        r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r10 >= 0) goto L_0x0105;
    L_0x00fb:
        if (r8 == 0) goto L_0x0104;
    L_0x00fd:
        r10 = r9.c;
        r11 = r8.c;
        if (r10 < r11) goto L_0x0104;
    L_0x0103:
        goto L_0x0105;
    L_0x0104:
        r8 = r9;
    L_0x0105:
        r9 = r0.d;
        r5 = r9[r5];
        r6 = r6 + 1;
        goto L_0x00b8;
    L_0x010c:
        if (r7 != 0) goto L_0x010f;
    L_0x010e:
        r7 = r8;
    L_0x010f:
        if (r7 != 0) goto L_0x0112;
    L_0x0111:
        goto L_0x0115;
    L_0x0112:
        r13.a(r7);
    L_0x0115:
        r0 = r13.d;
        r0 = r0.a;
        if (r0 != 0) goto L_0x011d;
    L_0x011b:
        r13.e = r1;
    L_0x011d:
        r0 = r13.a;
        if (r0 == 0) goto L_0x012c;
    L_0x0121:
        r0 = r0.h;
        if (r0 == r1) goto L_0x012d;
    L_0x0125:
        r0 = r13.b;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x012c;
    L_0x012b:
        goto L_0x012d;
    L_0x012c:
        return;
    L_0x012d:
        r0 = r12.b;
        r3 = r12.e;
        r0 = r0[r3];
        if (r0 == 0) goto L_0x013c;
    L_0x0135:
        r3 = r12.f;
        r3 = r3.a;
        r3.a(r0);
    L_0x013c:
        r0 = r13.e;
        if (r0 != 0) goto L_0x0143;
    L_0x0140:
        r13.a();
    L_0x0143:
        r0 = r12.b;
        r3 = r12.e;
        r0[r3] = r13;
        r0 = r13.a;
        r0.b = r3;
        r3 = r3 + r1;
        r12.e = r3;
        r0 = r0.g;
        if (r0 <= 0) goto L_0x017e;
    L_0x0154:
        r1 = r12.n;
        r3 = r1.length;
        if (r3 >= r0) goto L_0x015f;
    L_0x0159:
        r3 = r3 + r3;
        r1 = new defpackage.cw[r3];
        r12.n = r1;
        goto L_0x0154;
    L_0x015f:
        r3 = 0;
    L_0x0160:
        if (r3 >= r0) goto L_0x016d;
    L_0x0162:
        r4 = r13.a;
        r4 = r4.f;
        r4 = r4[r3];
        r1[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0160;
    L_0x016d:
        if (r2 >= r0) goto L_0x017e;
    L_0x016f:
        r3 = r1[r2];
        if (r3 == r13) goto L_0x017b;
    L_0x0173:
        r4 = r3.d;
        r4.a(r3, r13);
        r3.a();
    L_0x017b:
        r2 = r2 + 1;
        goto L_0x016d;
    L_0x017e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.a(cw):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3  */
    public final int a(defpackage.cy r19) {
        /*
        r18 = this;
        r0 = r18;
        r2 = 0;
    L_0x0003:
        r3 = r0.e;
        r4 = 0;
        r5 = 1;
        if (r2 >= r3) goto L_0x00bd;
    L_0x0009:
        r3 = r0.b;
        r3 = r3[r2];
        r6 = r3.a;
        r6 = r6.h;
        if (r6 != r5) goto L_0x0017;
    L_0x0013:
        r6 = r19;
        goto L_0x00b9;
    L_0x0017:
        r3 = r3.b;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x0013;
    L_0x001d:
        r2 = 0;
        r3 = 0;
    L_0x001f:
        if (r2 != 0) goto L_0x00be;
    L_0x0021:
        r3 = r3 + 1;
        r6 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r7 = -1;
        r6 = 0;
        r8 = -1;
        r9 = -1;
        r10 = 0;
        r11 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
    L_0x002e:
        r12 = r0.e;
        if (r6 >= r12) goto L_0x0087;
    L_0x0032:
        r12 = r0.b;
        r12 = r12[r6];
        r13 = r12.a;
        r13 = r13.h;
        if (r13 != r5) goto L_0x003d;
    L_0x003c:
        goto L_0x0084;
    L_0x003d:
        r13 = r12.b;
        r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1));
        if (r13 >= 0) goto L_0x0084;
    L_0x0043:
        r13 = r11;
        r11 = r9;
        r9 = r8;
        r8 = 1;
    L_0x0047:
        r14 = r0.d;
        if (r8 >= r14) goto L_0x0081;
    L_0x004b:
        r14 = r0.f;
        r14 = r14.c;
        r14 = r14[r8];
        r15 = r12.d;
        r15 = r15.b(r14);
        r16 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1));
        if (r16 <= 0) goto L_0x007e;
    L_0x005b:
        r16 = r13;
        r13 = r11;
        r11 = r9;
        r9 = 0;
    L_0x0060:
        r1 = 6;
        if (r9 >= r1) goto L_0x007a;
    L_0x0063:
        r1 = r14.e;
        r1 = r1[r9];
        r1 = r1 / r15;
        r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1));
        if (r17 >= 0) goto L_0x006f;
    L_0x006c:
        if (r9 != r10) goto L_0x006f;
    L_0x006e:
        goto L_0x0072;
    L_0x006f:
        if (r9 > r10) goto L_0x0072;
    L_0x0071:
        goto L_0x0077;
    L_0x0072:
        r16 = r1;
        r11 = r6;
        r13 = r8;
        r10 = r9;
    L_0x0077:
        r9 = r9 + 1;
        goto L_0x0060;
    L_0x007a:
        r9 = r11;
        r11 = r13;
        r13 = r16;
    L_0x007e:
        r8 = r8 + 1;
        goto L_0x0047;
    L_0x0081:
        r8 = r9;
        r9 = r11;
        r11 = r13;
    L_0x0084:
        r6 = r6 + 1;
        goto L_0x002e;
    L_0x0087:
        if (r8 == r7) goto L_0x00b4;
    L_0x0089:
        r1 = r0.b;
        r1 = r1[r8];
        r6 = r1.a;
        r6.b = r7;
        r6 = r0.f;
        r6 = r6.c;
        r6 = r6[r9];
        r1.a(r6);
        r6 = r1.a;
        r6.b = r8;
        r6 = 0;
    L_0x009f:
        r7 = r0.e;
        if (r6 >= r7) goto L_0x00ad;
    L_0x00a3:
        r7 = r0.b;
        r7 = r7[r6];
        r7.a(r1);
        r6 = r6 + 1;
        goto L_0x009f;
    L_0x00ad:
        r6 = r19;
        r6.a(r0);
        goto L_0x001f;
    L_0x00b4:
        r6 = r19;
        r2 = 1;
        goto L_0x001f;
    L_0x00b9:
        r2 = r2 + 1;
        goto L_0x0003;
    L_0x00bd:
        r3 = 0;
    L_0x00be:
        r1 = 0;
    L_0x00bf:
        r2 = r0.e;
        if (r1 >= r2) goto L_0x00d8;
    L_0x00c3:
        r2 = r0.b;
        r2 = r2[r1];
        r6 = r2.a;
        r6 = r6.h;
        if (r6 != r5) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00d5;
    L_0x00ce:
        r2 = r2.b;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x00d5;
    L_0x00d4:
        goto L_0x00d8;
    L_0x00d5:
        r1 = r1 + 1;
        goto L_0x00bf;
    L_0x00d8:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.a(cy):int");
    }

    public final void a(dc dcVar, dc dcVar2, int i, int i2) {
        cw b = b();
        dc c = c();
        c.c = i2;
        b.a(dcVar, dcVar2, c, i);
        a(b);
    }

    public final void b(dc dcVar, dc dcVar2, int i, int i2) {
        cw b = b();
        dc c = c();
        c.c = i2;
        b.b(dcVar, dcVar2, c, i);
        a(b);
    }

    public final void a(dc dcVar, dc dcVar2, int i, float f, dc dcVar3, dc dcVar4, int i2) {
        cw b = b();
        b.a(dcVar, dcVar2, i, f, dcVar3, dcVar4, i2);
        dc d = d();
        dc d2 = d();
        d.c = 4;
        d2.c = 4;
        b.a(d, d2);
        a(b);
    }

    public final cw c(dc dcVar, dc dcVar2, int i, int i2) {
        cw b = b();
        b.a(dcVar, dcVar2, i);
        dcVar = d();
        dcVar2 = d();
        dcVar.c = i2;
        dcVar2.c = i2;
        b.a(dcVar, dcVar2);
        a(b);
        return b;
    }

    public final void a(dc dcVar, int i) {
        int i2 = dcVar.b;
        cw cwVar;
        if (i2 != -1) {
            cwVar = this.b[i2];
            if (cwVar.e) {
                cwVar.b = (float) i;
                return;
            }
            cwVar = b();
            cwVar.a(dcVar, i);
            a(cwVar);
            return;
        }
        cwVar = b();
        cwVar.a = dcVar;
        float f = (float) i;
        dcVar.d = f;
        cwVar.b = f;
        cwVar.e = true;
        a(cwVar);
    }

    public static cw a(db dbVar, dc dcVar, dc dcVar2, int i, boolean z) {
        cw b = dbVar.b();
        b.a(dcVar, dcVar2, i);
        if (z) {
            dbVar.a(b, 1);
        }
        return b;
    }

    public static cw a(db dbVar, dc dcVar, dc dcVar2, dc dcVar3, float f) {
        cw b = dbVar.b();
        b.d.a(dcVar, -1.0f);
        b.d.a(dcVar2, 1.0f - f);
        b.d.a(dcVar3, f);
        return b;
    }

    public static cw b(db dbVar, dc dcVar, dc dcVar2, int i, boolean z) {
        dc c = dbVar.c();
        cw b = dbVar.b();
        b.a(dcVar, dcVar2, c, i);
        if (z) {
            dbVar.a(b, (int) (-b.d.b(c)));
        }
        return b;
    }

    public static cw c(db dbVar, dc dcVar, dc dcVar2, int i, boolean z) {
        dc c = dbVar.c();
        cw b = dbVar.b();
        b.b(dcVar, dcVar2, c, i);
        if (z) {
            dbVar.a(b, (int) (-b.d.b(c)));
        }
        return b;
    }

    public static cw a(db dbVar, dc dcVar, dc dcVar2, int i, float f, dc dcVar3, dc dcVar4, int i2, boolean z) {
        cw b = dbVar.b();
        b.a(dcVar, dcVar2, i, f, dcVar3, dcVar4, i2);
        if (z) {
            dc d = dbVar.d();
            dc d2 = dbVar.d();
            d.c = 4;
            d2.c = 4;
            b.a(d, d2);
        }
        return b;
    }

    private final dc a(int i) {
        dc dcVar = (dc) this.f.b.a();
        if (dcVar == null) {
            dcVar = new dc(i);
        } else {
            dcVar.a();
            dcVar.h = i;
        }
        i = this.m;
        int i2 = g;
        if (i >= i2) {
            g = i2 + i2;
            this.l = (dc[]) Arrays.copyOf(this.l, g);
        }
        dc[] dcVarArr = this.l;
        i2 = this.m;
        this.m = i2 + 1;
        dcVarArr[i2] = dcVar;
        return dcVar;
    }
}

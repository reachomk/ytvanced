package defpackage;

import android.util.Pair;

/* renamed from: ojm */
public final class ojm implements ojf {
    private final String a;
    private final oza b = new oza(1024);
    private final oyx c = new oyx(this.b.a);
    private ofy d;
    private nzw e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    public ojm(String str) {
        this.a = str;
    }

    public final void b() {
    }

    public final void a() {
        this.g = 0;
        this.l = false;
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.d = ofo.a(okl.b(), 1);
        this.f = okl.c();
    }

    public final void a(long j, int i) {
        this.k = j;
    }

    /* JADX WARNING: Missing block: B:64:0x0145, code skipped:
            if (r0.l == false) goto L_0x01a1;
     */
    public final void a(defpackage.oza r22) {
        /*
        r21 = this;
        r0 = r21;
    L_0x0002:
        r1 = r22.b();
        if (r1 <= 0) goto L_0x0209;
    L_0x0008:
        r1 = r0.g;
        r2 = 86;
        r3 = 1;
        if (r1 == 0) goto L_0x01fd;
    L_0x000f:
        r4 = 2;
        r5 = 0;
        if (r1 == r3) goto L_0x01e5;
    L_0x0013:
        r2 = 8;
        r6 = 3;
        if (r1 == r4) goto L_0x01bd;
    L_0x0018:
        if (r1 != r6) goto L_0x01b7;
    L_0x001a:
        r1 = r22.b();
        r4 = r0.i;
        r7 = r0.h;
        r4 = r4 - r7;
        r1 = java.lang.Math.min(r1, r4);
        r4 = r0.c;
        r4 = r4.a;
        r7 = r0.h;
        r8 = r22;
        r8.a(r4, r7, r1);
        r4 = r0.h;
        r4 = r4 + r1;
        r0.h = r4;
        r1 = r0.i;
        if (r4 != r1) goto L_0x0002;
    L_0x003b:
        r1 = r0.c;
        r1.a(r5);
        r1 = r0.c;
        r4 = r1.e();
        if (r4 != 0) goto L_0x0143;
    L_0x0048:
        r0.l = r3;
        r4 = r1.c(r3);
        if (r4 != r3) goto L_0x0055;
    L_0x0050:
        r7 = r1.c(r3);
        goto L_0x0056;
    L_0x0055:
        r7 = 0;
    L_0x0056:
        r0.m = r7;
        if (r7 != 0) goto L_0x013d;
    L_0x005a:
        if (r4 != r3) goto L_0x005f;
    L_0x005c:
        defpackage.ojm.b(r1);
    L_0x005f:
        r7 = r1.e();
        if (r7 == 0) goto L_0x0137;
    L_0x0065:
        r7 = 6;
        r9 = r1.c(r7);
        r0.n = r9;
        r9 = 4;
        r10 = r1.c(r9);
        r11 = r1.c(r6);
        if (r10 != 0) goto L_0x0131;
    L_0x0077:
        if (r11 != 0) goto L_0x0131;
    L_0x0079:
        if (r4 != 0) goto L_0x00c5;
    L_0x007b:
        r10 = r1.b();
        r11 = r0.a(r1);
        r1.a(r10);
        r10 = r11 + 7;
        r10 = r10 / r2;
        r10 = new byte[r10];
        r1.b(r10, r11);
        r12 = r0.f;
        r14 = -1;
        r15 = -1;
        r11 = r0.t;
        r13 = r0.r;
        r18 = java.util.Collections.singletonList(r10);
        r19 = 0;
        r10 = r0.a;
        r16 = "audio/mp4a-latm";
        r17 = r13;
        r13 = r16;
        r16 = r11;
        r20 = r10;
        r10 = defpackage.nzw.a(r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r11 = r0.e;
        r11 = r10.equals(r11);
        if (r11 != 0) goto L_0x00d2;
    L_0x00b4:
        r0.e = r10;
        r11 = 1024000000; // 0x3d090000 float:0.033447266 double:5.059232213E-315;
        r13 = r10.w;
        r13 = (long) r13;
        r11 = r11 / r13;
        r0.s = r11;
        r11 = r0.d;
        r11.a(r10);
        goto L_0x00d2;
    L_0x00c5:
        r10 = defpackage.ojm.b(r1);
        r11 = (int) r10;
        r10 = r0.a(r1);
        r11 = r11 - r10;
        r1.b(r11);
    L_0x00d2:
        r10 = r1.c(r6);
        r0.o = r10;
        if (r10 == 0) goto L_0x00fd;
    L_0x00da:
        if (r10 == r3) goto L_0x00f7;
    L_0x00dc:
        if (r10 == r6) goto L_0x00f3;
    L_0x00de:
        if (r10 == r9) goto L_0x00f3;
    L_0x00e0:
        r6 = 5;
        if (r10 == r6) goto L_0x00f3;
    L_0x00e3:
        if (r10 == r7) goto L_0x00ef;
    L_0x00e5:
        r6 = 7;
        if (r10 != r6) goto L_0x00e9;
    L_0x00e8:
        goto L_0x00ef;
    L_0x00e9:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x00ef:
        r1.b(r3);
        goto L_0x0100;
    L_0x00f3:
        r1.b(r7);
        goto L_0x0100;
    L_0x00f7:
        r6 = 9;
        r1.b(r6);
        goto L_0x0100;
    L_0x00fd:
        r1.b(r2);
    L_0x0100:
        r6 = r1.e();
        r0.p = r6;
        r9 = 0;
        r0.q = r9;
        if (r6 != 0) goto L_0x010d;
    L_0x010c:
        goto L_0x0127;
    L_0x010d:
        if (r4 == r3) goto L_0x0121;
    L_0x010f:
        r3 = r1.e();
        r6 = r0.q;
        r6 = r6 << r2;
        r4 = r1.c(r2);
        r9 = (long) r4;
        r6 = r6 + r9;
        r0.q = r6;
        if (r3 != 0) goto L_0x010f;
    L_0x0120:
        goto L_0x0127;
    L_0x0121:
        r3 = defpackage.ojm.b(r1);
        r0.q = r3;
    L_0x0127:
        r3 = r1.e();
        if (r3 == 0) goto L_0x0148;
    L_0x012d:
        r1.b(r2);
        goto L_0x0148;
    L_0x0131:
        r1 = new oae;
        r1.<init>();
        throw r1;
    L_0x0137:
        r1 = new oae;
        r1.<init>();
        throw r1;
    L_0x013d:
        r1 = new oae;
        r1.<init>();
        throw r1;
    L_0x0143:
        r3 = r0.l;
        if (r3 != 0) goto L_0x0148;
    L_0x0147:
        goto L_0x01a1;
    L_0x0148:
        r3 = r0.m;
        if (r3 != 0) goto L_0x01b1;
    L_0x014c:
        r3 = r0.n;
        if (r3 != 0) goto L_0x01ab;
    L_0x0150:
        r3 = r0.o;
        if (r3 != 0) goto L_0x01a5;
    L_0x0154:
        r3 = 0;
    L_0x0155:
        r4 = r1.c(r2);
        r13 = r3 + r4;
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r4 != r3) goto L_0x0161;
    L_0x015f:
        r3 = r13;
        goto L_0x0155;
    L_0x0161:
        r2 = r1.b();
        r3 = r2 & 7;
        if (r3 != 0) goto L_0x0171;
    L_0x0169:
        r3 = r0.b;
        r2 = r2 >> 3;
        r3.c(r2);
        goto L_0x017f;
    L_0x0171:
        r2 = r0.b;
        r2 = r2.a;
        r3 = r13 << 3;
        r1.b(r2, r3);
        r2 = r0.b;
        r2.c(r5);
    L_0x017f:
        r2 = r0.d;
        r3 = r0.b;
        r2.a(r3, r13);
        r9 = r0.d;
        r10 = r0.k;
        r12 = 1;
        r14 = 0;
        r15 = 0;
        r9.a(r10, r12, r13, r14, r15);
        r2 = r0.k;
        r6 = r0.s;
        r2 = r2 + r6;
        r0.k = r2;
        r2 = r0.p;
        if (r2 == 0) goto L_0x01a1;
    L_0x019b:
        r2 = r0.q;
        r3 = (int) r2;
        r1.b(r3);
    L_0x01a1:
        r0.g = r5;
        goto L_0x0002;
    L_0x01a5:
        r1 = new oae;
        r1.<init>();
        throw r1;
    L_0x01ab:
        r1 = new oae;
        r1.<init>();
        throw r1;
    L_0x01b1:
        r1 = new oae;
        r1.<init>();
        throw r1;
    L_0x01b7:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x01bd:
        r8 = r22;
        r1 = r0.j;
        r1 = r1 & -225;
        r1 = r1 << r2;
        r2 = r22.d();
        r1 = r1 | r2;
        r0.i = r1;
        r2 = r0.b;
        r3 = r2.a;
        r3 = r3.length;
        if (r1 > r3) goto L_0x01d3;
    L_0x01d2:
        goto L_0x01df;
    L_0x01d3:
        r2.a(r1);
        r1 = r0.c;
        r2 = r0.b;
        r2 = r2.a;
        r1.a(r2);
    L_0x01df:
        r0.h = r5;
        r0.g = r6;
        goto L_0x0002;
    L_0x01e5:
        r8 = r22;
        r1 = r22.d();
        r3 = r1 & 224;
        r6 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        if (r3 != r6) goto L_0x01f7;
    L_0x01f1:
        r0.j = r1;
        r0.g = r4;
        goto L_0x0002;
    L_0x01f7:
        if (r1 == r2) goto L_0x0002;
    L_0x01f9:
        r0.g = r5;
        goto L_0x0002;
    L_0x01fd:
        r8 = r22;
        r1 = r22.d();
        if (r1 != r2) goto L_0x0002;
    L_0x0205:
        r0.g = r3;
        goto L_0x0002;
    L_0x0209:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojm.a(oza):void");
    }

    private final int a(oyx oyx) {
        int a = oyx.a();
        Pair a2 = oyd.a(oyx, true);
        this.r = ((Integer) a2.first).intValue();
        this.t = ((Integer) a2.second).intValue();
        return a - oyx.a();
    }

    private static long b(oyx oyx) {
        return (long) oyx.c((oyx.c(2) + 1) << 3);
    }
}

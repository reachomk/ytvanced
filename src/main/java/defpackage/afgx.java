package defpackage;

/* renamed from: afgx */
public final class afgx implements afgs {
    private final xhv d;
    private final boolean e;
    private final boolean f;
    private final afjc g;
    private final xsc h;
    private final int i = -1;
    private final int j = -1;
    private String k;
    private String l;
    private int m;
    private afjh n;

    public afgx(xhv xhv, boolean z, boolean z2, afjc afjc, xsc xsc) {
        this.d = xhv;
        this.e = z;
        this.f = z2;
        this.g = afjc;
        this.h = xsc;
    }

    public final void a(int i, int i2, aahr aahr, String str) {
        long a = !aahr.b(i) ? this.h.a() : -1;
        int compareTo = (aahr == null || aahr.b(i) || i != i2) ? -2 : Integer.valueOf(i2).compareTo(Integer.valueOf(aahr.u()));
        this.g.a(this.d.k(), i2, i, compareTo, a, str);
    }

    public final void a(String str) {
        this.k = xvd.a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARNING: Missing block: B:18:0x0060, code skipped:
            if (r5 != 0) goto L_0x0064;
     */
    /* JADX WARNING: Missing block: B:63:0x00ee, code skipped:
            if (r6 == false) goto L_0x012b;
     */
    /* JADX WARNING: Missing block: B:74:0x0105, code skipped:
            if (r7 == -1) goto L_0x010a;
     */
    /* JADX WARNING: Missing block: B:79:0x011a, code skipped:
            if (r7 == -1) goto L_0x00f2;
     */
    /* JADX WARNING: Missing block: B:83:0x0127, code skipped:
            if (r7 == -1) goto L_0x00f2;
     */
    /* JADX WARNING: Missing block: B:84:0x012a, code skipped:
            r13 = 1;
     */
    public final defpackage.afgt a(boolean r26, defpackage.aajj r27, java.lang.String r28) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r27;
        r10 = r28;
        r2 = r27.aH();
        r3 = 4;
        if (r2 != r3) goto L_0x0015;
    L_0x000d:
        r2 = r0.d;
        r2 = r2.k();
        r12 = r2;
        goto L_0x0016;
    L_0x0015:
        r12 = 0;
    L_0x0016:
        r2 = r0.g;
        r2 = r2.b(r12);
        r0.n = r2;
        r2 = r0.n;
        r2 = r2.a;
        r13 = 0;
        r2 = android.text.TextUtils.equals(r2, r13);
        if (r2 == 0) goto L_0x0044;
    L_0x0029:
        r2 = android.text.TextUtils.equals(r10, r13);
        if (r2 != 0) goto L_0x0044;
    L_0x002f:
        r2 = r0.n;
        r2.a = r10;
        r3 = r0.g;
        r4 = r2.b;
        r5 = r2.c;
        r6 = r2.d;
        r7 = r2.e;
        r2 = r3;
        r3 = r12;
        r9 = r28;
        r2.a(r3, r4, r5, r6, r7, r9);
    L_0x0044:
        r2 = android.text.TextUtils.equals(r10, r13);
        if (r2 == 0) goto L_0x004c;
    L_0x004a:
        r5 = 2;
        goto L_0x0064;
    L_0x004c:
        r5 = r1.c;
        r6 = r5.b;
        r6 = r6 & 1024;
        if (r6 == 0) goto L_0x0063;
    L_0x0054:
        r5 = r5.B;
        if (r5 != 0) goto L_0x005a;
    L_0x0058:
        r5 = defpackage.axur.g;
    L_0x005a:
        r5 = r5.b;
        r5 = defpackage.axut.a(r5);
        if (r5 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0064;
    L_0x0063:
        r5 = 1;
    L_0x0064:
        r6 = r0.n;
        r6 = r6.a;
        r6 = android.text.TextUtils.equals(r10, r6);
        r7 = r0.n;
        r7 = r7.e;
        r14 = -1;
        r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1));
        if (r9 == 0) goto L_0x0078;
    L_0x0076:
        r9 = 0;
        goto L_0x0079;
    L_0x0078:
        r9 = 1;
    L_0x0079:
        r4 = r0.h;
        r18 = r12;
        r11 = r4.a();
        r19 = b;
        r4 = r1.c;
        r13 = r4.b;
        r13 = r13 & 1024;
        r21 = 0;
        if (r13 == 0) goto L_0x0096;
    L_0x008d:
        r4 = r4.B;
        if (r4 != 0) goto L_0x0093;
    L_0x0091:
        r4 = defpackage.axur.g;
    L_0x0093:
        r3 = r4.c;
        goto L_0x0098;
    L_0x0096:
        r3 = r21;
    L_0x0098:
        r23 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1));
        if (r23 == 0) goto L_0x009e;
    L_0x009c:
        r19 = r3;
    L_0x009e:
        r3 = a;
        r1 = r1.c;
        r13 = r1.b;
        r13 = r13 & 1024;
        if (r13 == 0) goto L_0x00b1;
    L_0x00a8:
        r1 = r1.B;
        if (r1 != 0) goto L_0x00ae;
    L_0x00ac:
        r1 = defpackage.axur.g;
    L_0x00ae:
        r14 = r1.d;
        goto L_0x00b3;
    L_0x00b1:
        r14 = r21;
    L_0x00b3:
        r1 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1));
        if (r1 == 0) goto L_0x00b8;
    L_0x00b7:
        goto L_0x00b9;
    L_0x00b8:
        r14 = r3;
    L_0x00b9:
        r1 = r0.n;
        r3 = r1.e;
        r21 = -1;
        r13 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1));
        if (r13 != 0) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00cc;
    L_0x00c4:
        r3 = r11 - r3;
        r13 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1));
        if (r13 <= 0) goto L_0x00cc;
    L_0x00ca:
        r3 = 1;
        goto L_0x00da;
    L_0x00cc:
        r3 = r1.f;
        r13 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1));
        if (r13 == 0) goto L_0x00d9;
    L_0x00d2:
        r3 = r11 - r3;
        r13 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));
        if (r13 <= 0) goto L_0x00d9;
    L_0x00d8:
        goto L_0x00ca;
    L_0x00d9:
        r3 = 0;
    L_0x00da:
        r4 = r5 + -1;
        if (r5 == 0) goto L_0x01ed;
    L_0x00de:
        r5 = -1;
        r13 = 2;
        if (r4 == r13) goto L_0x011d;
    L_0x00e2:
        r14 = 3;
        if (r4 == r14) goto L_0x00f4;
    L_0x00e5:
        if (r3 != 0) goto L_0x00f1;
    L_0x00e7:
        r5 = r1.b;
        r1 = r1.c;
        if (r9 == 0) goto L_0x00ee;
    L_0x00ed:
        goto L_0x00f2;
    L_0x00ee:
        if (r6 != 0) goto L_0x012a;
    L_0x00f0:
        goto L_0x012b;
    L_0x00f1:
        r1 = -1;
    L_0x00f2:
        r13 = 0;
        goto L_0x012b;
    L_0x00f4:
        if (r6 != 0) goto L_0x0112;
    L_0x00f6:
        if (r3 != 0) goto L_0x00fb;
    L_0x00f8:
        r1 = r1.b;
        goto L_0x00fc;
    L_0x00fb:
        r1 = -1;
    L_0x00fc:
        if (r3 != 0) goto L_0x00ff;
    L_0x00fe:
        r5 = 0;
    L_0x00ff:
        if (r3 != 0) goto L_0x0108;
    L_0x0101:
        r3 = -1;
        r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r6 != 0) goto L_0x010b;
    L_0x0107:
        goto L_0x010a;
    L_0x0108:
        r3 = -1;
    L_0x010a:
        r14 = 0;
    L_0x010b:
        r13 = r14;
        r24 = r5;
        r5 = r1;
        r1 = r24;
        goto L_0x012b;
    L_0x0112:
        r3 = -1;
        r5 = r1.b;
        r1 = r1.c;
        r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r6 != 0) goto L_0x012a;
    L_0x011c:
        goto L_0x00ed;
    L_0x011d:
        r3 = -1;
        if (r6 == 0) goto L_0x00f1;
    L_0x0121:
        r5 = r1.b;
        r1 = r1.c;
        r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r6 != 0) goto L_0x012a;
    L_0x0129:
        goto L_0x00ed;
    L_0x012a:
        r13 = 1;
    L_0x012b:
        if (r2 != 0) goto L_0x012f;
    L_0x012d:
        r0.m = r13;
    L_0x012f:
        if (r2 != 0) goto L_0x0165;
    L_0x0131:
        r2 = r0.l;
        r2 = android.text.TextUtils.equals(r2, r10);
        if (r2 != 0) goto L_0x0165;
    L_0x0139:
        r2 = r0.g;
        r2 = r2.b;
        r2 = r2.edit();
        r3 = "last_playback_start_timestamp";
        r2.putLong(r3, r11);
        if (r18 == 0) goto L_0x0160;
    L_0x0148:
        r3 = new java.lang.StringBuilder;
        r4 = 41;
        r3.<init>(r4);
        r4 = r18;
        r3.append(r4);
        r4 = "_last_playback_start_timestamp";
        r3.append(r4);
        r3 = r3.toString();
        r2.putLong(r3, r11);
    L_0x0160:
        r2.apply();
        r0.l = r10;
    L_0x0165:
        r2 = defpackage.aahr.a(r5);
        r3 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        if (r2 == 0) goto L_0x016e;
    L_0x016d:
        goto L_0x018c;
    L_0x016e:
        if (r26 == 0) goto L_0x0174;
    L_0x0170:
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x018c;
    L_0x0174:
        r2 = r0.f;
        if (r2 != 0) goto L_0x018a;
    L_0x0178:
        r2 = r0.d;
        r2 = r2.j();
        if (r2 == 0) goto L_0x018a;
    L_0x0180:
        r2 = r0.e;
        if (r2 == 0) goto L_0x0187;
    L_0x0184:
        r5 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        goto L_0x018c;
    L_0x0187:
        r5 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        goto L_0x018c;
    L_0x018a:
        r5 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
    L_0x018c:
        r2 = defpackage.aahr.a(r1);
        r4 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        if (r2 == 0) goto L_0x0196;
    L_0x0194:
        r4 = r1;
        goto L_0x01a9;
    L_0x0196:
        if (r26 == 0) goto L_0x019a;
    L_0x0198:
        r4 = 0;
        goto L_0x01a9;
    L_0x019a:
        r1 = r0.d;
        r1 = r1.j();
        if (r1 == 0) goto L_0x01a9;
    L_0x01a2:
        r1 = r0.f;
        if (r1 == 0) goto L_0x01a7;
    L_0x01a6:
        goto L_0x01a9;
    L_0x01a7:
        r4 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
    L_0x01a9:
        r1 = java.lang.Math.min(r4, r5);
        r2 = r0.j;
        if (r2 <= 0) goto L_0x01be;
    L_0x01b1:
        r3 = r0.i;
        if (r3 > 0) goto L_0x01b6;
    L_0x01b5:
        goto L_0x01be;
    L_0x01b6:
        if (r2 < r3) goto L_0x01be;
    L_0x01b8:
        r4 = new afgq;
        r4.<init>(r2, r3);
        goto L_0x01c0;
    L_0x01be:
        r4 = defpackage.afgt.a;
    L_0x01c0:
        r15 = r4;
        r2 = r0.n;
        r2 = r2.e;
        r6 = -1;
        r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x01cf;
    L_0x01cb:
        r11 = r11 - r2;
        r19 = r11;
        goto L_0x01d1;
    L_0x01cf:
        r19 = r2;
    L_0x01d1:
        r2 = new afgt;
        r14 = new afgq;
        r3 = r0.m;
        r14.<init>(r5, r1, r3);
        r1 = r0.k;
        r3 = r0.n;
        r4 = r3.b;
        r3 = r3.d;
        r13 = r2;
        r16 = r1;
        r17 = r4;
        r18 = r3;
        r13.<init>(r14, r15, r16, r17, r18, r19);
        return r2;
    L_0x01ed:
        r1 = 0;
        goto L_0x01f0;
    L_0x01ef:
        throw r1;
    L_0x01f0:
        goto L_0x01ef;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgx.a(boolean, aajj, java.lang.String):afgt");
    }
}

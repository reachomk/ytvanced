package defpackage;

import java.util.Locale;

/* renamed from: bcsq */
final class bcsq implements bcsv, bcsz {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d = 2;
    private final int e;

    bcsq(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.e = i;
    }

    public final int a() {
        int i = this.d;
        int i2 = i + 1;
        i2 += i2;
        if (this.c) {
            i2 += i - 1;
        }
        String str = this.a;
        return (str == null || str.length() <= i2) ? i2 : this.a.length();
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        if (bcpt != null) {
            if (i == 0) {
                String str = this.a;
                if (str != null) {
                    stringBuffer.append(str);
                    return;
                }
            }
            if (i >= 0) {
                stringBuffer.append('+');
            } else {
                stringBuffer.append('-');
                i = -i;
            }
            int i2 = i / 3600000;
            bcsy.a(stringBuffer, i2, 2);
            if (this.e != 1) {
                i -= i2 * 3600000;
                if (i != 0 || this.d > 1) {
                    i2 = i / 60000;
                    if (this.c) {
                        stringBuffer.append(':');
                    }
                    bcsy.a(stringBuffer, i2, 2);
                    if (this.e != 2) {
                        i -= i2 * 60000;
                        if (i != 0 || this.d > 2) {
                            int i3 = i / 1000;
                            if (this.c) {
                                stringBuffer.append(':');
                            }
                            bcsy.a(stringBuffer, i3, 2);
                            if (this.e != 3) {
                                i -= i3 * 1000;
                                if (i != 0 || this.d > 3) {
                                    if (this.c) {
                                        stringBuffer.append('.');
                                    }
                                    bcsy.a(stringBuffer, i, 3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int b() {
        return a();
    }

    /* JADX WARNING: Missing block: B:11:0x003d, code skipped:
            if (r1 != '+') goto L_0x003f;
     */
    /* JADX WARNING: Missing block: B:33:0x007f, code skipped:
            if (r6 <= '9') goto L_0x0083;
     */
    /* JADX WARNING: Missing block: B:73:0x0113, code skipped:
            if (r4 == 0) goto L_0x011f;
     */
    public final int a(defpackage.bcsu r13, java.lang.String r14, int r15) {
        /*
        r12 = this;
        r0 = r14.length();
        r0 = r0 - r15;
        r1 = r12.b;
        r2 = 43;
        r3 = 45;
        r4 = 0;
        r5 = java.lang.Integer.valueOf(r4);
        if (r1 == 0) goto L_0x0043;
    L_0x0012:
        r1 = r1.length();
        if (r1 == 0) goto L_0x0034;
    L_0x0018:
        r9 = r12.b;
        r7 = 1;
        r10 = 0;
        r11 = r9.length();
        r6 = r14;
        r8 = r15;
        r1 = r6.regionMatches(r7, r8, r9, r10, r11);
        if (r1 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0043;
    L_0x0029:
        r13.a(r5);
        r13 = r12.b;
        r13 = r13.length();
        r15 = r15 + r13;
        return r15;
    L_0x0034:
        if (r0 > 0) goto L_0x0037;
    L_0x0036:
        goto L_0x003f;
    L_0x0037:
        r1 = r14.charAt(r15);
        if (r1 == r3) goto L_0x0043;
    L_0x003d:
        if (r1 == r2) goto L_0x0043;
    L_0x003f:
        r13.a(r5);
        return r15;
    L_0x0043:
        r1 = 1;
        if (r0 <= r1) goto L_0x0133;
    L_0x0046:
        r5 = r14.charAt(r15);
        if (r5 != r3) goto L_0x004e;
    L_0x004c:
        r2 = 1;
        goto L_0x0051;
    L_0x004e:
        if (r5 != r2) goto L_0x0130;
    L_0x0050:
        r2 = 0;
    L_0x0051:
        r15 = r15 + r1;
        r3 = 2;
        r5 = defpackage.bcsq.a(r14, r15, r3);
        if (r5 < r3) goto L_0x012d;
    L_0x0059:
        r5 = defpackage.bcsy.a(r14, r15);
        r6 = 23;
        if (r5 > r6) goto L_0x012a;
    L_0x0061:
        r6 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r5 = r5 * r6;
        r0 = r0 + -3;
        r15 = r15 + r3;
        if (r0 <= 0) goto L_0x011f;
    L_0x006b:
        r6 = r14.charAt(r15);
        r7 = 58;
        if (r6 != r7) goto L_0x0079;
    L_0x0073:
        r0 = r0 + -1;
        r15 = r15 + 1;
        r4 = 1;
        goto L_0x0083;
    L_0x0079:
        r8 = 48;
        if (r6 < r8) goto L_0x011f;
    L_0x007d:
        r8 = 57;
        if (r6 <= r8) goto L_0x0083;
    L_0x0081:
        goto L_0x011f;
    L_0x0083:
        r6 = defpackage.bcsq.a(r14, r15, r3);
        if (r6 != 0) goto L_0x008d;
    L_0x0089:
        if (r4 != 0) goto L_0x008d;
    L_0x008b:
        goto L_0x011f;
    L_0x008d:
        if (r6 < r3) goto L_0x011c;
    L_0x008f:
        r6 = defpackage.bcsy.a(r14, r15);
        r8 = 59;
        if (r6 > r8) goto L_0x0119;
    L_0x0097:
        r9 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r6 = r6 * r9;
        r5 = r5 + r6;
        r0 = r0 + -2;
        r15 = r15 + 2;
        if (r0 <= 0) goto L_0x011f;
    L_0x00a3:
        if (r4 != 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00b0;
    L_0x00a6:
        r6 = r14.charAt(r15);
        if (r6 != r7) goto L_0x011f;
    L_0x00ac:
        r0 = r0 + -1;
        r15 = r15 + 1;
    L_0x00b0:
        r6 = defpackage.bcsq.a(r14, r15, r3);
        if (r6 == 0) goto L_0x0113;
    L_0x00b6:
        if (r6 < r3) goto L_0x0116;
    L_0x00b8:
        r6 = defpackage.bcsy.a(r14, r15);
        if (r6 > r8) goto L_0x0110;
    L_0x00be:
        r6 = r6 * 1000;
        r5 = r5 + r6;
        r15 = r15 + 2;
        r0 = r0 + -2;
        if (r0 <= 0) goto L_0x011f;
    L_0x00c7:
        if (r4 == 0) goto L_0x00db;
    L_0x00c9:
        r0 = r14.charAt(r15);
        r6 = 46;
        if (r0 == r6) goto L_0x00d9;
    L_0x00d1:
        r0 = r14.charAt(r15);
        r6 = 44;
        if (r0 != r6) goto L_0x011f;
    L_0x00d9:
        r15 = r15 + 1;
    L_0x00db:
        r0 = 3;
        r0 = defpackage.bcsq.a(r14, r15, r0);
        if (r0 != 0) goto L_0x00e4;
    L_0x00e2:
        if (r4 == 0) goto L_0x011f;
    L_0x00e4:
        if (r0 <= 0) goto L_0x010d;
    L_0x00e6:
        r4 = r15 + 1;
        r15 = r14.charAt(r15);
        r15 = r15 + -48;
        r15 = r15 * 100;
        r5 = r5 + r15;
        if (r0 <= r1) goto L_0x010b;
    L_0x00f3:
        r15 = r4 + 1;
        r1 = r14.charAt(r4);
        r1 = r1 + -48;
        r1 = r1 * 10;
        r5 = r5 + r1;
        if (r0 <= r3) goto L_0x011f;
    L_0x0100:
        r0 = r15 + 1;
        r14 = r14.charAt(r15);
        r14 = r14 + -48;
        r5 = r5 + r14;
        r15 = r0;
        goto L_0x011f;
    L_0x010b:
        r15 = r4;
        goto L_0x011f;
    L_0x010d:
        r13 = r15 ^ -1;
        return r13;
    L_0x0110:
        r13 = r15 ^ -1;
        return r13;
    L_0x0113:
        if (r4 != 0) goto L_0x0116;
    L_0x0115:
        goto L_0x011f;
    L_0x0116:
        r13 = r15 ^ -1;
        return r13;
    L_0x0119:
        r13 = r15 ^ -1;
        return r13;
    L_0x011c:
        r13 = r15 ^ -1;
        return r13;
    L_0x011f:
        if (r2 == 0) goto L_0x0122;
    L_0x0121:
        r5 = -r5;
    L_0x0122:
        r14 = java.lang.Integer.valueOf(r5);
        r13.a(r14);
        return r15;
    L_0x012a:
        r13 = r15 ^ -1;
        return r13;
    L_0x012d:
        r13 = r15 ^ -1;
        return r13;
    L_0x0130:
        r13 = r15 ^ -1;
        return r13;
    L_0x0133:
        r13 = r15 ^ -1;
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcsq.a(bcsu, java.lang.String, int):int");
    }

    private static int a(String str, int i, int i2) {
        int i3 = 0;
        for (i2 = Math.min(str.length() - i, i2); i2 > 0; i2--) {
            char charAt = str.charAt(i + i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }
}

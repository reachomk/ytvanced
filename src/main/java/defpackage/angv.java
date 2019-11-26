package defpackage;

/* renamed from: angv */
public final class angv {
    /* JADX WARNING: Missing block: B:16:0x003d, code skipped:
            if (((r0 & 1) & r2) == 0) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:17:0x0040, code skipped:
            if (r1 <= 0) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:18:0x0043, code skipped:
            if (r5 > 0) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:19:0x0046, code skipped:
            if (r5 < 0) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:21:0x0049, code skipped:
            return r0;
     */
    public static int a(int r5, int r6, java.math.RoundingMode r7) {
        /*
        defpackage.amqw.a(r7);
        if (r6 == 0) goto L_0x0052;
    L_0x0005:
        r0 = r5 / r6;
        r1 = r6 * r0;
        r1 = r5 - r1;
        if (r1 == 0) goto L_0x0051;
    L_0x000d:
        r5 = r5 ^ r6;
        r5 = r5 >> 31;
        r2 = 1;
        r5 = r5 | r2;
        r3 = defpackage.angy.a;
        r4 = r7.ordinal();
        r3 = r3[r4];
        r4 = 0;
        switch(r3) {
            case 1: goto L_0x004a;
            case 2: goto L_0x0049;
            case 3: goto L_0x0046;
            case 4: goto L_0x0048;
            case 5: goto L_0x0043;
            case 6: goto L_0x0024;
            case 7: goto L_0x0024;
            case 8: goto L_0x0024;
            default: goto L_0x001e;
        };
    L_0x001e:
        r5 = new java.lang.AssertionError;
        r5.<init>();
        throw r5;
    L_0x0024:
        r1 = java.lang.Math.abs(r1);
        r6 = java.lang.Math.abs(r6);
        r6 = r6 - r1;
        r1 = r1 - r6;
        if (r1 != 0) goto L_0x0040;
    L_0x0030:
        r6 = java.math.RoundingMode.HALF_UP;
        if (r7 == r6) goto L_0x0048;
    L_0x0034:
        r6 = java.math.RoundingMode.HALF_EVEN;
        if (r7 != r6) goto L_0x0039;
    L_0x0038:
        goto L_0x003a;
    L_0x0039:
        r2 = 0;
    L_0x003a:
        r6 = r0 & 1;
        r6 = r6 & r2;
        if (r6 != 0) goto L_0x0048;
    L_0x003f:
        goto L_0x0049;
    L_0x0040:
        if (r1 > 0) goto L_0x0048;
    L_0x0042:
        goto L_0x0049;
    L_0x0043:
        if (r5 <= 0) goto L_0x0049;
    L_0x0045:
        goto L_0x0048;
    L_0x0046:
        if (r5 >= 0) goto L_0x0049;
    L_0x0048:
        r0 = r0 + r5;
    L_0x0049:
        return r0;
    L_0x004a:
        if (r1 != 0) goto L_0x004d;
    L_0x004c:
        goto L_0x004e;
    L_0x004d:
        r2 = 0;
    L_0x004e:
        defpackage.angx.a(r2);
    L_0x0051:
        return r0;
    L_0x0052:
        r5 = new java.lang.ArithmeticException;
        r6 = "/ by zero";
        r5.<init>(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.angv.a(int, int, java.math.RoundingMode):int");
    }
}

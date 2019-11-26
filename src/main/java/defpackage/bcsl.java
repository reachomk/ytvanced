package defpackage;

/* renamed from: bcsl */
final class bcsl implements bcsv {
    private final bcsv[] a;
    private final int b;

    bcsl(bcsv[] bcsvArr) {
        this.a = bcsvArr;
        int length = bcsvArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                bcsv bcsv = bcsvArr[length];
                if (bcsv != null) {
                    int b = bcsv.b();
                    if (b > i) {
                        i = b;
                    }
                }
            } else {
                this.b = i;
                return;
            }
        }
    }

    public final int b() {
        return this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
    public final int a(defpackage.bcsu r10, java.lang.String r11, int r12) {
        /*
        r9 = this;
        r0 = r9.a;
        r1 = r0.length;
        r2 = r10.a();
        r3 = 0;
        r4 = 0;
        r5 = r12;
        r7 = r5;
        r6 = r4;
        r4 = 0;
    L_0x000d:
        if (r4 >= r1) goto L_0x0045;
    L_0x000f:
        r8 = r0[r4];
        if (r8 == 0) goto L_0x0040;
    L_0x0013:
        r8 = r8.a(r10, r11, r12);
        if (r8 < r12) goto L_0x0032;
    L_0x0019:
        if (r8 > r5) goto L_0x001c;
    L_0x001b:
        goto L_0x003a;
    L_0x001c:
        r5 = r11.length();
        if (r8 >= r5) goto L_0x0031;
    L_0x0022:
        r5 = r4 + 1;
        if (r5 >= r1) goto L_0x0031;
    L_0x0026:
        r5 = r0[r5];
        if (r5 == 0) goto L_0x0031;
    L_0x002a:
        r5 = r10.a();
        r6 = r5;
        r5 = r8;
        goto L_0x003a;
    L_0x0031:
        return r8;
    L_0x0032:
        if (r8 >= 0) goto L_0x003a;
    L_0x0034:
        r8 = r8 ^ -1;
        if (r8 > r7) goto L_0x0039;
    L_0x0038:
        goto L_0x003a;
    L_0x0039:
        r7 = r8;
    L_0x003a:
        r10.a(r2);
        r4 = r4 + 1;
        goto L_0x000d;
    L_0x0040:
        if (r5 <= r12) goto L_0x0044;
    L_0x0042:
        r3 = 1;
        goto L_0x0045;
    L_0x0044:
        return r12;
    L_0x0045:
        if (r5 > r12) goto L_0x0050;
    L_0x0047:
        if (r5 == r12) goto L_0x004a;
    L_0x0049:
        goto L_0x004d;
    L_0x004a:
        if (r3 == 0) goto L_0x004d;
    L_0x004c:
        goto L_0x0050;
    L_0x004d:
        r10 = r7 ^ -1;
        return r10;
    L_0x0050:
        if (r6 == 0) goto L_0x0055;
    L_0x0052:
        r10.a(r6);
    L_0x0055:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcsl.a(bcsu, java.lang.String, int):int");
    }
}

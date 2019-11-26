package defpackage;

/* renamed from: amrt */
public final class amrt {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e A:{RETURN} */
    public static int a(java.lang.CharSequence r8) {
        /*
        r0 = r8.length();
        r1 = 0;
        r2 = 0;
    L_0x0006:
        if (r2 >= r0) goto L_0x0013;
    L_0x0008:
        r3 = r8.charAt(r2);
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 >= r4) goto L_0x0013;
    L_0x0010:
        r2 = r2 + 1;
        goto L_0x0006;
    L_0x0013:
        r3 = r0;
    L_0x0014:
        if (r2 >= r0) goto L_0x006c;
    L_0x0016:
        r4 = r8.charAt(r2);
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r4 >= r5) goto L_0x0026;
    L_0x001e:
        r4 = 127 - r4;
        r4 = r4 >>> 31;
        r3 = r3 + r4;
        r2 = r2 + 1;
        goto L_0x0014;
    L_0x0026:
        r4 = r8.length();
    L_0x002a:
        if (r2 < r4) goto L_0x002e;
    L_0x002c:
        r3 = r3 + r1;
        goto L_0x006c;
    L_0x002e:
        r6 = r8.charAt(r2);
        if (r6 >= r5) goto L_0x003a;
    L_0x0034:
        r6 = 127 - r6;
        r6 = r6 >>> 31;
        r1 = r1 + r6;
        goto L_0x0050;
    L_0x003a:
        r1 = r1 + 2;
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r6 >= r7) goto L_0x0042;
    L_0x0041:
        goto L_0x0050;
    L_0x0042:
        r7 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r6 <= r7) goto L_0x0048;
    L_0x0047:
        goto L_0x0050;
    L_0x0048:
        r7 = java.lang.Character.codePointAt(r8, r2);
        if (r7 == r6) goto L_0x0053;
    L_0x004e:
        r2 = r2 + 1;
    L_0x0050:
        r2 = r2 + 1;
        goto L_0x002a;
    L_0x0053:
        r8 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = 39;
        r0.<init>(r1);
        r1 = "Unpaired surrogate at index ";
        r0.append(r1);
        r0.append(r2);
        r0 = r0.toString();
        r8.<init>(r0);
        throw r8;
    L_0x006c:
        if (r3 < r0) goto L_0x006f;
    L_0x006e:
        return r3;
    L_0x006f:
        r8 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = 54;
        r0.<init>(r1);
        r1 = "UTF-8 length does not fit in int: ";
        r0.append(r1);
        r1 = (long) r3;
        r3 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r1 = r1 + r3;
        r0.append(r1);
        r0 = r0.toString();
        r8.<init>(r0);
        goto L_0x0090;
    L_0x008f:
        throw r8;
    L_0x0090:
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amrt.a(java.lang.CharSequence):int");
    }
}

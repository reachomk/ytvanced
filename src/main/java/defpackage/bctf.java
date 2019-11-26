package defpackage;

/* renamed from: bctf */
final class bctf extends bcpt {
    public static final long serialVersionUID = 6941492635554961361L;
    public final int e;
    private final bctg f;
    private final bctg g;

    bctf(String str, int i, bctg bctg, bctg bctg2) {
        super(str);
        this.e = i;
        this.f = bctg;
        this.g = bctg2;
    }

    public final boolean b() {
        return false;
    }

    public final String a(long j) {
        return i(j).a;
    }

    public final int b(long j) {
        return this.e + i(j).b;
    }

    public final int c(long j) {
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b A:{RETURN} */
    /* JADX WARNING: Missing block: B:6:0x0014, code skipped:
            if (r5 < 0) goto L_0x0017;
     */
    public final long g(long r9) {
        /*
        r8 = this;
        r0 = r8.e;
        r1 = r8.f;
        r2 = r8.g;
        r3 = 0;
        r5 = r2.b;	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0017, ArithmeticException | IllegalArgumentException -> 0x0017 }
        r5 = r1.a(r9, r0, r5);	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0017, ArithmeticException | IllegalArgumentException -> 0x0017 }
        r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r7 <= 0) goto L_0x0018;
    L_0x0012:
        r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r7 < 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0018;
    L_0x0017:
        r5 = r9;
    L_0x0018:
        r1 = r1.b;	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0027, ArithmeticException | IllegalArgumentException -> 0x0027 }
        r0 = r2.a(r9, r0, r1);	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0027, ArithmeticException | IllegalArgumentException -> 0x0027 }
        r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x0026;
    L_0x0022:
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 < 0) goto L_0x0027;
    L_0x0026:
        r9 = r0;
    L_0x0027:
        r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r0 <= 0) goto L_0x002c;
    L_0x002b:
        return r9;
    L_0x002c:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bctf.g(long):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARNING: Missing block: B:6:0x0017, code skipped:
            if (r5 > 0) goto L_0x001a;
     */
    public final long h(long r9) {
        /*
        r8 = this;
        r0 = 1;
        r9 = r9 + r0;
        r0 = r8.e;
        r1 = r8.f;
        r2 = r8.g;
        r3 = 0;
        r5 = r2.b;	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x001a, ArithmeticException | IllegalArgumentException -> 0x001a }
        r5 = r1.b(r9, r0, r5);	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x001a, ArithmeticException | IllegalArgumentException -> 0x001a }
        r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r7 >= 0) goto L_0x001b;
    L_0x0015:
        r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r7 > 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001b;
    L_0x001a:
        r5 = r9;
    L_0x001b:
        r1 = r1.b;	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x002a, ArithmeticException | IllegalArgumentException -> 0x002a }
        r0 = r2.b(r9, r0, r1);	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x002a, ArithmeticException | IllegalArgumentException -> 0x002a }
        r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x0029;
    L_0x0025:
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 > 0) goto L_0x002a;
    L_0x0029:
        r9 = r0;
    L_0x002a:
        r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r0 <= 0) goto L_0x002f;
    L_0x002e:
        r9 = r5;
    L_0x002f:
        r0 = -1;
        r9 = r9 + r0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bctf.h(long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bctf) {
            bctf bctf = (bctf) obj;
            return this.d.equals(bctf.d) && this.e == bctf.e && this.f.equals(bctf.f) && this.g.equals(bctf.g);
        }
    }

    private final bctg i(long j) {
        long a;
        int i = this.e;
        bctg bctg = this.f;
        bctg bctg2 = this.g;
        try {
            a = bctg.a(j, i, bctg2.b);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            a = j;
        }
        try {
            j = bctg2.a(j, i, bctg.b);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return a > j ? bctg : bctg2;
    }
}

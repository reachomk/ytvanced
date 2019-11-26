package defpackage;

import java.io.Serializable;

/* renamed from: cg */
final class cg implements bx, Serializable {
    public static final long serialVersionUID = 1;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final ce g;

    cg(int i, boolean z, ce ceVar, boolean z2, double d, double d2, long[] jArr) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = d;
        this.e = d2;
        this.f = jArr;
        this.g = ceVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008c A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008c A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008d A:{RETURN} */
    /* JADX WARNING: Missing block: B:21:0x0037, code skipped:
            if ((r2 - r4) == 0.0d) goto L_0x0039;
     */
    public final boolean a(defpackage.bz r9) {
        /*
        r8 = this;
        r0 = r8.g;
        r0 = r0.ordinal();
        r1 = 1;
        if (r0 == r1) goto L_0x0025;
    L_0x0009:
        r2 = 2;
        if (r0 == r2) goto L_0x0022;
    L_0x000c:
        r2 = 3;
        if (r0 == r2) goto L_0x001f;
    L_0x000f:
        r2 = 4;
        if (r0 == r2) goto L_0x001b;
    L_0x0012:
        r2 = 5;
        if (r0 == r2) goto L_0x0018;
    L_0x0015:
        r2 = r9.a;
        goto L_0x0028;
    L_0x0018:
        r0 = r9.c;
        goto L_0x001d;
    L_0x001b:
        r0 = r9.b;
    L_0x001d:
        r2 = (double) r0;
        goto L_0x0028;
    L_0x001f:
        r2 = r9.e;
        goto L_0x0027;
    L_0x0022:
        r2 = r9.d;
        goto L_0x0027;
    L_0x0025:
        r2 = r9.f;
    L_0x0027:
        r2 = (double) r2;
    L_0x0028:
        r0 = r8.c;
        if (r0 == 0) goto L_0x0039;
    L_0x002c:
        r4 = (long) r2;
        r4 = (double) r4;
        java.lang.Double.isNaN(r4);
        r4 = r2 - r4;
        r6 = 0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0044;
    L_0x0039:
        r0 = r8.g;
        r4 = defpackage.ce.j;
        if (r0 != r4) goto L_0x0048;
    L_0x003f:
        r9 = r9.b;
        if (r9 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0048;
    L_0x0044:
        r9 = r8.b;
        r9 = r9 ^ r1;
        return r9;
    L_0x0048:
        r9 = r8.a;
        if (r9 == 0) goto L_0x0051;
    L_0x004c:
        r4 = (double) r9;
        java.lang.Double.isNaN(r4);
        r2 = r2 % r4;
    L_0x0051:
        r4 = r8.d;
        r9 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x0061;
    L_0x0058:
        r4 = r8.e;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0061;
    L_0x005f:
        r0 = 1;
        goto L_0x0062;
    L_0x0061:
        r0 = 0;
    L_0x0062:
        if (r0 == 0) goto L_0x0088;
    L_0x0064:
        r4 = r8.f;
        if (r4 == 0) goto L_0x0088;
    L_0x0068:
        r0 = 0;
        r4 = 0;
    L_0x006a:
        if (r0 != 0) goto L_0x0088;
    L_0x006c:
        r5 = r8.f;
        r6 = r5.length;
        if (r4 >= r6) goto L_0x0088;
    L_0x0071:
        r6 = r5[r4];
        r6 = (double) r6;
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x0084;
    L_0x0078:
        r0 = r4 + 1;
        r6 = r5[r0];
        r5 = (double) r6;
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x0082;
    L_0x0081:
        goto L_0x0084;
    L_0x0082:
        r0 = 1;
        goto L_0x0085;
    L_0x0084:
        r0 = 0;
    L_0x0085:
        r4 = r4 + 2;
        goto L_0x006a;
    L_0x0088:
        r2 = r8.b;
        if (r2 != r0) goto L_0x008d;
    L_0x008c:
        return r1;
    L_0x008d:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.a(bz):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Missing block: B:6:0x0026, code skipped:
            if (r9.b == false) goto L_0x003d;
     */
    /* JADX WARNING: Missing block: B:11:0x0031, code skipped:
            if (r9.b == false) goto L_0x003d;
     */
    public final java.lang.String toString() {
        /*
        r9 = this;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = r9.g;
        r6.append(r0);
        r0 = r9.a;
        if (r0 == 0) goto L_0x0018;
    L_0x000e:
        r0 = " % ";
        r6.append(r0);
        r0 = r9.a;
        r6.append(r0);
    L_0x0018:
        r0 = r9.d;
        r2 = r9.e;
        r4 = " != ";
        r5 = " = ";
        r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r7 != 0) goto L_0x002b;
    L_0x0024:
        r0 = r9.b;
        if (r0 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x003d;
    L_0x0029:
        r4 = r5;
        goto L_0x003d;
    L_0x002b:
        r0 = r9.c;
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r9.b;
        if (r0 != 0) goto L_0x0029;
    L_0x0033:
        goto L_0x003d;
    L_0x0034:
        r0 = r9.b;
        if (r0 != 0) goto L_0x003b;
    L_0x0038:
        r4 = " not within ";
        goto L_0x003d;
    L_0x003b:
        r4 = " within ";
    L_0x003d:
        r6.append(r4);
        r0 = r9.f;
        if (r0 != 0) goto L_0x004e;
    L_0x0044:
        r1 = r9.d;
        r3 = r9.e;
        r5 = 0;
        r0 = r6;
        defpackage.bt.a(r0, r1, r3, r5);
        goto L_0x006a;
    L_0x004e:
        r7 = 0;
        r8 = 0;
    L_0x0050:
        r0 = r9.f;
        r1 = r0.length;
        if (r8 >= r1) goto L_0x006a;
    L_0x0055:
        r1 = r0[r8];
        r1 = (double) r1;
        r3 = r8 + 1;
        r3 = r0[r3];
        r3 = (double) r3;
        if (r8 == 0) goto L_0x0062;
    L_0x005f:
        r0 = 1;
        r5 = 1;
        goto L_0x0063;
    L_0x0062:
        r5 = 0;
    L_0x0063:
        r0 = r6;
        defpackage.bt.a(r0, r1, r3, r5);
        r8 = r8 + 2;
        goto L_0x0050;
    L_0x006a:
        r0 = r6.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.toString():java.lang.String");
    }
}

package defpackage;

/* renamed from: ouc */
public final class ouc implements Comparable {
    public final boolean a;
    private final oub b;
    private final boolean c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A:{LOOP_END, LOOP:0: B:19:0x0071->B:21:0x0074} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    public ouc(defpackage.nzw r5, defpackage.oub r6, int r7) {
        /*
        r4 = this;
        r4.<init>();
        r4.b = r6;
        r0 = 0;
        r7 = defpackage.oua.a(r7, r0);
        r4.c = r7;
        r7 = r6.w;
        r7 = defpackage.oua.a(r5, r7);
        r4.d = r7;
        r7 = r5.c;
        r1 = 1;
        r7 = r7 & r1;
        if (r7 != 0) goto L_0x001c;
    L_0x001a:
        r7 = 0;
        goto L_0x001d;
    L_0x001c:
        r7 = 1;
    L_0x001d:
        r4.g = r7;
        r7 = r5.v;
        r4.h = r7;
        r7 = r5.w;
        r4.i = r7;
        r7 = r5.e;
        r4.j = r7;
        r7 = r5.e;
        r2 = -1;
        if (r7 == r2) goto L_0x0034;
    L_0x0030:
        r3 = r6.m;
        if (r7 > r3) goto L_0x003c;
    L_0x0034:
        r7 = r5.v;
        if (r7 == r2) goto L_0x003e;
    L_0x0038:
        r6 = r6.l;
        if (r7 <= r6) goto L_0x003e;
    L_0x003c:
        r6 = 0;
        goto L_0x003f;
    L_0x003e:
        r6 = 1;
    L_0x003f:
        r4.a = r6;
        r6 = defpackage.ozp.a;
        r7 = 24;
        if (r6 >= r7) goto L_0x005a;
    L_0x0047:
        r6 = new java.lang.String[r1];
        r7 = android.content.res.Resources.getSystem();
        r7 = r7.getConfiguration();
        r7 = r7.locale;
        r7 = defpackage.ozp.a(r7);
        r6[r0] = r7;
        goto L_0x0070;
    L_0x005a:
        r6 = android.content.res.Resources.getSystem();
        r6 = r6.getConfiguration();
        r6 = r6.getLocales();
        r6 = r6.toLanguageTags();
        r7 = ",";
        r6 = defpackage.ozp.a(r6, r7);
    L_0x0070:
        r7 = 0;
    L_0x0071:
        r1 = r6.length;
        if (r7 >= r1) goto L_0x007f;
    L_0x0074:
        r1 = r6[r7];
        r1 = defpackage.ozp.b(r1);
        r6[r7] = r1;
        r7 = r7 + 1;
        goto L_0x0071;
    L_0x007f:
        r7 = 0;
    L_0x0080:
        r1 = r6.length;
        if (r7 >= r1) goto L_0x0090;
    L_0x0083:
        r1 = r6[r7];
        r1 = defpackage.oua.a(r5, r1);
        if (r1 > 0) goto L_0x008e;
    L_0x008b:
        r7 = r7 + 1;
        goto L_0x0080;
    L_0x008e:
        r0 = r1;
        goto L_0x0093;
    L_0x0090:
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x0093:
        r4.e = r7;
        r4.f = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouc.<init>(nzw, oub, int):void");
    }

    /* renamed from: a */
    public final int compareTo(ouc ouc) {
        boolean z = this.c;
        int i = -1;
        if (z != ouc.c) {
            return !z ? -1 : 1;
        } else {
            int i2 = this.d;
            int i3 = ouc.d;
            if (i2 != i3) {
                return oua.b(i2, i3);
            }
            z = this.a;
            if (z != ouc.a) {
                return !z ? -1 : 1;
            } else {
                if (this.b.q) {
                    i2 = oua.a(this.j, ouc.j);
                    if (i2 != 0) {
                        return i2 > 0 ? -1 : 1;
                    }
                }
                z = this.g;
                if (z != ouc.g) {
                    return !z ? -1 : 1;
                } else {
                    i2 = this.e;
                    i3 = ouc.e;
                    if (i2 != i3) {
                        return -oua.b(i2, i3);
                    }
                    i2 = this.f;
                    i3 = ouc.f;
                    if (i2 != i3) {
                        return oua.b(i2, i3);
                    }
                    int b;
                    if (this.a && this.c) {
                        i = 1;
                    }
                    i2 = this.h;
                    i3 = ouc.h;
                    if (i2 == i3) {
                        i2 = this.i;
                        i3 = ouc.i;
                        if (i2 == i3) {
                            b = oua.b(this.j, ouc.j);
                            return i * b;
                        }
                    }
                    b = oua.b(i2, i3);
                    return i * b;
                }
            }
        }
    }
}

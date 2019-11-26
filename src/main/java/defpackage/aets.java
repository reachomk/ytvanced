package defpackage;

/* renamed from: aets */
public final class aets extends aett {
    public long a;
    private final long g;

    public aets(String str, String str2, long j, long j2, long j3, String str3) {
        String str4 = str2;
        int i = 0;
        if (!("start".equalsIgnoreCase(str2) || "predictStart".equalsIgnoreCase(str2))) {
            i = !"stop".equalsIgnoreCase(str2) ? !"continue".equalsIgnoreCase(str2) ? -1 : 1 : 2;
        }
        super(str, i, j2, j3, str3);
        this.g = j;
        this.a = -1;
    }

    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            return true;
     */
    public final boolean a(defpackage.aett r7) {
        /*
        r6 = this;
        r0 = r6.b(r7);
        r1 = 0;
        if (r0 == 0) goto L_0x0024;
    L_0x0007:
        r0 = r7.c;
        r2 = r6.c;
        if (r0 > r2) goto L_0x0024;
    L_0x000d:
        r0 = 1;
        if (r2 == 0) goto L_0x0023;
    L_0x0010:
        r2 = r7 instanceof defpackage.aets;
        if (r2 == 0) goto L_0x0023;
    L_0x0014:
        r7 = (defpackage.aets) r7;
        r2 = r7.d;
        r4 = r6.d;
        r2 = r2 - r4;
        r4 = 0;
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r7 > 0) goto L_0x0022;
    L_0x0021:
        return r0;
    L_0x0022:
        return r1;
    L_0x0023:
        return r0;
    L_0x0024:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aets.a(aett):boolean");
    }

    public final long a() {
        long j = this.a;
        if (j != -1) {
            return (j + this.g) - this.d;
        }
        return -1;
    }

    public final String toString() {
        String str = this.b;
        long j = this.a;
        long j2 = this.g;
        long j3 = this.d;
        long j4 = this.e;
        String str2 = this.f;
        long a = a();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 201) + String.valueOf(str2).length());
        stringBuilder.append("CuePoint identifier(");
        stringBuilder.append(str);
        stringBuilder.append("), periodStart(");
        stringBuilder.append(j);
        stringBuilder.append("), segmentTime(");
        stringBuilder.append(j2);
        stringBuilder.append("), timeOffset(");
        stringBuilder.append(j3);
        stringBuilder.append("), duration(");
        stringBuilder.append(j4);
        stringBuilder.append("), context(");
        stringBuilder.append(str2);
        stringBuilder.append("), startTime(");
        stringBuilder.append(a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

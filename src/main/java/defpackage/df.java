package defpackage;

import java.util.HashSet;

/* renamed from: df */
public final class df {
    public final dh a;
    public df b;
    public int c = 0;
    public int d = 0;
    public dc e;
    public final int f;
    public int g = 1;
    public int h = 1;
    private int i = -1;

    public final void a() {
        dc dcVar = this.e;
        if (dcVar == null) {
            this.e = new dc(1);
        } else {
            dcVar.a();
        }
    }

    public final int b() {
        if (this.a.K == 8) {
            return 0;
        }
        int i = this.i;
        if (i >= 0) {
            df dfVar = this.b;
            if (dfVar != null && dfVar.a.K == 8) {
                return i;
            }
        }
        return this.c;
    }

    public final void c() {
        this.b = null;
        this.c = 0;
        this.i = -1;
        this.g = 2;
        this.d = 0;
        this.h = 1;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final String toString() {
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("null:");
        int i = this.f;
        String a = de.a(i);
        if (i != 0) {
            String stringBuilder2;
            stringBuilder.append(a);
            if (this.b != null) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(" connected to ");
                stringBuilder3.append(this.b.a(hashSet));
                stringBuilder2 = stringBuilder3.toString();
            } else {
                stringBuilder2 = "";
            }
            stringBuilder.append(stringBuilder2);
            return stringBuilder.toString();
        }
        throw null;
    }

    private final String a(HashSet hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("null:");
        int i = this.f;
        String a = de.a(i);
        if (i != 0) {
            String stringBuilder2;
            stringBuilder.append(a);
            if (this.b != null) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(" connected to ");
                stringBuilder3.append(this.b.a(hashSet));
                stringBuilder2 = stringBuilder3.toString();
            } else {
                stringBuilder2 = "";
            }
            stringBuilder.append(stringBuilder2);
            return stringBuilder.toString();
        }
        throw null;
    }

    public df(dh dhVar, int i) {
        this.a = dhVar;
        this.f = i;
    }

    /* JADX WARNING: Missing block: B:16:0x002b, code skipped:
            if (r15 == 9) goto L_0x0080;
     */
    /* JADX WARNING: Missing block: B:25:0x0040, code skipped:
            if (r15 != 9) goto L_0x0080;
     */
    /* JADX WARNING: Missing block: B:33:0x0053, code skipped:
            if (r15 != 8) goto L_0x0080;
     */
    /* JADX WARNING: Missing block: B:35:0x0057, code skipped:
            if (r0 != null) goto L_0x0070;
     */
    /* JADX WARNING: Missing block: B:43:0x006e, code skipped:
            if (r9.a.l() != false) goto L_0x0070;
     */
    public final boolean a(defpackage.df r10, int r11, int r12, int r13, int r14, boolean r15) {
        /*
        r9 = this;
        r0 = 0;
        r1 = 2;
        r2 = 0;
        r3 = 1;
        if (r10 == 0) goto L_0x0081;
    L_0x0006:
        if (r15 == 0) goto L_0x000a;
    L_0x0008:
        goto L_0x0070;
    L_0x000a:
        r15 = r10.f;
        r4 = r9.f;
        r5 = 6;
        if (r15 == r4) goto L_0x005b;
    L_0x0011:
        r6 = r4 + -1;
        if (r4 == 0) goto L_0x005a;
    L_0x0015:
        r0 = 8;
        r4 = 4;
        if (r6 == r3) goto L_0x0043;
    L_0x001a:
        r7 = 9;
        r8 = 3;
        if (r6 == r1) goto L_0x002e;
    L_0x001f:
        if (r6 == r8) goto L_0x0043;
    L_0x0021:
        if (r6 == r4) goto L_0x002e;
    L_0x0023:
        if (r6 == r5) goto L_0x0027;
    L_0x0025:
        goto L_0x0080;
    L_0x0027:
        if (r15 == r5) goto L_0x0080;
    L_0x0029:
        if (r15 == r0) goto L_0x0080;
    L_0x002b:
        if (r15 != r7) goto L_0x0070;
    L_0x002d:
        goto L_0x0080;
    L_0x002e:
        if (r15 == r8) goto L_0x0036;
    L_0x0030:
        r0 = 5;
        if (r15 != r0) goto L_0x0034;
    L_0x0033:
        goto L_0x0036;
    L_0x0034:
        r0 = 0;
        goto L_0x0037;
    L_0x0036:
        r0 = 1;
    L_0x0037:
        r1 = r10.a;
        r1 = r1 instanceof defpackage.dj;
        if (r1 != 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0057;
    L_0x003e:
        if (r0 != 0) goto L_0x0070;
    L_0x0040:
        if (r15 == r7) goto L_0x0070;
    L_0x0042:
        goto L_0x0080;
    L_0x0043:
        if (r15 == r1) goto L_0x004a;
    L_0x0045:
        if (r15 != r4) goto L_0x0048;
    L_0x0047:
        goto L_0x004a;
    L_0x0048:
        r1 = 0;
        goto L_0x004b;
    L_0x004a:
        r1 = 1;
    L_0x004b:
        r4 = r10.a;
        r4 = r4 instanceof defpackage.dj;
        if (r4 == 0) goto L_0x0056;
    L_0x0051:
        if (r1 != 0) goto L_0x0070;
    L_0x0053:
        if (r15 != r0) goto L_0x0080;
    L_0x0055:
        goto L_0x0070;
    L_0x0056:
        r0 = r1;
    L_0x0057:
        if (r0 != 0) goto L_0x0070;
    L_0x0059:
        goto L_0x0080;
    L_0x005a:
        throw r0;
    L_0x005b:
        r15 = 7;
        if (r4 == r15) goto L_0x0080;
    L_0x005e:
        if (r4 != r5) goto L_0x0070;
    L_0x0060:
        r15 = r10.a;
        r15 = r15.l();
        if (r15 == 0) goto L_0x0080;
    L_0x0068:
        r15 = r9.a;
        r15 = r15.l();
        if (r15 == 0) goto L_0x0080;
    L_0x0070:
        r9.b = r10;
        if (r11 <= 0) goto L_0x0077;
    L_0x0074:
        r9.c = r11;
        goto L_0x0079;
    L_0x0077:
        r9.c = r2;
    L_0x0079:
        r9.i = r12;
        r9.g = r13;
        r9.d = r14;
        return r3;
    L_0x0080:
        return r2;
    L_0x0081:
        r9.b = r0;
        r9.c = r2;
        r10 = -1;
        r9.i = r10;
        r9.g = r3;
        r9.d = r1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df.a(df, int, int, int, int, boolean):boolean");
    }
}

package defpackage;

import java.util.ArrayList;

/* renamed from: ck */
public final class ck implements Cloneable {
    public static final int[] f = new int[]{1, 2, 3, 4, 5, 6};
    private static final cj h = cj.a(bh.a("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL"));
    public final cj a = h;
    public String b;
    public ArrayList c = new ArrayList();
    public ArrayList d;
    public boolean e;
    private boolean g;

    public ck(String str) {
        a(str);
    }

    public final ck a(String str) {
        this.b = str;
        this.e = false;
        this.c.clear();
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        a(0, 0, 0, 1);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ck ckVar = (ck) obj;
            if (this.a.equals(ckVar.a)) {
                String str = this.b;
                if (str == null ? ckVar.b == null : str.equals(ckVar.b)) {
                    if (this.c.equals(ckVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 37;
        String str = this.b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 37) + this.c.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    public final int a() {
        return this.c.size();
    }

    public final cl a(int i) {
        return (cl) this.c.get(i);
    }

    public final String a(cl clVar) {
        int i = clVar.a;
        return this.b.substring(i, clVar.b + i);
    }

    public final boolean a(cl clVar, String str) {
        return this.b.regionMatches(clVar.a, str, 0, clVar.b);
    }

    public final double b(cl clVar) {
        int i = clVar.e;
        if (i != 13) {
            return i == 14 ? ((Double) this.d.get(clVar.c)).doubleValue() : -1.23456789E8d;
        } else {
            return (double) clVar.c;
        }
    }

    public final int b(int i) {
        int i2 = ((cl) this.c.get(i)).d;
        return i2 >= i ? i2 : i;
    }

    public final Object clone() {
        return b();
    }

    private final ck b() {
        try {
            ck ckVar = (ck) super.clone();
            ckVar.c = (ArrayList) this.c.clone();
            ArrayList arrayList = this.d;
            if (arrayList != null) {
                ckVar.d = (ArrayList) arrayList.clone();
            }
            ckVar.g = false;
            return ckVar;
        } catch (CloneNotSupportedException e) {
            throw new cn(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    private final void a(int r7, int r8, boolean r9) {
        /*
        r6 = this;
        r0 = r7 + 1;
        r1 = r6.b;
        r1 = r1.charAt(r7);
        r2 = 0;
        r3 = 45;
        if (r1 == r3) goto L_0x0022;
    L_0x000d:
        r3 = 43;
        if (r1 == r3) goto L_0x0016;
    L_0x0011:
        r3 = 0;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x002d;
    L_0x0016:
        if (r0 == r8) goto L_0x0079;
    L_0x0018:
        r1 = r0 + 1;
        r3 = r6.b;
        r0 = r3.charAt(r0);
        r3 = 0;
        goto L_0x002d;
    L_0x0022:
        if (r0 == r8) goto L_0x0079;
    L_0x0024:
        r1 = r0 + 1;
        r3 = r6.b;
        r0 = r3.charAt(r0);
        r3 = 1;
    L_0x002d:
        r4 = 8734; // 0x221e float:1.2239E-41 double:4.315E-320;
        if (r0 == r4) goto L_0x0068;
    L_0x0031:
        r9 = 48;
        if (r0 >= r9) goto L_0x0036;
    L_0x0035:
        goto L_0x0059;
    L_0x0036:
        r9 = 57;
        if (r0 > r9) goto L_0x0059;
    L_0x003a:
        r2 = r2 * 10;
        r0 = r0 + -48;
        r2 = r2 + r0;
        r9 = r3 + 32767;
        if (r2 > r9) goto L_0x0059;
    L_0x0043:
        if (r1 == r8) goto L_0x004f;
    L_0x0045:
        r9 = r1 + 1;
        r0 = r6.b;
        r0 = r0.charAt(r1);
        r1 = r9;
        goto L_0x0031;
    L_0x004f:
        r8 = r8 - r7;
        if (r3 == 0) goto L_0x0053;
    L_0x0052:
        r2 = -r2;
    L_0x0053:
        r9 = 13;
        r6.b(r9, r7, r8, r2);
        return;
    L_0x0059:
        r9 = r6.b;
        r9 = r9.substring(r7, r8);
        r0 = java.lang.Double.parseDouble(r9);
        r8 = r8 - r7;
        r6.a(r0, r7, r8);
        return;
    L_0x0068:
        if (r9 != 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0079;
    L_0x006b:
        if (r1 != r8) goto L_0x0079;
    L_0x006d:
        if (r3 != 0) goto L_0x0072;
    L_0x006f:
        r0 = 9218868437227405312; // 0x7ff0000000000000 float:0.0 double:Infinity;
        goto L_0x0074;
    L_0x0072:
        r0 = -4503599627370496; // 0xfff0000000000000 float:0.0 double:-Infinity;
    L_0x0074:
        r8 = r8 - r7;
        r6.a(r0, r7, r8);
        return;
    L_0x0079:
        r9 = new java.lang.NumberFormatException;
        r0 = r6.b;
        r7 = r0.substring(r7, r8);
        r7 = java.lang.String.valueOf(r7);
        r8 = "Bad syntax for numeric value: ";
        r0 = r7.length();
        if (r0 != 0) goto L_0x0093;
    L_0x008d:
        r7 = new java.lang.String;
        r7.<init>(r8);
        goto L_0x0097;
    L_0x0093:
        r7 = r8.concat(r7);
    L_0x0097:
        r9.<init>(r7);
        goto L_0x009c;
    L_0x009b:
        throw r9;
    L_0x009c:
        goto L_0x009b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck.a(int, int, boolean):void");
    }

    private final int d(int i) {
        return bl.a(this.b, i);
    }

    private final int e(int i) {
        return bl.b(this.b, i);
    }

    private final int f(int i) {
        while (i < this.b.length()) {
            char charAt = this.b.charAt(i);
            if ((charAt < '0' && "+-.".indexOf(charAt) < 0) || (charAt > '9' && charAt != 'e' && charAt != 'E' && charAt != 8734)) {
                break;
            }
            i++;
        }
        return i;
    }

    private final boolean g(int i) {
        int i2 = i + 1;
        char charAt = this.b.charAt(i);
        boolean z = false;
        if (charAt == 's' || charAt == 'S') {
            i = i2 + 1;
            char charAt2 = this.b.charAt(i2);
            if (charAt2 == 'e' || charAt2 == 'E') {
                i2 = i + 1;
                charAt = this.b.charAt(i);
                if (charAt == 'l' || charAt == 'L') {
                    i = i2 + 1;
                    charAt2 = this.b.charAt(i2);
                    if (charAt2 == 'e' || charAt2 == 'E') {
                        i2 = i + 1;
                        charAt = this.b.charAt(i);
                        if (charAt == 'c' || charAt == 'C') {
                            charAt = this.b.charAt(i2);
                            if (charAt == 't') {
                                z = true;
                            } else if (charAt != 'T') {
                                return z;
                            } else {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    private final boolean h(int i) {
        return i > 0 || ((cl) this.c.get(0)).e == 1;
    }

    private final void a(double d, int i, int i2) {
        int i3;
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            this.d = new ArrayList();
            i3 = 0;
        } else {
            i3 = arrayList.size();
            if (i3 > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.d.add(Double.valueOf(d));
        b(14, i, i2, i3);
    }

    private static String a(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder(44);
        String str2 = "\"";
        if (i == 0) {
            stringBuilder.append(str2);
        } else {
            stringBuilder.append("[at pattern index ");
            stringBuilder.append(i);
            stringBuilder.append("] \"");
        }
        if (str.length() - i > 24) {
            int i2 = i + 20;
            int i3 = i2 - 1;
            if (Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            stringBuilder.append(str, i, i2);
            stringBuilder.append(" ...");
        } else {
            if (i != 0) {
                str = str.substring(i);
            }
            stringBuilder.append(str);
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private final String i(int i) {
        return ck.a(this.b, i);
    }

    private final String c() {
        return ck.a(this.b, 0);
    }

    public final int c(int i) {
        return ((cl) this.c.get(i)).e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:228:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x01ae A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x01ae A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x01ae A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:80:0x0167, code skipped:
            if (r1.length() != 0) goto L_0x016f;
     */
    /* JADX WARNING: Missing block: B:81:0x0169, code skipped:
            r1 = new java.lang.String(r2);
     */
    /* JADX WARNING: Missing block: B:82:0x016f, code skipped:
            r1 = r2.concat(r1);
     */
    /* JADX WARNING: Missing block: B:84:0x0176, code skipped:
            throw new java.lang.IndexOutOfBoundsException(r1);
     */
    /* JADX WARNING: Missing block: B:349:0x066a, code skipped:
            throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARNING: Missing block: B:431:0x08d6, code skipped:
            r1 = java.lang.String.valueOf(i(r13));
     */
    /* JADX WARNING: Missing block: B:432:0x08e4, code skipped:
            if (r1.length() != 0) goto L_0x08ec;
     */
    /* JADX WARNING: Missing block: B:433:0x08e6, code skipped:
            r1 = new java.lang.String(r3);
     */
    /* JADX WARNING: Missing block: B:434:0x08ec, code skipped:
            r1 = r3.concat(r1);
     */
    /* JADX WARNING: Missing block: B:436:0x08f3, code skipped:
            throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Missing block: B:453:0x0929, code skipped:
            r10 = r13 - 1;
            a(r9, 2, r10, r4, r21);
     */
    /* JADX WARNING: Missing block: B:454:0x0936, code skipped:
            if (r8 == 3) goto L_0x0939;
     */
    /* JADX WARNING: Missing block: B:455:0x0938, code skipped:
            return r13;
     */
    /* JADX WARNING: Missing block: B:456:0x0939, code skipped:
            return r10;
     */
    private final int a(int r19, int r20, int r21, int r22) {
        /*
        r18 = this;
        r6 = r18;
        r0 = r19;
        r1 = r20;
        r7 = r21;
        r8 = r22;
        r2 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r7 > r2) goto L_0x097f;
    L_0x000e:
        r2 = r6.c;
        r9 = r2.size();
        r10 = 1;
        r6.b(r10, r0, r1, r7);
        r0 = r0 + r1;
        r11 = r0;
    L_0x001a:
        r0 = r6.b;
        r0 = r0.length();
        r1 = "Unmatched '{' braces in message ";
        r12 = 3;
        r2 = 0;
        if (r11 >= r0) goto L_0x093e;
    L_0x0026:
        r13 = r11 + 1;
        r0 = r6.b;
        r0 = r0.charAt(r11);
        r3 = 35;
        r4 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r5 = 4;
        r11 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r14 = 39;
        if (r0 != r14) goto L_0x00a9;
    L_0x0039:
        r0 = r6.b;
        r0 = r0.length();
        if (r13 != r0) goto L_0x0046;
    L_0x0041:
        r6.b(r5, r13, r2, r14);
        goto L_0x093a;
    L_0x0046:
        r0 = r6.b;
        r0 = r0.charAt(r13);
        if (r0 != r14) goto L_0x0054;
    L_0x004e:
        r11 = r13 + 1;
        r6.b(r12, r13, r10, r2);
        goto L_0x001a;
    L_0x0054:
        r1 = r6.a;
        r15 = defpackage.cj.DOUBLE_REQUIRED;
        if (r1 != r15) goto L_0x005b;
    L_0x005a:
        goto L_0x0074;
    L_0x005b:
        if (r0 == r4) goto L_0x0074;
    L_0x005d:
        if (r0 == r11) goto L_0x0074;
    L_0x005f:
        if (r8 != r12) goto L_0x0065;
    L_0x0061:
        r1 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        if (r0 == r1) goto L_0x0074;
    L_0x0065:
        r1 = defpackage.cm.b(r22);
        if (r1 != 0) goto L_0x006c;
    L_0x006b:
        goto L_0x006f;
    L_0x006c:
        if (r0 != r3) goto L_0x006f;
    L_0x006e:
        goto L_0x0074;
    L_0x006f:
        r6.b(r5, r13, r2, r14);
        goto L_0x093a;
    L_0x0074:
        r0 = r13 + -1;
        r6.b(r12, r0, r10, r2);
    L_0x0079:
        r0 = r6.b;
        r13 = r13 + r10;
        r0 = r0.indexOf(r14, r13);
        if (r0 < 0) goto L_0x009e;
    L_0x0082:
        r13 = r0 + 1;
        r1 = r6.b;
        r1 = r1.length();
        if (r13 >= r1) goto L_0x0098;
    L_0x008c:
        r1 = r6.b;
        r1 = r1.charAt(r13);
        if (r1 != r14) goto L_0x0098;
    L_0x0094:
        r6.b(r12, r13, r10, r2);
        goto L_0x0079;
    L_0x0098:
        r6.b(r12, r0, r10, r2);
        r11 = r13;
        goto L_0x001a;
    L_0x009e:
        r0 = r6.b;
        r11 = r0.length();
        r6.b(r5, r11, r2, r14);
        goto L_0x001a;
    L_0x00a9:
        r15 = defpackage.cm.b(r22);
        if (r15 == 0) goto L_0x00b9;
    L_0x00af:
        if (r0 != r3) goto L_0x00b9;
    L_0x00b1:
        r0 = 5;
        r1 = r13 + -1;
        r6.b(r0, r1, r10, r2);
        goto L_0x093a;
    L_0x00b9:
        if (r0 != r4) goto L_0x0914;
    L_0x00bb:
        r13 = r13 + -1;
        r0 = r6.c;
        r15 = r0.size();
        r0 = 6;
        r6.b(r0, r13, r10, r2);
        r13 = r13 + r10;
        r13 = r6.d(r13);
        r5 = r6.b;
        r5 = r5.length();
        if (r13 != r5) goto L_0x00f2;
    L_0x00d4:
        r0 = new java.lang.IllegalArgumentException;
        r2 = r18.c();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 != 0) goto L_0x00ea;
    L_0x00e4:
        r2 = new java.lang.String;
        r2.<init>(r1);
        goto L_0x00ee;
    L_0x00ea:
        r2 = r1.concat(r2);
    L_0x00ee:
        r0.<init>(r2);
        throw r0;
    L_0x00f2:
        r5 = r6.e(r13);
        r3 = r6.b;
        r12 = -1;
        if (r13 >= r5) goto L_0x0140;
    L_0x00fb:
        r4 = r13 + 1;
        r14 = r3.charAt(r13);
        r0 = 48;
        if (r14 == r0) goto L_0x0114;
    L_0x0105:
        r0 = 49;
        if (r14 >= r0) goto L_0x010b;
    L_0x0109:
        r0 = -1;
        goto L_0x0141;
    L_0x010b:
        r0 = 57;
        if (r14 > r0) goto L_0x0109;
    L_0x010f:
        r0 = r14 + -48;
        r14 = r0;
        r0 = 0;
        goto L_0x011a;
    L_0x0114:
        if (r4 != r5) goto L_0x0118;
    L_0x0116:
        r0 = 0;
        goto L_0x0141;
    L_0x0118:
        r0 = 1;
        r14 = 0;
    L_0x011a:
        if (r4 >= r5) goto L_0x013b;
    L_0x011c:
        r16 = r4 + 1;
        r4 = r3.charAt(r4);
        r11 = 48;
        if (r4 < r11) goto L_0x0109;
    L_0x0126:
        r11 = 57;
        if (r4 > r11) goto L_0x0109;
    L_0x012a:
        r11 = 214748364; // 0xccccccc float:3.1554434E-31 double:1.06099789E-315;
        if (r14 >= r11) goto L_0x0130;
    L_0x012f:
        goto L_0x0131;
    L_0x0130:
        r0 = 1;
    L_0x0131:
        r14 = r14 * 10;
        r4 = r4 + -48;
        r14 = r14 + r4;
        r4 = r16;
        r11 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x011a;
    L_0x013b:
        if (r0 == 0) goto L_0x013e;
    L_0x013d:
        goto L_0x0140;
    L_0x013e:
        r0 = r14;
        goto L_0x0141;
    L_0x0140:
        r0 = -2;
    L_0x0141:
        r3 = "Bad argument syntax: ";
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r0 < 0) goto L_0x0177;
    L_0x0148:
        r11 = r5 - r13;
        if (r11 > r4) goto L_0x0157;
    L_0x014c:
        r14 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r0 <= r14) goto L_0x0151;
    L_0x0150:
        goto L_0x0157;
    L_0x0151:
        r14 = 8;
        r6.b(r14, r13, r11, r0);
        goto L_0x01a2;
    L_0x0157:
        r0 = new java.lang.IndexOutOfBoundsException;
        r1 = r6.i(r13);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Argument number too large: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x016f;
    L_0x0169:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0173;
    L_0x016f:
        r1 = r2.concat(r1);
    L_0x0173:
        r0.<init>(r1);
        throw r0;
    L_0x0177:
        if (r0 == r12) goto L_0x0197;
    L_0x0179:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r13);
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 != 0) goto L_0x018f;
    L_0x0189:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x0193;
    L_0x018f:
        r1 = r3.concat(r1);
    L_0x0193:
        r0.<init>(r1);
        throw r0;
    L_0x0197:
        r0 = r5 - r13;
        if (r0 > r4) goto L_0x08f4;
    L_0x019b:
        r6.e = r10;
        r11 = 9;
        r6.b(r11, r13, r0, r2);
    L_0x01a2:
        r0 = r6.d(r5);
        r5 = r6.b;
        r5 = r5.length();
        if (r0 != r5) goto L_0x01cc;
    L_0x01ae:
        r0 = new java.lang.IllegalArgumentException;
        r2 = r18.c();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 != 0) goto L_0x01c4;
    L_0x01be:
        r2 = new java.lang.String;
        r2.<init>(r1);
        goto L_0x01c8;
    L_0x01c4:
        r2 = r1.concat(r2);
    L_0x01c8:
        r0.<init>(r2);
        throw r0;
    L_0x01cc:
        r5 = r6.b;
        r5 = r5.charAt(r0);
        r11 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r5 != r11) goto L_0x01da;
    L_0x01d6:
        r10 = r0;
        r0 = 1;
        goto L_0x08a5;
    L_0x01da:
        r11 = 44;
        if (r5 == r11) goto L_0x01fc;
    L_0x01de:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r13);
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 != 0) goto L_0x01f4;
    L_0x01ee:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x01f8;
    L_0x01f4:
        r1 = r3.concat(r1);
    L_0x01f8:
        r0.<init>(r1);
        throw r0;
    L_0x01fc:
        r0 = r0 + 1;
        r0 = r6.d(r0);
        r5 = r0;
    L_0x0203:
        r11 = r6.b;
        r11 = r11.length();
        r14 = 65;
        if (r5 < r11) goto L_0x020e;
    L_0x020d:
        goto L_0x0227;
    L_0x020e:
        r11 = r6.b;
        r11 = r11.charAt(r5);
        r12 = 97;
        if (r11 < r12) goto L_0x021d;
    L_0x0218:
        r12 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r11 > r12) goto L_0x021d;
    L_0x021c:
        goto L_0x0223;
    L_0x021d:
        if (r11 < r14) goto L_0x0227;
    L_0x021f:
        r12 = 90;
        if (r11 > r12) goto L_0x0227;
    L_0x0223:
        r5 = r5 + 1;
        r12 = -1;
        goto L_0x0203;
    L_0x0227:
        r11 = r5 - r0;
        r5 = r6.d(r5);
        r12 = r6.b;
        r12 = r12.length();
        if (r5 != r12) goto L_0x0253;
    L_0x0235:
        r0 = new java.lang.IllegalArgumentException;
        r2 = r18.c();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 != 0) goto L_0x024b;
    L_0x0245:
        r2 = new java.lang.String;
        r2.<init>(r1);
        goto L_0x024f;
    L_0x024b:
        r2 = r1.concat(r2);
    L_0x024f:
        r0.<init>(r2);
        throw r0;
    L_0x0253:
        if (r11 == 0) goto L_0x08d6;
    L_0x0255:
        r12 = r6.b;
        r12 = r12.charAt(r5);
        r10 = 44;
        if (r12 == r10) goto L_0x0263;
    L_0x025f:
        r10 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r12 != r10) goto L_0x08d6;
    L_0x0263:
        if (r11 > r4) goto L_0x08b6;
    L_0x0265:
        r10 = 6;
        if (r11 != r10) goto L_0x033b;
    L_0x0268:
        r10 = r0 + 1;
        r4 = r6.b;
        r4 = r4.charAt(r0);
        r2 = 99;
        if (r4 != r2) goto L_0x0275;
    L_0x0274:
        goto L_0x0279;
    L_0x0275:
        r2 = 67;
        if (r4 != r2) goto L_0x02cf;
    L_0x0279:
        r2 = r10 + 1;
        r4 = r6.b;
        r4 = r4.charAt(r10);
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r4 != r3) goto L_0x0286;
    L_0x0285:
        goto L_0x028a;
    L_0x0286:
        r3 = 72;
        if (r4 != r3) goto L_0x02cf;
    L_0x028a:
        r3 = r2 + 1;
        r4 = r6.b;
        r2 = r4.charAt(r2);
        r4 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r2 != r4) goto L_0x0297;
    L_0x0296:
        goto L_0x029b;
    L_0x0297:
        r4 = 79;
        if (r2 != r4) goto L_0x02cf;
    L_0x029b:
        r2 = r3 + 1;
        r4 = r6.b;
        r3 = r4.charAt(r3);
        r4 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r3 != r4) goto L_0x02a8;
    L_0x02a7:
        goto L_0x02ac;
    L_0x02a8:
        r4 = 73;
        if (r3 != r4) goto L_0x02cf;
    L_0x02ac:
        r3 = r2 + 1;
        r4 = r6.b;
        r2 = r4.charAt(r2);
        r4 = 99;
        if (r2 != r4) goto L_0x02b9;
    L_0x02b8:
        goto L_0x02bd;
    L_0x02b9:
        r4 = 67;
        if (r2 != r4) goto L_0x02cf;
    L_0x02bd:
        r2 = r6.b;
        r2 = r2.charAt(r3);
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r2 == r3) goto L_0x02cc;
    L_0x02c7:
        r3 = 69;
        if (r2 == r3) goto L_0x02cc;
    L_0x02cb:
        goto L_0x02cf;
    L_0x02cc:
        r10 = 3;
        goto L_0x03c4;
    L_0x02cf:
        r2 = r6.b;
        r2 = r2.charAt(r0);
        r3 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        if (r2 != r3) goto L_0x02da;
    L_0x02d9:
        goto L_0x02de;
    L_0x02da:
        r3 = 80;
        if (r2 != r3) goto L_0x0331;
    L_0x02de:
        r2 = r10 + 1;
        r3 = r6.b;
        r3 = r3.charAt(r10);
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r3 != r4) goto L_0x02eb;
    L_0x02ea:
        goto L_0x02ef;
    L_0x02eb:
        r4 = 76;
        if (r3 != r4) goto L_0x0331;
    L_0x02ef:
        r3 = r2 + 1;
        r4 = r6.b;
        r2 = r4.charAt(r2);
        r4 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        if (r2 != r4) goto L_0x02fc;
    L_0x02fb:
        goto L_0x0300;
    L_0x02fc:
        r4 = 85;
        if (r2 != r4) goto L_0x0331;
    L_0x0300:
        r2 = r3 + 1;
        r4 = r6.b;
        r3 = r4.charAt(r3);
        r4 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        if (r3 != r4) goto L_0x030d;
    L_0x030c:
        goto L_0x0311;
    L_0x030d:
        r4 = 82;
        if (r3 != r4) goto L_0x0331;
    L_0x0311:
        r3 = r2 + 1;
        r4 = r6.b;
        r2 = r4.charAt(r2);
        r4 = 97;
        if (r2 != r4) goto L_0x031e;
    L_0x031d:
        goto L_0x0320;
    L_0x031e:
        if (r2 != r14) goto L_0x0331;
    L_0x0320:
        r2 = r6.b;
        r2 = r2.charAt(r3);
        r3 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r2 != r3) goto L_0x032d;
    L_0x032a:
        r10 = 4;
        goto L_0x03c4;
    L_0x032d:
        r3 = 76;
        if (r2 == r3) goto L_0x032a;
    L_0x0331:
        r2 = r6.g(r0);
        if (r2 == 0) goto L_0x03c3;
    L_0x0337:
        r2 = 5;
        r10 = 5;
        goto L_0x03c4;
    L_0x033b:
        r2 = 13;
        if (r11 != r2) goto L_0x03c3;
    L_0x033f:
        r2 = r6.g(r0);
        if (r2 == 0) goto L_0x03c3;
    L_0x0345:
        r2 = r0 + 6;
        r3 = r2 + 1;
        r4 = r6.b;
        r2 = r4.charAt(r2);
        r4 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r2 != r4) goto L_0x0354;
    L_0x0353:
        goto L_0x035a;
    L_0x0354:
        r4 = 79;
        if (r2 == r4) goto L_0x035a;
    L_0x0358:
        goto L_0x03c3;
    L_0x035a:
        r2 = r3 + 1;
        r4 = r6.b;
        r3 = r4.charAt(r3);
        r4 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        if (r3 != r4) goto L_0x0367;
    L_0x0366:
        goto L_0x036c;
    L_0x0367:
        r4 = 82;
        if (r3 == r4) goto L_0x036c;
    L_0x036b:
        goto L_0x03c3;
    L_0x036c:
        r3 = r2 + 1;
        r4 = r6.b;
        r2 = r4.charAt(r2);
        r4 = 100;
        if (r2 != r4) goto L_0x0379;
    L_0x0378:
        goto L_0x037e;
    L_0x0379:
        r4 = 68;
        if (r2 == r4) goto L_0x037e;
    L_0x037d:
        goto L_0x03c3;
    L_0x037e:
        r2 = r3 + 1;
        r4 = r6.b;
        r3 = r4.charAt(r3);
        r4 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r3 != r4) goto L_0x038b;
    L_0x038a:
        goto L_0x0390;
    L_0x038b:
        r4 = 73;
        if (r3 == r4) goto L_0x0390;
    L_0x038f:
        goto L_0x03c3;
    L_0x0390:
        r3 = r2 + 1;
        r4 = r6.b;
        r2 = r4.charAt(r2);
        r4 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r2 != r4) goto L_0x039d;
    L_0x039c:
        goto L_0x03a2;
    L_0x039d:
        r4 = 78;
        if (r2 == r4) goto L_0x03a2;
    L_0x03a1:
        goto L_0x03c3;
    L_0x03a2:
        r2 = r3 + 1;
        r4 = r6.b;
        r3 = r4.charAt(r3);
        r4 = 97;
        if (r3 != r4) goto L_0x03af;
    L_0x03ae:
        goto L_0x03b2;
    L_0x03af:
        if (r3 == r14) goto L_0x03b2;
    L_0x03b1:
        goto L_0x03c3;
    L_0x03b2:
        r3 = r6.b;
        r2 = r3.charAt(r2);
        r3 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r2 == r3) goto L_0x03c1;
    L_0x03bc:
        r3 = 76;
        if (r2 == r3) goto L_0x03c1;
    L_0x03c0:
        goto L_0x03c3;
    L_0x03c1:
        r10 = 6;
        goto L_0x03c4;
    L_0x03c3:
        r10 = 2;
    L_0x03c4:
        r2 = r6.c;
        r2 = r2.get(r15);
        r2 = (defpackage.cl) r2;
        r3 = r10 + -1;
        r3 = (short) r3;
        r2.c = r3;
        r2 = 2;
        if (r10 != r2) goto L_0x03da;
    L_0x03d4:
        r3 = 10;
        r4 = 0;
        r6.b(r3, r0, r11, r4);
    L_0x03da:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r12 == r0) goto L_0x0880;
    L_0x03de:
        r5 = r5 + 1;
        if (r10 != r2) goto L_0x0486;
    L_0x03e2:
        r0 = r5;
        r2 = 0;
    L_0x03e4:
        r3 = r6.b;
        r3 = r3.length();
        if (r0 >= r3) goto L_0x0468;
    L_0x03ec:
        r3 = r0 + 1;
        r4 = r6.b;
        r0 = r4.charAt(r0);
        r4 = 39;
        if (r0 != r4) goto L_0x0423;
    L_0x03f8:
        r0 = r6.b;
        r0 = r0.indexOf(r4, r3);
        if (r0 >= 0) goto L_0x0420;
    L_0x0400:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r5);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Quoted literal argument style text reaches to the end of the message: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0418;
    L_0x0412:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x041c;
    L_0x0418:
        r1 = r2.concat(r1);
    L_0x041c:
        r0.<init>(r1);
        throw r0;
    L_0x0420:
        r0 = r0 + 1;
        goto L_0x03e4;
    L_0x0423:
        r4 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r0 != r4) goto L_0x042b;
    L_0x0427:
        r2 = r2 + 1;
    L_0x0429:
        r0 = r3;
        goto L_0x03e4;
    L_0x042b:
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r0 == r4) goto L_0x0430;
    L_0x042f:
        goto L_0x0429;
    L_0x0430:
        if (r2 > 0) goto L_0x0465;
    L_0x0432:
        r3 = r3 + -1;
        r0 = r3 - r5;
        r1 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r0 <= r1) goto L_0x045b;
    L_0x043b:
        r0 = new java.lang.IndexOutOfBoundsException;
        r1 = r6.i(r5);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Argument style text too long: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0453;
    L_0x044d:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0457;
    L_0x0453:
        r1 = r2.concat(r1);
    L_0x0457:
        r0.<init>(r1);
        throw r0;
    L_0x045b:
        r1 = 11;
        r2 = 0;
        r6.b(r1, r5, r0, r2);
        r0 = r10;
        r10 = r3;
        goto L_0x08a5;
    L_0x0465:
        r2 = r2 + -1;
        goto L_0x0429;
    L_0x0468:
        r0 = new java.lang.IllegalArgumentException;
        r2 = r18.c();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 != 0) goto L_0x047e;
    L_0x0478:
        r2 = new java.lang.String;
        r2.<init>(r1);
        goto L_0x0482;
    L_0x047e:
        r2 = r1.concat(r2);
    L_0x0482:
        r0.<init>(r2);
        throw r0;
    L_0x0486:
        r0 = 3;
        if (r10 == r0) goto L_0x073b;
    L_0x0489:
        r0 = r5;
        r1 = 0;
        r2 = 1;
    L_0x048c:
        r0 = r6.d(r0);
        r3 = r6.b;
        r3 = r3.length();
        if (r0 == r3) goto L_0x049a;
    L_0x0498:
        r4 = 0;
        goto L_0x049b;
    L_0x049a:
        r4 = 1;
    L_0x049b:
        if (r0 == r3) goto L_0x06ab;
    L_0x049d:
        r3 = r6.b;
        r3 = r3.charAt(r0);
        r11 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r3 != r11) goto L_0x04a9;
    L_0x04a7:
        goto L_0x06ab;
    L_0x04a9:
        r3 = defpackage.cm.b(r10);
        if (r3 == 0) goto L_0x0534;
    L_0x04af:
        r3 = r6.b;
        r3 = r3.charAt(r0);
        r4 = 61;
        if (r3 != r4) goto L_0x0534;
    L_0x04b9:
        r2 = r0 + 1;
        r3 = r6.f(r2);
        r4 = r3 - r0;
        r11 = 1;
        if (r4 == r11) goto L_0x04f4;
    L_0x04c4:
        r11 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r4 <= r11) goto L_0x04e9;
    L_0x04c9:
        r1 = new java.lang.IndexOutOfBoundsException;
        r0 = r6.i(r0);
        r0 = java.lang.String.valueOf(r0);
        r2 = "Argument selector too long: ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x04e1;
    L_0x04db:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x04e5;
    L_0x04e1:
        r0 = r2.concat(r0);
    L_0x04e5:
        r1.<init>(r0);
        throw r1;
    L_0x04e9:
        r11 = 12;
        r12 = 0;
        r6.b(r11, r0, r4, r12);
        r6.a(r2, r3, r12);
        goto L_0x060b;
    L_0x04f4:
        r0 = new java.lang.IllegalArgumentException;
        r1 = defpackage.cm.a(r10);
        r2 = java.util.Locale.ENGLISH;
        r1 = r1.toLowerCase(r2);
        r2 = r6.i(r5);
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r3 = r3 + 21;
        r3 = r3 + r4;
        r5.<init>(r3);
        r3 = "Bad ";
        r5.append(r3);
        r5.append(r1);
        r1 = " pattern syntax: ";
        r5.append(r1);
        r5.append(r2);
        r1 = r5.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0534:
        r3 = r6.e(r0);
        r4 = r3 - r0;
        if (r4 == 0) goto L_0x066b;
    L_0x053c:
        r11 = defpackage.cm.b(r10);
        if (r11 == 0) goto L_0x05d4;
    L_0x0542:
        r11 = 6;
        if (r4 != r11) goto L_0x05d4;
    L_0x0545:
        r12 = r6.b;
        r12 = r12.length();
        if (r3 >= r12) goto L_0x05d4;
    L_0x054d:
        r12 = r6.b;
        r13 = 7;
        r14 = "offset:";
        r11 = 0;
        r12 = r12.regionMatches(r0, r14, r11, r13);
        if (r12 == 0) goto L_0x05d4;
    L_0x0559:
        if (r2 != 0) goto L_0x057b;
    L_0x055b:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r5);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Plural argument 'offset:' (if present) must precede key-message pairs: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0573;
    L_0x056d:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0577;
    L_0x0573:
        r1 = r2.concat(r1);
    L_0x0577:
        r0.<init>(r1);
        throw r0;
    L_0x057b:
        r3 = r3 + 1;
        r0 = r6.d(r3);
        r2 = r6.f(r0);
        if (r2 != r0) goto L_0x05a7;
    L_0x0587:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r5);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Missing value for plural 'offset:' ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x059f;
    L_0x0599:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x05a3;
    L_0x059f:
        r1 = r2.concat(r1);
    L_0x05a3:
        r0.<init>(r1);
        throw r0;
    L_0x05a7:
        r3 = r2 - r0;
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 <= r4) goto L_0x05ce;
    L_0x05ae:
        r1 = new java.lang.IndexOutOfBoundsException;
        r0 = r6.i(r0);
        r0 = java.lang.String.valueOf(r0);
        r2 = "Plural offset value too long: ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x05c6;
    L_0x05c0:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x05ca;
    L_0x05c6:
        r0 = r2.concat(r0);
    L_0x05ca:
        r1.<init>(r0);
        throw r1;
    L_0x05ce:
        r3 = 0;
        r6.a(r0, r2, r3);
        r0 = r2;
        goto L_0x0628;
    L_0x05d4:
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r4 <= r2) goto L_0x05f9;
    L_0x05d9:
        r1 = new java.lang.IndexOutOfBoundsException;
        r0 = r6.i(r0);
        r0 = java.lang.String.valueOf(r0);
        r2 = "Argument selector too long: ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x05f1;
    L_0x05eb:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x05f5;
    L_0x05f1:
        r0 = r2.concat(r0);
    L_0x05f5:
        r1.<init>(r0);
        throw r1;
    L_0x05f9:
        r2 = 12;
        r11 = 0;
        r6.b(r2, r0, r4, r11);
        r2 = r6.b;
        r12 = "other";
        r2 = r2.regionMatches(r0, r12, r11, r4);
        if (r2 != 0) goto L_0x060a;
    L_0x0609:
        goto L_0x060b;
    L_0x060a:
        r1 = 1;
    L_0x060b:
        r2 = r6.d(r3);
        r3 = r6.b;
        r3 = r3.length();
        if (r2 == r3) goto L_0x062b;
    L_0x0617:
        r3 = r6.b;
        r3 = r3.charAt(r2);
        r4 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r3 != r4) goto L_0x062b;
    L_0x0621:
        r0 = r7 + 1;
        r3 = 1;
        r0 = r6.a(r2, r3, r0, r10);
    L_0x0628:
        r2 = 0;
        goto L_0x048c;
    L_0x062b:
        r1 = new java.lang.IllegalArgumentException;
        r2 = defpackage.cm.a(r10);
        r3 = java.util.Locale.ENGLISH;
        r2 = r2.toLowerCase(r3);
        r0 = r6.i(r0);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r4 = java.lang.String.valueOf(r0);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r3 = r3 + 37;
        r3 = r3 + r4;
        r5.<init>(r3);
        r3 = "No message fragment after ";
        r5.append(r3);
        r5.append(r2);
        r2 = " selector: ";
        r5.append(r2);
        r5.append(r0);
        r0 = r5.toString();
        r1.<init>(r0);
        throw r1;
    L_0x066b:
        r0 = new java.lang.IllegalArgumentException;
        r1 = defpackage.cm.a(r10);
        r2 = java.util.Locale.ENGLISH;
        r1 = r1.toLowerCase(r2);
        r2 = r6.i(r5);
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r3 = r3 + 21;
        r3 = r3 + r4;
        r5.<init>(r3);
        r3 = "Bad ";
        r5.append(r3);
        r5.append(r1);
        r1 = " pattern syntax: ";
        r5.append(r1);
        r5.append(r2);
        r1 = r5.toString();
        r0.<init>(r1);
        throw r0;
    L_0x06ab:
        r2 = r6.h(r7);
        if (r4 == r2) goto L_0x06fb;
    L_0x06b1:
        if (r1 == 0) goto L_0x06ba;
    L_0x06b3:
        r17 = r10;
        r10 = r0;
        r0 = r17;
        goto L_0x08a5;
    L_0x06ba:
        r0 = new java.lang.IllegalArgumentException;
        r1 = defpackage.cm.a(r10);
        r2 = java.util.Locale.ENGLISH;
        r1 = r1.toLowerCase(r2);
        r2 = r18.c();
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r7 = 39;
        r3 = r3 + r7;
        r3 = r3 + r4;
        r5.<init>(r3);
        r3 = "Missing 'other' keyword in ";
        r5.append(r3);
        r5.append(r1);
        r1 = " pattern in ";
        r5.append(r1);
        r5.append(r2);
        r1 = r5.toString();
        r0.<init>(r1);
        throw r0;
    L_0x06fb:
        r0 = new java.lang.IllegalArgumentException;
        r1 = defpackage.cm.a(r10);
        r2 = java.util.Locale.ENGLISH;
        r1 = r1.toLowerCase(r2);
        r2 = r6.i(r5);
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r3 = r3 + 21;
        r3 = r3 + r4;
        r5.<init>(r3);
        r3 = "Bad ";
        r5.append(r3);
        r5.append(r1);
        r1 = " pattern syntax: ";
        r5.append(r1);
        r5.append(r2);
        r1 = r5.toString();
        r0.<init>(r1);
        throw r0;
    L_0x073b:
        r0 = r6.d(r5);
        r1 = r6.b;
        r1 = r1.length();
        if (r0 == r1) goto L_0x0860;
    L_0x0747:
        r1 = r6.b;
        r1 = r1.charAt(r0);
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r1 != r2) goto L_0x0753;
    L_0x0751:
        goto L_0x0860;
    L_0x0753:
        r1 = r6.f(r0);
        r2 = r1 - r0;
        if (r2 != 0) goto L_0x077b;
    L_0x075b:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r5);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Bad choice pattern syntax: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0773;
    L_0x076d:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0777;
    L_0x0773:
        r1 = r2.concat(r1);
    L_0x0777:
        r0.<init>(r1);
        throw r0;
    L_0x077b:
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r2 <= r3) goto L_0x07a0;
    L_0x0780:
        r1 = new java.lang.IndexOutOfBoundsException;
        r0 = r6.i(r0);
        r0 = java.lang.String.valueOf(r0);
        r2 = "Choice number too long: ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x0798;
    L_0x0792:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x079c;
    L_0x0798:
        r0 = r2.concat(r0);
    L_0x079c:
        r1.<init>(r0);
        throw r1;
    L_0x07a0:
        r2 = 1;
        r6.a(r0, r1, r2);
        r0 = r6.d(r1);
        r1 = r6.b;
        r1 = r1.length();
        if (r0 != r1) goto L_0x07d0;
    L_0x07b0:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r5);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Bad choice pattern syntax: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x07c8;
    L_0x07c2:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x07cc;
    L_0x07c8:
        r1 = r2.concat(r1);
    L_0x07cc:
        r0.<init>(r1);
        throw r0;
    L_0x07d0:
        r1 = r6.b;
        r1 = r1.charAt(r0);
        r2 = 35;
        if (r1 != r2) goto L_0x07db;
    L_0x07da:
        goto L_0x0810;
    L_0x07db:
        r4 = 60;
        if (r1 == r4) goto L_0x0810;
    L_0x07df:
        r4 = 8804; // 0x2264 float:1.2337E-41 double:4.35E-320;
        if (r1 != r4) goto L_0x07e4;
    L_0x07e3:
        goto L_0x0810;
    L_0x07e4:
        r0 = new java.lang.IllegalArgumentException;
        r2 = r6.i(r5);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + r14;
        r4.<init>(r3);
        r3 = "Expected choice separator (#<≤) instead of '";
        r4.append(r3);
        r4.append(r1);
        r1 = "' in choice pattern ";
        r4.append(r1);
        r4.append(r2);
        r1 = r4.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0810:
        r1 = 12;
        r4 = 0;
        r11 = 1;
        r6.b(r1, r0, r11, r4);
        r0 = r0 + 1;
        r1 = r7 + 1;
        r11 = 3;
        r0 = r6.a(r0, r4, r1, r11);
        r1 = r6.b;
        r1 = r1.length();
        if (r0 == r1) goto L_0x06b3;
    L_0x0828:
        r1 = r6.b;
        r1 = r1.charAt(r0);
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r1 != r4) goto L_0x0858;
    L_0x0832:
        r1 = r6.h(r7);
        if (r1 != 0) goto L_0x06b3;
    L_0x0838:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r5);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Bad choice pattern syntax: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0850;
    L_0x084a:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0854;
    L_0x0850:
        r1 = r2.concat(r1);
    L_0x0854:
        r0.<init>(r1);
        throw r0;
    L_0x0858:
        r0 = r0 + 1;
        r0 = r6.d(r0);
        goto L_0x0753;
    L_0x0860:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r18.c();
        r1 = java.lang.String.valueOf(r1);
        r2 = "Missing choice argument pattern in ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0878;
    L_0x0872:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x087c;
    L_0x0878:
        r1 = r2.concat(r1);
    L_0x087c:
        r0.<init>(r1);
        throw r0;
    L_0x0880:
        r0 = 2;
        if (r10 == r0) goto L_0x08a3;
    L_0x0883:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r13);
        r1 = java.lang.String.valueOf(r1);
        r2 = "No style field for complex argument: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x089b;
    L_0x0895:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x089f;
    L_0x089b:
        r1 = r2.concat(r1);
    L_0x089f:
        r0.<init>(r1);
        throw r0;
    L_0x08a3:
        r0 = r10;
        r10 = r5;
    L_0x08a5:
        r2 = 7;
        r4 = 1;
        r1 = -1;
        r5 = r0 + -1;
        r0 = r18;
        r1 = r15;
        r3 = r10;
        r0.a(r1, r2, r3, r4, r5);
        r0 = 1;
        r11 = r10 + 1;
        goto L_0x093b;
    L_0x08b6:
        r0 = new java.lang.IndexOutOfBoundsException;
        r1 = r6.i(r13);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Argument type name too long: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x08ce;
    L_0x08c8:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x08d2;
    L_0x08ce:
        r1 = r2.concat(r1);
    L_0x08d2:
        r0.<init>(r1);
        throw r0;
    L_0x08d6:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.i(r13);
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 != 0) goto L_0x08ec;
    L_0x08e6:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x08f0;
    L_0x08ec:
        r1 = r3.concat(r1);
    L_0x08f0:
        r0.<init>(r1);
        throw r0;
    L_0x08f4:
        r0 = new java.lang.IndexOutOfBoundsException;
        r1 = r6.i(r13);
        r1 = java.lang.String.valueOf(r1);
        r2 = "Argument name too long: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x090c;
    L_0x0906:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0910;
    L_0x090c:
        r1 = r2.concat(r1);
    L_0x0910:
        r0.<init>(r1);
        throw r0;
    L_0x0914:
        r1 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r2 = 3;
        if (r7 <= 0) goto L_0x091b;
    L_0x0919:
        if (r0 == r1) goto L_0x0921;
    L_0x091b:
        if (r8 != r2) goto L_0x093a;
    L_0x091d:
        r3 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        if (r0 != r3) goto L_0x093a;
    L_0x0921:
        if (r8 == r2) goto L_0x0925;
    L_0x0923:
        r4 = 1;
        goto L_0x0929;
    L_0x0925:
        if (r0 == r1) goto L_0x0928;
    L_0x0927:
        goto L_0x0923;
    L_0x0928:
        r4 = 0;
    L_0x0929:
        r10 = r13 + -1;
        r2 = 2;
        r0 = r18;
        r1 = r9;
        r3 = r10;
        r5 = r21;
        r0.a(r1, r2, r3, r4, r5);
        r0 = 3;
        if (r8 == r0) goto L_0x0939;
    L_0x0938:
        return r13;
    L_0x0939:
        return r10;
    L_0x093a:
        r11 = r13;
    L_0x093b:
        r10 = 1;
        goto L_0x001a;
    L_0x093e:
        r0 = 3;
        if (r7 > 0) goto L_0x0942;
    L_0x0941:
        goto L_0x0955;
    L_0x0942:
        r2 = 1;
        if (r7 != r2) goto L_0x0961;
    L_0x0945:
        if (r8 == r0) goto L_0x0948;
    L_0x0947:
        goto L_0x0961;
    L_0x0948:
        r0 = r6.c;
        r3 = 0;
        r0 = r0.get(r3);
        r0 = (defpackage.cl) r0;
        r0 = r0.e;
        if (r0 == r2) goto L_0x0961;
    L_0x0955:
        r2 = 2;
        r4 = 0;
        r0 = r18;
        r1 = r9;
        r3 = r11;
        r5 = r21;
        r0.a(r1, r2, r3, r4, r5);
        return r11;
    L_0x0961:
        r0 = new java.lang.IllegalArgumentException;
        r2 = r18.c();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 != 0) goto L_0x0977;
    L_0x0971:
        r2 = new java.lang.String;
        r2.<init>(r1);
        goto L_0x097b;
    L_0x0977:
        r2 = r1.concat(r2);
    L_0x097b:
        r0.<init>(r2);
        throw r0;
    L_0x097f:
        r0 = new java.lang.IndexOutOfBoundsException;
        r0.<init>();
        goto L_0x0986;
    L_0x0985:
        throw r0;
    L_0x0986:
        goto L_0x0985;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck.a(int, int, int, int):int");
    }

    private final void b(int i, int i2, int i3, int i4) {
        this.c.add(new cl(i, i2, i3, i4));
    }

    private final void a(int i, int i2, int i3, int i4, int i5) {
        ((cl) this.c.get(i)).d = this.c.size();
        b(i2, i3, i4, i5);
    }
}

package defpackage;

/* renamed from: anab */
public abstract class anab extends amzz {
    private static final String a;

    public abstract int a(anaa anaa, int i, String str, int i2, int i3, int i4);

    public final void a(StringBuilder stringBuilder, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    stringBuilder.append(str, i3, i4);
                } else if (charAt == 'n') {
                    stringBuilder.append(str, i3, i4 - 1);
                    stringBuilder.append(a);
                }
                i3 = i4 + 1;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            stringBuilder.append(str, i3, i2);
        }
    }

    /* JADX WARNING: Missing block: B:13:0x003b, code skipped:
            if (r3 != '$') goto L_0x006d;
     */
    /* JADX WARNING: Missing block: B:15:0x0040, code skipped:
            if (((r6 - 1) - r2) == 0) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:17:0x0048, code skipped:
            if (r7.charAt(r2) == '0') goto L_0x005f;
     */
    /* JADX WARNING: Missing block: B:18:0x004a, code skipped:
            r5 = r5 - 1;
     */
    /* JADX WARNING: Missing block: B:19:0x0050, code skipped:
            if (r6 == r7.length()) goto L_0x005a;
     */
    /* JADX WARNING: Missing block: B:20:0x0052, code skipped:
            r0 = r6 + 1;
            r7.charAt(r6);
            r12 = r1;
            r11 = r5;
     */
    /* JADX WARNING: Missing block: B:22:0x005e, code skipped:
            throw defpackage.anac.b(r10, r7, r4);
     */
    /* JADX WARNING: Missing block: B:24:0x0065, code skipped:
            throw defpackage.anac.a("index has leading zero", r7, r4, r6);
     */
    /* JADX WARNING: Missing block: B:26:0x006c, code skipped:
            throw defpackage.anac.a("missing index", r7, r4, r6);
     */
    /* JADX WARNING: Missing block: B:28:0x006f, code skipped:
            if (r3 == '<') goto L_0x0078;
     */
    /* JADX WARNING: Missing block: B:29:0x0071, code skipped:
            r12 = r1 + 1;
            r11 = r1;
            r5 = r2;
            r0 = r6;
     */
    /* JADX WARNING: Missing block: B:30:0x0078, code skipped:
            if (r0 == -1) goto L_0x00bb;
     */
    /* JADX WARNING: Missing block: B:32:0x007e, code skipped:
            if (r6 == r7.length()) goto L_0x00b6;
     */
    /* JADX WARNING: Missing block: B:33:0x0080, code skipped:
            r2 = r6 + 1;
            r7.charAt(r6);
            r11 = r0;
            r12 = r1;
            r0 = r2;
     */
    /* JADX WARNING: Missing block: B:34:0x0088, code skipped:
            r5 = r6;
     */
    /* JADX WARNING: Missing block: B:35:0x0089, code skipped:
            r6 = r0 - 1;
     */
    /* JADX WARNING: Missing block: B:37:0x008f, code skipped:
            if (r6 >= r7.length()) goto L_0x00b1;
     */
    /* JADX WARNING: Missing block: B:39:0x009c, code skipped:
            if (((char) ((r7.charAt(r6) & -33) - 65)) >= 26) goto L_0x00ae;
     */
    /* JADX WARNING: Missing block: B:40:0x009e, code skipped:
            r4 = defpackage.anab.a(r7, a(r14, r11, r7, r4, r5, r6));
            r0 = r11;
            r1 = r12;
     */
    /* JADX WARNING: Missing block: B:41:0x00ae, code skipped:
            r6 = r6 + 1;
     */
    /* JADX WARNING: Missing block: B:43:0x00b5, code skipped:
            throw defpackage.anac.b(r10, r7, r4);
     */
    /* JADX WARNING: Missing block: B:45:0x00ba, code skipped:
            throw defpackage.anac.b(r10, r7, r4);
     */
    /* JADX WARNING: Missing block: B:47:0x00c1, code skipped:
            throw defpackage.anac.a("invalid relative parameter", r7, r4, r6);
     */
    public final void a(defpackage.anaa r14) {
        /*
        r13 = this;
        r7 = r14.b();
        r8 = 0;
        r0 = defpackage.anab.a(r7, r8);
        r9 = -1;
        r4 = r0;
        r0 = -1;
        r1 = 0;
    L_0x000d:
        if (r4 < 0) goto L_0x00c7;
    L_0x000f:
        r2 = r4 + 1;
        r3 = r2;
        r5 = 0;
    L_0x0013:
        r6 = r7.length();
        r10 = "unterminated parameter";
        if (r3 >= r6) goto L_0x00c2;
    L_0x001b:
        r6 = r3 + 1;
        r3 = r7.charAt(r3);
        r11 = r3 + -48;
        r11 = (char) r11;
        r12 = 10;
        if (r11 >= r12) goto L_0x0039;
    L_0x0028:
        r5 = r5 * 10;
        r5 = r5 + r11;
        r3 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        if (r5 >= r3) goto L_0x0032;
    L_0x0030:
        r3 = r6;
        goto L_0x0013;
    L_0x0032:
        r14 = "index too large";
        r14 = defpackage.anac.a(r14, r7, r4, r6);
        throw r14;
    L_0x0039:
        r11 = 36;
        if (r3 != r11) goto L_0x006d;
    L_0x003d:
        r0 = r6 + -1;
        r0 = r0 - r2;
        if (r0 == 0) goto L_0x0066;
    L_0x0042:
        r0 = r7.charAt(r2);
        r2 = 48;
        if (r0 == r2) goto L_0x005f;
    L_0x004a:
        r5 = r5 + -1;
        r0 = r7.length();
        if (r6 == r0) goto L_0x005a;
    L_0x0052:
        r0 = r6 + 1;
        r7.charAt(r6);
        r12 = r1;
        r11 = r5;
        goto L_0x0088;
    L_0x005a:
        r14 = defpackage.anac.b(r10, r7, r4);
        throw r14;
    L_0x005f:
        r14 = "index has leading zero";
        r14 = defpackage.anac.a(r14, r7, r4, r6);
        throw r14;
    L_0x0066:
        r14 = "missing index";
        r14 = defpackage.anac.a(r14, r7, r4, r6);
        throw r14;
    L_0x006d:
        r5 = 60;
        if (r3 == r5) goto L_0x0078;
    L_0x0071:
        r0 = r1 + 1;
        r12 = r0;
        r11 = r1;
        r5 = r2;
        r0 = r6;
        goto L_0x0089;
    L_0x0078:
        if (r0 == r9) goto L_0x00bb;
    L_0x007a:
        r2 = r7.length();
        if (r6 == r2) goto L_0x00b6;
    L_0x0080:
        r2 = r6 + 1;
        r7.charAt(r6);
        r11 = r0;
        r12 = r1;
        r0 = r2;
    L_0x0088:
        r5 = r6;
    L_0x0089:
        r0 = r0 + r9;
        r6 = r0;
    L_0x008b:
        r0 = r7.length();
        if (r6 >= r0) goto L_0x00b1;
    L_0x0091:
        r0 = r7.charAt(r6);
        r0 = r0 & -33;
        r0 = r0 + -65;
        r0 = (char) r0;
        r1 = 26;
        if (r0 >= r1) goto L_0x00ae;
    L_0x009e:
        r0 = r13;
        r1 = r14;
        r2 = r11;
        r3 = r7;
        r0 = r0.a(r1, r2, r3, r4, r5, r6);
        r4 = defpackage.anab.a(r7, r0);
        r0 = r11;
        r1 = r12;
        goto L_0x000d;
    L_0x00ae:
        r6 = r6 + 1;
        goto L_0x008b;
    L_0x00b1:
        r14 = defpackage.anac.b(r10, r7, r4);
        throw r14;
    L_0x00b6:
        r14 = defpackage.anac.b(r10, r7, r4);
        throw r14;
    L_0x00bb:
        r14 = "invalid relative parameter";
        r14 = defpackage.anac.a(r14, r7, r4, r6);
        throw r14;
    L_0x00c2:
        r14 = defpackage.anac.b(r10, r7, r4);
        throw r14;
    L_0x00c7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anab.a(anaa):void");
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            } else {
                throw anac.b("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }

    /* JADX WARNING: Missing block: B:2:0x000c, code skipped:
            if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L_0x000e;
     */
    static {
        /*
        r0 = "line.separator";
        r0 = java.lang.System.getProperty(r0);	 Catch:{ SecurityException -> 0x000e }
        r1 = "\\n|\\r(?:\\n)?";
        r1 = r0.matches(r1);	 Catch:{ SecurityException -> 0x000e }
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        r0 = "\n";
    L_0x0010:
        a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anab.<clinit>():void");
    }
}

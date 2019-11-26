package defpackage;

/* renamed from: sf */
public final class sf {
    private static final ThreadLocal a = new ThreadLocal();

    /* JADX WARNING: Missing block: B:19:0x0058, code skipped:
            if (r6 < r7) goto L_0x005c;
     */
    public static boolean a(android.graphics.Paint r9, java.lang.String r10) {
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 23;
        if (r0 < r1) goto L_0x000b;
    L_0x0006:
        r9 = r9.hasGlyph(r10);
        return r9;
    L_0x000b:
        r0 = r10.length();
        r1 = 1;
        r2 = 0;
        if (r0 == r1) goto L_0x0014;
    L_0x0013:
        goto L_0x001f;
    L_0x0014:
        r3 = r10.charAt(r2);
        r3 = java.lang.Character.isWhitespace(r3);
        if (r3 == 0) goto L_0x001f;
    L_0x001e:
        return r1;
    L_0x001f:
        r3 = "󟿽";
        r4 = r9.measureText(r3);
        r5 = "m";
        r5 = r9.measureText(r5);
        r6 = r9.measureText(r10);
        r7 = 0;
        r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r8 == 0) goto L_0x00a9;
    L_0x0034:
        r8 = r10.length();
        r8 = r10.codePointCount(r2, r8);
        if (r8 <= r1) goto L_0x005c;
    L_0x003e:
        r5 = r5 + r5;
        r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r5 > 0) goto L_0x005b;
    L_0x0043:
        r5 = 0;
    L_0x0044:
        if (r5 >= r0) goto L_0x0056;
    L_0x0046:
        r8 = r10.codePointAt(r5);
        r8 = java.lang.Character.charCount(r8);
        r8 = r8 + r5;
        r5 = r9.measureText(r10, r5, r8);
        r7 = r7 + r5;
        r5 = r8;
        goto L_0x0044;
    L_0x0056:
        r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r5 >= 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        return r2;
    L_0x005c:
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x00a8;
    L_0x0060:
        r4 = a;
        r4 = r4.get();
        r4 = (defpackage.zz) r4;
        if (r4 != 0) goto L_0x007f;
    L_0x006a:
        r4 = new zz;
        r5 = new android.graphics.Rect;
        r5.<init>();
        r6 = new android.graphics.Rect;
        r6.<init>();
        r4.<init>(r5, r6);
        r5 = a;
        r5.set(r4);
        goto L_0x008d;
    L_0x007f:
        r5 = r4.a;
        r5 = (android.graphics.Rect) r5;
        r5.setEmpty();
        r5 = r4.b;
        r5 = (android.graphics.Rect) r5;
        r5.setEmpty();
    L_0x008d:
        r5 = 2;
        r6 = r4.a;
        r6 = (android.graphics.Rect) r6;
        r9.getTextBounds(r3, r2, r5, r6);
        r3 = r4.b;
        r3 = (android.graphics.Rect) r3;
        r9.getTextBounds(r10, r2, r0, r3);
        r9 = r4.a;
        r9 = (android.graphics.Rect) r9;
        r10 = r4.b;
        r9 = r9.equals(r10);
        r9 = r9 ^ r1;
        return r9;
    L_0x00a8:
        return r1;
    L_0x00a9:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf.a(android.graphics.Paint, java.lang.String):boolean");
    }
}

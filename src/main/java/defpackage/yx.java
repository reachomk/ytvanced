package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: yx */
public final class yx {
    public static final yy a = zb.c;
    private static final String b = Character.toString(8206);
    private static final String c = Character.toString(8207);
    private static final yx d = new yx(false, 2, a);
    private static final yx e = new yx(true, 2, a);
    private final boolean f;
    private final int g;
    private final yy h;

    public static yx a() {
        yw ywVar = new yw();
        if (ywVar.b == 2 && ywVar.c == a) {
            return !ywVar.a ? d : e;
        } else {
            return new yx(ywVar.a, ywVar.b, ywVar.c);
        }
    }

    private yx(boolean z, int i, yy yyVar) {
        this.f = z;
        this.g = i;
        this.h = yyVar;
    }

    public final String a(String str) {
        yy yyVar = this.h;
        if (str == null) {
            return null;
        }
        boolean a = yyVar.a(str, str.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = "";
        if ((this.g & 2) != 0) {
            yy yyVar2;
            if (a) {
                yyVar2 = zb.b;
            } else {
                yyVar2 = zb.a;
            }
            boolean a2 = yyVar2.a(str, str.length());
            CharSequence charSequence2 = (!this.f && (a2 || yx.b(str) == 1)) ? b : (this.f && (!a2 || yx.b(str) == -1)) ? c : charSequence;
            spannableStringBuilder.append(charSequence2);
        }
        if (a == this.f) {
            spannableStringBuilder.append(str);
        } else {
            spannableStringBuilder.append(!a ? 8234 : 8235);
            spannableStringBuilder.append(str);
            spannableStringBuilder.append(8236);
        }
        if (a) {
            yyVar = zb.b;
        } else {
            yyVar = zb.a;
        }
        a = yyVar.a(str, str.length());
        if (!this.f && (a || yx.a((CharSequence) str) == 1)) {
            charSequence = b;
        } else if (this.f && (!a || yx.a((CharSequence) str) == -1)) {
            charSequence = c;
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder.toString();
    }

    static boolean a(Locale locale) {
        return zg.a(locale) == 1;
    }

    /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            r2 = r2 - 1;
     */
    private static int a(java.lang.CharSequence r7) {
        /*
        r0 = new yz;
        r0.<init>(r7);
        r7 = r0.c;
        r0.d = r7;
        r7 = 0;
        r1 = 0;
        r2 = 0;
    L_0x000c:
        r3 = r0.d;
        r4 = -1;
        r5 = 1;
        if (r3 <= 0) goto L_0x0040;
    L_0x0012:
        r3 = r0.a();
        if (r3 == 0) goto L_0x0039;
    L_0x0018:
        if (r3 == r5) goto L_0x0032;
    L_0x001a:
        r6 = 2;
        if (r3 == r6) goto L_0x0032;
    L_0x001d:
        r6 = 9;
        if (r3 == r6) goto L_0x000c;
    L_0x0021:
        switch(r3) {
            case 14: goto L_0x002d;
            case 15: goto L_0x002d;
            case 16: goto L_0x002a;
            case 17: goto L_0x002a;
            case 18: goto L_0x0027;
            default: goto L_0x0024;
        };
    L_0x0024:
        if (r1 != 0) goto L_0x000c;
    L_0x0026:
        goto L_0x003e;
    L_0x0027:
        r2 = r2 + 1;
        goto L_0x000c;
    L_0x002a:
        if (r1 == r2) goto L_0x0034;
    L_0x002c:
        goto L_0x002f;
    L_0x002d:
        if (r1 == r2) goto L_0x0041;
    L_0x002f:
        r2 = r2 + -1;
        goto L_0x000c;
    L_0x0032:
        if (r2 != 0) goto L_0x0036;
    L_0x0034:
        r4 = 1;
        goto L_0x0041;
    L_0x0036:
        if (r1 != 0) goto L_0x000c;
    L_0x0038:
        goto L_0x003e;
    L_0x0039:
        if (r2 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x0041;
    L_0x003c:
        if (r1 != 0) goto L_0x000c;
    L_0x003e:
        r1 = r2;
        goto L_0x000c;
    L_0x0040:
        r4 = 0;
    L_0x0041:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Missing block: B:32:0x0083, code skipped:
            r5 = r5 - 1;
     */
    /* JADX WARNING: Missing block: B:54:?, code skipped:
            return 1;
     */
    private static int b(java.lang.CharSequence r9) {
        /*
        r0 = new yz;
        r0.<init>(r9);
        r9 = 0;
        r0.d = r9;
        r1 = -1;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 0;
    L_0x000d:
        r6 = r0.d;
        r7 = r0.c;
        if (r6 >= r7) goto L_0x0069;
    L_0x0013:
        if (r3 != 0) goto L_0x0069;
    L_0x0015:
        r7 = r0.a;
        r6 = r7.charAt(r6);
        r0.e = r6;
        r6 = java.lang.Character.isHighSurrogate(r6);
        if (r6 == 0) goto L_0x0039;
    L_0x0023:
        r6 = r0.a;
        r7 = r0.d;
        r6 = java.lang.Character.codePointAt(r6, r7);
        r7 = r0.d;
        r8 = java.lang.Character.charCount(r6);
        r7 = r7 + r8;
        r0.d = r7;
        r6 = java.lang.Character.getDirectionality(r6);
        goto L_0x0046;
    L_0x0039:
        r6 = r0.d;
        r6 = r6 + r2;
        r0.d = r6;
        r6 = r0.e;
        r6 = defpackage.yz.a(r6);
        r7 = r0.b;
    L_0x0046:
        if (r6 == 0) goto L_0x0064;
    L_0x0048:
        if (r6 == r2) goto L_0x0061;
    L_0x004a:
        r7 = 2;
        if (r6 == r7) goto L_0x0061;
    L_0x004d:
        r7 = 9;
        if (r6 == r7) goto L_0x000d;
    L_0x0051:
        switch(r6) {
            case 14: goto L_0x005d;
            case 15: goto L_0x005d;
            case 16: goto L_0x0059;
            case 17: goto L_0x0059;
            case 18: goto L_0x0055;
            default: goto L_0x0054;
        };
    L_0x0054:
        goto L_0x0067;
    L_0x0055:
        r5 = r5 + -1;
        r4 = 0;
        goto L_0x000d;
    L_0x0059:
        r5 = r5 + 1;
        r4 = 1;
        goto L_0x000d;
    L_0x005d:
        r5 = r5 + 1;
        r4 = -1;
        goto L_0x000d;
    L_0x0061:
        if (r5 != 0) goto L_0x0067;
    L_0x0063:
        goto L_0x007f;
    L_0x0064:
        if (r5 != 0) goto L_0x0067;
    L_0x0066:
        goto L_0x0086;
    L_0x0067:
        r3 = r5;
        goto L_0x000d;
    L_0x0069:
        if (r3 == 0) goto L_0x0089;
    L_0x006b:
        if (r4 != 0) goto L_0x0088;
    L_0x006d:
        r4 = r0.d;
        if (r4 <= 0) goto L_0x0089;
    L_0x0071:
        r4 = r0.a();
        switch(r4) {
            case 14: goto L_0x0081;
            case 15: goto L_0x0081;
            case 16: goto L_0x007c;
            case 17: goto L_0x007c;
            case 18: goto L_0x0079;
            default: goto L_0x0078;
        };
    L_0x0078:
        goto L_0x006d;
    L_0x0079:
        r5 = r5 + 1;
        goto L_0x006d;
    L_0x007c:
        if (r3 == r5) goto L_0x007f;
    L_0x007e:
        goto L_0x0083;
    L_0x007f:
        r9 = 1;
        goto L_0x0089;
    L_0x0081:
        if (r3 == r5) goto L_0x0086;
    L_0x0083:
        r5 = r5 + -1;
        goto L_0x006d;
    L_0x0086:
        r9 = -1;
        goto L_0x0089;
    L_0x0088:
        r9 = r4;
    L_0x0089:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx.b(java.lang.CharSequence):int");
    }
}

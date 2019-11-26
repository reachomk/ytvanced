package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: sjt */
public final class sjt {
    public static SpannableStringBuilder a(Context context, SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        if (!TextUtils.isEmpty(str2)) {
            spannableStringBuilder.setSpan(new sjw(str2, context), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    public static android.text.SpannableStringBuilder a(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, android.content.Context r14) {
        /*
        r0 = new android.text.SpannableStringBuilder;
        r0.<init>();
        r1 = "\\[(.*?)\\]\\(\\$\\{(.*?)\\}\\)";
        r1 = java.util.regex.Pattern.compile(r1);
        r1 = r1.matcher(r10);
        r2 = 0;
        r3 = 0;
    L_0x0011:
        r4 = r1.find();
        if (r4 == 0) goto L_0x007a;
    L_0x0017:
        r4 = r1.start();
        r3 = r10.substring(r3, r4);
        r0.append(r3);
        r3 = r1.end();
        r4 = 1;
        r5 = r1.group(r4);
        r6 = 2;
        r7 = r1.group(r6);
        r8 = r7.hashCode();
        r9 = -1957286624; // 0xffffffff8b562d20 float:-4.124885E-32 double:NaN;
        if (r8 == r9) goto L_0x0058;
    L_0x0039:
        r9 = -1136768504; // 0xffffffffbc3e4a08 float:-0.01161433 double:NaN;
        if (r8 == r9) goto L_0x004e;
    L_0x003e:
        r9 = -268837383; // 0xffffffffeff9ddf9 float:-1.5466023E29 double:NaN;
        if (r8 == r9) goto L_0x0044;
    L_0x0043:
        goto L_0x0062;
    L_0x0044:
        r8 = "privacy_policy_url";
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0062;
    L_0x004c:
        r7 = 1;
        goto L_0x0063;
    L_0x004e:
        r8 = "tos_url";
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0062;
    L_0x0056:
        r7 = 0;
        goto L_0x0063;
    L_0x0058:
        r8 = "learn_more_url";
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0062;
    L_0x0060:
        r7 = 2;
        goto L_0x0063;
    L_0x0062:
        r7 = -1;
    L_0x0063:
        if (r7 == 0) goto L_0x0075;
    L_0x0065:
        if (r7 == r4) goto L_0x0073;
    L_0x0067:
        if (r7 != r6) goto L_0x006b;
    L_0x0069:
        r4 = r13;
        goto L_0x0076;
    L_0x006b:
        r10 = new java.lang.RuntimeException;
        r11 = "Invalid markup in consent text/regex is broken";
        r10.<init>(r11);
        throw r10;
    L_0x0073:
        r4 = r12;
        goto L_0x0076;
    L_0x0075:
        r4 = r11;
    L_0x0076:
        defpackage.sjt.a(r14, r0, r5, r4);
        goto L_0x0011;
    L_0x007a:
        r10 = r10.substring(r3);
        r0.append(r10);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjt.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context):android.text.SpannableStringBuilder");
    }

    public static SpannableStringBuilder a(String str, Context context) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = Pattern.compile("\\[(.*?)\\]\\((.*?)\\)").matcher(str);
        int i = 0;
        while (matcher.find()) {
            spannableStringBuilder.append(str.substring(i, matcher.start()));
            i = matcher.end();
            sjt.a(context, spannableStringBuilder, matcher.group(1), matcher.group(2));
        }
        spannableStringBuilder.append(str.substring(i));
        return spannableStringBuilder;
    }
}

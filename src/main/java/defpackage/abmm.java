package defpackage;

import android.text.TextUtils;

/* renamed from: abmm */
public final class abmm {
    public static abmp a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new abmp(null, null);
        }
        String[] split = str.split("=", 2);
        if (split.length == 1) {
            return new abmp(split[0], "10");
        }
        return new abmp(split[0], split[1]);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "Enter a promo id with optional counter.";
        }
        abmp a = abmm.a(str);
        String str2 = a.a;
        str = a.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 36) + String.valueOf(str).length());
        stringBuilder.append("Forcing promo in request:");
        stringBuilder.append(str2);
        stringBuilder.append(" for ");
        stringBuilder.append(str);
        stringBuilder.append(" times");
        return stringBuilder.toString();
    }
}

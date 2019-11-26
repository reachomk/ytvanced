package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: agun */
public final class agun implements agus {
    public final int a(String str, agqp agqp) {
        String b = agqp.b();
        agpy agpy = agqp.a;
        return agun.a(str, b, agpy != null ? agpy.b : "");
    }

    public final int a(String str, agqi agqi) {
        String str2;
        String str3 = agqi.b;
        agpy agpy = agqi.c;
        if (agpy == null) {
            str2 = "";
        } else {
            str2 = agpy.b;
        }
        return agun.a(str, str3, str2);
    }

    private static int a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        str = str.toLowerCase(Locale.getDefault());
        str2 = str2.toLowerCase(Locale.getDefault());
        str3 = str3.toLowerCase(Locale.getDefault());
        if (str2.contains(str) || str3.contains(str)) {
            return 3;
        }
        String[] split = str.split("\\s+");
        int i = 0;
        for (CharSequence charSequence : split) {
            if (str2.contains(charSequence) || str3.contains(charSequence)) {
                i++;
            }
        }
        int length = split.length;
        if (i == length) {
            return 2;
        }
        if (i < (length >> 1) || i <= 0) {
            return 0;
        }
        return 1;
    }
}

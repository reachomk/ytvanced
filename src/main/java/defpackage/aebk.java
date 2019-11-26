package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: aebk */
public final class aebk {
    private static final Pattern a = Pattern.compile("RQ.*");

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && a.matcher(str).matches();
    }

    public static boolean a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (aebk.a(str)) {
            return aebk.a(str2);
        }
        return false;
    }
}

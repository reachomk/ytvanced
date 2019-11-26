package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: zg */
public final class zg {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    static {
        String str = "";
        Locale locale = new Locale(str, str);
    }
}

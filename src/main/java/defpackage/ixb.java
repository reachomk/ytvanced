package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: ixb */
public final class ixb extends abmu {
    private final SharedPreferences a;

    public ixb(SharedPreferences sharedPreferences) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final String a() {
        String string = this.a.getString(ebn.COUNTRY, "");
        if (TextUtils.isEmpty(string)) {
            string = Locale.getDefault().getCountry();
            if (string == null || string.length() != 2) {
                string = "us";
            }
        }
        return string.toLowerCase(Locale.ENGLISH);
    }
}

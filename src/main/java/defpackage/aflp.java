package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.security.SecureRandom;

/* renamed from: aflp */
public final class aflp implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aflp(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aflp a(bcaa bcaa, bcaa bcaa2) {
        return new aflp(bcaa, bcaa2);
    }

    public static String a(SharedPreferences sharedPreferences, SecureRandom secureRandom) {
        String str = "ap_dev_reg";
        Object string = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            string = String.format("%x", new Object[]{Long.valueOf(secureRandom.nextLong())});
            sharedPreferences.edit().putString(str, string).apply();
        }
        return (String) baqd.a(string, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aflp.a((SharedPreferences) this.a.get(), (SecureRandom) this.b.get());
    }
}

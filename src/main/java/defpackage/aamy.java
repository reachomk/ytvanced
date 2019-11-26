package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: aamy */
public final class aamy implements aams {
    private final SharedPreferences a;
    private final afpu b;

    public aamy(SharedPreferences sharedPreferences, afpu afpu) {
        this.a = sharedPreferences;
        this.b = afpu;
    }

    public final void a(asic asic) {
        if ((asic.a & 2) != 0 && !TextUtils.isEmpty(asic.b)) {
            String str = asic.b;
            String str2;
            if (this.b.g()) {
                str2 = "incognito_visitor_id";
                if (!str.equals(this.a.getString(str2, null))) {
                    this.a.edit().putString(str2, str).apply();
                    return;
                }
                return;
            }
            str2 = "visitor_id";
            if (!str.equals(this.a.getString(str2, null))) {
                this.a.edit().putString(str2, str).apply();
            }
        }
    }
}

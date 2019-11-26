package defpackage;

import android.content.SharedPreferences;

/* renamed from: afql */
public final class afql {
    private final SharedPreferences a;

    public afql(SharedPreferences sharedPreferences) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        if (!sharedPreferences.contains(afng.INNERTUBE_SAFETY_MODE_ENABLED)) {
            int i = sharedPreferences.getInt(afng.SAFETY_MODE, -1);
            boolean z = false;
            if (i == -1) {
                int i2 = sharedPreferences.getInt(afng.DEPRECATED_SAFE_SEARCH, -1);
                if (i2 == 0 || i2 == 1) {
                    a(false);
                    return;
                } else if (i2 != 2) {
                    a(false);
                    return;
                } else {
                    a(true);
                    return;
                }
            }
            if (i != 0) {
                z = true;
            }
            a(z);
        }
    }

    public final boolean a() {
        return this.a.getBoolean(afng.INNERTUBE_SAFETY_MODE_ENABLED, false);
    }

    private final void a(boolean z) {
        this.a.edit().putBoolean(afng.INNERTUBE_SAFETY_MODE_ENABLED, z).apply();
    }
}

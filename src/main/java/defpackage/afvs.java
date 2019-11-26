package defpackage;

import android.content.SharedPreferences;

/* renamed from: afvs */
public final class afvs implements afvq {
    private final SharedPreferences a;
    private final xsc b;

    public afvs(SharedPreferences sharedPreferences, xsc xsc) {
        this.a = sharedPreferences;
        this.b = xsc;
    }

    public final void a() {
        this.a.edit().putLong("device_context_app_last_opened", this.b.a()).apply();
    }

    public final long b() {
        return this.a.getLong("device_context_app_last_opened", 0);
    }
}

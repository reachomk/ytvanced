package defpackage;

import android.content.SharedPreferences;

/* renamed from: afly */
public final class afly implements afms {
    private final SharedPreferences a;

    public afly(SharedPreferences sharedPreferences) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final boolean a() {
        return this.a.getBoolean("ApiRequestLogging", false);
    }

    public final boolean b() {
        return this.a.getBoolean("BasicRequestLogging", false);
    }

    public final boolean c() {
        return this.a.getBoolean("FullApiResponseLogging", false);
    }
}

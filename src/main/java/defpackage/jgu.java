package defpackage;

import android.content.SharedPreferences;

/* renamed from: jgu */
final class jgu implements exv {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ jgp c;

    jgu(jgp jgp, SharedPreferences sharedPreferences, boolean z) {
        this.c = jgp;
        this.a = sharedPreferences;
        this.b = z;
    }

    public final void a() {
        this.a.registerOnSharedPreferenceChangeListener(this.c);
        if (!this.b) {
            this.c.a();
        }
    }

    public final void b() {
        this.a.unregisterOnSharedPreferenceChangeListener(this.c);
    }
}

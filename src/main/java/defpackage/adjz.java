package defpackage;

import android.content.SharedPreferences;

/* renamed from: adjz */
public final class adjz {
    public final SharedPreferences a;

    public adjz(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void a() {
        this.a.edit().putBoolean("mdx.continue_watching_visible", false).apply();
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.a.getBoolean("mdx.continue_watching_visible", false);
    }

    /* Access modifiers changed, original: final */
    public final long c() {
        return this.a.getLong("mdx.continue_watching_last_shown", 0);
    }
}

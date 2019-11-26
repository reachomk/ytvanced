package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: adkw */
public final class adkw {
    public final SharedPreferences a;
    public final xsc b;

    public adkw(SharedPreferences sharedPreferences, xsc xsc) {
        this.a = sharedPreferences;
        this.b = xsc;
    }

    public final void a() {
        this.a.edit().putBoolean("com.google.android.libraries.youtube.mdx.notification.LOCAL_NOTIFICATIONS_ACTED_ON", true).apply();
    }

    public final void a(boolean z) {
        Editor putBoolean = this.a.edit().putBoolean("com.google.android.libraries.youtube.mdx.notification.LOCAL_NOTIFICATIONS_VISIBILITY", z);
        if (z) {
            putBoolean.putLong("com.google.android.libraries.youtube.mdx.notification.LAST_SHOWN_TIME_MS", this.b.a());
        }
        putBoolean.apply();
    }

    /* Access modifiers changed, original: final */
    public final long b() {
        return this.a.getLong("com.google.android.libraries.youtube.mdx.notification.LAST_SHOWN_TIME_MS", 0);
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.a.getBoolean("com.google.android.libraries.youtube.mdx.notification.DISABLED", false);
    }

    /* Access modifiers changed, original: final */
    public final long d() {
        return this.a.getLong("com.google.android.libraries.youtube.mdx.notification.SCAN_PERIOD_MS", (long) adkq.b);
    }
}

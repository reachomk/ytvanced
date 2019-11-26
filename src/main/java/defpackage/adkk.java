package defpackage;

import android.content.SharedPreferences;

/* renamed from: adkk */
public final class adkk {
    public final SharedPreferences a;

    public adkk(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* Access modifiers changed, original: final */
    public final long a() {
        return this.a.getLong("mdx.lr_notification_last_notif_shown_time_ms", 0);
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.a.getInt("mdx.last_lr_notification_shown_id", -1);
    }

    public final void c() {
        this.a.edit().putInt("mdx.last_lr_notification_shown_id", -1).apply();
        String str = "";
        this.a.edit().putString("mdx.last_lr_notification_shown_tag", str).apply();
        this.a.edit().putString("mdx.screen_id_for_last_lr_notification_shown", str).apply();
    }

    /* Access modifiers changed, original: final */
    public final String d() {
        return this.a.getString("mdx.screen_id_for_last_lr_notification_shown", "");
    }

    /* Access modifiers changed, original: final */
    public final boolean e() {
        return d().equals("mdx.last_lr_notif_shown_is_multi_screen");
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        this.a.edit().putString("mdx.screen_id_for_last_lr_notification_shown", str).apply();
    }
}

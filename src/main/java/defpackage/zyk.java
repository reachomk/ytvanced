package defpackage;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: zyk */
public class zyk implements aaap {
    private final SharedPreferences a;
    private final String b;
    private final boolean c;

    public zyk(SharedPreferences sharedPreferences, String str, boolean z) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = z;
    }

    public final void a(apxu apxu, Map map) {
        this.a.edit().putBoolean(this.b, this.c).apply();
        this.a.edit().putBoolean("has_seen_push_notifications_dialog", true).apply();
    }
}

package defpackage;

import android.content.SharedPreferences;
import java.util.List;

/* renamed from: gcg */
public final class gcg implements t {
    public final zng a;
    public final SharedPreferences b;
    public final boolean c;
    public String d;
    public String e;
    public boolean f;

    public gcg(zng zng, SharedPreferences sharedPreferences, boolean z) {
        this.a = zng;
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.c = z;
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
        if (this.f) {
            this.b.edit().putString("MOST_RECENT_PRESET_EFFECT_ID", this.e).apply();
        }
    }

    public final void a(af afVar) {
        afVar.y_().b(this);
    }

    public static boolean a(String str, List list) {
        return zjt.a(list, str) != null;
    }
}

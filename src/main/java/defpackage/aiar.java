package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aiar */
public final class aiar implements aiaw {
    private final SharedPreferences a;
    private final bcaa b;
    private boolean c;
    private boolean d;

    public aiar(Context context, SharedPreferences sharedPreferences) {
        Object aiau = new aiau(context);
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (bcaa) amqw.a(aiau);
    }

    public final boolean a() {
        boolean z;
        if (this.d) {
            z = this.c;
        } else {
            z = this.a.getBoolean("debug_player_controls_always_visible", false);
            this.c = z;
            this.d = true;
        }
        return z || ((Boolean) this.b.get()).booleanValue();
    }
}

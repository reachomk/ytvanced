package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: actz */
public final class actz {
    public static final String a = actz.class.getSimpleName();
    public final xsc b;
    public final Context c;
    public final bcaa d;
    public final boolean e = false;

    public actz(Context context, xsc xsc, bcaa bcaa) {
        this.c = context;
        this.b = xsc;
        this.d = bcaa;
    }

    public final void a() {
        ((SharedPreferences) this.d.get()).edit().putLong("LastCrashTimestamp", this.b.a()).apply();
    }
}

package defpackage;

import android.content.SharedPreferences;

/* renamed from: vom */
public final class vom implements baqa {
    private final bcaa a;

    private vom(bcaa bcaa) {
        this.a = bcaa;
    }

    public static vom a(bcaa bcaa) {
        return new vom(bcaa);
    }

    public final /* synthetic */ Object get() {
        return new von((SharedPreferences) this.a.get());
    }
}

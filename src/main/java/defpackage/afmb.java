package defpackage;

import android.content.SharedPreferences;

/* renamed from: afmb */
public final class afmb implements baqa {
    private final bcaa a;

    private afmb(bcaa bcaa) {
        this.a = bcaa;
    }

    public static afmb a(bcaa bcaa) {
        return new afmb(bcaa);
    }

    public final /* synthetic */ Object get() {
        return new afly((SharedPreferences) this.a.get());
    }
}

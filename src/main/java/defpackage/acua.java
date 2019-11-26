package defpackage;

import android.content.SharedPreferences;

/* renamed from: acua */
public final class acua implements baqa {
    private final bcaa a;
    private final bcaa b;

    private acua(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static acua a(bcaa bcaa, bcaa bcaa2) {
        return new acua(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new acty((SharedPreferences) this.a.get(), (xci) this.b.get());
    }
}

package defpackage;

import android.content.SharedPreferences;

/* renamed from: aftv */
public final class aftv implements baqa {
    private final bcaa a;
    private final bcaa b;

    public aftv(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object get() {
        return new afts((SharedPreferences) this.a.get(), (afpu) this.b.get());
    }
}

package defpackage;

import android.content.SharedPreferences;

/* renamed from: aanb */
public final class aanb implements baqa {
    private final bcaa a;
    private final bcaa b;

    public aanb(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object get() {
        return new aamy((SharedPreferences) this.a.get(), (afpu) this.b.get());
    }
}

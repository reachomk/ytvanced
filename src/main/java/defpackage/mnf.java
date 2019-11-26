package defpackage;

import android.content.SharedPreferences;

/* renamed from: mnf */
public final class mnf implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public mnf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public final /* synthetic */ Object get() {
        return (zwv) baqd.a(new zwv((SharedPreferences) this.a.get(), (xsc) this.b.get(), this.c, (xci) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

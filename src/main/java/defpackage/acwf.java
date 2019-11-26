package defpackage;

import android.content.SharedPreferences;

/* renamed from: acwf */
public final class acwf implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private acwf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static acwf a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new acwf(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        afmn afmn = (afmn) this.a.get();
        this.b.get();
        return new acwg(afmn, (SharedPreferences) this.c.get(), (acum) this.d.get());
    }
}

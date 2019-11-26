package defpackage;

import android.content.SharedPreferences;

/* renamed from: afow */
public final class afow implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    private afow(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
    }

    public static afow a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        return new afow(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7);
    }

    public final /* synthetic */ Object get() {
        return new afov((xsv) this.a.get(), (xgq) this.b.get(), (SharedPreferences) this.c.get(), (afmh) this.d.get(), bapx.b(this.e), (String) this.f.get(), (String) this.g.get());
    }
}

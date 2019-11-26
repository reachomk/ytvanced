package defpackage;

import android.content.Context;

/* renamed from: wyf */
public final class wyf implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private wyf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static wyf a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new wyf(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new wyd((Context) this.a.get(), (wxz) this.b.get(), (wye) this.c.get());
    }
}

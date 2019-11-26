package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* renamed from: acxu */
public final class acxu implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    private acxu(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public static acxu a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        return new acxu(bcaa, bcaa2, bcaa3, bcaa4, bcaa5);
    }

    public final /* synthetic */ Object get() {
        return new acxs((SharedPreferences) this.a.get(), (xuu) this.b.get(), (xsc) this.c.get(), (acum) this.d.get(), (Executor) this.e.get());
    }
}

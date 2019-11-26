package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: acwd */
public final class acwd implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    private acwd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
    }

    public static acwd a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        return new acwd(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6);
    }

    public final /* synthetic */ Object get() {
        return new acwe((Context) this.a.get(), (acum) this.b.get(), (zyw) this.c.get(), (Map) this.d.get(), (acvh) this.e.get(), (acwg) this.f.get());
    }
}

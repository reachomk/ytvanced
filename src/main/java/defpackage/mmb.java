package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: mmb */
public final class mmb implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;

    private mmb(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
    }

    public static mmb a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        return new mmb(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8);
    }

    public final /* synthetic */ Object get() {
        return (akkl) baqd.a((Object) new akkb((Executor) this.a.get(), (Context) this.b.get(), (xgq) this.c.get(), this.d, null, (xsc) this.e.get(), new akke(70, 30), (aort) this.f.get(), null, this.g, this.h), "Cannot return null from a non-@Nullable @Provides method");
    }
}

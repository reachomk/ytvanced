package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acuh */
public final class acuh implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;

    private acuh(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
    }

    public static acuh a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        return new acuh(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8);
    }

    public final /* synthetic */ Object get() {
        this.a.get();
        this.b.get();
        return new acuf((acul) this.c.get(), (afoi) this.d.get(), (afpu) this.e.get(), (xsc) this.f.get(), (xpt) this.g.get(), (Executor) this.h.get());
    }
}

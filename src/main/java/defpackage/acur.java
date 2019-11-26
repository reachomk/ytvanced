package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acur */
public final class acur implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;

    private acur(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
        this.i = bcaa9;
    }

    public static acur a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        return new acur(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9);
    }

    public final /* synthetic */ Object get() {
        this.a.get();
        this.b.get();
        return new acun((acty) this.c.get(), (abcz) this.d.get(), (acul) this.e.get(), (afpu) this.f.get(), (zzf) this.g.get(), (Executor) this.h.get(), (afoi) this.i.get());
    }
}

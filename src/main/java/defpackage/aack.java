package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: aack */
public final class aack implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    private aack(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
    }

    public static aack a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
        return new aack(bcaa, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa10);
    }

    public final /* synthetic */ Object get() {
        return new aabe((Executor) this.a.get(), (xci) this.b.get(), (afpu) this.c.get(), (Map) this.d.get(), (xsc) this.e.get(), (aaep) this.f.get(), (zyw) this.g.get());
    }
}

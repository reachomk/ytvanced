package defpackage;

import java.util.concurrent.Executor;

/* renamed from: vuo */
public final class vuo implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    private vuo(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
    }

    public static vuo a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        return new vuo(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7);
    }

    public final /* synthetic */ Object get() {
        this.a.get();
        return new vup((Executor) this.b.get(), (afti) this.c.get(), (afqv) this.d.get(), (afqv) this.e.get(), (vrk) this.f.get(), (xsc) this.g.get());
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afpm */
public final class afpm implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    private afpm(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public static afpm a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        return new afpm(bcaa, bcaa2, bcaa3, bcaa4, bcaa5);
    }

    public final /* synthetic */ Object get() {
        return new afpi((Executor) this.a.get(), (afqv) this.b.get(), (afmi) this.c.get(), (afmz) this.d.get(), (afpg) this.e.get());
    }
}

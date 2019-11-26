package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ajpp */
public final class ajpp implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private ajpp(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static ajpp a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new ajpp(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new ajpe((Executor) this.a.get(), (ajph) this.b.get(), (xsc) this.c.get());
    }
}

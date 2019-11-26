package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aixj */
public final class aixj implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aixj(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aixj a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aixj(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new aixc((airv) this.a.get(), (aisl) this.b.get(), (Executor) this.c.get());
    }
}

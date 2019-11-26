package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajhk */
public final class ajhk implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private ajhk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static ajhk a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new ajhk(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new ajhi((ScheduledExecutorService) this.a.get(), (Executor) this.b.get(), (xwk) this.c.get());
    }
}

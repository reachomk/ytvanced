package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: afoq */
public final class afoq implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private afoq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static afoq a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new afoq(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        return new afop((afmx) this.a.get(), (xsc) this.b.get(), (xbp) this.c.get(), (ScheduledExecutorService) this.d.get());
    }
}

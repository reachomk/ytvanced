package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: aeoe */
public final class aeoe implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private aeoe(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static aeoe a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new aeoe(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        return new aenq((ExecutorService) this.a.get(), (xsc) this.b.get(), (afjj) this.c.get(), (zzl) this.d.get());
    }
}

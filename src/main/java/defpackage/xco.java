package defpackage;

import java.util.concurrent.Executor;

/* renamed from: xco */
public final class xco implements baqa {
    private final bcaa a;
    private final bcaa b;

    private xco(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static xco a(bcaa bcaa, bcaa bcaa2) {
        return new xco(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new xci((Executor) this.a.get(), (xsc) this.b.get());
    }
}

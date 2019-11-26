package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wwr */
public final class wwr implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wwr(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wwr a(bcaa bcaa, bcaa bcaa2) {
        return new wwr(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return wwm.a((xax) this.a.get()) ? (Executor) this.b.get() : null;
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahgh */
public final class ahgh implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private ahgh(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static ahgh a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new ahgh(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        ahgd ahgd = new ahgd((aiyx) this.a.get(), (ajbp) this.b.get(), bapx.b(this.c), (Executor) this.d.get());
        ahgd.a();
        return ahgd;
    }
}

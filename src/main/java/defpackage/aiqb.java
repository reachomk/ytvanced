package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aiqb */
public final class aiqb implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aiqb(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aiqb a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aiqb(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new aipx((aiqa) this.a.get(), (afgu) this.b.get(), (Executor) this.c.get());
    }
}

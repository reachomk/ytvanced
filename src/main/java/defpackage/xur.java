package defpackage;

import java.security.SecureRandom;

/* renamed from: xur */
public final class xur implements baqa {
    private final bcaa a;
    private final bcaa b;

    private xur(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static xur a(bcaa bcaa, bcaa bcaa2) {
        return new xur(bcaa, bcaa2);
    }

    public static SecureRandom a(xtb xtb, amqp amqp) {
        return (SecureRandom) baqd.a((SecureRandom) amqp.a(new xus(xtb)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xur.a((xtb) this.a.get(), (amqp) this.b.get());
    }
}

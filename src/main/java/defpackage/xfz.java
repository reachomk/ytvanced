package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xfz */
public final class xfz implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private xfz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static xfz a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new xfz(bcaa, bcaa2, bcaa3);
    }

    public static xhv a(xhu xhu, xax xax, amqp amqp) {
        return (xhv) baqd.a(new xgj(xhu, xax.d(), (List) amqp.a(new ArrayList())), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xfz.a((xhu) this.a.get(), (xax) this.b.get(), (amqp) this.c.get());
    }
}

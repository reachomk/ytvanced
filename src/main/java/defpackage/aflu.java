package defpackage;

import java.util.List;

/* renamed from: aflu */
public final class aflu implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aflu(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aflu a(bcaa bcaa, bcaa bcaa2) {
        return new aflu(bcaa, bcaa2);
    }

    public static afqv a(afrb afrb, List list) {
        return (afqv) baqd.a(afrb.a(list), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aflu.a((afrb) this.a.get(), (List) this.b.get());
    }
}

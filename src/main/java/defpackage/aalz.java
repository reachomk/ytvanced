package defpackage;

import java.util.Set;

/* renamed from: aalz */
public final class aalz implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aalz(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aalz a(bcaa bcaa, bcaa bcaa2) {
        return new aalz(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        this.a.get();
        return new aalx((Set) this.b.get());
    }
}

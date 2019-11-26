package defpackage;

import android.content.Context;

/* renamed from: xnr */
public final class xnr implements baqa {
    private final bcaa a;
    private final bcaa b;

    private xnr(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static xnr a(bcaa bcaa, bcaa bcaa2) {
        return new xnr(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new xns((Context) this.a.get(), (xhv) this.b.get());
    }
}

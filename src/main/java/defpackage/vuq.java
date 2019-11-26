package defpackage;

import android.content.Context;

/* renamed from: vuq */
public final class vuq implements baqa {
    private final bcaa a;
    private final bcaa b;

    private vuq(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static vuq a(bcaa bcaa, bcaa bcaa2) {
        return new vuq(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new vur((Context) this.a.get(), (tax) this.b.get());
    }
}

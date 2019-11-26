package defpackage;

import android.content.Context;

/* renamed from: wvy */
public final class wvy implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wvy(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wvy a(bcaa bcaa, bcaa bcaa2) {
        return new wvy(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(wvr.a((tem) this.a.get(), (Context) this.b.get()));
    }
}

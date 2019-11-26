package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: wvw */
public final class wvw implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wvw(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wvw a(bcaa bcaa, bcaa bcaa2) {
        return new wvw(bcaa, bcaa2);
    }

    public static xme a(xmh xmh, Executor executor) {
        HashMap hashMap = new HashMap();
        hashMap.put(xmh.e, xmh);
        return (xme) baqd.a(new xme(hashMap, ankc.a(executor)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wvw.a((xmh) this.a.get(), (Executor) this.b.get());
    }
}

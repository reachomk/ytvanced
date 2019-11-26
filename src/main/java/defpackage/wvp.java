package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wvp */
public final class wvp implements baqa {
    private final bcaa a;

    private wvp(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wvp a(bcaa bcaa) {
        return new wvp(bcaa);
    }

    public final /* synthetic */ Object get() {
        return new wvn((Executor) this.a.get());
    }
}

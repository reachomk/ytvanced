package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbtm */
public final class bbtm extends bbmi {
    private final Callable a;

    public bbtm(Callable callable) {
        this.a = callable;
    }

    public final void a(bbmo bbmo) {
        try {
            ((bbmm) bbow.a(this.a.call(), "null ObservableSource supplied")).b(bbmo);
        } catch (Throwable th) {
            bbnm.a(th);
            bboc.a(th, bbmo);
        }
    }
}

package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rob */
final class rob implements Callable {
    private final /* synthetic */ rnr a;
    private final /* synthetic */ rnz b;

    rob(rnz rnz, rnr rnr) {
        this.b = rnz;
        this.a = rnr;
    }

    public final Object call() {
        return this.a.a(this.b.d);
    }
}

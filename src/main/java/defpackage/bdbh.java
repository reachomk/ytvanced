package defpackage;

import java.util.concurrent.Future;

/* renamed from: bdbh */
final class bdbh implements bcuo {
    private final Future a;
    private final /* synthetic */ bdbe b;

    bdbh(bdbe bdbe, Future future) {
        this.b = bdbe;
        this.a = future;
    }

    public final void b() {
        if (this.b.get() != Thread.currentThread()) {
            this.a.cancel(true);
        } else {
            this.a.cancel(false);
        }
    }

    public final boolean c() {
        return this.a.isCancelled();
    }
}

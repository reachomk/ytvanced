package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;

/* renamed from: bbfr */
final class bbfr implements Runnable {
    private final /* synthetic */ Collection a;
    private final /* synthetic */ bbgp b;
    private final /* synthetic */ Future c;
    private final /* synthetic */ Future d;
    private final /* synthetic */ bbfq e;

    bbfr(bbfq bbfq, Collection collection, bbgp bbgp, Future future, Future future2) {
        this.e = bbfq;
        this.a = collection;
        this.b = bbgp;
        this.c = future;
        this.d = future2;
    }

    public final void run() {
        for (bbgp bbgp : this.a) {
            if (bbgp != this.b) {
                bbgp.a.b(bbfq.b);
            }
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
        }
        future = this.d;
        if (future != null) {
            future.cancel(false);
        }
        this.e.b();
    }
}

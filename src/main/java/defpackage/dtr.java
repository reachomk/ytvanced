package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dtr */
final class dtr implements Runnable {
    private final /* synthetic */ Executor a;
    private final /* synthetic */ dtl b;

    dtr(dtl dtl, Executor executor) {
        this.b = dtl;
        this.a = executor;
    }

    public final void run() {
        afpt c = ((afpu) this.b.g.get()).c();
        if (c instanceof ust) {
            this.a.execute(new utb((utc) this.b.h.get(), (ust) c));
        }
    }
}

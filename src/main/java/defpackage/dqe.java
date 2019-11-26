package defpackage;

import java.io.File;

/* renamed from: dqe */
final class dqe implements Runnable {
    private final /* synthetic */ dos a;

    dqe(dos dos) {
        this.a = dos;
    }

    public final void run() {
        for (File delete : ((File) this.a.af.get()).listFiles()) {
            delete.delete();
        }
        ((aboo) this.a.q.get()).b();
        ((fyj) this.a.r.get()).f();
    }
}

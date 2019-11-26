package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: nzg */
final /* synthetic */ class nzg implements Runnable {
    private final CopyOnWriteArrayList a;
    private final nyp b;

    nzg(CopyOnWriteArrayList copyOnWriteArrayList, nyp nyp) {
        this.a = copyOnWriteArrayList;
        this.b = nyp;
    }

    public final void run() {
        nyz.a(this.a, this.b);
    }
}

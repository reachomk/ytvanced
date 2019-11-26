package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbvp */
final class bbvp extends AtomicReference implements bbnw, Runnable {
    public static final long serialVersionUID = -4552101107598366241L;
    public long a;
    public boolean b;
    private final bbvq c;

    bbvp(bbvq bbvq) {
        this.c = bbvq;
    }

    public final void run() {
        this.c.b(this);
    }

    public final /* synthetic */ void accept(Object obj) {
        bbnz.c(this, (bbnc) obj);
    }
}

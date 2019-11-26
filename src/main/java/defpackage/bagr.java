package defpackage;

/* renamed from: bagr */
public final class bagr implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ bagn b;

    public bagr(bagn bagn, Runnable runnable) {
        this.b = bagn;
        this.a = runnable;
    }

    public final void run() {
        if (this.a != null || this.b.h != null) {
            this.b.a().c = this.a;
        }
    }
}

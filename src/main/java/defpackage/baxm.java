package defpackage;

/* renamed from: baxm */
final class baxm implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ baxj b;

    baxm(baxj baxj, int i) {
        this.b = baxj;
        this.a = i;
    }

    public final void run() {
        if (!this.b.b.b()) {
            try {
                this.b.b.c(this.a);
            } catch (Throwable th) {
                this.b.a.a(th);
                this.b.b.close();
            }
        }
    }
}

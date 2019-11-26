package defpackage;

/* renamed from: baxl */
final class baxl implements Runnable {
    private final /* synthetic */ bbff a;
    private final /* synthetic */ baxj b;

    baxl(baxj baxj, bbff bbff) {
        this.b = baxj;
        this.a = bbff;
    }

    public final void run() {
        try {
            this.b.b.a(this.a);
        } catch (Throwable th) {
            this.b.a(th);
            this.b.b.close();
        }
    }
}

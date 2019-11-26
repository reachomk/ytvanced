package defpackage;

/* renamed from: bbdy */
final class bbdy implements Runnable {
    private final /* synthetic */ bavx a;
    private final /* synthetic */ bbdv b;

    bbdy(bbdv bbdv, bavx bavx) {
        this.b = bbdv;
        this.a = bavx;
    }

    public final void run() {
        this.b.b(this.a);
    }
}

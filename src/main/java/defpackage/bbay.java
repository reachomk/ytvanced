package defpackage;

/* renamed from: bbay */
final class bbay implements Runnable {
    private final /* synthetic */ bbhp a;
    private final /* synthetic */ bbav b;

    bbay(bbav bbav, bbhp bbhp) {
        this.b = bbav;
        this.a = bbhp;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}

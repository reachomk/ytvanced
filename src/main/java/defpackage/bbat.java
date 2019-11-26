package defpackage;

/* renamed from: bbat */
final class bbat implements Runnable {
    private final /* synthetic */ bavx a;
    private final /* synthetic */ bbah b;

    bbat(bbah bbah, bavx bavx) {
        this.b = bbah;
        this.a = bavx;
    }

    public final void run() {
        this.b.a.b(this.a);
    }
}

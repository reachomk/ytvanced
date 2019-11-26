package defpackage;

/* renamed from: lhn */
final /* synthetic */ class lhn implements Runnable {
    private final lhj a;
    private final lhr b;

    lhn(lhj lhj, lhr lhr) {
        this.a = lhj;
        this.b = lhr;
    }

    public final void run() {
        lhj lhj = this.a;
        lhj.a.a(this.b, new lhp());
    }
}

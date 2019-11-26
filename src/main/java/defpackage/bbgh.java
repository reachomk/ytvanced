package defpackage;

/* renamed from: bbgh */
final class bbgh implements Runnable {
    public final bbgi a;
    public final /* synthetic */ bbfq b;

    bbgh(bbfq bbfq, bbgi bbgi) {
        this.b = bbfq;
        this.a = bbgi;
    }

    public final void run() {
        this.b.d.execute(new bbgk(this));
    }
}

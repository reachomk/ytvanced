package defpackage;

/* renamed from: bbaf */
final class bbaf implements Runnable {
    private final /* synthetic */ bbai a;
    private final /* synthetic */ bazq b;

    bbaf(bbai bbai, bazq bazq) {
        this.a = bbai;
        this.b = bazq;
    }

    public final void run() {
        bbah bbah = this.a;
        bazq bazq = this.b;
        basr c = bbah.c.c();
        try {
            bazo a = bazq.a(bbah.b.c(), bbah.b.b(), bbah.b.a());
            bbah.a(a);
        } finally {
            bbah = bbah.c;
            bbah.a(c);
        }
    }
}

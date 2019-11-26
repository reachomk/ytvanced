package defpackage;

/* renamed from: bbdu */
final class bbdu implements Runnable {
    private final /* synthetic */ bbcm a;
    private final /* synthetic */ bbdr b;

    bbdu(bbdr bbdr, bbcm bbcm) {
        this.b = bbdr;
        this.a = bbcm;
    }

    public final void run() {
        if (this.b.b.x) {
            this.a.a(bbde.b);
        }
        if (!this.b.b.y) {
            this.b.b.s.add(this.a);
        }
    }
}

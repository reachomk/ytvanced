package defpackage;

/* renamed from: bbdw */
final class bbdw implements Runnable {
    private final /* synthetic */ baud a;
    private final /* synthetic */ basp b;
    private final /* synthetic */ bbdr c;

    bbdw(bbdr bbdr, baud baud, basp basp) {
        this.c = bbdr;
        this.a = baud;
        this.b = basp;
    }

    public final void run() {
        bbdr bbdr = this.c;
        bbde bbde = bbdr.b;
        if (bbdr == bbde.p) {
            bbde.a(this.a);
            if (this.b != basp.SHUTDOWN) {
                this.c.b.C.a(2, "Entering {0} state", this.b);
                this.c.b.m.a(this.b);
            }
        }
    }
}

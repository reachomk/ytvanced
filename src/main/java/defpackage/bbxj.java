package defpackage;

/* renamed from: bbxj */
final class bbxj implements Runnable {
    private final bbxm a;
    private final /* synthetic */ bbxk b;

    bbxj(bbxk bbxk, bbxm bbxm) {
        this.b = bbxk;
        this.a = bbxm;
    }

    public final void run() {
        bbxm bbxm = this.a;
        bbnz.c(bbxm.b, this.b.a(bbxm));
    }
}

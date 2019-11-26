package defpackage;

/* renamed from: bbxn */
final class bbxn implements Runnable {
    private final bboe a;
    private final Runnable b;
    private final /* synthetic */ bbxl c;

    bbxn(bbxl bbxl, bboe bboe, Runnable runnable) {
        this.c = bbxl;
        this.a = bboe;
        this.b = runnable;
    }

    public final void run() {
        bbnz.c(this.a, this.c.a(this.b));
    }
}

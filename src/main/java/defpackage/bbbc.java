package defpackage;

/* renamed from: bbbc */
final class bbbc implements Runnable {
    private final /* synthetic */ bavx a;
    private final /* synthetic */ baum b;
    private final /* synthetic */ bbav c;
    private final /* synthetic */ int d;

    public final void run() {
        this.c.a.a(this.a, this.d, this.b);
    }

    bbbc(bbav bbav, bavx bavx, int i, baum baum) {
        this.c = bbav;
        this.a = bavx;
        this.d = i;
        this.b = baum;
    }
}

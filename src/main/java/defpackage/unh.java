package defpackage;

/* renamed from: unh */
final class unh implements Runnable {
    private final /* synthetic */ uor a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ unf c;

    unh(unf unf, uor uor, boolean z) {
        this.c = unf;
        this.a = uor;
        this.b = z;
    }

    public final void run() {
        this.c.a(this.a, this.b);
        this.a.d();
    }
}

package defpackage;

/* renamed from: ppf */
final class ppf implements Runnable {
    private final /* synthetic */ ppa a;
    private final /* synthetic */ int b;

    ppf(ppa ppa, int i) {
        this.a = ppa;
        this.b = i;
    }

    public final void run() {
        this.a.d.a(this.b);
    }
}

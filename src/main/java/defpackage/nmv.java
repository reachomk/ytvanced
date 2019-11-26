package defpackage;

/* renamed from: nmv */
final class nmv implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ long b;
    private final /* synthetic */ nmu c;

    nmv(nmu nmu, int i, long j) {
        this.c = nmu;
        this.a = i;
        this.b = j;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}

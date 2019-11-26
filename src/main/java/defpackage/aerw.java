package defpackage;

/* renamed from: aerw */
final /* synthetic */ class aerw implements Runnable {
    private final aeru a;
    private final nxu b;
    private final npv c;

    aerw(aeru aeru, nxu nxu, npv npv) {
        this.a = aeru;
        this.b = nxu;
        this.c = npv;
    }

    public final void run() {
        aeru aeru = this.a;
        aeru.b(this.c);
        aeru.e = null;
    }
}

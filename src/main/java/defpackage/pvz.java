package defpackage;

/* renamed from: pvz */
final class pvz implements Runnable {
    private final /* synthetic */ psa a;
    private final /* synthetic */ ptx b;

    pvz(ptx ptx, psa psa) {
        this.b = ptx;
        this.a = psa;
    }

    public final void run() {
        this.b.a(this.a);
    }
}

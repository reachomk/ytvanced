package defpackage;

/* renamed from: adql */
final class adql implements Runnable {
    private final adqe a;
    private final /* synthetic */ adqm b;

    public adql(adqm adqm, adqe adqe) {
        this.b = adqm;
        this.a = adqe;
    }

    public final void run() {
        long b = this.b.a.b();
        if (b != -1 && b <= 300000) {
            this.a.i();
        }
    }
}

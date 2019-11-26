package defpackage;

/* renamed from: acvg */
final class acvg implements Runnable {
    private final /* synthetic */ acuz a;

    acvg(acuz acuz) {
        this.a = acuz;
    }

    public final void run() {
        synchronized (this.a.n) {
            acuz acuz = this.a;
            if (acuz.t != 2) {
                acuz.t = 2;
                acuz.a(3, null, null);
                this.a.b();
            }
        }
    }
}

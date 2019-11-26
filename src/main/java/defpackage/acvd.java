package defpackage;

/* renamed from: acvd */
final class acvd implements Runnable {
    private final /* synthetic */ acuz a;

    acvd(acuz acuz) {
        this.a = acuz;
    }

    public final void run() {
        synchronized (this.a.n) {
            acuz acuz = this.a;
            if (acuz.t != 3) {
                acuz.t = 3;
                acuz.a(4, null, null);
                this.a.c();
            }
        }
    }
}

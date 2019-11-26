package defpackage;

/* renamed from: acjg */
final /* synthetic */ class acjg implements Runnable {
    private final acjh a;
    private final Throwable b;

    acjg(acjh acjh, Throwable th) {
        this.a = acjh;
        this.b = th;
    }

    public final void run() {
        acjh acjh = this.a;
        Throwable th = this.b;
        acji acji = acjh.n;
        if (acji != null) {
            acji.a(th);
        }
    }
}

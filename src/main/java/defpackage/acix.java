package defpackage;

/* renamed from: acix */
final class acix implements Runnable {
    private final /* synthetic */ Throwable a;
    private final /* synthetic */ acis b;

    acix(acis acis, Throwable th) {
        this.b = acis;
        this.a = th;
    }

    public final void run() {
        acjb acjb = this.b.g;
        if (acjb != null) {
            acjb.b(this.a);
        }
    }
}

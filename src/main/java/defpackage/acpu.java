package defpackage;

/* renamed from: acpu */
final class acpu implements Runnable {
    private final /* synthetic */ acpr a;

    acpu(acpr acpr) {
        this.a = acpr;
    }

    public final void run() {
        acpr acpr = this.a;
        acpr.b.d(acpr.a - 1);
    }
}

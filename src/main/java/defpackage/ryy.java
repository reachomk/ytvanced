package defpackage;

/* renamed from: ryy */
final class ryy implements Runnable {
    private final /* synthetic */ ryi a;
    private final /* synthetic */ ryz b;

    ryy(ryz ryz, ryi ryi) {
        this.b = ryz;
        this.a = ryi;
    }

    public final void run() {
        synchronized (this.b.a) {
            ryh ryh = this.b.b;
            if (ryh != null) {
                ryh.a(this.a.e());
            }
        }
    }
}

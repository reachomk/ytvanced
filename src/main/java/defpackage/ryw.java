package defpackage;

/* renamed from: ryw */
final class ryw implements Runnable {
    private final /* synthetic */ ryi a;
    private final /* synthetic */ ryx b;

    ryw(ryx ryx, ryi ryi) {
        this.b = ryx;
        this.a = ryi;
    }

    public final void run() {
        synchronized (this.b.a) {
            rye rye = this.b.b;
            if (rye != null) {
                rye.a(this.a);
            }
        }
    }
}

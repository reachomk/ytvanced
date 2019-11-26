package defpackage;

/* renamed from: pov */
final /* synthetic */ class pov implements Runnable {
    private final pos a;

    pov(pos pos) {
        this.a = pos;
    }

    public final void run() {
        pos pos = this.a;
        synchronized (pos.b) {
            if (pos.a == -1) {
                return;
            }
            pos.a(15);
        }
    }
}

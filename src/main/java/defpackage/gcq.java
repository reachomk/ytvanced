package defpackage;

/* renamed from: gcq */
final class gcq implements Runnable {
    private final /* synthetic */ gcl a;

    gcq(gcl gcl) {
        this.a = gcl;
    }

    public final void run() {
        gcl gcl = this.a;
        if (gcl.af != null) {
            gcl.ac();
        }
    }
}

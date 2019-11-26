package defpackage;

/* renamed from: emm */
final class emm implements Runnable {
    private final /* synthetic */ emn a;

    emm(emn emn) {
        this.a = emn;
    }

    public final void run() {
        emn emn = this.a;
        emn.f.removeCallbacks(emn.e);
        if (this.a.b() == 0.0f) {
            this.a.c();
            return;
        }
        this.a.f();
        this.a.f.postInvalidate();
    }
}

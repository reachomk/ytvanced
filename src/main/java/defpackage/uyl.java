package defpackage;

/* renamed from: uyl */
final class uyl implements Runnable {
    private final /* synthetic */ uyh a;

    uyl(uyh uyh) {
        this.a = uyh;
    }

    public final void run() {
        for (afqd b : this.a.h) {
            b.b();
        }
        this.a.h.clear();
    }
}

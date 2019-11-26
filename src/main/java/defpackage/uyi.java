package defpackage;

/* renamed from: uyi */
final class uyi implements Runnable {
    private final /* synthetic */ uyh a;

    uyi(uyh uyh) {
        this.a = uyh;
    }

    public final void run() {
        for (afqd a : this.a.h) {
            a.a();
        }
        this.a.h.clear();
    }
}

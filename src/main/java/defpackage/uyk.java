package defpackage;

/* renamed from: uyk */
final class uyk implements Runnable {
    private final /* synthetic */ Exception a;
    private final /* synthetic */ uyh b;

    uyk(uyh uyh, Exception exception) {
        this.b = uyh;
        this.a = exception;
    }

    public final void run() {
        for (afqd a : this.b.h) {
            a.a(this.a);
        }
        this.b.h.clear();
    }
}

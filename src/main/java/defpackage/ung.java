package defpackage;

/* renamed from: ung */
final class ung implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ unf b;

    ung(unf unf, int i) {
        this.b = unf;
        this.a = i;
    }

    public final void run() {
        unf unf = this.b;
        if (unf.h != null) {
            unf.a(this.a);
        }
    }
}

package defpackage;

/* renamed from: foo */
final class foo implements Runnable {
    private final /* synthetic */ fop a;

    foo(fop fop) {
        this.a = fop;
    }

    public final void run() {
        synchronized (this.a) {
            Runnable runnable = this.a.a;
            if (runnable != null) {
                runnable.run();
                this.a.a = null;
            }
        }
    }
}

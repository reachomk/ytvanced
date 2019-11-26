package defpackage;

/* renamed from: not */
final class not implements Runnable {
    private final /* synthetic */ nni a;
    private final /* synthetic */ nou b;

    not(nou nou, nni nni) {
        this.b = nou;
        this.a = nni;
    }

    public final void run() {
        nou nou = this.b;
        nou.a.a(nou.b, this.a);
    }
}

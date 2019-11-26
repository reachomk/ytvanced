package defpackage;

/* renamed from: amkd */
final class amkd implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ amkc b;

    amkd(amkc amkc, boolean z) {
        this.b = amkc;
        this.a = z;
    }

    public final void run() {
        this.b.a.k(this.a);
    }
}

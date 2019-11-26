package defpackage;

/* renamed from: ahxi */
final class ahxi implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ ahxc b;

    ahxi(ahxc ahxc, boolean z) {
        this.b = ahxc;
        this.a = z;
    }

    public final void run() {
        this.b.b(this.a);
    }
}

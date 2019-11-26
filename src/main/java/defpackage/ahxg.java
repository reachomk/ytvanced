package defpackage;

/* renamed from: ahxg */
final /* synthetic */ class ahxg implements Runnable {
    private final ahxc a;
    private final int b;

    ahxg(ahxc ahxc, int i) {
        this.a = ahxc;
        this.b = i;
    }

    public final void run() {
        this.a.a(this.b);
    }
}

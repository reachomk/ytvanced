package defpackage;

/* renamed from: adyf */
final /* synthetic */ class adyf implements Runnable {
    private final adyc a;
    private final int b;

    adyf(adyc adyc, int i) {
        this.a = adyc;
        this.b = i;
    }

    public final void run() {
        this.a.a(this.b);
    }
}

package defpackage;

/* renamed from: ajpi */
final /* synthetic */ class ajpi implements Runnable {
    private final ajpe a;
    private final ajpn b;

    ajpi(ajpe ajpe, ajpn ajpn) {
        this.a = ajpe;
        this.b = ajpn;
    }

    public final void run() {
        ajpe ajpe = this.a;
        if (this.b == ajpe.e) {
            ajpe.e = null;
            ajpe.f = null;
            ajpe.b();
        }
    }
}

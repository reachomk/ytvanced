package defpackage;

/* renamed from: zgo */
final /* synthetic */ class zgo implements Runnable {
    private final zgp a;
    private final zir b;

    zgo(zgp zgp, zir zir) {
        this.a = zgp;
        this.b = zir;
    }

    public final void run() {
        zgp zgp = this.a;
        zir zir = this.b;
        zir.a = true;
        zir.onLongPress(zgp.a);
    }
}

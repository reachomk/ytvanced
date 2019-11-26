package defpackage;

/* renamed from: opc */
final /* synthetic */ class opc implements Runnable {
    private final opa a;

    opc(opa opa) {
        this.a = opa;
    }

    public final void run() {
        opa opa = this.a;
        if (!opa.x) {
            ((ooi) oxz.a(opa.j)).a(opa);
        }
    }
}

package defpackage;

/* renamed from: acbl */
final /* synthetic */ class acbl implements Runnable {
    private final acay a;
    private final boolean b;
    private final acas c;

    acbl(acay acay, boolean z, acas acas) {
        this.a = acay;
        this.b = z;
        this.c = acas;
    }

    public final void run() {
        acay acay = this.a;
        boolean z = this.b;
        acas acas = this.c;
        if (acay.w == 0) {
            acay.a(2, acas);
        } else if (!acay.r && z) {
            acay.a(3, acas);
        } else {
            acay.h = z;
            acay.g();
            acay.a(0, acas);
        }
    }
}

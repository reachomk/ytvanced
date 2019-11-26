package defpackage;

/* renamed from: acbk */
final /* synthetic */ class acbk implements Runnable {
    private final acay a;
    private final acas b;
    private final int c;

    acbk(acay acay, acas acas, int i) {
        this.a = acay;
        this.b = acas;
        this.c = i;
    }

    public final void run() {
        acay acay = this.a;
        acas acas = this.b;
        int i = this.c;
        if (acas != null) {
            acas.a(i, acay.h);
        }
    }
}

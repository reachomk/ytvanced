package defpackage;

/* renamed from: acbf */
final /* synthetic */ class acbf implements Runnable {
    private final acay a;
    private final int b;

    acbf(acay acay, int i) {
        this.a = acay;
        this.b = i;
    }

    public final void run() {
        acay acay = this.a;
        int i = this.b;
        acau acau = acay.y;
        if (acau != null) {
            acau.a(i);
            acay.y = null;
        }
    }
}

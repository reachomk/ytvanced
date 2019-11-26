package defpackage;

/* renamed from: acdd */
final /* synthetic */ class acdd implements Runnable {
    private final acda a;
    private final int b;
    private final acal c;

    acdd(acda acda, int i, acal acal) {
        this.a = acda;
        this.b = i;
        this.c = acal;
    }

    public final void run() {
        acda acda = this.a;
        int i = this.b;
        acal acal = this.c;
        acda.a.a(i);
        if (acal != null) {
            acda.b.post(new acdc(acal));
        }
    }
}

package defpackage;

/* renamed from: acci */
final /* synthetic */ class acci implements Runnable {
    private final accj a;
    private final int b;
    private final acal c;

    acci(accj accj, int i, acal acal) {
        this.a = accj;
        this.b = i;
        this.c = acal;
    }

    public final void run() {
        accj accj = this.a;
        int i = this.b;
        acal acal = this.c;
        accj.a.a(i);
        if (acal != null) {
            accj.b.post(new accl(acal));
        }
    }
}

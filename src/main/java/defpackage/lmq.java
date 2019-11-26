package defpackage;

/* renamed from: lmq */
final /* synthetic */ class lmq implements Runnable {
    private final lmo a;

    lmq(lmo lmo) {
        this.a = lmo;
    }

    public final void run() {
        lmo lmo = this.a;
        int i = lmo.c;
        amqw.b(i == 2, "State = %s", i);
        lmo.a();
        i = lmo.d - 1;
        lmo.d = i;
        if (i > 0) {
            lmo.a.b();
            return;
        }
        lmo.c++;
        lmo.b();
    }
}

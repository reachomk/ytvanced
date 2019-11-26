package defpackage;

/* renamed from: lmt */
final /* synthetic */ class lmt implements Runnable {
    private final lmo a;

    lmt(lmo lmo) {
        this.a = lmo;
    }

    public final void run() {
        lmo lmo = this.a;
        int i = lmo.c;
        amqw.b(i == 4, "State = %s", i);
        if (!lmo.a(lmo.b)) {
            lmo.c++;
            lmo.b();
        }
    }
}

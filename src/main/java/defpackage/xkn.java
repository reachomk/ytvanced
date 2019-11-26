package defpackage;

/* renamed from: xkn */
final /* synthetic */ class xkn implements Runnable {
    private final xko a;

    xkn(xko xko) {
        this.a = xko;
    }

    public final void run() {
        xko xko = this.a;
        amqw.a(xko.b, (Object) "Timing out, callback not provided");
        int i = 2;
        if (xko.a != 2) {
            i = 1;
        }
        xko.a = 3;
        xko.b.a(i);
    }
}

package defpackage;

/* renamed from: accx */
final /* synthetic */ class accx implements Runnable {
    private final acck a;
    private final int b;
    private final arml c;

    accx(acck acck, int i, arml arml) {
        this.a = acck;
        this.b = i;
        this.c = arml;
    }

    public final void run() {
        acck acck = this.a;
        int i = this.b;
        arml arml = this.c;
        accz accz = acck.j;
        if (accz != null) {
            accz.a(i, arml);
        }
    }
}

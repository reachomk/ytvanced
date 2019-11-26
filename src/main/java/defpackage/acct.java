package defpackage;

/* renamed from: acct */
final /* synthetic */ class acct implements Runnable {
    private final acck a;
    private final int b;
    private final arml c;

    acct(acck acck, int i, arml arml) {
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
            accz.a(i, null, arml);
        }
    }
}

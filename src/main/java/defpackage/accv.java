package defpackage;

/* renamed from: accv */
final /* synthetic */ class accv implements Runnable {
    private final acck a;
    private final String b;

    accv(acck acck, String str) {
        this.a = acck;
        this.b = str;
    }

    public final void run() {
        acck acck = this.a;
        String str = this.b;
        accz accz = acck.j;
        if (accz != null) {
            accz.a(str);
        }
    }
}

package defpackage;

/* renamed from: accq */
final /* synthetic */ class accq implements Runnable {
    private final acck a;
    private final int b;
    private final String c;

    accq(acck acck, int i, String str) {
        this.a = acck;
        this.b = i;
        this.c = str;
    }

    public final void run() {
        acck acck = this.a;
        int i = this.b;
        String str = this.c;
        accz accz = acck.j;
        if (accz != null) {
            accz.a(i, str, null);
        }
    }
}

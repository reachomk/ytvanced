package defpackage;

/* renamed from: accs */
final /* synthetic */ class accs implements Runnable {
    private final acck a;
    private final String b;
    private final String c;
    private final int d;

    accs(acck acck, String str, String str2, int i) {
        this.a = acck;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final void run() {
        acck acck = this.a;
        String str = this.b;
        String str2 = this.c;
        int i = this.d;
        accz accz = acck.j;
        if (accz != null) {
            accz.a(str, str2, i);
        }
    }
}

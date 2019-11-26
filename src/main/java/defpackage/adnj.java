package defpackage;

/* renamed from: adnj */
final /* synthetic */ class adnj implements Runnable {
    private final adnh a;
    private final xtu b;
    private final int c;
    private final int d;

    adnj(adnh adnh, xtu xtu, int i, int i2) {
        this.a = adnh;
        this.b = xtu;
        this.c = i;
        this.d = i2;
    }

    public final void run() {
        adnh adnh = this.a;
        xtu xtu = this.b;
        int i = this.c;
        int i2 = this.d;
        int c = xtu.c();
        int i3 = c - 1;
        if (c == 0) {
            throw null;
        } else if (i3 == 1) {
            adnh.d.b(0, i, i2);
            adnh.d.a(0, i, i2);
        } else if (i3 == 2) {
            adnh.d.a(0, i, i2);
        } else if (i3 == 3) {
            adnh.d.b(0, i, i2);
        }
    }
}

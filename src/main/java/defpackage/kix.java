package defpackage;

/* renamed from: kix */
final /* synthetic */ class kix implements Runnable {
    private final kis a;
    private final String b;
    private final double c;

    kix(kis kis, String str, double d) {
        this.a = kis;
        this.b = str;
        this.c = d;
    }

    public final void run() {
        kis kis = this.a;
        String str = this.b;
        double d = this.c;
        fno fno = (fno) kis.a.e.get(str);
        if (fno != null) {
            fno.f = d;
            kis.a.a(str);
        }
    }
}

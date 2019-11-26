package defpackage;

/* renamed from: kiy */
final /* synthetic */ class kiy implements Runnable {
    private final kis a;
    private final String b;

    kiy(kis kis, String str) {
        this.a = kis;
        this.b = str;
    }

    public final void run() {
        kis kis = this.a;
        fno fno = (fno) kis.a.e.get(this.b);
        if (fno != null) {
            fno.a();
            kis.a.a(fno);
        }
    }
}

package defpackage;

/* renamed from: kiz */
final /* synthetic */ class kiz implements Runnable {
    private final kis a;
    private final String b;
    private final amec c;

    kiz(kis kis, String str, amec amec) {
        this.a = kis;
        this.b = str;
        this.c = amec;
    }

    public final void run() {
        kis kis = this.a;
        String str = this.b;
        amec amec = this.c;
        fno fno = (fno) kis.a.e.get(str);
        if (fno != null) {
            fno.a(amec);
            kis.a.a(fno);
        }
    }
}

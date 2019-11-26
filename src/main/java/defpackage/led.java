package defpackage;

/* renamed from: led */
final /* synthetic */ class led implements eqy {
    private final leb a;

    led(leb leb) {
        this.a = leb;
    }

    public final void a(long j) {
        leb leb = this.a;
        leb.k = j;
        if (j <= 0) {
            leb.j.setEnabled(false);
        } else {
            leb.j.setEnabled(true);
        }
    }
}

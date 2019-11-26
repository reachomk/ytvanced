package defpackage;

/* renamed from: yqj */
final /* synthetic */ class yqj implements xsd {
    private final yqk a;

    yqj(yqk yqk) {
        this.a = yqk;
    }

    public final void a(Object obj) {
        yqk yqk = this.a;
        yko yko = (yko) obj;
        if (yko.b()) {
            if (yqk.k != null) {
                yqk.j.h.a(yko.getBodyKey(), yqk.k);
                yqk.k = null;
            }
            yqk.a(yko.a, new yql(yqk));
            yqk.a(yko.getBodyKey(), new yqo(yqk, yko));
        }
    }
}

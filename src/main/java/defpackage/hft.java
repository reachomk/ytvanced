package defpackage;

/* renamed from: hft */
final /* synthetic */ class hft implements hds {
    private final hfo a;
    private final aakj b;

    hft(hfo hfo, aakj aakj) {
        this.a = hfo;
        this.b = aakj;
    }

    public final void a() {
        hfo hfo = this.a;
        aakj aakj = this.b;
        adqe adqe = hfo.e;
        if (adqe == null) {
            xtl.b(hfo.a, "MDx session is null, not handling auto play video request.");
        } else {
            adqe.b(adpw.n().a(aakj.b()).e());
        }
    }
}

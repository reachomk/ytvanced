package defpackage;

/* renamed from: yaz */
final /* synthetic */ class yaz implements bqk {
    private final yax a;
    private final algc b;
    private final apxu c;

    yaz(yax yax, algc algc, apxu apxu) {
        this.a = yax;
        this.b = algc;
        this.c = apxu;
    }

    public final void a(bqn bqn) {
        yax yax = this.a;
        algc algc = this.b;
        apxu apxu = this.c;
        yax.a.c(bqn);
        if (algc != null) {
            algc.b(apxu);
        }
        amxo amxo = (amxo) yax.d.iterator();
        while (amxo.hasNext()) {
            ((algc) amxo.next()).b(apxu);
        }
    }
}

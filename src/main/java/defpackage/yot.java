package defpackage;

/* renamed from: yot */
final /* synthetic */ class yot implements xsd {
    private final yor a;

    yot(yor yor) {
        this.a = yor;
    }

    public final void a(Object obj) {
        yor yor = this.a;
        aadz aadz = (aadz) obj;
        ylf ylf = (ylf) aadz.c();
        if (ylf != null && ylf.b()) {
            yor.i = ylf;
            yor.j = (ymh) aadz.e().a("technodrome_metadata", ymh.d.getParserForType());
            yor.f.a(yor.f(), false);
            yor.a(yor.k);
            if (yor.i.a(yor.g)) {
                yor.f.a(false);
            } else {
                yor.k = yor.e.a(yor.i.getAuthorKey(), new yov(yor), true, yor.c);
            }
        }
    }
}

package defpackage;

/* renamed from: yph */
final /* synthetic */ class yph implements xsd {
    private final ypf a;

    yph(ypf ypf) {
        this.a = ypf;
    }

    public final void a(Object obj) {
        ypf ypf = this.a;
        aadz aadz = (aadz) obj;
        ykk ykk = (ykk) aadz.c();
        yml yml = (yml) aadz.e().a("technodrome_metadata", yml.d.getParserForType());
        if (ykk != null && ykk.b()) {
            ypf.r = ykk;
            ypf.s = yml;
            if (ypf.t == null) {
                ypf.t = ypf.e.a(ypf.f, new ypm(ypf), false, ypf.n);
            }
            ypf.f();
        }
    }
}

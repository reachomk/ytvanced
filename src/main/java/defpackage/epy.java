package defpackage;

/* renamed from: epy */
final /* synthetic */ class epy implements bcvk {
    private final epx a;

    epy(epx epx) {
        this.a = epx;
    }

    public final void a(Object obj) {
        epx epx = this.a;
        Boolean bool = (Boolean) obj;
        epx.e.a(bool.booleanValue());
        fej fej = epx.a;
        if (fej != null) {
            fej.b(!bool.booleanValue() ? 2 : 1);
        }
        aptk aptk = epx.e;
        if ((((aptl) aptk.instance).a & 256) != 0) {
            epx.d.b(new acvs(aptk.a().d()), epx.a((aptl) ((anxl) epx.e.build())));
        }
    }
}

package defpackage;

/* renamed from: waq */
public final class waq {
    private final xsc a;
    private final acum b;

    public waq(xsc xsc, acum acum) {
        this.a = xsc;
        this.b = acum;
    }

    public final void a(asmw asmw) {
        this.b.a(asmw, this.a.a());
    }

    public final void a(int i) {
        aonu aonu = (aonu) aonv.c.createBuilder();
        aonu.copyOnWrite();
        aonv aonv = (aonv) aonu.instance;
        aonv.a |= 1;
        aonv.b = i - 1;
        aonv aonv2 = (aonv) ((anxl) aonu.build());
        asmz asmz = (asmz) asmw.f.createBuilder();
        aons aons = (aons) aont.c.createBuilder();
        aons.copyOnWrite();
        aont aont = (aont) aons.instance;
        if (aonv2 != null) {
            aont.b = aonv2;
            aont.a = 11;
            asmz.a(aons);
            a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }
}

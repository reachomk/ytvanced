package defpackage;

/* renamed from: ssq */
public final class ssq implements swd {
    private final bapu a;
    private final bbmn b;

    public ssq(bapu bapu, bbmn bbmn) {
        this.a = bapu;
        this.b = bbmn;
    }

    public final anwy a() {
        return azvb.g;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        azsr azsr;
        azvb azvb = (azvb) obj;
        swf swf = (swf) this.a.get();
        if ((azvb.a & 1) != 0) {
            azsr = azvb.b;
            if (azsr == null) {
                azsr = azsr.a;
            }
            swf.a(azsr, swg).c();
        }
        if ((azvb.a & 2) == 0) {
            return bblt.a();
        }
        bbmm bJ_;
        azsr = azvb.c;
        if (azsr == null) {
            azsr = azsr.a;
        }
        bblt b = swf.a(azsr, swg).b(this.b);
        if (b instanceof bbpa) {
            bJ_ = ((bbpa) b).bJ_();
        } else {
            bJ_ = new bbqs(b);
        }
        return new bbvg(bJ_).b(new ssp(azvb, swf, swg));
    }
}

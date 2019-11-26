package defpackage;

/* renamed from: ssp */
final /* synthetic */ class ssp implements bbnv {
    private final azvb a;
    private final swf b;
    private final swg c;

    ssp(azvb azvb, swf swf, swg swg) {
        this.a = azvb;
        this.b = swf;
        this.c = swg;
    }

    public final Object a(Object obj) {
        azvb azvb = this.a;
        swf swf = this.b;
        swg swg = this.c;
        azsr azsr;
        if (((bbmf) obj).a == null) {
            if ((azvb.a & 4) == 0) {
                return bblt.a();
            }
            azsr = azvb.d;
            if (azsr == null) {
                azsr = azsr.a;
            }
            return swf.a(azsr, swg);
        } else if ((azvb.a & 8) == 0) {
            return bblt.a();
        } else {
            azsr = azvb.e;
            if (azsr == null) {
                azsr = azsr.a;
            }
            return swf.a(azsr, swg);
        }
    }
}

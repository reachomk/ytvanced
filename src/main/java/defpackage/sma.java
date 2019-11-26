package defpackage;

/* renamed from: sma */
final /* synthetic */ class sma implements bbnv {
    private final slx a;
    private final bdgm b;
    private final swk c;
    private final syc d;

    sma(slx slx, bdgm bdgm, swk swk, syc syc) {
        this.a = slx;
        this.b = bdgm;
        this.c = swk;
        this.d = syc;
    }

    public final Object a(Object obj) {
        bbmi c;
        slx slx = this.a;
        bdgm bdgm = this.b;
        swk swk = this.c;
        syc syc = this.d;
        syf syf = (syf) obj;
        if (bdgm.e == null) {
            bdgt bdgt = bdgm.d;
            if (bdgt == null || szb.a(bdgt, bdgv.a) != null) {
                c = stx.a(bdgm, slx.a).c(smf.a);
                return c.c(new smi(syc, syf));
            }
        }
        c = bbmi.a(new stk(bdgm, slx.a, slx.b.a(swk)));
        return c.c(new smi(syc, syf));
    }
}

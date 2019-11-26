package defpackage;

/* renamed from: abmc */
public final class abmc extends aaml {
    public String a = "";

    public abmc(aamd aamd, afpt afpt) {
        super("ypc/get_offer_details", aamd, afpt);
    }

    private final atpd n() {
        atpd atpd = (atpd) atpe.d.createBuilder();
        String str = this.a;
        atpd.copyOnWrite();
        atpe atpe = (atpe) atpd.instance;
        if (str != null) {
            atpe.a |= 2;
            atpe.c = str;
            return atpd;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((atpe) ((anxl) n().build())).c);
    }

    public final /* synthetic */ anzd c() {
        return n();
    }
}

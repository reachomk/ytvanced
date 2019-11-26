package defpackage;

/* renamed from: abku */
public final class abku extends aaml {
    public String a = "";

    public abku(aamd aamd, afpt afpt) {
        super("ypc/get_offline_upsell", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        atph atph = (atph) atpi.d.createBuilder();
        String str = this.a;
        atph.copyOnWrite();
        atpi atpi = (atpi) atph.instance;
        if (str != null) {
            atpi.a |= 2;
            atpi.c = str;
            return atph;
        }
        throw new NullPointerException();
    }
}

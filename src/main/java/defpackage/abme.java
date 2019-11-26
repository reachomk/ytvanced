package defpackage;

/* renamed from: abme */
public final class abme extends aaml {
    public String a = "";

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((atqi) ((anxl) n().build())).c);
    }

    private final atqh n() {
        atqh atqh = (atqh) atqi.d.createBuilder();
        String str = this.a;
        atqh.copyOnWrite();
        atqi atqi = (atqi) atqh.instance;
        if (str != null) {
            atqi.a |= 2;
            atqi.c = str;
            return atqh;
        }
        throw new NullPointerException();
    }

    public final /* synthetic */ anzd c() {
        return n();
    }

    public /* synthetic */ abme(aamd aamd, afpt afpt) {
        super("ypc/get_tip_module", aamd, afpt);
    }
}

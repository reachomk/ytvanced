package defpackage;

/* renamed from: abai */
public final class abai extends aaml {
    public aukf a;
    public String b;

    public abai(aamd aamd, afpt afpt) {
        super("live/get_broadcast_setup", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        aspp aspp;
        asps asps = (asps) aspp.e.createBuilder();
        aukf aukf = this.a;
        if (aukf != null) {
            asps.copyOnWrite();
            aspp = (aspp) asps.instance;
            aspp.c = aukf;
            aspp.a |= 2;
        }
        String str = this.b;
        if (str != null) {
            asps.copyOnWrite();
            aspp = (aspp) asps.instance;
            aspp.a |= 4;
            aspp.d = str;
        }
        return asps;
    }
}

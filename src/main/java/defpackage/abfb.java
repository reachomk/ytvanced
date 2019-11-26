package defpackage;

/* renamed from: abfb */
public final class abfb extends aaml {
    public anvu a = null;

    public abfb(aamd aamd, afpt afpt) {
        super("live_chat/get_live_chat_super_sticker_buy_flow", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        asri asri = (asri) asrf.d.createBuilder();
        anvu anvu = this.a;
        if (anvu != null) {
            asri.copyOnWrite();
            asrf asrf = (asrf) asri.instance;
            asrf.a |= 2;
            asrf.c = anvu;
        }
        return asri;
    }
}

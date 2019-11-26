package defpackage;

/* renamed from: abaz */
public final class abaz extends aaml {
    public anvu a = anvu.a;

    public abaz(aamd aamd, afpt afpt) {
        super("live_chat/get_item_context_menu", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        asve asve = (asve) asvb.d.createBuilder();
        anvu anvu = this.a;
        asve.copyOnWrite();
        asvb asvb = (asvb) asve.instance;
        if (anvu != null) {
            asvb.a |= 2;
            asvb.c = anvu;
            return asve;
        }
        throw new NullPointerException();
    }
}

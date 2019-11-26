package defpackage;

/* renamed from: abcc */
public final class abcc extends aaml {
    public anvu a = anvu.a;

    public abcc(aamd aamd, afpt afpt) {
        super("live_chat/moderate", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        asvk asvk = (asvk) asvh.d.createBuilder();
        anvu anvu = this.a;
        asvk.copyOnWrite();
        asvh asvh = (asvh) asvk.instance;
        if (anvu != null) {
            asvh.a |= 2;
            asvh.c = anvu;
            return asvk;
        }
        throw new NullPointerException();
    }
}

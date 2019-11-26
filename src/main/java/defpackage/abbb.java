package defpackage;

/* renamed from: abbb */
public final class abbb extends aaml {
    public aucm a;
    private String b = "";

    public abbb(aamd aamd, afpt afpt) {
        super("live_chat/get_live_chat_replay", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final abbb a(ajtf ajtf) {
        this.b = aali.b(ajtf.a());
        a(ajtf.b());
        return this;
    }

    public final /* synthetic */ anzd c() {
        asvq asvq = (asvq) asvn.e.createBuilder();
        String str = this.b;
        asvq.copyOnWrite();
        asvn asvn = (asvn) asvq.instance;
        if (str != null) {
            asvn.a |= 4;
            asvn.c = str;
            aucm aucm = this.a;
            if (aucm != null) {
                asvq.copyOnWrite();
                asvn = (asvn) asvq.instance;
                asvn.d = aucm;
                asvn.a |= 8;
            }
            return asvq;
        }
        throw new NullPointerException();
    }
}

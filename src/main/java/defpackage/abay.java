package defpackage;

/* renamed from: abay */
public final class abay extends aaml {
    public anvu a = anvu.a;

    public abay(aamd aamd, afpt afpt) {
        super("live_chat/get_live_chat_message_buy_flow", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        asvo asvo = (asvo) asvl.d.createBuilder();
        anvu anvu = this.a;
        asvo.copyOnWrite();
        asvl asvl = (asvl) asvo.instance;
        if (anvu != null) {
            asvl.a |= 2;
            asvl.c = anvu;
            return asvo;
        }
        throw new NullPointerException();
    }
}

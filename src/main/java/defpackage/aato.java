package defpackage;

/* renamed from: aato */
public final class aato extends aaml {
    public String a;

    public aato(aamd aamd, afpt afpt) {
        super("conversation/get_invite_more_panel", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        asdx asdx = (asdx) asdu.d.createBuilder();
        String str = this.a;
        asdx.copyOnWrite();
        asdu asdu = (asdu) asdx.instance;
        if (str != null) {
            asdu.a |= 2;
            asdu.c = str;
            return asdx;
        }
        throw new NullPointerException();
    }
}

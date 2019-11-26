package defpackage;

/* renamed from: abjv */
public final class abjv extends aaml {
    public String a;

    public abjv(aamd aamd, afpt afpt) {
        super("video/delete", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        atnx atnx = (atnx) atny.d.createBuilder();
        String str = this.a;
        atnx.copyOnWrite();
        atny atny = (atny) atnx.instance;
        if (str != null) {
            atny.a |= 2;
            atny.c = str;
            return atnx;
        }
        throw new NullPointerException();
    }
}

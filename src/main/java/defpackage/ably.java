package defpackage;

/* renamed from: ably */
public final class ably extends aaml {
    public String a = "";

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        aswe aswe = (aswe) aswb.d.createBuilder();
        String str = this.a;
        aswe.copyOnWrite();
        aswb aswb = (aswb) aswe.instance;
        if (str != null) {
            aswb.a |= 2;
            aswb.c = str;
            return aswe;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ ably(aamd aamd, afpt afpt) {
        super("sponsors/manage_sponsorship", aamd, afpt);
    }
}

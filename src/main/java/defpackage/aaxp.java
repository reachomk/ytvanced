package defpackage;

/* renamed from: aaxp */
public final class aaxp extends aaml {
    public String a;

    public aaxp(aamd aamd, afpt afpt) {
        super("flag/details", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        asok asok = (asok) asoh.d.createBuilder();
        String str = this.a;
        asok.copyOnWrite();
        asoh asoh = (asoh) asok.instance;
        if (str != null) {
            asoh.a |= 2;
            asoh.c = str;
            return asok;
        }
        throw new NullPointerException();
    }
}

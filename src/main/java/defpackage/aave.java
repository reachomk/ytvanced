package defpackage;

/* renamed from: aave */
public final class aave extends aaml {
    public String a;
    public String b;

    public aave(aamd aamd, afpt afpt) {
        super("comment/update_comment", aamd, afpt);
        String str = "";
        this.a = str;
        this.b = str;
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        asgg asgg = (asgg) asgh.e.createBuilder();
        String str = this.a;
        asgg.copyOnWrite();
        asgh asgh = (asgh) asgg.instance;
        if (str != null) {
            asgh.a |= 2;
            asgh.c = str;
            str = this.b;
            asgg.copyOnWrite();
            asgh = (asgh) asgg.instance;
            if (str != null) {
                asgh.a |= 4;
                asgh.d = str;
                return asgg;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}

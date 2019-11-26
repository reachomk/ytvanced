package defpackage;

/* renamed from: aavf */
public final class aavf extends aaml {
    public String a;
    public String b;

    public aavf(aamd aamd, afpt afpt) {
        super("comment/update_comment_reply", aamd, afpt);
        String str = "";
        this.a = str;
        this.b = str;
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
        xvd.a(this.b);
    }

    public final /* synthetic */ anzd c() {
        asge asge = (asge) asgf.e.createBuilder();
        String str = this.a;
        asge.copyOnWrite();
        asgf asgf = (asgf) asge.instance;
        if (str != null) {
            asgf.a |= 2;
            asgf.c = str;
            str = this.b;
            asge.copyOnWrite();
            asgf = (asgf) asge.instance;
            if (str != null) {
                asgf.a |= 4;
                asgf.d = str;
                return asge;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}

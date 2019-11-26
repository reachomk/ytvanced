package defpackage;

/* renamed from: ablg */
public final class ablg extends aaml {
    public String a;

    public ablg(aamd aamd, afpt afpt) {
        super("ypc/resume_subscription", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a, (Object) "resume params must be specified");
    }

    public final /* synthetic */ anzd c() {
        atgi atgi = (atgi) atgf.d.createBuilder();
        String str = this.a;
        atgi.copyOnWrite();
        atgf atgf = (atgf) atgi.instance;
        if (str != null) {
            atgf.a |= 2;
            atgf.c = str;
            return atgi;
        }
        throw new NullPointerException();
    }
}

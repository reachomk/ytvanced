package defpackage;

/* renamed from: aaoo */
public final class aaoo extends aaml {
    public atfx a;
    public String b;
    public String c;

    public aaoo(aamd aamd, afpt afpt) {
        super("account/request_verification_code", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
        xvd.a(this.b);
        xvd.a(this.c);
    }

    public final /* synthetic */ anzd c() {
        atge atge = (atge) atgb.f.createBuilder();
        atfx atfx = this.a;
        atge.copyOnWrite();
        atgb atgb = (atgb) atge.instance;
        if (atfx != null) {
            atgb.a |= 2;
            atgb.c = atfx.c;
            String str = this.b;
            atge.copyOnWrite();
            atgb = (atgb) atge.instance;
            if (str != null) {
                atgb.a |= 4;
                atgb.d = str;
                str = this.c;
                atge.copyOnWrite();
                atgb = (atgb) atge.instance;
                if (str != null) {
                    atgb.a |= 8;
                    atgb.e = str;
                    return atge;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}

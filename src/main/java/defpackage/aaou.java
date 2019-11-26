package defpackage;

/* renamed from: aaou */
public final class aaou extends aaml {
    public Long a;
    public String b;

    public aaou(aamd aamd, afpt afpt) {
        super("account/validate_verification_code", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
        xvd.a(this.b);
    }

    public final /* synthetic */ anzd c() {
        atmj atmj = (atmj) atmk.e.createBuilder();
        long longValue = this.a.longValue();
        atmj.copyOnWrite();
        atmk atmk = (atmk) atmj.instance;
        atmk.a |= 2;
        atmk.c = longValue;
        String str = this.b;
        atmj.copyOnWrite();
        atmk atmk2 = (atmk) atmj.instance;
        if (str != null) {
            atmk2.a |= 4;
            atmk2.d = str;
            return atmj;
        }
        throw new NullPointerException();
    }
}

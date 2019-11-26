package defpackage;

/* renamed from: aaye */
public class aaye extends aaml {
    public String a;
    public String b;
    public int c = -1;

    protected aaye(aamd aamd, afpt afpt) {
        super("player/heartbeat", aamd, afpt);
    }

    public aaye c(String str) {
        this.a = str;
        return this;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        xvd.a(this.j);
        xvd.a(this.a);
        xvd.a(this.b);
        amqw.b(this.c >= 0);
    }

    /* renamed from: n */
    public atcb c() {
        atcb atcb = (atcb) atcc.f.createBuilder();
        atcb.a(this.a);
        String str = this.b;
        atcb.copyOnWrite();
        atcc atcc = (atcc) atcb.instance;
        if (str != null) {
            atcc.a |= 4;
            atcc.d = str;
            int i = this.c;
            atcb.copyOnWrite();
            atcc = (atcc) atcb.instance;
            atcc.a |= 32;
            atcc.e = i;
            return atcb;
        }
        throw new NullPointerException();
    }
}

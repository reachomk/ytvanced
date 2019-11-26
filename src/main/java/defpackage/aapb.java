package defpackage;

/* renamed from: aapb */
public final class aapb extends aaml {
    public String a;
    public String b;
    public String c;
    public long d = -2;
    public long e = -1;
    public int p = -1;
    public long q = -1;
    public int r = -1;
    public int s = -1;
    public int t = 0;
    public int u = 0;
    public String v;
    public boolean w;
    public amul x;

    public aapb(aamd aamd, afpt afpt) {
        super("player/ad_break", aamd, afpt, aall.ENABLED);
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.v = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        String str = "";
        amqw.b(str.equals(this.a) ^ 1);
        amqw.b(str.equals(this.b) ^ 1);
        boolean z = false;
        amqw.b(this.p != -1);
        amqw.b(this.r != -1);
        amqw.b(this.s != -1);
        amqw.b(this.t != -1);
        if (this.u != -1) {
            z = true;
        }
        amqw.b(z);
        amqw.b(str.equals(this.v) ^ 1);
    }

    public final /* synthetic */ anzd c() {
        arzn arzn = (arzn) arzk.j.createBuilder();
        String str = this.a;
        arzn.copyOnWrite();
        arzk arzk = (arzk) arzn.instance;
        if (str != null) {
            int i = 4;
            arzk.a |= 4;
            arzk.c = str;
            str = this.c;
            arzn.copyOnWrite();
            arzk = (arzk) arzn.instance;
            if (str != null) {
                arzk.a |= 16384;
                arzk.h = str;
                long j = this.d;
                arzn.copyOnWrite();
                arzk arzk2 = (arzk) arzn.instance;
                arzk2.a |= 8;
                arzk2.d = j;
                j = this.e;
                arzn.copyOnWrite();
                arzk2 = (arzk) arzn.instance;
                arzk2.a |= 32768;
                arzk2.i = j;
                int i2 = this.p;
                arzn.copyOnWrite();
                arzk = (arzk) arzn.instance;
                arzk.a |= 16;
                arzk.e = i2;
                str = this.b;
                arzn.copyOnWrite();
                arzk = (arzk) arzn.instance;
                if (str != null) {
                    arzk.a |= 64;
                    arzk.g = str;
                    awam awam = (awam) awan.s.createBuilder();
                    awam.a(this.v);
                    awam.a(this.q);
                    awam.a(this.r);
                    int i3 = this.s;
                    if (i3 != -1) {
                        awam.d(i3);
                    }
                    awam.c(this.t);
                    awam.b(this.u);
                    if (this.w) {
                        i = 3;
                    }
                    awam.copyOnWrite();
                    awan awan = (awan) awam.instance;
                    awan.a |= 134217728;
                    awan.q = i - 1;
                    amul amul = this.x;
                    if (!(amul == null || amul.isEmpty())) {
                        arkk arkk = (arkk) arkl.f.createBuilder();
                        arkk.a(this.x);
                        awam.a(arkk);
                    }
                    awas awas = (awas) awat.g.createBuilder();
                    awas.a(awam);
                    arzn.copyOnWrite();
                    arzk arzk3 = (arzk) arzn.instance;
                    arzk3.f = (awat) ((anxl) awas.build());
                    arzk3.a |= 32;
                    return arzn;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}

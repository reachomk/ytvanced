package defpackage;

/* renamed from: abmg */
public final class abmg extends aaml {
    public String a;
    public String b;
    public String c;
    public int d = 1;

    public abmg(aamd aamd, afpt afpt) {
        super("ypc/update_cross_device_offline_state", aamd, afpt);
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
    }

    private final atkd n() {
        atkd atkd = (atkd) atke.g.createBuilder();
        String str = this.a;
        atkd.copyOnWrite();
        atke atke = (atke) atkd.instance;
        if (str != null) {
            atke.a |= 2;
            atke.c = str;
            int i = this.d;
            atkd.copyOnWrite();
            atke = (atke) atkd.instance;
            if (i != 0) {
                atke.a |= 4;
                atke.d = i - 1;
                str = this.b;
                atkd.copyOnWrite();
                atke = (atke) atkd.instance;
                if (str != null) {
                    atke.a |= 8;
                    atke.e = str;
                    str = this.c;
                    atkd.copyOnWrite();
                    atke = (atke) atkd.instance;
                    if (str != null) {
                        atke.a |= 16;
                        atke.f = str;
                        return atkd;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        atke atke = (atke) ((anxl) n().build());
        xvd.a(atke.c);
        xvd.a(atke.e);
        int a = azmk.a(atke.d);
        boolean z = false;
        if (!(a == 0 || a == 1)) {
            z = true;
        }
        amqw.b(z);
        xvd.a(atke.f);
    }

    public final /* synthetic */ anzd c() {
        return n();
    }
}

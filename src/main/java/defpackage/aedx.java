package defpackage;

/* renamed from: aedx */
public final class aedx implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aedx(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aedx a(bcaa bcaa, bcaa bcaa2) {
        return new aedx(bcaa, bcaa2);
    }

    public static afjb a(xsc xsc, aajk aajk) {
        aajj aajj = (aajj) aajk.get();
        awdg awdg = aajj.c;
        float f = 5.0f;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.bk != 0.0f) {
                arhh = aajj.c.d;
                if (arhh == null) {
                    arhh = arhh.bv;
                }
                f = arhh.bk;
            }
        }
        double d = (double) f;
        awdg awdg2 = aajj.c;
        boolean z = false;
        if ((awdg2.a & 2) != 0) {
            arhh arhh2 = awdg2.d;
            if (arhh2 == null) {
                arhh2 = arhh.bv;
            }
            if (arhh2.bl) {
                z = true;
            }
        }
        return (afjb) baqd.a(new afjb(xsc, d, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aedx.a((xsc) this.a.get(), (aajk) this.b.get());
    }
}

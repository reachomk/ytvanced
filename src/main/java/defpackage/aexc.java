package defpackage;

/* renamed from: aexc */
final class aexc {
    public final aexs a;
    public final aeyt b;
    public final afjc c;
    public final xhv d;
    public final afgz e;
    public final afjv f;
    public final bcaa g;
    public final ozb h;
    public volatile afkh i;
    public volatile afaj j;
    private final amro k;
    private final amro l;

    aexc(aexs aexs, aeyt aeyt, afjc afjc, xhv xhv, afgz afgz, afjv afjv, bcaa bcaa, amro amro, amro amro2, ozb ozb) {
        this.a = aexs;
        this.b = aeyt;
        this.c = afjc;
        this.d = xhv;
        this.e = afgz;
        this.f = afjv;
        this.g = bcaa;
        this.k = amro;
        this.l = amro2;
        this.h = ozb;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.i != null;
    }

    /* Access modifiers changed, original: final */
    public final afjs b() {
        afkh afkh = this.i;
        return (afkh == null || !afkh.n()) ? null : new afjs(afkh.a(), afkh.b());
    }

    /* Access modifiers changed, original: final */
    public final aajj c() {
        afaj afaj = this.j;
        return afaj == null ? aajj.b : afaj.d();
    }

    /* Access modifiers changed, original: final */
    public final aeuy d() {
        afaj afaj = this.j;
        return afaj == null ? aeuy.e : afaj.c;
    }

    /* Access modifiers changed, original: final */
    public final amro a(aajj aajj) {
        awdg awdg = aajj.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.bq) {
                return this.k;
            }
        }
        return aexf.a;
    }

    public final amro b(aajj aajj) {
        if (aajj.Q()) {
            return this.l;
        }
        return aexe.a;
    }
}

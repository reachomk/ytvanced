package defpackage;

/* renamed from: agwp */
public final class agwp {
    private final zyw a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public agwp(zyw zyw, bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = zyw;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
    }

    public final agwn a(agql agql) {
        if (!((agwc) this.b.get()).b().f().equals("NO_OP_STORE_TAG")) {
            apxn a = this.a.a();
            if ((a.a & 524288) != 0) {
                avnm avnm = a.l;
                if (avnm == null) {
                    avnm = avnm.q;
                }
                int i = avnm.f;
                if (i == 1) {
                    return ((agwk) this.c.get()).a(agql);
                }
                if (i == 2) {
                    return ((agwo) this.d.get()).a(agql);
                }
                if (i != 3) {
                    return null;
                }
                agwn a2 = ((agwk) this.c.get()).a(agql);
                agwn a3 = ((agwo) this.d.get()).a(agql);
                agwn agwn = new agwn(a2.a, a2.b, 4, a2.c);
                agwn.f = a2.e;
                agwn.g = a3.e;
                agwn.d = a3.c;
                return agwn;
            }
        }
        return null;
    }
}

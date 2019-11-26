package defpackage;

/* renamed from: afbx */
final /* synthetic */ class afbx implements amro {
    private final afbo a;

    afbx(afbo afbo) {
        this.a = afbo;
    }

    public final Object get() {
        afbo afbo = this.a;
        awdg awdg = afbo.y.c;
        long j = Long.MAX_VALUE;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.aG) {
                aajs aajs = afbo.s;
                if (aajs != null) {
                    aaiz aaiz = aajs.i;
                    if (aajs.a()) {
                        if (aaiz == null) {
                            j = afbo.C() * 1000;
                        } else {
                            npf npf = (npf) aaiz.l;
                            if (npf != null) {
                                int b = npf.b();
                                if (b != 0) {
                                    npk a = npf.a(b - 1);
                                    if (!a.b.isEmpty()) {
                                        npe npe = (npe) a.b.get(0);
                                        if (!npe.b.isEmpty()) {
                                            npa d = ((npm) npe.b.get(0)).d();
                                            if (d != null) {
                                                awdg awdg2 = afbo.y.c;
                                                if ((awdg2.a & 2) != 0) {
                                                    arhh arhh2 = awdg2.d;
                                                    if (arhh2 == null) {
                                                        arhh2 = arhh.bv;
                                                    }
                                                    if (arhh2.al) {
                                                        long j2 = a.a;
                                                        int a2 = d.a(-1);
                                                        j = ((j2 * 1000) + d.a(a2)) + d.a(a2, -1);
                                                    }
                                                }
                                                int a3 = d.a(0);
                                                j = d.a(a3) + d.a(a3, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Long.valueOf(j);
    }
}

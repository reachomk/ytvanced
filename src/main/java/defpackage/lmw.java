package defpackage;

/* renamed from: lmw */
public final /* synthetic */ class lmw implements lnl {
    private final lmv a;

    public lmw(lmv lmv) {
        this.a = lmv;
    }

    public final void a(lmk lmk) {
        lmv lmv = this.a;
        if (lmk != null) {
            lhq lhq = (lhq) lmv.e.get();
            int d = lmk.d();
            if (d >= 0) {
                aumk aumk;
                arvt b = lhq.c.b();
                if (b == null || (b.a & 64) == 0) {
                    aumk = null;
                } else {
                    aume aume = b.e;
                    if (aume == null) {
                        aume = aume.af;
                    }
                    aumk = aume.n;
                    if (aumk == null) {
                        aumk = aumk.d;
                    }
                }
                int i = 0;
                if (aumk != null && aumk.c > 0 && aumk.b > 0) {
                    int i2;
                    int e = lhq.a.e();
                    int i3 = e + 1;
                    lhq.d.clear();
                    int i4 = -1;
                    if (d == e - 1) {
                        i2 = (int) aumk.c;
                    } else if (d == i3) {
                        i2 = (int) aumk.b;
                        i4 = 1;
                    }
                    i2 = Math.min(i2, lhq.e.length);
                    for (e = 0; e < i2; e++) {
                        Object obj;
                        i3 = (i4 * e) + d;
                        int a = lhq.a.a(0);
                        if (!xty.a(i3, 0, lhq.a.a(1) + a)) {
                            obj = null;
                        } else if (i3 < a) {
                            obj = (enm) lhq.a.a(0, i3);
                        } else {
                            obj = (enm) lhq.a.a(1, i3 - a);
                        }
                        if (obj == null) {
                            break;
                        }
                        lhq.d.add(obj);
                    }
                }
                while (i < lhq.d.size()) {
                    enm enm = (enm) lhq.d.get(i);
                    if (!enm.e().m()) {
                        lhq.b.a(enm.e(), airf.c().b(lhq.e[i]).a(), aijg.a);
                    }
                    i++;
                }
                lhq.d.clear();
            }
        }
    }
}

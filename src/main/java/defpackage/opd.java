package defpackage;

/* renamed from: opd */
final /* synthetic */ class opd implements Runnable {
    private final opa a;

    opd(opa opa) {
        this.a = opa;
    }

    public final void run() {
        opa opa = this.a;
        ofu ofu = opa.k;
        if (!opa.x && !opa.p && opa.o && ofu != null) {
            boolean[] zArr;
            opm[] opmArr = opa.m;
            int length = opmArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                if (opmArr[i2].f() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            opa.g.b();
            int length2 = opa.m.length;
            opx[] opxArr = new opx[length2];
            boolean[] zArr2 = new boolean[length2];
            opa.t = ofu.b();
            int i3 = 0;
            while (i3 < length2) {
                nzw f = opa.m[i3].f();
                String str = f.i;
                boolean a = oyu.a(str);
                boolean z = a || oyu.b(str);
                zArr2[i3] = z;
                opa.r = z | opa.r;
                olu olu = opa.l;
                if (olu != null) {
                    if (a || opa.n[i3].a) {
                        olj olj = f.g;
                        if (olj == null) {
                            olj = new olj(olu);
                        } else {
                            olj = olj.a(olu);
                        }
                        f = f.a(olj);
                    }
                    if (a && f.e == -1) {
                        int i4 = olu.a;
                        if (i4 != -1) {
                            zArr = zArr2;
                            f = new nzw(f.a, f.b, f.c, f.d, i4, f.f, f.g, f.h, f.i, f.j, f.k, f.l, f.m, f.n, f.o, f.p, f.q, f.r, f.t, f.s, f.u, f.v, f.w, f.x, f.y, f.z, f.A, f.B);
                            opxArr[i3] = new opx(f);
                            i3++;
                            zArr2 = zArr;
                            i = 0;
                        }
                    }
                }
                zArr = zArr2;
                opxArr[i3] = new opx(f);
                i3++;
                zArr2 = zArr;
                i = 0;
            }
            zArr = zArr2;
            length2 = (opa.u == -1 && ofu.b() == -9223372036854775807L) ? 7 : 1;
            opa.s = length2;
            opa.q = new opg(ofu, new opz(opxArr), zArr);
            opa.p = true;
            opa.c.a(opa.t, ofu.aS_());
            ((ooi) oxz.a(opa.j)).a(opa);
        }
    }
}

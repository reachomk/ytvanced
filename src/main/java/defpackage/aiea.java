package defpackage;

/* renamed from: aiea */
public final class aiea implements ajan, xcp {
    private final /* synthetic */ aidq a;

    public aiea(aidq aidq) {
        this.a = aidq;
    }

    public final long e() {
        return 32768;
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 4 || ordinal == 7) {
            aakj aakj;
            aakj aakj2 = ahkn.c;
            aaju aaju = null;
            if (aakj2 == null) {
                aakj2 = ahkn.b;
                if (aakj2 != null) {
                    this.a.e = aakj2.b();
                    this.a.f = ahkn.e;
                } else {
                    this.a.e = null;
                }
            } else {
                this.a.e = aakj2.b();
                this.a.f = ahkn.f;
            }
            if (ahkn.a.a()) {
                aakj = ahkn.c;
            } else {
                aakj = ahkn.b;
            }
            this.a.u = aakj.n() != null ? aakj.n().l() : 1.0f;
            aidq aidq = this.a;
            float f = 0.0f;
            if (aakj.n() != null) {
                awdg awdg = aakj.n().c;
                if ((awdg.a & 64) != 0) {
                    aoxy aoxy = awdg.e;
                    if (aoxy == null) {
                        aoxy = aoxy.f;
                    }
                    f = Math.min(0.0f, aoxy.b);
                }
            }
            aidq.v = f;
            aajs aajs = aakj.c;
            aidq = this.a;
            if (aajs != null) {
                aaju = aajs.u();
            }
            aidq.k = aaju;
            aidq aidq2 = this.a;
            aidq2.g = ((Integer) aidq2.b.get()).intValue();
            aidq2 = this.a;
            aidq2.h = ((Integer) aidq2.c.get()).intValue();
            aidq2 = this.a;
            if (aidq2.q) {
                aidq2.a.d(aidq2.e);
                aidq2 = this.a;
                aidq2.a.e(aidq2.f);
                aidq2 = this.a;
                aidq2.a.a(aidq2.k);
            }
        }
    }

    public final void a(aetv aetv) {
        if (afhz.a(aetv.h)) {
            aidq aidq = this.a;
            aidq.i = aetv.b;
            aidq.j = aetv.c;
            if (aidq.q) {
                aidq.a.a(aidq.i);
                aidq aidq2 = this.a;
                aidq2.a.b(aidq2.j);
            }
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 32768)).a(ajcg.a(ajam.O(), 32768, 1)).a(new aidz(this), aiec.a), ajam.Q().e.a(new aieb(this))};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aetv.class, ahkn.class};
        } else if (i == 0) {
            a((aetv) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

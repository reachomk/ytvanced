package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: etq */
public final class etq {
    public arml a;
    public aqfa b;
    public apxu c;
    private arml d;
    private awhh e;
    private aqfc f;

    public final etq a(String str) {
        this.d = ajqy.a(str);
        return this;
    }

    public final etq b(String str) {
        awhg awhg = (awhg) awhh.c.createBuilder();
        awhg.a(str);
        this.e = (awhh) ((anxl) awhg.build());
        return this;
    }

    public final etq a(long j) {
        aqfb aqfb = (aqfb) aqfc.c.createBuilder();
        j = TimeUnit.MILLISECONDS.toSeconds(j);
        aqfb.copyOnWrite();
        aqfc aqfc = (aqfc) aqfb.instance;
        aqfc.a |= 1;
        aqfc.b = j;
        this.f = (aqfc) ((anxl) aqfb.build());
        return this;
    }

    public final aqey a() {
        aqey aqey = aqey.n;
        aqex aqex = (aqex) aqey.n.createBuilder();
        arml arml = this.d;
        if (arml == null) {
            arml = aqey.f;
            if (arml == null) {
                arml = arml.f;
            }
        }
        aqex.a(arml);
        arml = this.a;
        if (arml == null) {
            arml = aqey.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        aqex.copyOnWrite();
        aqey aqey2 = (aqey) aqex.instance;
        if (arml != null) {
            aqey2.g = arml;
            aqey2.a |= 2;
            aqfa aqfa = this.b;
            if (aqfa == null) {
                aqfa = aqey.j;
                if (aqfa == null) {
                    aqfa = aqfa.f;
                }
            }
            aqex.copyOnWrite();
            aqey2 = (aqey) aqex.instance;
            if (aqfa != null) {
                aqey2.j = aqfa;
                aqey2.a |= 32;
                aqer aqer = (aqer) aqes.c.createBuilder();
                awhh awhh = this.e;
                if (awhh != null) {
                    aqer.a(awhh);
                }
                aqex.a(aqer);
                aqet aqet = (aqet) aqeu.c.createBuilder();
                aqfc aqfc = this.f;
                if (aqfc != null) {
                    aqet.copyOnWrite();
                    aqeu aqeu = (aqeu) aqet.instance;
                    aqeu.b = aqfc;
                    aqeu.a = 135744618;
                }
                aqex.copyOnWrite();
                aqey2 = (aqey) aqex.instance;
                aqey2.l = (aqeu) ((anxl) aqet.build());
                aqey2.a |= 32768;
                apxu apxu = this.c;
                if (apxu == null) {
                    if (aqey.b == 4) {
                        apxu = (apxu) aqey.c;
                    } else {
                        apxu = apxu.d;
                    }
                }
                aqex.a(apxu);
                return (aqey) ((anxl) aqex.build());
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}

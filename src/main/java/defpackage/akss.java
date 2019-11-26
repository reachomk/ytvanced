package defpackage;

/* renamed from: akss */
public final class akss {
    public final axav a;
    public final avum b;

    public akss(axav axav) {
        avum avum;
        this.a = axav;
        avuo avuo = axav.b;
        if (avuo == null) {
            avuo = avuo.c;
        }
        if ((avuo.a & 1) == 0) {
            avum = null;
        } else {
            avuo avuo2 = axav.b;
            if (avuo2 == null) {
                avuo2 = avuo.c;
            }
            avum = avuo2.b;
            if (avum == null) {
                avum = avum.e;
            }
        }
        this.b = avum;
    }

    public final apfo a() {
        apfm apfm = this.a.i;
        if (apfm == null) {
            apfm = apfm.d;
        }
        if ((apfm.a & 2) == 0) {
            return null;
        }
        apfm = this.a.i;
        if (apfm == null) {
            apfm = apfm.d;
        }
        apfo apfo = apfm.c;
        if (apfo == null) {
            apfo = apfo.i;
        }
        return apfo;
    }
}

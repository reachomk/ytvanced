package defpackage;

import java.io.IOException;

/* renamed from: afde */
final class afde extends afco {
    public final /* synthetic */ afbo a;
    private int b;

    public final void a() {
        this.b = 0;
    }

    public final void a(int i, IOException iOException) {
        super.a(i, iOException);
        awdg awdg = this.a.y.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.aq && (iOException instanceof owd) && ((owd) iOException).a == 500) {
                int i2;
                i = this.b + 1;
                this.b = i;
                awdg awdg2 = this.a.y.c;
                if ((awdg2.a & 2) != 0) {
                    arhh arhh2 = awdg2.d;
                    if (arhh2 == null) {
                        arhh2 = arhh.bv;
                    }
                    i2 = arhh2.as;
                } else {
                    i2 = 0;
                }
                if (i > i2) {
                    afbo afbo = this.a;
                    afbo.q.a(afbo.r, 2, null);
                }
            }
        }
    }

    /* synthetic */ afde(afbo afbo) {
        this.a = afbo;
        super(afbo);
    }
}

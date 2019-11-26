package defpackage;

import android.content.SharedPreferences;
import java.security.Key;

/* renamed from: agzz */
public final class agzz implements ahaa {
    private final xsc a;
    private final xua b;
    private final ajgv c;
    private final aajx d;
    private final ahad e;
    private final Key f;
    private final afhg g;
    private final agps h;
    private final bcaa i;
    private final bcaa j;
    private final agwa k;

    public agzz(xsc xsc, xua xua, ajgv ajgv, aajx aajx, ahad ahad, xsf xsf, SharedPreferences sharedPreferences, agps agps, afhg afhg, bcaa bcaa, bcaa bcaa2, agwa agwa) {
        this.a = xsc;
        this.b = xua;
        this.c = ajgv;
        this.d = aajx;
        this.e = ahad;
        this.f = xsf.a(sharedPreferences);
        this.g = afhg;
        this.i = bcaa;
        this.j = bcaa2;
        this.k = agwa;
        this.h = agps;
    }

    public final agya a(agqz agqz, agxz agxz, agzo agzo, agvz agvz) {
        afhg afhg;
        agzo agzo2 = agzo;
        agzo2.a(this.f);
        if (agxj.i(agqz.f)) {
            afhg = (afhg) this.i.get();
        } else {
            afhg = this.g;
        }
        agzo2.a = afhg;
        return new agzx(agxz, agvz, this.d, this.a, this.b, agqz, agzo, this.e, this.j, this.k, this.h);
    }
}

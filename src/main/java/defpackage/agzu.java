package defpackage;

import android.content.SharedPreferences;
import java.security.Key;

/* renamed from: agzu */
public final class agzu implements ahaa {
    private final xsc a;
    private final xua b;
    private final ajgv c;
    private final aajx d;
    private final ahad e;
    private final Key f;
    private final afhg g;
    private final agwa h;
    private final bcaa i;

    public agzu(xsc xsc, xua xua, ajgv ajgv, aajx aajx, ahad ahad, xsf xsf, SharedPreferences sharedPreferences, afhg afhg, bcaa bcaa, agwa agwa) {
        this.a = xsc;
        this.b = xua;
        this.c = ajgv;
        this.d = aajx;
        this.e = ahad;
        this.f = xsf.a(sharedPreferences);
        this.g = afhg;
        this.i = bcaa;
        this.h = agwa;
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
        return new agzv(this.a, this.b, agqz, agxz, agzo, this.c, agvz, this.d, this.e, this.h);
    }
}

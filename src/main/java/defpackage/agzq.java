package defpackage;

import android.content.SharedPreferences;
import java.security.Key;

/* renamed from: agzq */
public final class agzq implements ahaa {
    private final xsc a;
    private final xua b;
    private final ahad c;
    private final Key d;
    private final afhg e;
    private final agwa f;
    private final bcaa g;

    public agzq(xsc xsc, xua xua, ahad ahad, xsf xsf, SharedPreferences sharedPreferences, afhg afhg, bcaa bcaa, agwa agwa) {
        this.a = xsc;
        this.b = xua;
        this.c = ahad;
        this.d = xsf.a(sharedPreferences);
        this.e = afhg;
        this.g = bcaa;
        this.f = agwa;
    }

    public final agya a(agqz agqz, agxz agxz, agzo agzo, agvz agvz) {
        afhg afhg;
        agzo.a(this.d);
        if (agxj.i(agqz.f)) {
            afhg = (afhg) this.g.get();
        } else {
            afhg = this.e;
        }
        agzo.a = afhg;
        return new agzr(this.a, this.b, agqz, agxz, agzo, agvz, this.c, this.f);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: ahyk */
public final class ahyk extends ajps implements aipq {
    public final Executor a;
    public final zzl b;
    private final xua c;
    private final aajx d;
    private final aamj e;

    public ahyk(xua xua, aajx aajx, Executor executor, zzl zzl, aamj aamj) {
        this.c = xua;
        this.d = aajx;
        this.a = executor;
        this.b = zzl;
        this.e = aamj;
    }

    public final void a() {
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a.a(airi.PLAYBACK_LOADED) && ahkn.d.f() != null && ahkn.d.g() != null && !ahkn.d.g().e()) {
            attz[] attzArr = ahkn.b.a.A;
            if (attzArr != null && attzArr.length != 0) {
                ahkn.d.f().a(new ahyj(this, ahkn));
            }
        }
    }

    public static boolean a(attz attz) {
        if (!(attz == null || (attz.a & 1) == 0)) {
            atub atub = attz.b;
            if (atub == null) {
                atub = atub.c;
            }
            int a = attv.a(atub.b);
            if (a != 0 && a == 2) {
                return true;
            }
        }
        return false;
    }

    public final ajqm[] a(ajqi ajqi, attz attz, long j) {
        ArrayList arrayList = new ArrayList();
        boolean a = ahyk.a(attz);
        for (attx attx : attz.c) {
            ajxu ajxu = (ajxu) this.e.a(attx.b.d(), ajxu.class);
            if (ajxu != null) {
                aakj aakj = new aakj(ajxu, j, this.d);
                if (aakj.c != null) {
                    aakj.e.a("PLAYER_IS_CONTENT_INTERSTITIAL_KEY", true);
                    aakj.e.a("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY", a);
                    arrayList.add(ajqi.a(aakj, this.c.a(), 2));
                }
            }
        }
        return (ajqm[]) arrayList.toArray(new ajqm[arrayList.size()]);
    }
}

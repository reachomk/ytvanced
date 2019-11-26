package defpackage;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.facebook.yoga.YogaEdge;
import java.util.Collection;
import java.util.Map;

/* renamed from: ssd */
public final class ssd implements sxm {
    private final Collection a;

    public ssd(Map map) {
        this.a = map.values();
    }

    public final aobz a() {
        return bdht.a;
    }

    public final /* synthetic */ void a(cmg cmg, Object obj, swn swn) {
        float f;
        bdht bdht = (bdht) obj;
        clz a = swn.a();
        DisplayMetrics displayMetrics = cmg.b().getDisplayMetrics();
        if (!(bdht.d == 0 && bdht.e == 0.0f && bdht.f == 0.0f)) {
            cln a2 = clo.a(cmg);
            if (bdht.d != 0) {
                a2.a(YogaEdge.ALL, bdht.d);
            }
            if (bdht.e != 0.0f) {
                a2.a(YogaEdge.ALL, (float) con.a(bdht.e));
            }
            f = bdht.f;
            if (f != 0.0f) {
                bdhq bdhq = bdht.g;
                if (bdhq == null) {
                    a2.a(f);
                } else {
                    if (bdhq.a) {
                        a2.a(0, f);
                    }
                    if (bdht.g.b) {
                        a2.a(1, bdht.f);
                    }
                    if (bdht.g.c) {
                        a2.a(3, bdht.f);
                    }
                    if (bdht.g.d) {
                        a2.a(2, bdht.f);
                    }
                }
            }
            a.a(a2.a());
        }
        a.r(bdht.c);
        float f2 = bdht.i;
        if (f2 != 0.0f) {
            a.s(f2);
        }
        f2 = bdht.j;
        if (f2 != 0.0f) {
            a.t(f2);
        }
        sxp sxp = new sxp();
        f = bdht.f;
        if (f != 0.0f) {
            sxp.b = syq.a(f, displayMetrics);
        }
        bdhq bdhq2 = bdht.g;
        if (bdhq2 != null) {
            sxp.c = bdhq2.a;
            sxp.d = bdhq2.b;
            sxp.e = bdhq2.c;
            sxp.f = bdhq2.d;
        }
        if (bdht.b != 0) {
            stg stg = new stg();
            stg.c = bdht.b;
            stg.d = sxp.b;
            stg.e = sxp.c;
            stg.f = sxp.d;
            stg.g = sxp.e;
            stg.h = sxp.f;
            sxp.a = stg;
        }
        bdhs bdhs = bdht.h;
        if (bdhs != null) {
            for (sxs sxs : this.a) {
                if (bdhs.hasExtension(sxs.a())) {
                    sxs.a(cmg, szb.a(bdhs, sxs.a()), sxp);
                }
            }
        }
        Drawable drawable = sxp.a;
        if (a instanceof snd) {
            snd snd = (snd) a;
            snd.u(sxp.b);
            if (drawable != null) {
                snd.b(drawable);
            }
        } else if (drawable != null) {
            a.a(drawable);
        }
    }
}

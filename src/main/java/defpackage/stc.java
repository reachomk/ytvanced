package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: stc */
final class stc implements sxs {
    stc() {
    }

    public final aobz a() {
        return bdgg.a;
    }

    public final /* synthetic */ void a(cmg cmg, Object obj, sxp sxp) {
        bdgg bdgg = (bdgg) obj;
        int i = bdgg.b;
        int i2 = bdgg.c;
        if (i != 0 || i2 != 0) {
            Drawable drawable = sxp.a;
            stg stg;
            if (drawable != null) {
                amqw.a(drawable instanceof stg, "Alien Drawable in Style: %s", drawable.getClass().getName());
                stg = (stg) drawable;
                stg.a = i2;
                stg.b = i;
                return;
            }
            stg = new stg();
            stg.a = i2;
            stg.b = i;
            stg.d = sxp.b;
            stg.e = sxp.c;
            stg.f = sxp.d;
            stg.g = sxp.e;
            stg.h = sxp.f;
            sxp.a = stg;
        }
    }
}

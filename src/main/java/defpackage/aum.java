package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: aum */
public final class aum implements auq {
    public final void a() {
    }

    public final void a(aun aun, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        aun.a(new aup(colorStateList, f));
        View d = aun.d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        b(aun, f3);
    }

    public final void a(aun aun, float f) {
        aup e = aum.e(aun);
        if (f != e.a) {
            e.a = f;
            e.a(null);
            e.invalidateSelf();
        }
    }

    public final void b(aun aun, float f) {
        aup e = aum.e(aun);
        boolean a = aun.a();
        boolean b = aun.b();
        if (!(f == e.b && e.c == a && e.d == b)) {
            e.b = f;
            e.c = a;
            e.d = b;
            e.a(null);
            e.invalidateSelf();
        }
        if (aun.a()) {
            f = aum.e(aun).b;
            float d = aum.d(aun);
            int ceil = (int) Math.ceil((double) aus.b(f, d, aun.b()));
            int ceil2 = (int) Math.ceil((double) aus.a(f, d, aun.b()));
            aun.a(ceil, ceil2, ceil, ceil2);
            return;
        }
        aun.a(0, 0, 0, 0);
    }

    public final float b(aun aun) {
        float d = aum.d(aun);
        return d + d;
    }

    public final float c(aun aun) {
        float d = aum.d(aun);
        return d + d;
    }

    private static float d(aun aun) {
        return aum.e(aun).a;
    }

    public final void a(aun aun) {
        aun.d().setElevation(0.0f);
    }

    public final void a(aun aun, ColorStateList colorStateList) {
        aup e = aum.e(aun);
        e.a(colorStateList);
        e.invalidateSelf();
    }

    private static aup e(aun aun) {
        return (aup) aun.c();
    }
}

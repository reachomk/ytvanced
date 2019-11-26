package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: crr */
public class crr {
    public static final csc a = c;
    public static final int b = 2;
    private static final csc c = new csa(cvi.c);

    public static csc a(int i, Interpolator interpolator) {
        return new crz(i, interpolator);
    }

    public static float a(csb csb, cpg cpg, cto cto) {
        crx crx = new crx(cpg, cto);
        csd csd = cpg.h;
        ctx ctx = csb.e;
        ctv ctv = new ctv(csd, cto);
        return ctx.a();
    }

    static {
        csa csa = new csa(cvi.d);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
    }

    public static cse a(String str) {
        return new cse(str);
    }
}

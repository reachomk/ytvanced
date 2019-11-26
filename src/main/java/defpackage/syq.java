package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.yoga.YogaEdge;

/* renamed from: syq */
public class syq {
    public static void a(baot baot, syp syp) {
        baou baou;
        baou baou2 = new baou();
        int a = baot.a(20);
        baou baou3 = null;
        if (a != 0) {
            baou2.a(a + baot.a, baot.b);
            baou = baou2;
        } else {
            baou = null;
        }
        boolean z = true;
        syq.a(baou != null, YogaEdge.ALL, baou2, syp);
        syq.a(baot.e(baou2) != null, YogaEdge.HORIZONTAL, baou2, syp);
        syq.a(baot.f(baou2) != null, YogaEdge.VERTICAL, baou2, syp);
        a = baot.a(12);
        if (a != 0) {
            baou2.a(a + baot.a, baot.b);
            baou = baou2;
        } else {
            baou = null;
        }
        syq.a(baou != null, YogaEdge.START, baou2, syp);
        a = baot.a(14);
        if (a != 0) {
            baou2.a(a + baot.a, baot.b);
            baou3 = baou2;
        }
        syq.a(baou3 != null, YogaEdge.END, baou2, syp);
        syq.a(baot.a(baou2) != null, YogaEdge.TOP, baou2, syp);
        syq.a(baot.d(baou2) != null, YogaEdge.RIGHT, baou2, syp);
        syq.a(baot.c(baou2) != null, YogaEdge.BOTTOM, baou2, syp);
        if (baot.b(baou2) == null) {
            z = false;
        }
        syq.a(z, YogaEdge.LEFT, baou2, syp);
    }

    private static void a(boolean z, YogaEdge yogaEdge, baou baou, syp syp) {
        if (z) {
            syp.a(yogaEdge, baou);
        }
    }

    public static void a(boolean z, YogaEdge yogaEdge, azub azub, sys sys) {
        if (z) {
            ((sqt) sys).a.a().g(yogaEdge, azub.b);
        }
    }

    public static float a(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }
}

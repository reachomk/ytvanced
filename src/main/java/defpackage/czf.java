package defpackage;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View.OnScrollChangeListener;
import android.view.ViewTreeObserver;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;

/* renamed from: czf */
final class czf {
    private static final aaa a = new aaa(2);

    static void a(cmn cmn, cma cma, boolean z, ComponentTree componentTree, Integer num, Integer num2, cqp cqp, cqp cqp2, cqp cqp3) {
        int a = (cmn.a() - cmn.f()) - cmn.d();
        int i;
        if (num == null || num2 == null) {
            crd a2 = czf.a();
            componentTree.a(cma, MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(cmn.b(), 1073741824), a2);
            i = a2.a;
            if (!z) {
                a = 0;
            }
            i = Math.max(i, a);
            int i2 = a2.b;
            czf.a(a2);
            cqp.a = Integer.valueOf(i);
            cqp2.a = Integer.valueOf(i2);
        } else {
            i = num.intValue();
            if (!z) {
                a = 0;
            }
            cqp.a = Integer.valueOf(Math.max(i, a));
            cqp2.a = num2;
        }
        cqp3.a = cmn.h();
    }

    static czk a(Context context) {
        return new czk(context);
    }

    static void a(czk czk, boolean z, OnScrollChangeListener onScrollChangeListener, czj czj, ComponentTree componentTree, int i, int i2, YogaDirection yogaDirection) {
        czk.setHorizontalScrollBarEnabled(z);
        czk.a.a(componentTree);
        czk.b = i;
        czk.c = i2;
        ViewTreeObserver viewTreeObserver = czk.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new czi(czk, czj, yogaDirection));
        viewTreeObserver.addOnScrollChangedListener(new czh(onScrollChangeListener, czk, czj));
    }

    static void a(czk czk) {
        czk.a.u.b();
        czk.b = 0;
        czk.c = 0;
    }

    static void a(cmg cmg, cri cri, cri cri2, cma cma, Integer num) {
        cri.a = new czj(num != null ? num.intValue() : -1);
        cmy a = ComponentTree.a(new cmg(cmg.b, cmg.c, cmg.d, cmg.e(), (byte) 0), cma);
        a.c = false;
        cri2.a = a.a();
    }

    public static crd a() {
        crd crd = (crd) a.a();
        return crd == null ? new crd() : crd;
    }

    public static void a(crd crd) {
        a.a(crd);
    }
}

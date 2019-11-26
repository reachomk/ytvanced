package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import java.util.HashMap;

/* renamed from: tqp */
public final class tqp {
    private final tqt a;
    private final tqo b;
    private final boolean c;
    private final tpr d;

    public tqp(boolean z, tpr tpr) {
        tqq tqq = new tqq();
        tqr tqr = new tqr();
        trg trg = new trg();
        this.c = z;
        this.d = tpr;
        this.a = tqq;
        this.b = tqr;
    }

    @Deprecated
    public final double a(View view) {
        if (view != null && tqp.d(view)) {
            Rect a = this.a.a(view);
            double height = (double) (a.height() * a.width());
            double height2 = (double) (view.getHeight() * view.getWidth());
            if (height > 0.0d && height2 > 0.0d) {
                if (this.c && trg.a(view)) {
                    return 0.0d;
                }
                Double.isNaN(height);
                Double.isNaN(height2);
                return height / height2;
            }
        }
        return 0.0d;
    }

    private static DisplayMetrics c(View view) {
        return view.getContext().getApplicationContext().getResources().getDisplayMetrics();
    }

    private static int a(DisplayMetrics displayMetrics, int i) {
        return (int) Math.ceil((double) (((float) i) / displayMetrics.density));
    }

    @Deprecated
    public final double b(View view) {
        if (view != null) {
            double height = (double) (view.getHeight() * view.getWidth());
            double a = a(view);
            Double.isNaN(height);
            height *= a;
            a = (double) (tqp.c(view).heightPixels * tqp.c(view).widthPixels);
            if (a > 0.0d) {
                Double.isNaN(a);
                return height / a;
            }
        }
        return 0.0d;
    }

    public final tqi a(tqj tqj, View view) {
        View view2 = view;
        if (view2 == null || view.getDisplay() == null) {
            return new tqi(0.0d, 0.0d, null, null, null, null);
        }
        DisplayMetrics displayMetrics;
        int displayId;
        DisplayMetrics displayMetrics2 = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect(0, 0, tqp.a(displayMetrics2, displayMetrics2.widthPixels), tqp.a(displayMetrics2, displayMetrics2.heightPixels));
        trl trl = this.d.a;
        Display display = view.getDisplay();
        if (display == null) {
            displayMetrics = null;
        } else {
            displayId = display.getDisplayId();
            HashMap hashMap = trl.a;
            Integer valueOf = Integer.valueOf(displayId);
            if (hashMap.containsKey(valueOf)) {
                displayMetrics = (DisplayMetrics) trl.a.get(valueOf);
            } else {
                displayMetrics = trl.a(display);
            }
        }
        Rect rect2 = new Rect(0, 0, tqp.a(displayMetrics, displayMetrics.widthPixels), tqp.a(displayMetrics, displayMetrics.heightPixels));
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int a = tqp.a(displayMetrics2, iArr[0]);
        displayId = tqp.a(displayMetrics2, iArr[1]);
        Rect rect3 = new Rect(a, displayId, tqp.a(displayMetrics2, width) + a, tqp.a(displayMetrics2, height) + displayId);
        if (tqj.e() || !tqp.d(view) || (this.c && trg.a(view))) {
            return new tqi(0.0d, 0.0d, rect3, rect3, rect, rect2);
        }
        double height2 = (double) (rect2.height() * rect2.width());
        double height3 = (double) (rect3.height() * rect3.width());
        boolean d = tqj.d();
        Rect rect4 = new Rect();
        if (d) {
            rect4.setIntersect(rect3, rect3);
        } else {
            Rect a2 = this.b.a(view2);
            rect4.setIntersect(new Rect(rect3.left + tqp.a(displayMetrics2, a2.left), rect3.top + tqp.a(displayMetrics2, a2.top), rect3.left + tqp.a(displayMetrics2, a2.right), rect3.top + tqp.a(displayMetrics2, a2.bottom)), rect3);
        }
        double height4 = (double) (rect4.height() * rect4.width());
        if (height3 > 0.0d) {
            Double.isNaN(height4);
            Double.isNaN(height3);
            height3 = height4 / height3;
        } else {
            height3 = 0.0d;
        }
        if (height2 > 0.0d) {
            Double.isNaN(height4);
            Double.isNaN(height2);
            height4 /= height2;
        } else {
            height4 = 0.0d;
        }
        return new tqi(height3, height4, rect3, rect3, rect, rect2);
    }

    private static boolean d(View view) {
        while (view.getVisibility() == 0) {
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
            if (view == null) {
                return true;
            }
        }
        return false;
    }
}

package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;

/* renamed from: fpl */
public final class fpl {
    public static int a(int i, int i2, float f) {
        return (int) ((((float) i) + (((float) (i2 - i)) * f)) + 0.5f);
    }

    public static void a(Point point, View view) {
        while (view != null) {
            ViewParent parent = view.getParent();
            point.x = (int) (((float) point.x) - (((float) view.getLeft()) + view.getTranslationX()));
            point.y = (int) (((float) point.y) - (((float) view.getTop()) + view.getTranslationY()));
            if (parent instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) parent;
                point.x += viewPager.getScrollX();
                point.y += viewPager.getScrollY();
            }
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                point.x -= iArr[0];
                point.y -= iArr[1];
                return;
            }
        }
    }

    public static View a(View view, Point point, amqv amqv) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                for (View view2 : new fpo((ViewGroup) view)) {
                    View view22 = fpl.a(view22, new Point(point.x - (view22.getLeft() + ((int) view22.getTranslationX())), point.y - (view22.getTop() + ((int) view22.getTranslationY()))), amqv);
                    if (view22 != null) {
                        return view22;
                    }
                }
            }
            if (point.x < 0 || point.x >= view.getWidth() || point.y < 0 || point.y >= view.getHeight() || !amqv.a(view)) {
                return null;
            }
            return view;
        }
        return null;
    }

    public static void a(Rect rect, Rect rect2, Rect rect3, float f) {
        rect.set(fpl.a(rect2.left, rect3.left, f), fpl.a(rect2.top, rect3.top, f), fpl.a(rect2.right, rect3.right, f), fpl.a(rect2.bottom, rect3.bottom, f));
    }

    public static View a(View view, int i, Class cls) {
        if (view != null) {
            view = view.findViewById(i);
            if (view != null) {
                try {
                    return (View) cls.cast(view);
                } catch (ClassCastException unused) {
                }
            }
        }
        return null;
    }

    public static boolean a(View view) {
        boolean z = false;
        if (view instanceof RecyclerView) {
            apn apn = ((RecyclerView) view).n;
            return apn != null && apn.k();
        } else {
            if (view != null) {
                if (view.canScrollHorizontally(-1)) {
                    z = true;
                } else if (view.canScrollHorizontally(1)) {
                    return true;
                } else {
                    return z;
                }
            }
            return z;
        }
    }

    public static void a(Activity activity, boolean z) {
        View findViewById = activity.findViewById(R.id.accessibility_layer_container);
        if (findViewById instanceof AccessibilityLayerLayout) {
            AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout) findViewById;
            accessibilityLayerLayout.getContext();
            accessibilityLayerLayout.a = z;
        }
    }
}

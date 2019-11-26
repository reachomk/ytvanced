package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.youtube.R;

/* renamed from: xpu */
public final class xpu {
    public final Rect a = new Rect();
    public final Rect b = new Rect();

    public static void a(View view, xpx xpx) {
        amqw.a((Object) view);
        amqw.a((Object) xpx);
        view.setTag(R.id.view_position_clip_supplier_tag, xpx);
    }

    public static void a(xpu xpu, View view, View view2) {
        amqw.a((Object) xpu);
        xpu.a();
        if (view != null && view2 != null && xpr.a(view2, view)) {
            xpu.a.set(0, 0, view.getWidth(), view.getHeight());
            Object obj = null;
            while (view != view2 && view != null) {
                View view3 = (View) view.getParent();
                int left = view.getLeft() + ((int) view.getTranslationX());
                int top = view.getTop() + ((int) view.getTranslationY());
                if (view3 instanceof ViewPager) {
                    ViewPager viewPager = (ViewPager) view3;
                    left -= viewPager.getScrollX();
                    top -= viewPager.getScrollY();
                }
                xpu.a.offset(left, top);
                if (obj != null) {
                    int width = view3.getWidth();
                    int height = view3.getHeight();
                    Rect rect = xpu.b;
                    rect.left = Math.max(rect.left + left, 0);
                    rect = xpu.b;
                    rect.top = Math.max(rect.top + top, 0);
                    rect = xpu.b;
                    rect.right = Math.min(rect.right + left, width);
                    Rect rect2 = xpu.b;
                    rect2.bottom = Math.min(rect2.bottom + top, height);
                    Object tag = view3.getTag(R.id.view_position_clip_supplier_tag);
                    if (tag instanceof xpx) {
                        rect2 = (Rect) ((xpx) tag).get();
                        Rect rect3 = xpu.b;
                        rect3.left = Math.max(rect3.left, rect2.left);
                        rect3 = xpu.b;
                        rect3.top = Math.max(rect3.top, rect2.top);
                        rect3 = xpu.b;
                        rect3.right = Math.min(rect3.right, rect2.right);
                        rect3 = xpu.b;
                        rect3.bottom = Math.min(rect3.bottom, rect2.bottom);
                    }
                }
                view = view3;
                obj = 1;
            }
        }
    }

    public xpu() {
        a();
    }

    public final void a() {
        this.a.set(0, 0, 0, 0);
        this.b.set(0, 0, 1073741823, 1073741823);
    }

    public final boolean b() {
        return c() > 0 && d() > 0;
    }

    public final int c() {
        return Math.max(Math.min(this.a.right, this.b.right) - Math.max(this.a.left, this.b.left), 0);
    }

    public final int d() {
        return Math.max(Math.min(this.a.bottom, this.b.bottom) - Math.max(this.a.top, this.b.top), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xpu) {
            xpu xpu = (xpu) obj;
            return this.a.equals(xpu.a) && this.b.equals(xpu.b);
        }
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}

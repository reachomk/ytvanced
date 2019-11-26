package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: wlj */
public final class wlj {
    public static void a(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                Rect rect = new Rect();
                view.getHitRect(rect);
                if (abe.g(view) != 1) {
                    rect.left -= i;
                    rect.right += i3;
                } else {
                    rect.left -= i3;
                    rect.right += i;
                }
                rect.top -= i2;
                rect.bottom += i4;
                xrl.a(viewGroup, view, new TouchDelegate(rect, view));
            }
        }
    }
}

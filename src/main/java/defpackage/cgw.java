package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cgw */
final class cgw {
    private static Integer d;
    public final View a;
    public final List b = new ArrayList();
    public cgv c;

    cgw(View view) {
        this.a = view;
    }

    private static boolean a(int i) {
        return i > 0 || i == aocf.UNSET_ENUM_VALUE;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    public static boolean a(int i, int i2) {
        return cgw.a(i) && cgw.a(i2);
    }

    public final int b() {
        int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
        LayoutParams layoutParams = this.a.getLayoutParams();
        return a(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int c() {
        int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
        LayoutParams layoutParams = this.a.getLayoutParams();
        return a(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    private final int a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        i -= i3;
        if (i <= 0) {
            if (this.a.isLayoutRequested() || i2 != -2) {
                i = 0;
            } else {
                Context context = this.a.getContext();
                if (d == null) {
                    Display defaultDisplay = ((WindowManager) chw.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    d = Integer.valueOf(Math.max(point.x, point.y));
                }
                return d.intValue();
            }
        }
        return i;
    }
}

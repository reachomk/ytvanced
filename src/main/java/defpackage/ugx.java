package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

/* renamed from: ugx */
public final class ugx {
    public final int a;
    public final int b;
    public final ExpandingScrollView c;
    public final ugh d;
    public final ugh e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j = -1.0f;
    public boolean k;
    public int l = 1;

    public ugx(ExpandingScrollView expandingScrollView, ugy ugy, ugy ugy2) {
        this.c = expandingScrollView;
        this.d = new ugh(ugy);
        this.e = new ugh(ugy2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(expandingScrollView.getContext());
        this.a = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledPagingTouchSlop();
    }

    public static boolean a(View view, int i, int i2, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i3 = i + scrollX;
                if (i3 >= childAt.getLeft() && i3 < childAt.getRight()) {
                    int i4 = i2 + scrollY;
                    if (i4 >= childAt.getTop() && i4 < childAt.getBottom() && ugx.a(childAt, i3 - childAt.getLeft(), i4 - childAt.getTop(), false)) {
                        return true;
                    }
                }
            }
        }
        return abe.a(view, -1);
    }
}

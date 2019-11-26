package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewParent;
import android.widget.ScrollView;

/* renamed from: tqc */
final class tqc implements OnLayoutChangeListener {
    private final /* synthetic */ tqd a;

    tqc(tqd tqd) {
        this.a = tqd;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        tqd tqd = this.a;
        View view2 = (View) tqd.a.get();
        if (view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            i4 = tqd.a(view2.getContext(), iArr[0]);
            i3 = tqd.a(view2.getContext(), iArr[1]);
            i6 = tqd.a(view2.getContext(), view2.getWidth());
            i7 = tqd.a(view2.getContext(), view2.getHeight());
            tqd.c.g = new Rect(i4, i3, i6 + i4, i7 + i3);
            DisplayMetrics a = tqd.a(view2.getContext());
            i4 = a.heightPixels;
            i3 = a.widthPixels;
            tqd.c.j = tqd.a(view2.getContext(), i4);
            tqd.c.k = tqd.a(view2.getContext(), i3);
            for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ScrollView) {
                    ScrollView scrollView = (ScrollView) parent;
                    i4 += Math.max(0, scrollView.getChildAt(0).getHeight() - scrollView.getHeight());
                    i3 += Math.max(0, scrollView.getChildAt(0).getWidth() - scrollView.getWidth());
                }
            }
            tqd.c.h = tqd.a(view2.getContext(), i4);
            tqd.c.i = tqd.a(view2.getContext(), i3);
        }
        view.removeOnLayoutChangeListener(this);
    }
}

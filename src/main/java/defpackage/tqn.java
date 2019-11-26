package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewParent;
import android.widget.ScrollView;

/* renamed from: tqn */
final class tqn implements OnLayoutChangeListener {
    private final /* synthetic */ tql a;

    tqn(tql tql) {
        this.a = tql;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        tql tql = this.a;
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        i5 = tql.a(iArr[0], displayMetrics.density);
        i3 = tql.a(iArr[1], displayMetrics.density);
        tql.g = new Rect(i5, i3, tql.a(view.getWidth(), displayMetrics.density) + i5, tql.a(view.getHeight(), displayMetrics.density) + i3);
        i3 = displayMetrics.heightPixels;
        i5 = displayMetrics.widthPixels;
        tql.j = tql.a(i3, displayMetrics.density);
        tql.k = tql.a(i5, displayMetrics.density);
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) parent;
                i3 += Math.max(0, scrollView.getChildAt(0).getHeight() - scrollView.getHeight());
                i5 += Math.max(0, scrollView.getChildAt(0).getWidth() - scrollView.getWidth());
            }
        }
        tql.h = tql.a(i3, displayMetrics.density);
        tql.i = tql.a(i5, displayMetrics.density);
        view.removeOnLayoutChangeListener(this);
    }
}

package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: jvk */
public final class jvk implements OnLayoutChangeListener {
    private final /* synthetic */ Rect a;

    public jvk(Rect rect) {
        this.a = rect;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = (View) view.getParent();
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.left += this.a.left;
        rect.top += this.a.top;
        rect.right -= this.a.right;
        rect.bottom -= this.a.bottom;
        view2.setTouchDelegate(new jvl(rect, view));
    }
}

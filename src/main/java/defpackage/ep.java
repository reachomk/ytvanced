package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* renamed from: ep */
public abstract class ep extends er {
    public final Rect a = new Rect();
    public int b = 0;
    public int c;
    private final Rect d = new Rect();

    public abstract View a(List list);

    public float b(View view) {
        throw null;
    }

    public int d(View view) {
        throw null;
    }

    public ep(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = a(coordinatorLayout.b(view));
        if (a != null) {
            auy auy = (auy) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + auy.leftMargin, a.getBottom() + auy.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - auy.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - auy.bottomMargin);
            abx abx = coordinatorLayout.c;
            if (!(abx == null || !abe.v(coordinatorLayout) || abe.v(view))) {
                rect.left += abx.a();
                rect.right -= abx.c();
            }
            Rect rect2 = this.d;
            int i2 = auy.c;
            Gravity.apply(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i = e(a);
            view.layout(rect2.left, rect2.top - i, rect2.right, rect2.bottom - i);
            this.b = rect2.top - a.getBottom();
            return;
        }
        coordinatorLayout.b(view, i);
        this.b = 0;
    }

    public final int e(View view) {
        if (this.c == 0) {
            return 0;
        }
        float b = b(view);
        int i = this.c;
        return th.a((int) (b * ((float) i)), 0, i);
    }
}

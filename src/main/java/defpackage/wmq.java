package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wmq */
public final class wmq {
    public final Rect a = new Rect();
    public final List b = new ArrayList();
    public int c;
    public int d;

    private wmq() {
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.a.set(i3, i2, i3, i2);
        this.b.clear();
        this.c = i4;
        this.d = i;
    }

    public final boolean a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        measuredWidth = (measuredWidth + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin;
        int measuredHeight = (view.getMeasuredHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin;
        int width = this.c - this.a.width();
        Rect rect;
        if (measuredWidth <= width) {
            rect = this.a;
            rect.right += measuredWidth;
            if (this.a.height() < measuredHeight) {
                rect = this.a;
                rect.bottom = rect.top + measuredHeight;
            }
            this.b.add(view);
            return true;
        } else if (!this.b.isEmpty()) {
            return false;
        } else {
            Rect rect2 = this.a;
            rect2.right += width;
            rect = this.a;
            rect.bottom = rect.top + measuredHeight;
            this.b.add(view);
            return true;
        }
    }

    public final int a() {
        return Math.min(this.a.width(), this.c);
    }

    /* synthetic */ wmq(byte b) {
    }
}

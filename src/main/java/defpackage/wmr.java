package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* renamed from: wmr */
public final class wmr {
    public final Rect a = new Rect();
    public int b;
    private final wmq c = new wmq();
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    private wmr() {
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.d = i;
        this.e = i3;
        this.b = i4;
        this.f = i5;
        this.g = i6;
        this.h = z;
        this.a.setEmpty();
        Rect rect = this.a;
        rect.bottom = i2;
        this.c.a(i6, rect.bottom, i, (i5 - i) - i3);
    }

    public final void a(View view) {
        if (!this.c.a(view)) {
            a();
            amqw.b(this.c.a(view), (Object) "Failed to add child to empty row");
        }
        Rect rect = this.a;
        rect.right = Math.max(rect.right, (this.c.a() + this.d) + this.e);
    }

    public final void a() {
        wmq wmq;
        int a;
        if (this.h) {
            wmq = this.c;
            a = wmq.a.left + ((wmq.c - wmq.a()) / 2);
            for (View view : wmq.b) {
                LayoutParams layoutParams = view.getLayoutParams();
                int i = layoutParams instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams) layoutParams).gravity : layoutParams instanceof FrameLayout.LayoutParams ? ((FrameLayout.LayoutParams) layoutParams).gravity : 0;
                if ((8388615 & i) == 0) {
                    i |= 8388611;
                }
                if ((i & 112) == 0) {
                    i |= 48;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i, wmq.d);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int i2 = marginLayoutParams.leftMargin + a;
                int i3 = i2 + measuredWidth;
                a += (measuredWidth + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin;
                measuredWidth = wmq.a.top + marginLayoutParams.topMargin;
                i = ((i & 112) | absoluteGravity) & 112;
                if (i == 16) {
                    i = (wmq.a.height() - measuredHeight) / 2;
                    measuredWidth += i;
                } else if (i == 80) {
                    i = wmq.a.height() - measuredHeight;
                    measuredWidth += i;
                } else if (i == 112) {
                    measuredHeight = wmq.a.bottom - marginLayoutParams.bottomMargin;
                    view.layout(i2, measuredWidth, i3, measuredHeight);
                }
                measuredHeight += measuredWidth;
                view.layout(i2, measuredWidth, i3, measuredHeight);
            }
        }
        Rect rect = this.a;
        rect.bottom += this.c.a.height();
        wmq = this.c;
        a = this.g;
        int i4 = this.a.bottom;
        int i5 = this.d;
        wmq.a(a, i4, i5, (this.f - i5) - this.e);
    }

    public /* synthetic */ wmr(byte b) {
    }
}

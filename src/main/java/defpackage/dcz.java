package defpackage;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: dcz */
final class dcz extends NestedScrollView {
    public final cpq b;
    public ddb c;
    public OnPreDrawListener d;
    public boolean e;

    dcz(Context context) {
        super(context);
        this.b = new cpq(context);
        addView(this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.e) {
            this.b.m();
        }
        ddb ddb = this.c;
        if (ddb != null) {
            ddb.a = getScrollY();
        }
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, true);
    }
}

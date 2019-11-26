package defpackage;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: kbn */
final class kbn implements OnAttachStateChangeListener {
    private final /* synthetic */ akor a;
    private final /* synthetic */ int b;
    private final /* synthetic */ kbi c;

    kbn(kbi kbi, akor akor, int i) {
        this.c = kbi;
        this.a = akor;
        this.b = i;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.c.d.removeOnAttachStateChangeListener(this);
        boolean z = false;
        this.c.d.measure(MeasureSpec.makeMeasureSpec(((View) this.c.d.getParent()).getMeasuredWidth(), 1073741824), 0);
        int measuredWidth = this.c.d.getMeasuredWidth();
        float a = this.c.a(this.a);
        int i = this.b;
        int measuredHeight = this.c.e.getMeasuredHeight();
        kbi kbi = this.c;
        int i2 = kbi.c;
        View view2 = kbi.f;
        if (measuredHeight + (i2 + i2) <= ((int) (((float) measuredWidth) / a)) - i) {
            z = true;
        }
        xpr.a(view2, z);
        this.c.d.requestLayout();
    }
}

package defpackage;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: wsl */
final class wsl implements OnGlobalLayoutListener {
    private final /* synthetic */ wsj a;

    wsl(wsj wsj) {
        this.a = wsj;
    }

    public final void onGlobalLayout() {
        if (this.a.a.getParent() != null) {
            this.a.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view = this.a.a;
            view.measure(MeasureSpec.makeMeasureSpec(((View) view.getParent()).getMeasuredWidth(), 1073741824), 0);
            if (this.a.b.getMeasuredWidth() > this.a.a.getMeasuredWidth() / 2) {
                this.a.a(1);
            } else {
                this.a.a(0);
            }
            this.a.a.requestLayout();
        }
    }
}

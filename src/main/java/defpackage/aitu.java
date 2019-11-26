package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: aitu */
final class aitu implements OnGlobalLayoutListener {
    private final /* synthetic */ aits a;

    aitu(aits aits) {
        this.a = aits;
    }

    public final void onGlobalLayout() {
        if (this.a.b()) {
            this.a.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.e(64);
            this.a.a(0, "onLayoutChange", new Object[0]);
            if (this.a.b(2) || this.a.b(4)) {
                this.a.e();
            }
        }
    }
}

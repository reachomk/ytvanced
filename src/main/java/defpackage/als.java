package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: als */
final class als implements OnGlobalLayoutListener {
    private final /* synthetic */ alq a;

    als(alq alq) {
        this.a = alq;
    }

    public final void onGlobalLayout() {
        alq alq = this.a;
        AppCompatSpinner appCompatSpinner = alq.d;
        if (abe.H(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(alq.c)) {
            this.a.g();
            super.f_();
            return;
        }
        this.a.d();
    }
}

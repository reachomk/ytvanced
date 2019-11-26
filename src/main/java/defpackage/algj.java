package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: algj */
final /* synthetic */ class algj implements OnFocusChangeListener {
    private final algg a;

    algj(algg algg) {
        this.a = algg;
    }

    public final void onFocusChange(View view, boolean z) {
        algg algg = this.a;
        for (almv b : algg.f.b) {
            b.b(z);
        }
        if (algg.c.isInputMethodTarget() && !z) {
            xpr.a(algg.c);
        }
    }
}

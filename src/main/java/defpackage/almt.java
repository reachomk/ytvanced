package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: almt */
final class almt implements OnFocusChangeListener {
    private final /* synthetic */ almv a;
    private final /* synthetic */ almr b;

    almt(almr almr, almv almv) {
        this.b = almr;
        this.a = almv;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.b(z);
        if (this.b.a.isInputMethodTarget() && !z) {
            xpr.a(this.b.a);
        }
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: wmu */
final /* synthetic */ class wmu implements OnFocusChangeListener {
    private final wmt a;

    wmu(wmt wmt) {
        this.a = wmt;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.b();
        if (!z) {
            xpr.a(view);
        }
    }
}

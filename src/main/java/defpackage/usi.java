package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: usi */
final /* synthetic */ class usi implements OnFocusChangeListener {
    private final usf a;

    usi(usf usf) {
        this.a = usf;
    }

    public final void onFocusChange(View view, boolean z) {
        usf usf = this.a;
        if (z) {
            usf.g.performClick();
        }
    }
}

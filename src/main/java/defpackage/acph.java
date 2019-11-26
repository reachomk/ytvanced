package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: acph */
final /* synthetic */ class acph implements OnFocusChangeListener {
    private final acpe a;

    acph(acpe acpe) {
        this.a = acpe;
    }

    public final void onFocusChange(View view, boolean z) {
        acpe acpe = this.a;
        if (z) {
            acpe.ac.setMaxLines(Integer.MAX_VALUE);
            return;
        }
        acpe.ac.setMaxLines(2);
        acpe.ac.setSelection(0);
    }
}

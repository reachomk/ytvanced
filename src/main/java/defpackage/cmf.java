package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: cmf */
public final class cmf implements OnFocusChangeListener {
    public coj a;

    cmf() {
    }

    public final void onFocusChange(View view, boolean z) {
        coj coj = this.a;
        if (coj != null) {
            if (cok.b == null) {
                cok.b = new coq();
            }
            cok.b.a = view;
            cok.b.b = z;
            coj.a.m().a(coj, cok.b);
            cok.b.a = null;
        }
    }
}

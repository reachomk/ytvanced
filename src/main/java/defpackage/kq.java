package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: kq */
final class kq implements OnFocusChangeListener {
    private final /* synthetic */ kk a;

    kq(kk kkVar) {
        this.a = kkVar;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.g.i.setActivated(z);
        if (!z) {
            this.a.i.setChecked(false);
            this.a.b = false;
        }
    }
}

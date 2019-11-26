package defpackage;

import android.view.inputmethod.InputMethodManager;

/* renamed from: zrt */
final class zrt implements Runnable {
    private final /* synthetic */ zrr a;

    zrt(zrr zrr) {
        this.a = zrr;
    }

    public final void run() {
        nn p = this.a.p();
        if (p != null) {
            ((InputMethodManager) p.getSystemService("input_method")).hideSoftInputFromWindow(this.a.K.getWindowToken(), 0);
        }
    }
}

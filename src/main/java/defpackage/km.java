package defpackage;

import android.widget.AutoCompleteTextView;

/* renamed from: km */
final class km implements Runnable {
    private final /* synthetic */ AutoCompleteTextView a;
    private final /* synthetic */ kn b;

    km(kn knVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = knVar;
        this.a = autoCompleteTextView;
    }

    public final void run() {
        boolean isPopupShowing = this.a.isPopupShowing();
        this.b.a.i.setChecked(isPopupShowing);
        this.b.a.b = isPopupShowing;
    }
}

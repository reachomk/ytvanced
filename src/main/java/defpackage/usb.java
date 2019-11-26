package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Spinner;

/* renamed from: usb */
final class usb implements OnFocusChangeListener {
    private final /* synthetic */ Spinner a;

    usb(Spinner spinner) {
        this.a = spinner;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.performClick();
        }
    }
}

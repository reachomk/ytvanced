package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: algl */
final class algl implements TextWatcher {
    private final /* synthetic */ algg a;

    algl(algg algg) {
        this.a = algg;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (almv a : this.a.f.b) {
            a.a(charSequence.toString());
        }
    }
}

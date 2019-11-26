package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: aljv */
final class aljv implements TextWatcher {
    private final /* synthetic */ aljs a;

    aljv(aljs aljs) {
        this.a = aljs;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((alfx) this.a.ae).a(charSequence.toString());
        this.a.an.setVisibility(charSequence.length() == 0 ? 8 : 0);
    }
}

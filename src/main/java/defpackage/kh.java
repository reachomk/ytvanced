package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: kh */
final class kh implements TextWatcher {
    private final /* synthetic */ ke a;

    kh(ke keVar) {
        this.a = keVar;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        this.a.g.d(editable.length() > 0);
    }
}

package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: almq */
final class almq implements TextWatcher {
    private final /* synthetic */ almv a;

    almq(almv almv) {
        this.a = almv;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a(charSequence.toString());
    }
}

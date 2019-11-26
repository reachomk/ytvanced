package defpackage;

import android.support.design.textfield.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: ld */
public final class ld implements TextWatcher {
    private final /* synthetic */ TextInputLayout a;

    public ld(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.a(textInputLayout.m ^ 1);
        textInputLayout = this.a;
        if (textInputLayout.b) {
            textInputLayout.c(editable.length());
        }
    }
}

package defpackage;

import android.support.design.textfield.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;

/* renamed from: fdz */
final class fdz implements TextWatcher {
    private final /* synthetic */ TextInputLayout a;
    private final /* synthetic */ fdn b;

    fdz(fdn fdn, TextInputLayout textInputLayout) {
        this.b = fdn;
        this.a = textInputLayout;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        HatsSurvey hatsSurvey = this.b.b;
        boolean z = false;
        if (length > 0 && length <= this.a.c) {
            z = true;
        }
        hatsSurvey.a(z);
    }
}

package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: kpj */
final class kpj implements TextWatcher {
    private final /* synthetic */ kph a;

    kpj(kph kph) {
        this.a = kph;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.e();
    }
}

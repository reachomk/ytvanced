package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

/* renamed from: kn */
final class kn implements TextWatcher {
    public final /* synthetic */ kk a;

    kn(kk kkVar) {
        this.a = kkVar;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        AutoCompleteTextView a = kk.a(this.a.g.a);
        a.post(new km(this, a));
    }
}

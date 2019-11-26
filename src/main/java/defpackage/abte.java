package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: abte */
final class abte implements TextWatcher {
    private final /* synthetic */ abta a;

    abte(abta abta) {
        this.a = abta;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        abta abta = this.a;
        abta.a(abta.i.a(abta.b.getText(), this.a.k), this.a.j);
    }
}

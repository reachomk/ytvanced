package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: irg */
final class irg implements TextWatcher {
    private final /* synthetic */ iqu a;

    irg(iqu iqu) {
        this.a = iqu;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0 && this.a.au.g()) {
            this.a.aI.setVisibility(0);
        } else {
            this.a.aI.setVisibility(8);
        }
        abnx abnx = this.a.at;
        abnx.d.add(athc.KEYBOARD);
        abnx.b();
        this.a.al();
        this.a.aK = editable.toString();
        this.a.ak();
        iqu iqu = this.a;
        iqu.c(iqu.aK);
    }
}

package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: agks */
public final class agks implements TextWatcher {
    private final /* synthetic */ ahcy a;

    public agks(ahcy ahcy) {
        this.a = ahcy;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        i = aahv.a;
        if (charSequence.length() > 0) {
            i = Integer.parseInt(charSequence.toString());
        }
        this.a.b = i;
    }
}

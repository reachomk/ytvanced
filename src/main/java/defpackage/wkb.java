package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: wkb */
final class wkb implements TextWatcher {
    private final /* synthetic */ wjv a;

    wkb(wjv wjv) {
        this.a = wjv;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        wjv wjv = this.a;
        wjv.ay += Math.max(0, i2 - i3);
    }

    public final void afterTextChanged(Editable editable) {
        this.a.ac();
    }
}

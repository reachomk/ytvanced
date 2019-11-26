package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: jmo */
final class jmo implements TextWatcher {
    private final /* synthetic */ jml a;

    jmo(jml jml) {
        this.a = jml;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        jml jml = this.a;
        jml.f = editable;
        jml.c();
    }
}

package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;

/* renamed from: flf */
final class flf implements TextWatcher {
    private final /* synthetic */ Button a;
    private final /* synthetic */ fkz b;

    flf(fkz fkz, Button button) {
        this.b = fkz;
        this.a = button;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable) || TextUtils.getTrimmedLength(editable) == 0) {
            this.b.a(this.a, false);
        } else {
            this.b.a(this.a, true);
        }
    }
}

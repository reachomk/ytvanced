package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: koz */
final class koz implements TextWatcher {
    private final /* synthetic */ kov a;

    koz(kov kov) {
        this.a = kov;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.e();
    }
}

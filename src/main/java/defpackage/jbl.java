package defpackage;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: jbl */
public final class jbl implements TextWatcher {
    private final /* synthetic */ AlertDialog a;

    public jbl(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        this.a.getButton(-1).setEnabled(TextUtils.isEmpty(editable) ^ 1);
    }
}

package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.youtube.R;

/* renamed from: wmx */
final class wmx implements TextWatcher {
    private final /* synthetic */ wmt a;

    wmx(wmt wmt) {
        this.a = wmt;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() > 0) {
            this.a.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_clear_entry, 0);
            this.a.d = true;
        } else {
            this.a.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            wmt wmt = this.a;
            wmt.d = false;
            wmt.c();
        }
        this.a.b();
    }
}

package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: ayh */
final class ayh implements TextWatcher {
    public int a = Integer.MAX_VALUE;
    private final EditText b;
    private awx c;

    ayh(EditText editText) {
        this.b = editText;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.b.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            i2 = awq.a().c();
            if (i2 != 0) {
                if (i2 == 1) {
                    awq.a().a((Spannable) charSequence, i, i3 + i, this.a);
                    return;
                } else if (i2 != 3) {
                    return;
                }
            }
            awq a = awq.a();
            if (this.c == null) {
                this.c = new ayg(this.b);
            }
            a.a(this.c);
        }
    }
}

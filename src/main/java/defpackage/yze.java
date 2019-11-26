package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: yze */
final class yze implements TextWatcher {
    private final /* synthetic */ yza a;

    yze(yza yza) {
        this.a = yza;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float f;
        this.a.d.a(charSequence != null ? charSequence.toString() : null);
        if (this.a.a.getLineCount() >= 5) {
            f = this.a.c;
        } else {
            f = this.a.b;
        }
        if (((float) this.a.a.getPaddingTop()) != f) {
            TextView textView = this.a.a;
            textView.setPadding(textView.getPaddingLeft(), (int) f, this.a.a.getPaddingRight(), this.a.a.getPaddingBottom());
        }
    }
}

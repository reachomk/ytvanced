package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: axz */
final class axz implements InputFilter {
    private final TextView a;
    private awx b;

    axz(TextView textView) {
        this.a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.a.isInEditMode()) {
            int c = awq.a().c();
            if (c != 0) {
                if (c == 1) {
                    if (!((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) || charSequence == null)) {
                        if (!(i == 0 && i2 == charSequence.length())) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        charSequence = awq.a().a(charSequence, charSequence.length());
                    }
                    return charSequence;
                } else if (c != 3) {
                    return charSequence;
                }
            }
            awq a = awq.a();
            if (this.b == null) {
                this.b = new ayc(this.a);
            }
            a.a(this.b);
        }
        return charSequence;
    }

    static void a(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }
}

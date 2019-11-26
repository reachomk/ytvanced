package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

/* renamed from: yfl */
final class yfl implements TextWatcher {
    private final /* synthetic */ EditText a;
    private final /* synthetic */ yfh b;

    yfl(yfh yfh, EditText editText) {
        this.b = yfh;
        this.a = editText;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        yfh yfh = this.b;
        int i4 = 0;
        i2 = (yfh.g.matcher(charSequence).matches() && yfh.k == null) ? 1 : 0;
        ImageView imageView = yfh.e;
        if (i2 != 0) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
        aqnz aqnz = yfh.j;
        aqnz aqnz2 = null;
        aqny aqny = aqnz != null ? (aqny) ((anxo) aqnz.toBuilder()) : null;
        yfh.l.a(aqny, i2 ^ 1);
        if (i3 > 1 && yfh.k == null) {
            ((yfi) yfh.a.get()).a(charSequence.toString(), i3, aqny, yfh);
        }
        if (aqny != null) {
            aqnz2 = (aqnz) ((anxl) aqny.build());
        }
        yfh.j = aqnz2;
        yfh yfh2 = this.b;
        if (this.a.getLineCount() < 5) {
            i = yfh2.h;
        } else {
            i = yfh2.i;
        }
        if (yfh2.d.getPaddingTop() != i) {
            EditText editText = yfh2.d;
            editText.setPadding(editText.getPaddingLeft(), i, yfh2.d.getPaddingRight(), yfh2.d.getPaddingBottom());
        }
    }
}

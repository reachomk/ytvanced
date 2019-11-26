package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import com.google.android.youtube.R;

/* renamed from: adwa */
final class adwa implements TextWatcher, OnKeyListener {
    private final advv a;
    private final EditText b;
    private final EditText c;
    private final EditText d;
    private final int e;

    adwa(advv advv, EditText editText, EditText editText2, EditText editText3, int i) {
        this.a = advv;
        this.b = editText;
        this.c = editText2;
        this.d = editText3;
        this.e = i;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        advv advv;
        if (charSequence.length() == this.e) {
            EditText editText = this.d;
            if (editText != null) {
                editText.requestFocus();
            }
            advv = this.a;
            String valueOf = String.valueOf(advv.f.getText());
            String valueOf2 = String.valueOf(advv.g.getText());
            String valueOf3 = String.valueOf(advv.h.getText());
            String valueOf4 = String.valueOf(advv.i.getText());
            int length = valueOf.length();
            int length2 = valueOf2.length();
            StringBuilder stringBuilder = new StringBuilder(((length + length2) + valueOf3.length()) + valueOf4.length());
            stringBuilder.append(valueOf);
            stringBuilder.append(valueOf2);
            stringBuilder.append(valueOf3);
            stringBuilder.append(valueOf4);
            valueOf = stringBuilder.toString();
            if (valueOf.length() == advv.l) {
                advv.k.setVisibility(0);
                advv.j.setVisibility(8);
                advv.b.a(new adiy(valueOf), wxc.a(advv.e, new adwb(advv)));
            }
            return;
        }
        advv = this.a;
        advv.c();
        advv.j.setImageDrawable(null);
        advv.j.setContentDescription(null);
        advv.j.setClickable(false);
        advv.a(xwe.a(advv.j.getContext(), R.attr.ytThemedBlue, 0));
        advv.m.setEnabled(false);
        advv.m.setTag(null);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0 || this.c.getSelectionStart() != 0 || this.c.getSelectionEnd() != 0) {
            return false;
        }
        EditText editText = this.b;
        if (editText == null) {
            return false;
        }
        editText.requestFocus();
        Editable text = this.b.getText();
        int length = text.length();
        if (length > 0) {
            length--;
            this.b.setText(text.subSequence(0, length));
            this.b.setSelection(length);
        }
        return true;
    }
}

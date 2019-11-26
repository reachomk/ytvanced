package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: gre */
final class gre implements TextWatcher {
    private final /* synthetic */ grf a;

    gre(grf grf) {
        this.a = grf;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() > 0 && i < charSequence.length() && i >= 0 && charSequence.charAt(i) == 10) {
            this.a.a();
        }
    }

    public final void afterTextChanged(Editable editable) {
        grf grf = this.a;
        if (grf.i == null && grf.b()) {
            int selectionStart = grf.b.getSelectionStart();
            if (selectionStart > 0) {
                if ("@﹫＠+﹢＋".indexOf(grf.b.getText().charAt(selectionStart - 1)) != -1) {
                    selectionStart = grf.b.getSelectionStart();
                    grf.i = new grj();
                    grf.b.getText().setSpan(grf.i, selectionStart - 1, selectionStart, 34);
                    grf.h.a();
                    return;
                }
            }
        }
        if (grf.i != null) {
            if (grf.b()) {
                Editable text = grf.b.getText();
                int selectionStart2 = grf.b.getSelectionStart();
                Object obj = null;
                Object obj2 = (selectionStart2 <= 0 || text.charAt(selectionStart2 - 1) != ' ') ? null : 1;
                if (selectionStart2 >= 2 && text.charAt(selectionStart2 - 2) == ' ') {
                    obj = 1;
                }
                if (((!grf.j && obj == null) || obj2 == null) && text.getSpanStart(grf.i) < text.getSpanEnd(grf.i)) {
                    text = grf.b.getText();
                    grf.h.a(text.subSequence(text.getSpanStart(grf.i) + 1, text.getSpanEnd(grf.i)).toString());
                }
            }
            grf.a();
        }
    }
}

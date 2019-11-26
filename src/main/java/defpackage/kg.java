package defpackage;

import android.text.TextUtils;
import android.widget.EditText;

/* renamed from: kg */
final class kg implements lg {
    private final /* synthetic */ ke a;

    kg(ke keVar) {
        this.a = keVar;
    }

    public final void a(EditText editText) {
        this.a.g.d(TextUtils.isEmpty(editText.getText()) ^ 1);
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}

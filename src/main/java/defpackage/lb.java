package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

/* renamed from: lb */
final class lb implements lj {
    private final /* synthetic */ kw a;

    lb(kw kwVar) {
        this.a = kwVar;
    }

    public final void a(int i) {
        EditText editText = this.a.g.a;
        if (editText != null && i == 1) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

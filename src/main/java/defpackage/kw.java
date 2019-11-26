package defpackage;

import android.support.design.textfield.TextInputLayout;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.youtube.R;

/* renamed from: kw */
public final class kw extends ks {
    public final TextWatcher a = new kz(this);
    private final lg b = new ky(this);
    private final lj c = new lb(this);

    public kw(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.g.a(agb.b(this.h, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.g;
        textInputLayout.d(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.g.a(new la(this));
        this.g.a(this.b);
        textInputLayout = this.g;
        textInputLayout.j.add(this.c);
    }

    public final boolean c() {
        EditText editText = this.g.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}

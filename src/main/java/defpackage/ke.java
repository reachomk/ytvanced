package defpackage;

import android.support.design.textfield.TextInputLayout;
import android.text.TextWatcher;
import com.google.android.youtube.R;

/* renamed from: ke */
public final class ke extends ks {
    public final TextWatcher a = new kh(this);
    private final lg b = new kg(this);

    public ke(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.g.a(agb.b(this.h, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.g;
        textInputLayout.d(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.g.a(new kj(this));
        this.g.a(this.b);
    }
}

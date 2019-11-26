package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputEditText;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputView;

/* renamed from: uzz */
public final class uzz implements TextWatcher {
    private final /* synthetic */ int a;
    private final /* synthetic */ CodeInputView b;

    public uzz(CodeInputView codeInputView, int i) {
        this.b = codeInputView;
        this.a = i;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 > i2) {
            CodeInputView codeInputView = this.b;
            CodeInputEditText codeInputEditText = codeInputView.a[this.a];
            if (codeInputView.c) {
                i = CodeInputView.b(codeInputEditText);
                if (i < 5) {
                    codeInputView.c(i + 1);
                    return;
                }
                codeInputView.c();
                codeInputView.a(-1);
                vab vab = codeInputView.b;
                if (vab != null) {
                    vab.a(codeInputView.a());
                }
            }
        }
    }
}

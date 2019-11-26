package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: la */
final class la implements OnClickListener {
    private final /* synthetic */ kw a;

    la(kw kwVar) {
        this.a = kwVar;
    }

    public final void onClick(View view) {
        EditText editText = this.a.g.a;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (this.a.c()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            editText.setSelection(selectionEnd);
        }
    }
}

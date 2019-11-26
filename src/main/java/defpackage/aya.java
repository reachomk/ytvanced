package defpackage;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* renamed from: aya */
final class aya extends InputConnectionWrapper {
    private final TextView a;

    aya(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.a = textView;
        awq a = awq.a();
        if (a.d() && editorInfo != null && editorInfo.extras != null) {
            a.c.a(editorInfo);
        }
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        if (awq.a(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (awq.a(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }

    private final Editable a() {
        return this.a.getEditableText();
    }
}

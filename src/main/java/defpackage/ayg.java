package defpackage;

import android.text.Selection;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: ayg */
final class ayg extends awx {
    private final Reference a;

    ayg(EditText editText) {
        this.a = new WeakReference(editText);
    }

    public final void a() {
        EditText editText = (EditText) this.a.get();
        if (editText != null && editText.isAttachedToWindow()) {
            CharSequence editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            awq.a().a(editableText);
            axz.a(editableText, selectionStart, selectionEnd);
        }
    }
}

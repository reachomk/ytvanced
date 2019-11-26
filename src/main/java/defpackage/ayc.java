package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: ayc */
final class ayc extends awx {
    private final Reference a;

    ayc(TextView textView) {
        this.a = new WeakReference(textView);
    }

    public final void a() {
        TextView textView = (TextView) this.a.get();
        if (textView != null && textView.isAttachedToWindow()) {
            CharSequence a = awq.a().a(textView.getText());
            int selectionStart = Selection.getSelectionStart(a);
            int selectionEnd = Selection.getSelectionEnd(a);
            textView.setText(a);
            if (a instanceof Spannable) {
                axz.a((Spannable) a, selectionStart, selectionEnd);
            }
        }
    }
}

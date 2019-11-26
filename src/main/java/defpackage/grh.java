package defpackage;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;

/* renamed from: grh */
final class grh implements SpanWatcher {
    private final /* synthetic */ grf a;

    grh(grf grf) {
        this.a = grf;
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        grf grf = this.a;
        if (grf.i != null) {
            Editable text = grf.b.getText();
            int spanStart = text.getSpanStart(this.a.i);
            int spanEnd = text.getSpanEnd(this.a.i);
            i = this.a.b.getSelectionStart();
            i2 = this.a.b.getSelectionEnd();
            if (i < spanStart || i2 < spanStart || i > spanEnd || i2 > spanEnd) {
                this.a.a();
            }
        }
    }
}

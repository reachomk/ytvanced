package defpackage;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;

/* renamed from: wlt */
public final class wlt implements SpanWatcher {
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (obj == Selection.SELECTION_END) {
            int selectionStart = Selection.getSelectionStart(spannable);
            i = Selection.getSelectionEnd(spannable);
            if (selectionStart != -1 && selectionStart == i && i4 > 0 && i4 < spannable.length()) {
                wlr[] wlrArr;
                if (i4 <= i2) {
                    wlrArr = (wlr[]) spannable.getSpans(i4, i4 + 1, wlr.class);
                    if (wlrArr != null && wlrArr.length > 0) {
                        selectionStart = spannable.getSpanStart(wlrArr[0]);
                        if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        }
                        return;
                    }
                    return;
                }
                wlrArr = (wlr[]) spannable.getSpans(i4 - 1, i4, wlr.class);
                if (wlrArr != null && wlrArr.length > 0) {
                    selectionStart = spannable.getSpanEnd(wlrArr[0]);
                    if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    }
                }
            }
        }
    }
}

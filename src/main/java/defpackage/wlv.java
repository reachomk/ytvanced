package defpackage;

import android.text.Editable;

/* renamed from: wlv */
final /* synthetic */ class wlv implements Runnable {
    private final Editable a;
    private final wlr b;

    wlv(Editable editable, wlr wlr) {
        this.a = editable;
        this.b = wlr;
    }

    public final void run() {
        Editable editable = this.a;
        wlr wlr = this.b;
        int spanStart = editable.getSpanStart(wlr);
        int spanEnd = editable.getSpanEnd(wlr);
        if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
            editable.removeSpan(wlr);
            editable.delete(spanStart, spanEnd);
        }
    }
}

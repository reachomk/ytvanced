package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;

/* renamed from: iva */
final class iva implements OnPreDrawListener {
    private final /* synthetic */ TextView a;
    private final /* synthetic */ iuw b;

    iva(iuw iuw, TextView textView) {
        this.b = iuw;
        this.a = textView;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int lineCount = this.a.getLineCount();
        iuw iuw = this.b;
        if (lineCount == iuw.w && iuw.e) {
            iuw.d.a();
        }
        return true;
    }
}

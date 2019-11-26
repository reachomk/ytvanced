package defpackage;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: ddc */
final class ddc implements OnPreDrawListener {
    private final /* synthetic */ ddb a;
    private final /* synthetic */ dcz b;

    ddc(dcz dcz, ddb ddb) {
        this.b = dcz;
        this.a = ddb;
    }

    public final boolean onPreDraw() {
        this.b.setScrollY(this.a.a);
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        return true;
    }
}

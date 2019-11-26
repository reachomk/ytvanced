package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: xpz */
final class xpz implements OnPreDrawListener {
    private final /* synthetic */ xpw a;

    xpz(xpw xpw) {
        this.a = xpw;
    }

    public final boolean onPreDraw() {
        this.a.c();
        return true;
    }
}

package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: wia */
final class wia implements OnGlobalLayoutListener {
    private final /* synthetic */ wib a;

    wia(wib wib) {
        this.a = wib;
    }

    public final void onGlobalLayout() {
        wib wib = this.a;
        View view = wib.c;
        int i = wib.d;
        wlj.a(view, i, 0, i, 0);
        this.a.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

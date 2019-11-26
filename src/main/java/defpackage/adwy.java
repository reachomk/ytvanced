package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: adwy */
final class adwy implements OnGlobalLayoutListener {
    private final /* synthetic */ alcg a;
    private final /* synthetic */ adwl b;

    adwy(adwl adwl, alcg alcg) {
        this.b = adwl;
        this.a = alcg;
    }

    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.b.k.getGlobalVisibleRect(rect);
        this.a.a(rect);
        this.b.k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

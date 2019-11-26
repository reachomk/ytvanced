package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: hgc */
final class hgc implements OnGlobalLayoutListener {
    private final /* synthetic */ alcg a;
    private final /* synthetic */ hfy b;

    hgc(hfy hfy, alcg alcg) {
        this.b = hfy;
        this.a = alcg;
    }

    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.b.b.getGlobalVisibleRect(rect);
        this.a.a(rect);
        this.b.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

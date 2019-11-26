package defpackage;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: gne */
final class gne implements OnGlobalLayoutListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ ViewTreeObserver c;
    private final /* synthetic */ gmp d;

    gne(gmp gmp, int i, int i2, ViewTreeObserver viewTreeObserver) {
        this.d = gmp;
        this.a = i;
        this.b = i2;
        this.c = viewTreeObserver;
    }

    public final void onGlobalLayout() {
        if (this.a != this.d.aL.getWidth() || this.b != this.d.aL.getHeight()) {
            this.c.removeOnGlobalLayoutListener(this);
            this.d.a.notifyObservers();
        }
    }
}

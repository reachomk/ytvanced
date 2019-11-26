package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gua */
final /* synthetic */ class gua implements OnLayoutChangeListener {
    private final gub a;

    gua(gub gub) {
        this.a = gub;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        gub gub = this.a;
        gub.bW = view.getWidth();
        gub.bX = view.getHeight();
    }
}

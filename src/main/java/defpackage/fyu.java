package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: fyu */
final /* synthetic */ class fyu implements OnLayoutChangeListener {
    private final fyr a;

    fyu(fyr fyr) {
        this.a = fyr;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fyr fyr = this.a;
        zhl h = fyr.b.h();
        if (h != null) {
            i = (int) (((float) fyr.c.getWidth()) * (((float) h.a) / ((float) h.b)));
            fyr.d.setTranslationY((float) ((fyr.c.getHeight() - i) / 2));
            fyr.d.setLayoutParams(new LayoutParams(fyr.c.getWidth(), i));
        }
    }
}

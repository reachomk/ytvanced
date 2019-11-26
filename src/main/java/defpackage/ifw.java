package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: ifw */
final /* synthetic */ class ifw implements OnLayoutChangeListener {
    private final ifl a;

    ifw(ifl ifl) {
        this.a = ifl;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ifl ifl = this.a;
        i3 -= i;
        i4 -= i2;
        if (foh.t(ifl.D) && ifl.f && i3 >= i4) {
            i3 = (i3 - ((int) (((float) i4) * 1.7777778f))) / 2;
            Rect rect = ifl.E;
            rect.set(i3, rect.top, i3, ifl.E.bottom);
            ifl.k.setPadding(ifl.E.left, ifl.E.top, ifl.E.right, ifl.E.bottom);
            ifl.h.a(ifl.E);
            ifl.j.a(ifl.E);
        }
    }
}

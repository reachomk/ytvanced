package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: lwd */
final class lwd extends eix implements OnLayoutChangeListener {
    private lwd() {
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i3 -= i;
        i4 -= i2;
        i8 -= i6;
        if (i3 != i7 - i5 || i4 != i8) {
            a(i3, i4);
        }
    }

    /* synthetic */ lwd(byte b) {
    }
}

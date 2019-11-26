package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: hvz */
final /* synthetic */ class hvz implements OnLayoutChangeListener {
    private final hvx a;

    hvz(hvx hvx) {
        this.a = hvx;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        hvx hvx = this.a;
        i4 -= i2;
        i3 -= i;
        if (i4 != hvx.b || i3 != hvx.c) {
            hvx.b = i4;
            hvx.c = i3;
            hvx.b(22);
        }
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: krm */
final /* synthetic */ class krm implements OnLayoutChangeListener {
    private final krl a;

    krm(krl krl) {
        this.a = krl;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        krl krl = this.a;
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            krl.a(krl.i, krl.h);
        }
    }
}

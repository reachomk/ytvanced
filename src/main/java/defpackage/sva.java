package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: sva */
final class sva implements OnLayoutChangeListener {
    private final /* synthetic */ bbmh a;
    private final /* synthetic */ suv b;

    sva(suv suv, bbmh bbmh) {
        this.b = suv;
        this.a = bbmh;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bbmh bbmh = this.a;
        suv suv = this.b;
        bbmh.a(suv.a(suv.a, suv.b, suv.c, suv.d));
    }
}

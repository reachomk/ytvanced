package defpackage;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: grg */
final class grg implements OnLayoutChangeListener {
    private final /* synthetic */ grf a;

    grg(grf grf) {
        this.a = grf;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i8) {
            grf grf = this.a;
            i = grf.a.getHeight();
            i2 = grf.b.getLineHeight();
            LayoutParams layoutParams = grf.c.getLayoutParams();
            layoutParams.height = i - (i2 << 2);
            grf.c.setLayoutParams(layoutParams);
            grf.d.a(i / 2);
            BottomSheetBehavior bottomSheetBehavior = grf.d;
            if (bottomSheetBehavior.k != 5) {
                bottomSheetBehavior.b(4);
            }
        }
    }
}

package defpackage;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: ybj */
final class ybj implements OnLayoutChangeListener {
    private final /* synthetic */ ybk a;

    ybj(ybk ybk) {
        this.a = ybk;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BottomSheetBehavior b = BottomSheetBehavior.b((View) this.a.ac.getParent());
        if (b != null) {
            b.b(3);
            b.j = true;
        }
        this.a.ad.removeOnLayoutChangeListener(this);
    }
}

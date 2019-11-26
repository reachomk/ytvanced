package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: ift */
final /* synthetic */ class ift implements OnLayoutChangeListener {
    private final ifl a;

    ift(ifl ifl) {
        this.a = ifl;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (int) (((float) (i3 - i)) * 0.16666667f);
        this.a.m.setPadding(i9, 10, i9, 10);
    }
}

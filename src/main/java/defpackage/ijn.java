package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: ijn */
final class ijn implements OnLayoutChangeListener {
    private final /* synthetic */ ijj a;

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i3 -= i;
        i4 -= i2;
        i8 -= i6;
        if (i3 != i7 - i5 || i4 != i8) {
            ijj ijj = this.a;
            ijj.a = ((float) i3) / ((float) i4);
            ijj.c();
        }
    }

    /* synthetic */ ijn(ijj ijj) {
        this.a = ijj;
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: abxa */
final class abxa implements OnLayoutChangeListener {
    public final /* synthetic */ abxb a;

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int measuredHeight = this.a.b.getMeasuredHeight();
        abxb abxb = this.a;
        if (measuredHeight != abxb.i) {
            abxb.i = measuredHeight;
            abxb.b.post(new abxd(this));
        }
    }

    /* synthetic */ abxa(abxb abxb) {
        this.a = abxb;
    }
}

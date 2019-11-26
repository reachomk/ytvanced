package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: her */
final class her implements OnLayoutChangeListener {
    private final /* synthetic */ hel a;

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            this.a.b();
        }
    }

    /* synthetic */ her(hel hel) {
        this.a = hel;
    }
}

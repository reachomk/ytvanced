package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: alkk */
final class alkk implements OnLayoutChangeListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ alkc b;

    alkk(alkc alkc, int i) {
        this.b = alkc;
        this.a = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b.aa.getHeight() != this.a) {
            this.b.aa.removeOnLayoutChangeListener(this);
            this.b.f(false);
        }
    }
}

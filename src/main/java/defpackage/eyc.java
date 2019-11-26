package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: eyc */
public final /* synthetic */ class eyc implements OnLayoutChangeListener {
    private final exz a;

    public eyc(exz exz) {
        this.a = exz;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        exz exz = this.a;
        i4 -= i2;
        if (i4 != i8 - i6 && exz.b != null) {
            for (eya a_ : exz.a) {
                a_.a_(i4);
            }
        }
    }
}

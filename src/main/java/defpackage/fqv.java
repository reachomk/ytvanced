package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: fqv */
final class fqv implements OnLayoutChangeListener {
    private final fqt a;

    public fqv(fqt fqt) {
        this.a = fqt;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.c(view.getHeight());
    }
}

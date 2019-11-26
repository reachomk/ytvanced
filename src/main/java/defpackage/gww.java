package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gww */
final class gww implements OnLayoutChangeListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ gwq b;

    gww(gwq gwq, int i) {
        this.b = gwq;
        this.a = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b.ab.getHeight() != this.a) {
            this.b.ab.removeOnLayoutChangeListener(this);
            this.b.f(false);
        }
    }
}

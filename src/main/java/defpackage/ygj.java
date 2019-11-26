package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: ygj */
final class ygj implements OnLayoutChangeListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ ygg b;

    ygj(ygg ygg, View view) {
        this.b = ygg;
        this.a = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.b.o = true;
        this.a.removeOnLayoutChangeListener(this);
    }
}

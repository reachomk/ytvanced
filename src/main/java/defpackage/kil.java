package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: kil */
final class kil implements OnLayoutChangeListener {
    private final aygk a;
    private final boolean b;
    private final /* synthetic */ kih c;

    public kil(kih kih, aygk aygk, boolean z) {
        this.c = kih;
        this.a = aygk;
        this.b = z;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.c.b.removeOnLayoutChangeListener(this);
        this.c.a(this.a, this.b);
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: kkx */
final class kkx implements OnLayoutChangeListener {
    private final /* synthetic */ kkt a;

    kkx(kkt kkt) {
        this.a = kkt;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.c.removeOnLayoutChangeListener(this);
        kkt kkt = this.a;
        kkt.a.a(kkt, kkt.j);
    }
}

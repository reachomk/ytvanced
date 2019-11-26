package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: yfm */
public final class yfm implements OnLayoutChangeListener {
    private final /* synthetic */ yfh a;

    public yfm(yfh yfh) {
        this.a = yfh;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.e.removeOnLayoutChangeListener(this);
        this.a.e.sendAccessibilityEvent(8);
    }
}

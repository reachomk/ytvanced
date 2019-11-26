package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: bez */
public final class bez extends Animation {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ SwipeRefreshLayout c;

    public bez(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        bes bes = this.c.i;
        int i = this.a;
        bes.setAlpha((int) (((float) i) + (((float) (this.b - i)) * f)));
    }
}

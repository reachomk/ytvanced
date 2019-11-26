package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Interpolator;

/* renamed from: aqf */
public final class aqf {
    public int a = 0;
    public int b = 0;
    public int c = aocf.UNSET_ENUM_VALUE;
    public int d = -1;
    public boolean e = false;
    private Interpolator f = null;
    private int g = 0;

    /* Access modifiers changed, original: final */
    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.d(i);
            this.e = false;
        } else if (this.e) {
            Interpolator interpolator = this.f;
            if (interpolator == null || this.c > 0) {
                int i2 = this.c;
                if (i2 > 0) {
                    recyclerView.I.a(this.a, this.b, i2, interpolator);
                    int i3 = this.g + 1;
                    this.g = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.e = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.g = 0;
        }
    }

    public final void a(int i, int i2, int i3, Interpolator interpolator) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = interpolator;
        this.e = true;
    }
}

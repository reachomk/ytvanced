package defpackage;

import android.view.animation.Interpolator;

/* renamed from: crz */
public final class crz implements csc {
    private final int a;
    private final Interpolator b;

    public crz(int i, Interpolator interpolator) {
        this.a = i;
        this.b = interpolator;
    }

    public final cuc a(ctw ctw) {
        return new ctz(this.a, ctw, this.b);
    }
}

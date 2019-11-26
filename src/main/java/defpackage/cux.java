package defpackage;

import android.animation.TimeInterpolator;

/* renamed from: cux */
public final class cux extends cvd {
    private final TimeInterpolator e;

    public cux(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(long j) {
        return this.e.getInterpolation(a("default_input").c);
    }
}

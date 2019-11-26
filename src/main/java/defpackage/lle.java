package defpackage;

import android.animation.ValueAnimator;

/* renamed from: lle */
final class lle {
    public final ValueAnimator a;
    public float b;
    public float c;
    public final /* synthetic */ llb d;

    public lle(llb llb, ValueAnimator valueAnimator) {
        this.d = llb;
        this.a = valueAnimator;
        this.a.addUpdateListener(new lld(this));
    }

    public final void a() {
        this.a.cancel();
    }
}

package defpackage;

import android.animation.ObjectAnimator;

/* renamed from: upj */
final class upj {
    public float a = 1.0f;
    private boolean b = true;
    private float c = 1.0f;
    private final ObjectAnimator d;

    public upj(upg upg) {
        this.d = ObjectAnimator.ofFloat(this, upg.a, new float[]{1.0f}).setDuration(150);
    }

    public final void a(float f) {
        f = Math.max(Math.min(f, 1.0f), 0.0f);
        this.c = f;
        boolean z = ((float) Math.floor((double) f)) == 1.0f;
        if (!this.d.isRunning() || z != this.b) {
            this.d.setFloatValues(new float[]{f});
            this.d.start();
            this.b = z;
        }
    }

    public final float a() {
        return Math.min(this.a, this.c);
    }
}

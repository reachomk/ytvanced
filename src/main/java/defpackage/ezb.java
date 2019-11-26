package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;

/* renamed from: ezb */
final class ezb extends any {
    private final boolean i;
    private float j;
    private final /* synthetic */ eyy k;

    public final PointF c(int i) {
        return this.k.d(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final int d() {
        return -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(DisplayMetrics displayMetrics) {
        if (this.j == 0.0f) {
            int i = this.k.b;
            if (i != 0) {
                this.j = 300.0f / ((float) Math.abs(i));
            }
        }
        float a = super.a(displayMetrics);
        float f = this.j;
        return (f == 0.0f || (!this.i && f > a)) ? a : f;
    }

    /* synthetic */ ezb(eyy eyy, Context context, boolean z) {
        this.k = eyy;
        super(context);
        this.i = z;
    }
}

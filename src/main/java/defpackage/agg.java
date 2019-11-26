package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: agg */
final class agg implements TimeInterpolator {
    public int a;
    private int[] b;
    private int c;

    agg(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.c = numberOfFrames;
        int[] iArr = this.b;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.b = new int[numberOfFrames];
        }
        iArr = this.b;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr[i2] = duration;
            i += duration;
        }
        this.a = i;
    }

    public final float getInterpolation(float f) {
        int i = (int) ((f * ((float) this.a)) + 0.5f);
        int i2 = this.c;
        int[] iArr = this.b;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.a) : 0.0f);
    }
}

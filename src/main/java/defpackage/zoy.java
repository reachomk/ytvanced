package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.TextureView;
import android.view.View;

/* renamed from: zoy */
final /* synthetic */ class zoy implements AnimatorUpdateListener {
    private final zos a;
    private final boolean b;
    private final TextureView c;
    private final View d;

    zoy(zos zos, boolean z, TextureView textureView, View view) {
        this.a = zos;
        this.b = z;
        this.c = textureView;
        this.d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        zos zos = this.a;
        boolean z = this.b;
        TextureView textureView = this.c;
        View view = this.d;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            floatValue = 1.0f - floatValue;
        }
        float f = zos.b;
        zos.a(textureView, view, f + ((1.0f - f) * floatValue), floatValue);
    }
}

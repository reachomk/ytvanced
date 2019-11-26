package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: azv */
final class azv extends Animation {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ View c;

    azv(int i, int i2, View view) {
        this.a = i;
        this.b = i2;
        this.c = view;
    }

    /* Access modifiers changed, original: protected|final */
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        azl.b(this.c, i - ((int) (((float) (i - this.b)) * f)));
    }
}

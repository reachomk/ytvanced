package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

/* renamed from: kqz */
final class kqz extends Animation {
    private final /* synthetic */ TextView a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;

    kqz(TextView textView, int i, int i2, int i3) {
        this.a = textView;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean willChangeBounds() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.getLayoutParams().height = ((int) (((float) this.b) * f)) + this.c;
        if (f >= 1.0f) {
            this.a.getLayoutParams().height = -2;
            if (this.d == 0) {
                this.a.setVisibility(8);
            }
        }
        this.a.requestLayout();
    }
}

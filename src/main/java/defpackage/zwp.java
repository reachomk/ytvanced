package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: zwp */
public final class zwp extends Animation {
    public final Collection a = new ArrayList();

    /* Access modifiers changed, original: protected|final */
    public final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        for (zwo zwo : this.a) {
            float f2 = zwo.b;
            f2 += (zwo.c - f2) * f;
            ProgressBar progressBar = zwo.a;
            if (progressBar != null) {
                progressBar.setProgress((int) f2);
            }
        }
    }
}

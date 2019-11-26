package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: jzi */
class jzi extends jvp {
    private final Interpolator i = acr.a(0.25f, 0.46f, 0.45f, 0.94f);

    public jzi(Context context, ans ans) {
        super(context, ans);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, aqh aqh, aqf aqf) {
        int b = b(view, -1);
        int a = a(view, -1);
        int a2 = a((int) Math.sqrt((double) ((b * b) + (a * a))));
        if (a2 > 0) {
            aqf.a(-b, -a, a2, this.i);
        }
    }
}

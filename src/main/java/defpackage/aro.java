package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: aro */
final class aro extends any {
    private final /* synthetic */ arm i;

    aro(arm arm, Context context) {
        this.i = arm;
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, aqh aqh, aqf aqf) {
        arm arm = this.i;
        RecyclerView recyclerView = arm.a;
        if (recyclerView != null) {
            int[] a = arm.a(recyclerView.n, view);
            int i = a[0];
            int i2 = a[1];
            int a2 = a(Math.max(Math.abs(i), Math.abs(i2)));
            if (a2 > 0) {
                aqf.a(i, i2, a2, this.a);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}

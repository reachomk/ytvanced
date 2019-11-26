package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: lme */
final class lme extends lmc {
    private final /* synthetic */ RecyclerView i;

    lme(String str, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.i = recyclerView2;
        super(str, recyclerView, (byte) 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, aqh aqh, aqf aqf) {
        int[] a = llr.a(this.i, view);
        int i = a[0];
        int i2 = a[1];
        int a2 = a(Math.max(Math.abs(i), Math.abs(i2)));
        if (a2 > 0) {
            aqf.a(i, i2, a2, this.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i) {
        return Math.min(100, super.b(i));
    }
}

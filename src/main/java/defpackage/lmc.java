package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: lmc */
class lmc extends any {
    private final RecyclerView i;
    private int j;
    private int k;

    public lmc(String str, RecyclerView recyclerView) {
        super(recyclerView.getContext());
        this.i = recyclerView;
        lmb lmb = new lmb();
        ffs ffs = new ffs();
    }

    /* Access modifiers changed, original: protected */
    public void a(View view, aqh aqh, aqf aqf) {
        apn apn = this.i.n;
        this.j = apn.l(view);
        this.k = apn.m(view);
        super.a(view, aqh, aqf);
        Object[] objArr = new Object[]{"state", aqh};
    }

    public final int b(View view, int i) {
        return super.b(view, i);
    }

    /* Access modifiers changed, original: protected */
    public int b(int i) {
        return super.b(i);
    }

    public final int a(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = new Object[]{"snapPref", "decL", Integer.valueOf(this.j), "decR", Integer.valueOf(this.k), Integer.valueOf(i5), "ret=", Integer.valueOf(super.a(i + this.j, i2 - this.k, i3, i4, i5))};
        return super.a(i + this.j, i2 - this.k, i3, i4, i5);
    }

    public final int a(View view) {
        return RecyclerView.f(view);
    }

    public final View d(int i) {
        return super.d(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(View view) {
        super.b(view);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i) {
        return super.a(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(DisplayMetrics displayMetrics) {
        return 45.0f / ((float) displayMetrics.densityDpi);
    }

    /* synthetic */ lmc(String str, RecyclerView recyclerView, byte b) {
        this(str, recyclerView);
    }
}

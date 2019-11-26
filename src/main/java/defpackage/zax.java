package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: zax */
public final class zax extends ans implements OnLayoutChangeListener, zcl {
    public RecyclerView a;
    public int b;
    private final zcd w;
    private final zca x = new zca(this);

    public zax(Context context, zcd zcd) {
        this.w = zcd;
    }

    public final void d(RecyclerView recyclerView) {
        this.a = recyclerView;
        recyclerView.addOnLayoutChangeListener(this);
        recyclerView.a(this.x);
        this.b = -1;
    }

    public final void a(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this);
        recyclerView.b(this.x);
        this.a = null;
        this.b = -1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 > 0 && i8 > 0 && i4 != i8 && this.b != -1) {
            this.a.post(new zba(this));
        }
    }

    public final void F() {
        this.b = r();
    }

    public final void e(int i, int i2) {
        if (i != -1) {
            aqc zcb = new zcb((Context) zcd.a((Context) this.w.a.get()), i2);
            zcb.b = i;
            a(zcb);
        }
    }
}

package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: akzi */
final /* synthetic */ class akzi implements OnLayoutChangeListener {
    private final akzg a;

    akzi(akzg akzg) {
        this.a = akzg;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.c((RecyclerView) view);
    }
}

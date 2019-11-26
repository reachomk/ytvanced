package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: allm */
final /* synthetic */ class allm implements OnLongClickListener {
    private final allk a;
    private final aaas b;

    allm(allk allk, aaas aaas) {
        this.a = allk;
        this.b = aaas;
    }

    public final boolean onLongClick(View view) {
        this.a.a(this.b);
        return true;
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ngd */
final /* synthetic */ class ngd implements OnClickListener {
    private final nge a;
    private final ngg b;

    ngd(nge nge, ngg ngg) {
        this.a = nge;
        this.b = ngg;
    }

    public final void onClick(View view) {
        this.b.a(this.a.getContext());
    }
}

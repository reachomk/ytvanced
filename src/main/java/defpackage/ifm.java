package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ifm */
final class ifm implements OnClickListener {
    private final /* synthetic */ ifh a;

    ifm(ifh ifh) {
        this.a = ifh;
    }

    public final void onClick(View view) {
        ifh ifh = this.a;
        ifh.c.removeCallbacks(ifh.b);
        this.a.ag_();
    }
}

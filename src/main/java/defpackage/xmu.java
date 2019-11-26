package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: xmu */
final class xmu implements OnClickListener {
    private final /* synthetic */ xmr a;

    xmu(xmr xmr) {
        this.a = xmr;
    }

    public final void onClick(View view) {
        xmr xmr = this.a;
        xmr.b(xmr.u.indexOf(view), true);
    }
}

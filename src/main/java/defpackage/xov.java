package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: xov */
final /* synthetic */ class xov implements OnClickListener {
    private final xow a;

    xov(xow xow) {
        this.a = xow;
    }

    public final void onClick(View view) {
        xoy xoy = this.a.a;
        if (xoy != null) {
            xoy.bf_();
        }
    }
}

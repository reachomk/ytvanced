package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iso */
final /* synthetic */ class iso implements OnClickListener {
    private final isp a;

    iso(isp isp) {
        this.a = isp;
    }

    public final void onClick(View view) {
        this.a.dismissAllowingStateLoss();
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gva */
final class gva implements OnClickListener {
    private final /* synthetic */ guz a;

    gva(guz guz) {
        this.a = guz;
    }

    public final void onClick(View view) {
        this.a.d.t().a(3, new acvs(acwc.LOCATION_ACCESS_PERMISSION_DENY_BUTTON), null);
        this.a.a();
        this.a.e.dismiss();
    }
}

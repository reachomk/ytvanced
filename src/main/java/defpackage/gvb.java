package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gvb */
final class gvb implements OnClickListener {
    private final /* synthetic */ guz a;

    gvb(guz guz) {
        this.a = guz;
    }

    public final void onClick(View view) {
        this.a.d.t().a(3, new acvs(acwc.LOCATION_ACCESS_PERMISSION_ALLOW_BUTTON), null);
        this.a.a();
        this.a.e.dismiss();
    }
}

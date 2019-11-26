package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: adwo */
final /* synthetic */ class adwo implements OnClickListener {
    private final adwl a;
    private final acvx b;
    private final adwx c;

    adwo(adwl adwl, acvx acvx, adwx adwx) {
        this.a = adwl;
        this.b = acvx;
        this.c = adwx;
    }

    public final void onClick(View view) {
        adwl adwl = this.a;
        acvx acvx = this.b;
        adwx adwx = this.c;
        acvx.a(3, new acvs(acwc.MDX_SMART_REMOTE_BUTTON_COLLAPSE_ARROW), null);
        adwx.a();
        adwl.u = false;
    }
}

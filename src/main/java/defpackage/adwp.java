package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: adwp */
final /* synthetic */ class adwp implements OnClickListener {
    private final adwl a;
    private final acvx b;

    adwp(adwl adwl, acvx acvx) {
        this.a = adwl;
        this.b = acvx;
    }

    public final void onClick(View view) {
        adwl adwl = this.a;
        acvx acvx = this.b;
        atss atss = (atss) atst.q.createBuilder();
        atsg atsg = (atsg) atsh.c.createBuilder();
        atsg.a(!adwl.e ? 2 : 3);
        atss.a((atsh) ((anxl) atsg.build()));
        acvx.a(3, new acvs(acwc.MDX_SMART_REMOTE_BUTTON_MIC), (atst) ((anxl) atss.build()));
        adwl.b();
        adwl.u = false;
    }
}

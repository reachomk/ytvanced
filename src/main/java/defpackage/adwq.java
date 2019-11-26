package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: adwq */
final /* synthetic */ class adwq implements OnClickListener {
    private final adwl a;
    private final acvx b;

    adwq(adwl adwl, acvx acvx) {
        this.a = adwl;
        this.b = acvx;
    }

    public final void onClick(View view) {
        adwl adwl = this.a;
        acvx acvx = this.b;
        if (adwl.c != null) {
            atss atss = (atss) atst.q.createBuilder();
            atsg atsg = (atsg) atsh.c.createBuilder();
            atsg.a(!adwl.t ? 3 : 2);
            atss.a((atsh) ((anxl) atsg.build()));
            acvx.a(3, new acvs(acwc.MDX_SMART_REMOTE_BUTTON_BACK), (atst) ((anxl) atss.build()));
            adwl.c.a(adqd.KEY_BACK);
        }
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: advc */
final /* synthetic */ class advc implements OnClickListener {
    private final advb a;
    private final adfy b;
    private final adgw c;

    advc(advb advb, adfy adfy, adgw adgw) {
        this.a = advb;
        this.b = adfy;
        this.c = adgw;
    }

    public final void onClick(View view) {
        advb advb = this.a;
        adfy adfy = this.b;
        adgw adgw = this.c;
        bbs bbs = (bbs) view.getTag();
        if (bbs.a()) {
            advb.g.a(3, new acvs(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_UNLINK_BUTTON), null);
            adgw.f();
            return;
        }
        advb.g.a(3, new acvs(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_LINK_BUTTON), null);
        if (!adfy.a(new advl(advb, bbs))) {
            advb.a(bbs);
        }
    }
}

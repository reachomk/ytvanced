package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: advx */
final /* synthetic */ class advx implements OnClickListener {
    private final advv a;
    private final acvx b;
    private final adfy c;

    advx(advv advv, acvx acvx, adfy adfy) {
        this.a = advv;
        this.b = acvx;
        this.c = adfy;
    }

    public final void onClick(View view) {
        advv advv = this.a;
        acvx acvx = this.b;
        adfy adfy = this.c;
        acvx.a(3, new acvs(acwc.MDX_SMART_PAIRING_USE_TV_CODE_LINK_BUTTON), null);
        if (!adfy.a(new advz(advv))) {
            advv.a();
        }
    }
}

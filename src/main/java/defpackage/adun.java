package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: adun */
final /* synthetic */ class adun implements OnClickListener {
    private final aduo a;
    private final acvx b;

    adun(aduo aduo, acvx acvx) {
        this.a = aduo;
        this.b = acvx;
    }

    public final void onClick(View view) {
        aduo aduo = this.a;
        this.b.a(3, new acvs(acwc.MDX_SMART_PAIRING_DELETE_TV_CODES_DELETE_BUTTON), null);
        adio adio = (adio) view.getTag();
        aduq aduq = new aduq();
        Bundle bundle = new Bundle();
        bundle.putString("deviceId", adio.b());
        bundle.putString("screenName", adio.bq_());
        aduq.a(aduo.d);
        aduq.f(bundle);
        aduq.a(aduo.c.f(), "confirmRemoveDialog");
    }
}

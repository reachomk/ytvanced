package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: adve */
final /* synthetic */ class adve implements OnClickListener {
    private final advb a;
    private final advm b;

    adve(advb advb, advm advm) {
        this.a = advb;
        this.b = advm;
    }

    public final void onClick(View view) {
        advb advb = this.a;
        advm advm = this.b;
        advb.g.a(3, new acvs(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_ENTER_TV_CODE_BUTTON), null);
        advm.d();
    }
}

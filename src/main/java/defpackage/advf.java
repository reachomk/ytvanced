package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: advf */
final /* synthetic */ class advf implements OnClickListener {
    private final advb a;
    private final advm b;

    advf(advb advb, advm advm) {
        this.a = advb;
        this.b = advm;
    }

    public final void onClick(View view) {
        advb advb = this.a;
        advm advm = this.b;
        if (advb.j) {
            advb.g.a(3, new acvs(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_GET_HELP_BUTTON), null);
            advm.b();
            return;
        }
        advb.g.a(3, new acvs(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_WI_FI_SETTINGS_BUTTON), null);
        advm.a();
    }
}

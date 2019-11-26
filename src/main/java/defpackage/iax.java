package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iax */
final /* synthetic */ class iax implements OnClickListener {
    private final iau a;

    iax(iau iau) {
        this.a = iau;
    }

    public final void onClick(View view) {
        iau iau = this.a;
        if (iau.a.c().g()) {
            iau.d.a();
            return;
        }
        iau.c.a(3, new acvs(acwc.WATCH_MINIMIZE_BUTTON), null);
        iau.b.e_(lcr.a);
    }
}

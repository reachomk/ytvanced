package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wki */
final class wki implements OnClickListener {
    private final /* synthetic */ wjv a;

    wki(wjv wjv) {
        this.a = wjv;
    }

    public final void onClick(View view) {
        this.a.aq.requestFocus();
        xpr.b(this.a.aq);
        grf grf = this.a.aA;
        if (grf != null) {
            grf.c();
        }
    }
}

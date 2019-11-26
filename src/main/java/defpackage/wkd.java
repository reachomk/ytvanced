package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wkd */
final class wkd implements OnClickListener {
    private final /* synthetic */ wjv a;

    wkd(wjv wjv) {
        this.a = wjv;
    }

    public final void onClick(View view) {
        whd whd = this.a.ab;
        whj whj = whd.b;
        whd.b = null;
        if (whj != null) {
            whd.a(whj.a, whj.b, whj.c);
        }
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wkj */
final class wkj implements OnClickListener {
    private final /* synthetic */ apxu a;
    private final /* synthetic */ wjv b;

    wkj(wjv wjv, apxu apxu) {
        this.b = wjv;
        this.a = apxu;
    }

    public final void onClick(View view) {
        this.b.aI = true;
        this.b.aa.a(this.a, null);
    }
}

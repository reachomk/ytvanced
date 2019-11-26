package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;

/* renamed from: wde */
final /* synthetic */ class wde implements OnShowListener {
    private final wda a;
    private final wdj b;
    private final boolean c;

    wde(wda wda, wdj wdj, boolean z) {
        this.a = wda;
        this.b = wdj;
        this.c = z;
    }

    public final void onShow(DialogInterface dialogInterface) {
        wda wda = this.a;
        wdj wdj = this.b;
        boolean z = this.c;
        if (!(wdj.f == null || z)) {
            acvx c = wda.c();
            if (c != null) {
                c.b(new acvs(wdj.f.d));
            }
        }
        wda.a();
    }
}

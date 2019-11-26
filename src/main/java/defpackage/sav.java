package defpackage;

import com.google.android.youtube.R;

/* renamed from: sav */
final class sav implements ptm {
    private final /* synthetic */ sap a;

    sav(sap sap) {
        this.a = sap;
    }

    public final /* synthetic */ void a(ptn ptn) {
        pkd pkd = (pkd) ptn;
        if (!pkd.a().b()) {
            this.a.a((int) R.string.ccl_failed_status_request, pkd.a().f);
        }
    }
}

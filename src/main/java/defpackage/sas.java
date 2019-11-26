package defpackage;

import com.google.android.youtube.R;

/* renamed from: sas */
final class sas implements ptm {
    private final /* synthetic */ sap a;

    sas(sap sap) {
        this.a = sap;
    }

    public final /* synthetic */ void a(ptn ptn) {
        pkd pkd = (pkd) ptn;
        if (!pkd.a().b()) {
            this.a.a((int) R.string.ccl_failed_to_pause, pkd.a().f);
        }
    }
}

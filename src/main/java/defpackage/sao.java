package defpackage;

import com.google.android.youtube.R;

/* renamed from: sao */
final class sao implements ptm {
    private final /* synthetic */ sap a;

    sao(sap sap) {
        this.a = sap;
    }

    public final /* synthetic */ void a(ptn ptn) {
        pkd pkd = (pkd) ptn;
        if (!pkd.a().b()) {
            this.a.a((int) R.string.ccl_failed_setting_volume, pkd.a().f);
        }
    }
}

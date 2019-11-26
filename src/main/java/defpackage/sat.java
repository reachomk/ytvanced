package defpackage;

import com.google.android.youtube.R;

/* renamed from: sat */
final class sat implements ptm {
    private final /* synthetic */ sap a;

    sat(sap sap) {
        this.a = sap;
    }

    public final /* synthetic */ void a(ptn ptn) {
        pkd pkd = (pkd) ptn;
        if (!pkd.a().b()) {
            this.a.a((int) R.string.ccl_failed_to_play, pkd.a().f);
        }
    }
}

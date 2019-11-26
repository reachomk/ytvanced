package defpackage;

import com.google.android.youtube.R;

/* renamed from: sbi */
final class sbi implements ptm {
    private final /* synthetic */ sap a;

    sbi(sap sap) {
        this.a = sap;
    }

    public final /* synthetic */ void a(ptn ptn) {
        pkd pkd = (pkd) ptn;
        if (!pkd.a().b()) {
            this.a.a((int) R.string.ccl_failed_to_set_track_style, pkd.a().f);
        }
    }
}

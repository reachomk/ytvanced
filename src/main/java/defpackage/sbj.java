package defpackage;

import com.google.android.youtube.R;

/* renamed from: sbj */
public final class sbj implements ptm {
    private final /* synthetic */ sap a;

    public sbj(sap sap) {
        this.a = sap;
    }

    public final /* synthetic */ void a(ptn ptn) {
        pkd pkd = (pkd) ptn;
        if (!pkd.a().b()) {
            this.a.a((int) R.string.ccl_failed_to_set_track_style, pkd.a().f);
        }
    }
}

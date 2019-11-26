package defpackage;

import com.google.android.youtube.R;

/* renamed from: sax */
public final class sax implements ptm {
    private final /* synthetic */ sap a;

    public sax(sap sap) {
        this.a = sap;
    }

    public final /* synthetic */ void a(ptn ptn) {
        pkd pkd = (pkd) ptn;
        if (!pkd.a().b()) {
            this.a.a((int) R.string.ccl_failed_seek, pkd.a().f);
        }
    }
}

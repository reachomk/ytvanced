package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: sbd */
public final class sbd implements ptm {
    private final /* synthetic */ sap a;

    public sbd(sap sap) {
        this.a = sap;
    }

    public final /* synthetic */ void a(ptn ptn) {
        Status status = (Status) ptn;
        if (!status.b()) {
            sap sap = this.a;
            int i = status.f;
            for (sbo n : sap.H) {
                n.n();
            }
        }
    }
}

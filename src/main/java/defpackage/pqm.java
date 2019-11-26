package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: pqm */
final class pqm implements ptm {
    private final long a;
    private final /* synthetic */ pkg b;

    pqm(pkg pkg, long j) {
        this.b = pkg;
        this.a = j;
    }

    public final /* synthetic */ void a(ptn ptn) {
        Status status = (Status) ptn;
        if (!status.b()) {
            this.b.b.b.a(this.a, status.f);
        }
    }
}

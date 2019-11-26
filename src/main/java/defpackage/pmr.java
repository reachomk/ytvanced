package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: pmr */
final class pmr implements ptm {
    private final long a;
    private final /* synthetic */ pmc b;

    pmr(pmc pmc, long j) {
        this.b = pmc;
        this.a = j;
    }

    public final /* synthetic */ void a(ptn ptn) {
        Status status = (Status) ptn;
        if (!status.b()) {
            this.b.b.c.a(this.a, status.f);
        }
    }
}

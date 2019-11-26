package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: qej */
final class qej extends qdv {
    private final /* synthetic */ qdx a;

    qej(ptd ptd, qdx qdx) {
        this.a = qdx;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp) {
        qql qql = (qql) psp;
        ((qqq) qql.v()).b(new ErrorReport(this.a, qql.a.getCacheDir()));
        a(Status.a);
    }
}

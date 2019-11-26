package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: qek */
final class qek extends qdv {
    private final /* synthetic */ qdx a;
    private final /* synthetic */ Context h;
    private final /* synthetic */ long i;

    qek(ptd ptd, qdx qdx, Context context, long j) {
        this.a = qdx;
        this.h = context;
        this.i = j;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp) {
        qql qql = (qql) psp;
        qdx qdx = this.a;
        if (qdx != null) {
            qdu qdu = qdx.p;
            if (qdu != null) {
                Context context = this.h;
                long j = this.i;
                qdw.a(new qqo(context, qdu, j));
                qdw.a(new qqn(context, qdu, j));
                qdx = this.a;
                long j2 = this.i;
                qql.a(qdx);
                ((qqq) qql.v()).a(new ErrorReport(qdx, qql.a.getCacheDir()), j2);
                a(Status.a);
                return;
            }
        }
        qql.a(qdx);
        ((qqq) qql.v()).a(new ErrorReport(qdx, qql.a.getCacheDir()));
        a(Status.a);
    }
}

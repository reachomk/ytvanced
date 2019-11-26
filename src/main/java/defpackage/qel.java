package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: qel */
final class qel extends qdv {
    private final /* synthetic */ qdx a;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ long i;

    qel(ptd ptd, qdx qdx, Bundle bundle, long j) {
        this.a = qdx;
        this.h = bundle;
        this.i = j;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp) {
        qql qql = (qql) psp;
        try {
            ((qqq) qql.v()).a(this.a, this.h, this.i);
            a(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psbd failed!", e);
            c(qdw.a);
        }
    }
}

package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: qem */
final class qem extends qdv {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ long h;

    qem(ptd ptd, Bundle bundle, long j) {
        this.a = bundle;
        this.h = j;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp) {
        qql qql = (qql) psp;
        try {
            ((qqq) qql.v()).a(this.a, this.h);
            a(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            c(qdw.a);
        }
    }
}

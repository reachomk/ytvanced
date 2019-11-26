package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.firebase.jobdispatcher.GooglePlayReceiver;

/* renamed from: des */
final class des extends dej {
    private final /* synthetic */ deq a;

    des(deq deq) {
        this.a = deq;
    }

    public final void a(Bundle bundle, def def) {
        deo a = GooglePlayReceiver.a.a(bundle);
        if (a == null) {
            Log.wtf("FJD.JobService", "start: unknown invocation provided");
            return;
        }
        deq deq = this.a;
        deq.b.execute(new deu(4, deq, a.a(), def, null, false, 0));
    }

    public final void a(Bundle bundle, boolean z) {
        deo a = GooglePlayReceiver.a.a(bundle);
        if (a == null) {
            Log.wtf("FJD.JobService", "stop: unknown invocation provided");
            return;
        }
        deq deq = this.a;
        deq.b.execute(new deu(5, deq, a.a(), null, null, z, 0));
    }
}

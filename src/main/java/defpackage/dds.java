package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.firebase.jobdispatcher.GooglePlayReceiver;

/* renamed from: dds */
final class dds extends dee {
    private final /* synthetic */ ddp a;

    dds(ddp ddp) {
        this.a = ddp;
    }

    public final void a(Bundle bundle, int i) {
        deo a = GooglePlayReceiver.a.a(bundle);
        if (a == null) {
            Log.wtf("FJD.ExecutionDelegator", "jobFinished: unknown invocation provided");
            return;
        }
        dex dex;
        ddp ddp = this.a;
        dep a2 = a.a();
        synchronized (ddp.a) {
            dex = (dex) ddp.a.get(a2.b);
        }
        if (dex != null) {
            dex.a(a2);
            if (dex.a()) {
                synchronized (ddp.a) {
                    ddp.a.remove(a2.b);
                }
            }
        }
        ddp.f.a(a2, i);
    }
}

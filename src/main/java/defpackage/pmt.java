package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: pmt */
final class pmt implements pot {
    private final /* synthetic */ pmb a;

    pmt(pmb pmb) {
        this.a = pmb;
    }

    public final void a(long j) {
        try {
            pmb pmb = this.a;
            pmb.a((pma) pmb.a(new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }

    public final void a(long j, int i, Object obj) {
        try {
            this.a.a(new pme(new Status(i)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }
}

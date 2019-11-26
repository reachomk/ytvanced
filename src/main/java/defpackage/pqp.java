package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: pqp */
final class pqp implements pot {
    private final /* synthetic */ pkj a;

    pqp(pkj pkj) {
        this.a = pkj;
    }

    public final void a(long j) {
        try {
            pkj pkj = this.a;
            pkj.a((pkd) pkj.a(new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaPlayer", "Result already set when calling onRequestReplaced", e);
        }
    }

    public final void a(long j, int i, Object obj) {
        try {
            this.a.a(new pki(new Status(i)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaPlayer", "Result already set when calling onRequestCompleted", e);
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* renamed from: qqo */
public final class qqo implements Runnable {
    private final Context a;
    private final qdu b;
    private final long c;

    public qqo(Context context, qdu qdu, long j) {
        this.a = context;
        this.b = qdu;
        this.c = j;
    }

    public final void run() {
        Bundle bundle = new Bundle(1);
        try {
            qed qed = new qed();
            qed.a();
            this.b.b();
            this.a.getCacheDir();
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(qed.b()));
        } catch (Exception e) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        long j = this.c;
        pzl.a(qdw.a(qdw.a(this.a).f, qdx.a(null), bundle, j));
    }
}

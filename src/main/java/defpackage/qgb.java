package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qgb */
public final class qgb implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final qdu c;
    private final long d;

    public qgb(Context context, GoogleHelp googleHelp, qdu qdu, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = qdu;
        this.d = j;
    }

    public final void run() {
        Bundle bundle = new Bundle(1);
        try {
            qed qed = new qed();
            qed.a();
            this.c.b();
            this.a.getCacheDir();
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(qed.b()));
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        qdx a = qdx.a(null);
        qgf a2 = qhf.a(this.a);
        GoogleHelp googleHelp = this.b;
        long j = this.d;
        pzl.a(qgf.h.a(a2.f, googleHelp, a, bundle, j));
    }
}

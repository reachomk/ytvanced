package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.util.Log;

/* renamed from: sjp */
public final class sjp {
    private final Context a;
    private final sfe b;

    sjp(Context context) {
        this(context, null);
    }

    public sjp(Context context, sfe sfe) {
        this.a = context;
        this.b = sfe;
    }

    public final void a(Activity activity, sfz sfz, int i, sfq sfq, sgz sgz) {
        if (!(this.b == null || sfq.a() || sfq.b())) {
            this.b.a(sfz, sfz.a(11));
        }
        if (sgz.a() != null) {
            a(sgz.a(), sfq);
        } else {
            activity.setResult(i, sga.a(sfq));
        }
    }

    public final void a(Activity activity, sfz sfz, sgz sgz, IllegalStateException illegalStateException) {
        a(activity, sfz, 6000, new sfq(101, illegalStateException), sgz);
    }

    private final void a(PendingIntent pendingIntent, sfq sfq) {
        try {
            pendingIntent.send(this.a, 0, sga.a(sfq));
        } catch (CanceledException e) {
            Log.e("CompletionHelper", "Attempt to send intent was canceled", e);
        }
    }
}

package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: agkg */
final class agkg extends AsyncTask {
    private final /* synthetic */ DebugOfflineResyncActivity a;

    agkg(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        this.a = debugOfflineResyncActivity;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        xpr.a(this.a, (CharSequence) "All expiration times have been randomized!", 1);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        DebugOfflineResyncActivity debugOfflineResyncActivity = this.a;
        for (agqy agqy : debugOfflineResyncActivity.i.k().a()) {
            if (agqy.j != null) {
                double a = debugOfflineResyncActivity.g.a(0.0d, 1.0d);
                if (a >= 0.2d) {
                    Object b;
                    agqw agqw = agqy.j;
                    long j = agqw.d;
                    long toMillis = TimeUnit.SECONDS.toMillis(agqw.g());
                    long a2 = (long) debugOfflineResyncActivity.g.a(0.0d, (double) TimeUnit.DAYS.toMillis(1));
                    agqv h;
                    if (a >= 0.6d) {
                        h = agqy.j.h();
                        h.d = (j - toMillis) + a2;
                        b = h.b();
                    } else {
                        h = agqy.j.h();
                        h.d = (j - toMillis) - a2;
                        b = h.b();
                    }
                    debugOfflineResyncActivity.i.l().a((agqw) b);
                }
            }
        }
        return null;
    }
}

package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;

/* renamed from: agke */
final class agke extends AsyncTask {
    private final /* synthetic */ DebugOfflineResyncActivity a;

    agke(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        this.a = debugOfflineResyncActivity;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        xpr.a(this.a, (CharSequence) "All offline video expiry timestamps set to 0!", 1);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        DebugOfflineResyncActivity debugOfflineResyncActivity = this.a;
        for (agqy agqy : debugOfflineResyncActivity.i.k().a()) {
            agqw agqw = agqy.j;
            if (agqw != null) {
                agqv h = agqw.h();
                h.d = debugOfflineResyncActivity.c.a() - DebugOfflineResyncActivity.a;
                debugOfflineResyncActivity.i.l().a((agqw) h.b());
            }
        }
        return null;
    }
}

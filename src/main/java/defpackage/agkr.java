package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStreamsActivity;

/* renamed from: agkr */
final class agkr extends AsyncTask {
    private final /* synthetic */ DebugOfflineStreamsActivity a;

    agkr(DebugOfflineStreamsActivity debugOfflineStreamsActivity) {
        this.a = debugOfflineStreamsActivity;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        agfi h = ((agwc) this.a.c.get()).b().h();
        if (h != null) {
            for (agqy a : h.c()) {
                h.a(a.a(), agqf.STREAM_CORRUPT);
            }
        }
        return null;
    }
}

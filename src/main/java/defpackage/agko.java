package defpackage;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStreamsActivity;

/* renamed from: agko */
final class agko extends AsyncTask {
    private final /* synthetic */ ProgressDialog a;
    private final /* synthetic */ DebugOfflineStreamsActivity b;

    agko(DebugOfflineStreamsActivity debugOfflineStreamsActivity, ProgressDialog progressDialog) {
        this.b = debugOfflineStreamsActivity;
        this.a = progressDialog;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.dismiss();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        afzh d = ((agak) ((agwc) this.b.c.get()).b()).d();
        if (d != null) {
            d.a(true);
        }
        return null;
    }
}

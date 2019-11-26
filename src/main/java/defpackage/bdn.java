package defpackage;

import android.os.AsyncTask;
import android.util.Log;

/* renamed from: bdn */
final class bdn extends AsyncTask {
    private final /* synthetic */ bdp a;
    private final /* synthetic */ bdo b;

    bdn(bdo bdo, bdp bdp) {
        this.b = bdo;
        this.a = bdp;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a((bdm) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return this.b.b();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }
}

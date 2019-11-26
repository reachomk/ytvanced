package defpackage;

import android.os.AsyncTask;

/* renamed from: sae */
final class sae extends AsyncTask {
    private final /* synthetic */ int a;
    private final /* synthetic */ saf b;

    sae(saf saf, int i) {
        this.b = saf;
        this.a = i;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            this.b.d(4);
            this.b.a(null, null);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        int i = 0;
        while (i < this.a) {
            i++;
            if (isCancelled()) {
                return Boolean.valueOf(true);
            }
            try {
                if (this.b.h()) {
                    cancel(true);
                }
                Thread.sleep(1000);
            } catch (InterruptedException unused) {
            }
        }
        return Boolean.valueOf(false);
    }
}

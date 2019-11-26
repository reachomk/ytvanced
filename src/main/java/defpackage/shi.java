package defpackage;

import android.os.AsyncTask;
import android.webkit.CookieManager;

/* renamed from: shi */
public final class shi extends az {
    public final ap a = new ap();
    private AsyncTask b;

    public shi() {
        this.a.a(shk.NOT_STARTED);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2) {
        if (this.a.a() == shk.NOT_STARTED) {
            this.a.a(shk.FETCHING);
            CookieManager.getInstance().removeAllCookie();
            this.b = new shl(this, str, str2);
            this.b.execute(new Void[0]);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        AsyncTask asyncTask = this.b;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.b = null;
        }
    }
}

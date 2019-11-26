package defpackage;

import android.os.AsyncTask;

/* renamed from: guv */
final class guv implements wxg {
    private AsyncTask a;
    private final /* synthetic */ gub b;

    public final void a() {
        AsyncTask asyncTask = this.a;
        if (asyncTask != null && !asyncTask.isCancelled()) {
            this.a.cancel(false);
            this.a = null;
        }
    }

    /* synthetic */ guv(gub gub) {
        this.b = gub;
    }
}

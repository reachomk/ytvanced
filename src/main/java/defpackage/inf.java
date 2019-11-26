package defpackage;

import android.os.AsyncTask;

/* renamed from: inf */
final class inf implements wxg {
    public xom a;
    private AsyncTask b;

    private inf() {
    }

    public final void a() {
        AsyncTask asyncTask = this.b;
        if (asyncTask != null && !asyncTask.isCancelled()) {
            this.b.cancel(false);
            this.b = null;
        }
    }

    /* synthetic */ inf(byte b) {
    }
}

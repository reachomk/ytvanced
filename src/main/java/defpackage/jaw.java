package defpackage;

import android.app.Activity;

/* renamed from: jaw */
final /* synthetic */ class jaw implements Runnable {
    private final Activity a;

    public jaw(Activity activity) {
        this.a = activity;
    }

    public final void run() {
        this.a.recreate();
    }
}

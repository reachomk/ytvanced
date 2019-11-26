package defpackage;

import android.app.Application;

/* renamed from: mx */
final class mx implements Runnable {
    private final /* synthetic */ Application a;
    private final /* synthetic */ mz b;

    mx(Application application, mz mzVar) {
        this.a = application;
        this.b = mzVar;
    }

    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}

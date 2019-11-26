package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: mz */
final class mz implements ActivityLifecycleCallbacks {
    public Object a;
    private Activity b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;

    mz(Activity activity) {
        this.b = activity;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityStarted(Activity activity) {
        if (this.b == activity) {
            this.c = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.d && !this.e && !this.c && mv.a(this.a, activity)) {
            this.e = true;
            this.a = null;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.d = true;
        }
    }
}

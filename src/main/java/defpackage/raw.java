package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;

/* renamed from: raw */
public final class raw implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    static {
        Handler handler = new Handler(Looper.getMainLooper());
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        throw null;
    }

    public final void onActivityDestroyed(Activity activity) {
        throw null;
    }

    public final void onActivityPaused(Activity activity) {
        throw null;
    }

    public final void onActivityResumed(Activity activity) {
        throw null;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        throw null;
    }

    public final void onActivityStarted(Activity activity) {
        throw null;
    }

    public final void onActivityStopped(Activity activity) {
        throw null;
    }

    public final void onGlobalLayout() {
        throw null;
    }

    public final void onScrollChanged() {
        throw null;
    }

    public final void onViewAttachedToWindow(View view) {
        throw null;
    }

    public final void onViewDetachedFromWindow(View view) {
        throw null;
    }
}

package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: aamv */
public final class aamv implements ActivityLifecycleCallbacks {
    public aamx a;
    private final xto b;

    public aamv(Context context) {
        this.b = new aamu("ScreenData.ScreenDimensions", context);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void a(Activity activity) {
        this.a = new aamx(aamv.a((Context) activity), false);
    }

    public final aamx a() {
        return (aamx) this.b.get();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    public static DisplayMetrics a(Context context) {
        DisplayMetrics displayMetrics;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            displayMetrics = null;
        }
        return displayMetrics == null ? context.getResources().getDisplayMetrics() : displayMetrics;
    }
}

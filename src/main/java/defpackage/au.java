package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: au */
public final class au extends u {
    private final /* synthetic */ at a;

    public au(at atVar) {
        this.a = atVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ((ay) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.a.h;
    }

    public final void onActivityPaused(Activity activity) {
        at atVar = this.a;
        int i = atVar.b - 1;
        atVar.b = i;
        if (i == 0) {
            atVar.e.postDelayed(atVar.g, 700);
        }
    }

    public final void onActivityStopped(Activity activity) {
        at atVar = this.a;
        atVar.a--;
        atVar.a();
    }
}

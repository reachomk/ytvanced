package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: cnj */
final class cnj implements ActivityLifecycleCallbacks {
    private cnj() {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (cnk.a) {
            if (cnk.b.containsKey(activity)) {
                throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (cnk.a) {
            cnk.b.remove(activity);
            Iterator it = cnk.b.entrySet().iterator();
            while (it.hasNext()) {
                Context context = (Context) ((Entry) it.next()).getKey();
                while (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == activity) {
                        it.remove();
                        break;
                    }
                }
            }
            cnk.c.put(cns.a(activity), Boolean.valueOf(true));
        }
    }

    /* synthetic */ cnj(byte b) {
    }
}

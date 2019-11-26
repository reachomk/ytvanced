package defpackage;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import java.util.Set;

/* renamed from: xfb */
public final class xfb extends xff {
    public xfb(Application application, Set set) {
        super(application, set);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj, Object obj2) {
        ((Application) obj).registerActivityLifecycleCallbacks((ActivityLifecycleCallbacks) obj2);
    }
}

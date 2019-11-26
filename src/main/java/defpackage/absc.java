package defpackage;

import android.app.Activity;
import android.content.res.Configuration;

/* renamed from: absc */
public class absc extends nf {
    public Activity a;
    private boolean b;

    public final void a(Activity activity) {
        super.a(activity);
        this.a = activity;
        this.b = xss.b(activity);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.b) {
            f();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        nf nfVar = this.y;
        if (nfVar instanceof nd) {
            ((nd) nfVar).f();
        }
    }
}

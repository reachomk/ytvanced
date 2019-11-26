package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;

/* renamed from: eeh */
public final class eeh extends ezc {
    private final /* synthetic */ bcaa a;
    private final /* synthetic */ eec b;

    public eeh(eec eec, bcaa bcaa) {
        this.b = eec;
        this.a = bcaa;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        acxl acxl = (acxl) this.a.get();
        xak.a();
        if (!acxl.c) {
            Looper.myQueue().removeIdleHandler(acxl.b);
            acxl.c = true;
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.b.a.a(edk.class)) {
            this.b.b.d(new edj(activity.getIntent()));
        }
    }
}

package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: ae */
public final class ae extends u {
    private final ad a = new ad();

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof nn) {
            ((nn) activity).f().a(this.a);
        }
        ay.a(activity);
    }

    public final void onActivityStopped(Activity activity) {
        if (activity instanceof nn) {
            ac.a((nn) activity, z.CREATED);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (activity instanceof nn) {
            ac.a((nn) activity, z.CREATED);
        }
    }
}

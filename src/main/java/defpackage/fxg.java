package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Map;

/* renamed from: fxg */
public final class fxg implements aaap, dxi {
    private final Activity a;
    private final xci b;
    private final fpt c;

    public fxg(Activity activity, xci xci, fpt fpt) {
        this.a = activity;
        this.b = xci;
        this.c = fpt;
    }

    public final void a(apxu apxu, Map map) {
        aiqs a = aiqq.a();
        a.a = apxu;
        aiqq b = a.b();
        elg elg = (elg) xsb.a(map, (Object) "PLAYBACK_START_DESCRIPTOR_MUTATOR", elg.class);
        if (elg != null) {
            elg.a(b);
        }
        int intValue = ((Integer) xsb.c(map, "com.google.android.apps.youtube.app.endpoint.flags", Integer.valueOf(0))).intValue();
        Bundle bundle = (Bundle) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.bundle", Bundle.class);
        boolean z = true;
        boolean z2 = (intValue & 32) != 0;
        boolean z3 = (intValue & 2) != 0;
        int i = intValue & 1;
        if ((intValue & 8) == 0) {
            z = false;
        }
        Object airl = new airl(b);
        airl.a(z3);
        airl.b(z);
        if (!(i == 0 || bundle == null)) {
            airl.a(bundle);
        }
        airl airl2 = (airl) amqw.a(airl);
        View view = (View) xsb.c(map, "VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY");
        aygk aygk = (aygk) xsb.c(map, "VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY");
        Boolean valueOf = Boolean.valueOf(false);
        int i2 = !((Boolean) xsb.c(map, "ALLOW_RELOAD", valueOf)).booleanValue() ? (b.m() || b.g() <= 0) ? 0 : 2 : 3;
        eiy eiy = new eiy(airl2, view, aygk, z2, i2, ((Boolean) xsb.c(map, "START_SHUFFLED", valueOf)).booleanValue());
        this.b.d(new efd());
        Activity activity = this.a;
        if (activity instanceof dvf) {
            ((dvf) activity).a(eiy);
            return;
        }
        Intent a2 = this.c.a();
        a2.setFlags(67108864);
        a2.putExtra("watch", eiy.a);
        this.a.startActivity(a2);
    }
}

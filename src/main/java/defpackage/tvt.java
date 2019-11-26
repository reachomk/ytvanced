package defpackage;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: tvt */
final class tvt implements ttw {
    public final /* synthetic */ tvs a;

    tvt(tvs tvs) {
        this.a = tvs;
    }

    public final void a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.b.a(4, simpleName);
        this.a.a();
        tvs tvs = this.a;
        tvs.c = ((ScheduledExecutorService) tvs.e.a()).schedule(new tvw(this, simpleName), 10, TimeUnit.SECONDS);
    }
}

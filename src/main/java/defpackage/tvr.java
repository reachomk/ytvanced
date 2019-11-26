package defpackage;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: tvr */
final class tvr implements ttx {
    public final /* synthetic */ tvs a;

    tvr(tvs tvs) {
        this.a = tvs;
    }

    public final void b(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.b.a(3, simpleName);
        this.a.a();
        tvs tvs = this.a;
        tvs.d = ((ScheduledExecutorService) tvs.e.a()).schedule(new tvu(this, simpleName), 10, TimeUnit.SECONDS);
    }
}

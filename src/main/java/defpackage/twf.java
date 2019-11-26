package defpackage;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: twf */
final class twf implements ttx {
    public final /* synthetic */ twg a;

    twf(twg twg) {
        this.a = twg;
    }

    public final void b(Activity activity) {
        this.a.e();
        twg twg = this.a;
        twg.m = ((ScheduledExecutorService) twg.b.a()).schedule(new twi(this), 10, TimeUnit.SECONDS);
    }
}

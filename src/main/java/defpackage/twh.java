package defpackage;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: twh */
final class twh implements ttx {
    public final /* synthetic */ twg a;

    twh(twg twg) {
        this.a = twg;
    }

    public final void b(Activity activity) {
        ((ScheduledExecutorService) this.a.b.a()).submit(new twk(this));
    }
}

package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tvs */
final class tvs {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final tvv b;
    public ScheduledFuture c;
    public ScheduledFuture d;
    public final tzu e;
    public final tty f;
    public final ttx g = new tvr(this);
    public final ttw h = new tvt(this);

    tvs(tvv tvv, Application application, tzu tzu) {
        tty a = tty.a(application);
        this.b = tvv;
        this.e = tzu;
        this.f = a;
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.c = null;
        }
        scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.d = null;
        }
    }
}

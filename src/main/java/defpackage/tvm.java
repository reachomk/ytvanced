package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: tvm */
final class tvm extends ttj implements ttr {
    public final Application a;
    public final tzu b;
    public final tty d;
    public final ucf e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final AtomicLong i = new AtomicLong();
    public final AtomicBoolean j = new AtomicBoolean();
    public ScheduledFuture k;

    tvm(Application application, boolean z, boolean z2, tty tty, tzu tzu, tzu tzu2, ucf ucf, udc udc) {
        super(udc, application, tzu, tzu2, 2);
        this.a = (Application) uhy.a((Object) application);
        this.f = z;
        this.g = z2;
        this.d = (tty) uhy.a((Object) tty);
        this.b = (tzu) uhy.a((Object) tzu2);
        this.e = (ucf) uhy.a((Object) ucf);
        this.e.b = new tvo(this);
        this.h = ubq.a(application);
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.d.b(this);
        this.e.b();
        e();
    }

    public final void a(Activity activity) {
        if (!this.c) {
            this.e.a(activity, activity.getClass().getName());
        }
    }

    public final void e() {
        ScheduledFuture scheduledFuture = this.k;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.k.cancel(true);
            }
            this.k = null;
        }
    }
}

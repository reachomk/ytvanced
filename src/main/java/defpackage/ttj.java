package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ttj */
abstract class ttj implements tzr {
    public final Application a;
    public final tzu b;
    public volatile boolean c;
    private final twc d;

    public final void a() {
        this.c = true;
        d();
    }

    public abstract void d();

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        int i;
        ucy ucy = this.d.a;
        synchronized (ucy.a) {
            i = 0;
            if (SystemClock.elapsedRealtime() - ucy.d > 1000) {
            } else if (ucy.c >= ucy.b) {
                i = 1;
            }
        }
        return i ^ 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, boolean z, bcfe bcfe, bcbb bcbb) {
        a(str, z, bcfe, bcbb, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bcfe bcfe) {
        a(null, true, bcfe, null, null);
    }

    public final void a(String str, boolean z, bcfe bcfe, bcbb bcbb, String str2) {
        if (!this.c) {
            twc twc = this.d;
            if (twc.c == 1) {
                twc.a(str, z, bcfe, bcbb, str2);
            } else {
                ((ScheduledExecutorService) twc.b.a()).submit(new twb(twc, str, z, bcfe, bcbb, str2));
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final ScheduledExecutorService c() {
        return (ScheduledExecutorService) this.b.a();
    }

    protected ttj(udc udc, Application application, tzu tzu, tzu tzu2, int i) {
        this(udc, application, tzu, tzu2, i, Integer.MAX_VALUE);
    }

    protected ttj(udc udc, Application application, tzu tzu, tzu tzu2, int i, int i2) {
        uhy.a((Object) udc);
        uhy.a((Object) application);
        this.a = application;
        this.b = tzu2;
        this.d = new twc(udc, tzu, tzu2, i, i2);
    }
}

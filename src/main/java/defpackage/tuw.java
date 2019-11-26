package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tuw */
final class tuw extends ttj implements ttx, tzh {
    public final tux d;
    public final Map e = new HashMap();
    public final boolean f;
    public final int g;
    public final ucb h;
    public final tvd i;
    private final tty j;

    tuw(udc udc, Application application, tzu tzu, tzu tzu2, boolean z, int i, ucb ucb, tvd tvd) {
        super(udc, application, tzu, tzu2, 2, i);
        this.j = tty.a(application);
        this.f = z;
        this.h = (ucb) uhy.a((Object) ucb);
        this.i = tvd;
        if (ucn.a == 0) {
            synchronized (ucn.class) {
                if (ucn.a == 0) {
                    int a = ucn.a(application);
                    int i2 = 60;
                    if (a >= 10 && a <= 60) {
                        i2 = a;
                    }
                    double d = (double) i2;
                    Double.isNaN(d);
                    ucn.a = (int) Math.ceil(1000.0d / d);
                }
            }
        }
        this.g = ucn.a;
        this.d = new tux(new tuy(this, tvd), z);
        this.j.a(this.d);
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void b(Activity activity) {
        synchronized (this.e) {
            this.e.clear();
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.j.b(this.d);
        tux tux = this.d;
        synchronized (tux) {
            tux.b();
            if (tux.d != null) {
                tux.c.quitSafely();
                tux.c = null;
                tux.d = null;
            }
        }
        synchronized (this.e) {
            this.e.clear();
        }
    }
}

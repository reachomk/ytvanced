package defpackage;

import android.app.Application;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: tui */
final class tui implements txg {
    public final tvg a;

    tui(tvg tvg) {
        this.a = tvg;
    }

    public final void a() {
        this.a.o.a();
    }

    public final void b() {
        if (this.a.d()) {
            this.a.e().e();
        }
    }

    public final void a(String str) {
        b(str);
    }

    public final void b(String str) {
        if (this.a.d()) {
            this.a.e().a(str, 1, null);
        }
    }

    public final void a(twm twm) {
        if (twm != null) {
            tvg tvg = this.a;
            if (tvg.l.f().a() && ((tzc) tvg.l.f().b()).a) {
                tvg = this.a;
                if (tvg.e == null) {
                    synchronized (twn.class) {
                        if (tvg.e == null) {
                            udc a = tvg.a();
                            Application application = tvg.i;
                            tzu tzu = tvg.j;
                            tzu tzu2 = tvg.k;
                            tzc tzc = (tzc) tvg.l.f().b();
                            tvg.l.f().b();
                            tvg.e = (twn) tvg.a(new twn(a, application, tzu, tzu2, tzc.c, tvg.m.g, tzc.b, tzc.d));
                        }
                    }
                }
                twn twn = tvg.e;
                if (twn.b()) {
                    if (twm.c <= 0 && twm.d <= 0 && twm.e <= 0) {
                        int i = twm.p;
                        if (!(i == 3 || i == 4)) {
                            tyv.d("NetworkMetricService", "skip logging NetworkEvent due to empty bandwidth/latency data", new Object[0]);
                            return;
                        }
                    }
                    twn.h.incrementAndGet();
                    twn.c().submit(new twq(twn, twm));
                }
            }
        }
    }

    public final void c() {
        if (this.a.b()) {
            tur c = this.a.c();
            if (c.d.compareAndSet(false, true)) {
                Thread.setDefaultUncaughtExceptionHandler(c.a(Thread.getDefaultUncaughtExceptionHandler()));
            }
        }
    }

    public final UncaughtExceptionHandler a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        return this.a.b() ? this.a.c().a(uncaughtExceptionHandler) : uncaughtExceptionHandler;
    }
}

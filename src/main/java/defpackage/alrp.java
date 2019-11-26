package defpackage;

import android.net.nsd.NsdManager;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: alrp */
public final class alrp implements alqr {
    public final alqb a;
    public final NsdManager b;
    public final alsa c;
    public final ScheduledExecutorService d;
    public final acum e;
    public final Random f = new Random();
    public alrv g = alrv.STOPPED;
    public alrq h;
    public final List i = new CopyOnWriteArrayList();
    private Future j;

    public alrp(alqb alqb, NsdManager nsdManager, alsa alsa, ScheduledExecutorService scheduledExecutorService, acum acum) {
        this.a = alqb;
        this.b = nsdManager;
        this.c = alsa;
        this.d = scheduledExecutorService;
        this.e = acum;
    }

    public static String a(int i) {
        return i != 0 ? i != 3 ? i != 4 ? "UNKNOWN" : "FAILURE_MAX_LIMIT" : "FAILURE_ALREADY_ACTIVE" : "FAILURE_INTERNAL_ERROR";
    }

    public final void a(alqq alqq) {
        amqw.a((Object) alqq);
        this.i.add(alqq);
    }

    public final void b(alqq alqq) {
        amqw.a((Object) alqq);
        this.i.remove(alqq);
    }

    public final synchronized void a(xhv xhv) {
        if (xhv.e()) {
            if (this.c.b > 0) {
                f();
                this.j = this.d.schedule(new alro(this), (long) this.c.b, TimeUnit.SECONDS);
            }
            if (this.g.f) {
                this.g = alrv.STARTING;
                this.h = new alrq(this);
                this.b.discoverServices(this.c.a, 1, this.h);
            }
        }
    }

    public final synchronized void b(xhv xhv) {
        if (xhv.e()) {
            a(xhv);
        } else {
            a();
        }
    }

    private final synchronized void f() {
        Future future = this.j;
        if (future != null) {
            future.cancel(false);
        }
    }

    public final synchronized void a() {
        b();
        f();
    }

    public final synchronized void b() {
        if (this.g != alrv.STOPPED) {
            if (this.g.g) {
                this.b.stopServiceDiscovery(this.h);
            }
            this.g = alrv.STOPPING;
        }
    }

    public final synchronized void c() {
        if (this.g.h) {
            this.b.stopServiceDiscovery(this.h);
        } else {
            this.g = alrv.STARTED;
        }
    }

    public final synchronized void d() {
        this.g = alrv.STOPPED;
        this.h = null;
    }

    public final synchronized void e() {
        String str = "NSD discovery start failed";
        afpc.a(2, afpf.spacecast, str);
        xtl.c(str);
        this.g = alrv.STOPPED;
        this.h = null;
    }
}

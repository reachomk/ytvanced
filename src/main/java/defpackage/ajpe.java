package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: ajpe */
public final class ajpe implements ajoz {
    public final ajph a;
    public final Executor b;
    public final xsc c;
    public volatile boolean d;
    public volatile ajpn e;
    public volatile ajpc f;
    public boolean g;
    public final LinkedBlockingQueue h = new LinkedBlockingQueue();
    private final Runnable i = new ajpd(this);

    public ajpe(Executor executor, ajph ajph, xsc xsc) {
        this.a = new ajpk(this, ajph);
        this.b = executor;
        this.c = xsc;
        this.d = false;
    }

    public final void a(boolean z) {
        this.d = z;
        b();
    }

    public final void a() {
        xak.a();
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
        this.e = null;
        this.g = false;
        this.h.clear();
    }

    public final void a(ajpc ajpc) {
        this.h.add(ajpc);
        b();
    }

    public final void b() {
        a(this.i);
    }

    public final void a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }
}

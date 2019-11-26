package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdbe */
public final class bdbe extends AtomicReference implements bcuo, Runnable {
    public static final long serialVersionUID = -3962399486978279857L;
    public final bdco a;
    private final bcvl b;

    public bdbe(bcvl bcvl) {
        this.b = bcvl;
        this.a = new bdco();
    }

    public bdbe(bcvl bcvl, bdfu bdfu) {
        this.b = bcvl;
        this.a = new bdco(new bdbg(this, bdfu));
    }

    public bdbe(bcvl bcvl, bdco bdco) {
        this.b = bcvl;
        this.a = new bdco(new bdbj(this, bdco));
    }

    public final void run() {
        try {
            lazySet(Thread.currentThread());
            this.b.a();
        } catch (bcve e) {
            bdbe.a(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th) {
            bdbe.a(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th));
        } finally {
            b();
        }
    }

    private static void a(Throwable th) {
        bdeh.a(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public final boolean c() {
        return this.a.b;
    }

    public final void b() {
        if (!this.a.b) {
            this.a.b();
        }
    }

    public final void a(Future future) {
        this.a.a(new bdbh(this, future));
    }
}

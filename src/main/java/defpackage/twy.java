package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: twy */
final class twy implements txg {
    public volatile tui a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final Queue d = new ConcurrentLinkedQueue();
    public final amqp e = ampo.a;

    twy(boolean z) {
    }

    private final void a(txe txe) {
        synchronized (this.d) {
            if (this.a == null) {
                this.d.add(txe);
            } else {
                txe.a(this.a);
            }
        }
    }

    public final void a(tui tui) {
        txe txe = (txe) this.d.poll();
        while (txe != null) {
            txe.a(tui);
            txe = (txe) this.d.poll();
        }
    }

    public final void b() {
        a(new twx());
    }

    public final void a(String str) {
        a(new txa(str));
    }

    public final void a(twm twm) {
        a(new twz(twm));
    }

    public final void c() {
        Thread.setDefaultUncaughtExceptionHandler(a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    public final UncaughtExceptionHandler a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        txe txc = new txc(uncaughtExceptionHandler, this.b, this.c);
        a(txc);
        return txc;
    }

    public final void a() {
        this.d.clear();
    }
}

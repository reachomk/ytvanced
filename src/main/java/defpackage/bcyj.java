package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcyj */
final class bcyj extends bcup implements bdbv {
    public final bdbs a;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    private final AtomicLong c;
    private final bcup d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final bcvl f;
    private final bcts g;

    public bcyj(bcup bcup, bcts bcts) {
        this.d = bcup;
        this.c = null;
        this.f = null;
        this.a = new bdbs(this);
        this.g = bcts;
    }

    public final void d() {
        a(Long.MAX_VALUE);
    }

    public final void bM_() {
        if (!this.e.get()) {
            bdbs bdbs = this.a;
            bdbs.a = true;
            bdbs.a();
        }
    }

    public final void a(Throwable th) {
        if (!this.e.get()) {
            this.a.a(th);
        }
    }

    public final void e_(Object obj) {
        this.b.offer(bcwf.a(obj));
        this.a.a();
    }

    public final boolean b(Object obj) {
        return bcwf.a(this.d, obj);
    }

    public final void b(Throwable th) {
        if (th == null) {
            this.d.bM_();
        } else {
            this.d.a(th);
        }
    }

    public final Object e() {
        return this.b.peek();
    }

    public final Object f() {
        return this.b.poll();
    }
}

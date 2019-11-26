package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ahis */
public final class ahis implements afid {
    public final AtomicLong a = new AtomicLong();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicLong c = new AtomicLong();

    public final void a(int i) {
    }

    public final void a() {
        this.c.set(0);
        this.a.set(0);
        this.b.set(0);
    }

    public final long b() {
        return this.c.get();
    }

    public final void a(long j, long j2) {
        this.c.addAndGet(j2);
    }

    public final void a(afin afin) {
        if (afin.a == 1) {
            this.a.addAndGet(afin.c);
            this.b.addAndGet(afin.b);
        }
    }
}

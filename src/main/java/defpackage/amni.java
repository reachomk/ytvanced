package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: amni */
public final class amni {
    public final amnm a;
    public final AtomicLong b = new AtomicLong(amni.a(aocf.UNSET_ENUM_VALUE, aocf.UNSET_ENUM_VALUE));
    public final AtomicReference c = new AtomicReference(null);
    public final anko d = anko.f();
    private final AtomicReference e = new AtomicReference(null);

    public amni(anij anij, Executor executor) {
        this.a = new amnm(anij, executor);
        this.d.a(this.a, aniv.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final anjv a() {
        if (this.d.isDone()) {
            return this.d;
        }
        int a;
        long j;
        do {
            j = this.b.get();
            a = amni.a(j);
        } while (!this.b.compareAndSet(j, amni.a(a, ((int) j) + 1)));
        anko f = anko.f();
        anjv anjv = (anjv) this.e.getAndSet(f);
        if (anjv != null) {
            anjv = anhk.a(anjv, Throwable.class, amnx.a(new amnj(this, a)), aniv.a);
        } else {
            anjv = anjf.a(amnx.a(new amnk(this, a)), aniv.a);
        }
        f.a(anjv);
        amnl amnl = new amnl(this, a);
        f.a(new amnh(this, f, amnl), aniv.a);
        return amnl;
    }

    public final anjv a(int i) {
        if (amni.a(this.b.get()) > i) {
            return anjf.a();
        }
        amno amno = new amno(i);
        amno amno2;
        do {
            amno2 = (amno) this.c.get();
            if (amno2 != null && amno2.a > i) {
                return anjf.a();
            }
        } while (!this.c.compareAndSet(amno2, amno));
        if (amni.a(this.b.get()) > i) {
            amno.cancel(true);
            this.c.compareAndSet(amno, null);
            return amno;
        }
        amnm amnm = this.a;
        anij anij = amnm.a;
        Executor executor = amnm.b;
        if (anij == null || executor == null) {
            amno.a(this.d);
        } else {
            amno.a(anjf.a(amnx.a(anij), executor));
        }
        return amno;
    }
}

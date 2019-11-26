package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aluo */
public final class aluo implements alup {
    public final aluj a;
    public final int b = 50;
    public final xsc c;
    public final zq d;
    public final AtomicInteger e;
    private final Executor f;

    public aluo(aluj aluj, Executor executor, xsc xsc) {
        this.a = aluj;
        this.f = executor;
        this.c = xsc;
        this.e = new AtomicInteger();
        this.d = new aluv(this);
    }

    public final anjv a(Object obj) {
        alug a = a((aluu) this.d.a(obj));
        if (a != null) {
            return anjf.a(amqp.b(a));
        }
        if (this.a.d() != null) {
            return anja.c(this.a.d().a()).a(new alur(this, obj), this.f).a(new aluq(this, obj), aniv.a);
        }
        return anjf.a(ampo.a);
    }

    public final anjv a(Object obj, Object obj2) {
        if (obj2 != null) {
            return anjf.a(new alut(this, obj, obj2), this.f);
        }
        return anjf.a(new IllegalArgumentException("value cannot be null."));
    }

    public final anjv b(Object obj) {
        this.d.b(obj);
        return anjf.a(null);
    }

    public final anjv a(amqv amqv) {
        return anjf.a(new alus(this, amqv), this.f);
    }

    public final alug a(aluu aluu) {
        if (aluu == null) {
            return null;
        }
        long j = aluu.b;
        int i = 2;
        if (j == 0) {
            return alug.a(aluu.a, 2);
        }
        Object obj = aluu.a;
        if (j <= this.c.b()) {
            i = 4;
        }
        return alug.a(obj, i);
    }
}

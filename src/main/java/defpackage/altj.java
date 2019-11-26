package defpackage;

import java.util.Arrays;

/* renamed from: altj */
public abstract class altj {
    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract boolean d();

    public abstract long e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof altj) {
            altj altj = (altj) obj;
            return amqq.a(Integer.valueOf(a()), Integer.valueOf(altj.a())) && amqq.a(Long.valueOf(b()), Long.valueOf(altj.b())) && amqq.a(Long.valueOf(c()), Long.valueOf(altj.c())) && Arrays.equals(i(), altj.i()) && amqq.a(Boolean.valueOf(d()), Boolean.valueOf(altj.d())) && amqq.a(Long.valueOf(e()), Long.valueOf(altj.e())) && amqq.a(Long.valueOf(f()), Long.valueOf(altj.f())) && amqq.a(Long.valueOf(g()), Long.valueOf(altj.g())) && amqq.a(Long.valueOf(h()), Long.valueOf(altj.h()));
        }
    }

    public abstract long f();

    public abstract long g();

    public abstract long h();

    public abstract byte[] i();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(b()), Long.valueOf(c()), Integer.valueOf(Arrays.hashCode(i())), Boolean.valueOf(d()), Long.valueOf(e()), Long.valueOf(f()), Long.valueOf(g()), Long.valueOf(h())});
    }

    public static alti j() {
        altg altg = new altg();
        altg.a(new byte[0]);
        altg.a(false);
        altg.c(0);
        altg.d(0);
        altg.e(0);
        altg.f(0);
        return altg;
    }

    altj() {
    }
}

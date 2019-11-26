package defpackage;

import java.util.HashSet;

/* renamed from: agea */
final class agea {
    private final agdv a;
    private final agqr b;
    private final HashSet c;
    private volatile agqu d;
    private volatile int e;
    private volatile int f = 0;
    private volatile int g;
    private volatile int h;

    agea(agdv agdv, agqr agqr) {
        this.a = (agdv) amqw.a((Object) agdv);
        this.b = agqr;
        this.c = new HashSet(agqr.b);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str) {
        xvd.a(str);
        this.c.add(str);
        this.a.a(str, this.b.a);
        this.f++;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        this.h = 0;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        this.e = 0;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a(agqz agqz) {
        amqw.a((Object) agqz);
        String b = agxj.b(agqz.f);
        if (!this.c.contains(b)) {
            return false;
        }
        if (!agqz.b()) {
            this.c.remove(b);
            this.a.b(b, this.b.a);
            if (agqz.b == agrc.FAILED) {
                this.h++;
            }
        }
        if (this.f > 0) {
            int size = this.f - this.c.size();
            if (size == this.f) {
                this.e = 100;
            } else {
                int i = (size * 100) / this.f;
                if (agqz.b()) {
                    i += agqz.a() / this.f;
                }
                if (i == 0) {
                    if (agqz.d > 0) {
                        i = 1;
                    }
                }
                int min = Math.min(99, i);
                if (min > this.e) {
                    this.e = min;
                }
            }
            this.g = size;
        }
        this.d = null;
        return true;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean b(agqz agqz) {
        boolean z;
        amqw.a((Object) agqz);
        String b = agxj.b(agqz.f);
        if (this.c.remove(b)) {
            this.a.b(b, this.b.a);
            if (this.f > 0) {
                this.g = this.f - this.c.size();
                this.e = (this.g * 100) / this.f;
            }
            this.f--;
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private final synchronized int d() {
        return this.c.size();
    }

    /* Access modifiers changed, original: final */
    public final agqu c() {
        if (this.d == null) {
            this.d = new agqu(this.b, this.f, d(), this.e, this.h);
        }
        return this.d;
    }
}

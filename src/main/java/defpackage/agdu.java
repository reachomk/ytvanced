package defpackage;

import java.util.HashSet;

/* renamed from: agdu */
final class agdu {
    private final agdr a;
    private final agqi b;
    private final HashSet c;
    private volatile agqh d;
    private volatile int e;
    private volatile int f;
    private volatile int g;
    private volatile int h;
    private volatile boolean i;

    agdu(agdr agdr, agqi agqi) {
        this.a = (agdr) amqw.a((Object) agdr);
        this.b = (agqi) amqw.a((Object) agqi);
        this.c = new HashSet(agqi.e);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str) {
        xvd.a(str);
        this.c.add(str);
        this.a.a(str, this.b.a);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        this.i = false;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        this.e = 0;
        this.f = 0;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i) {
        this.g = i;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a(agqz agqz) {
        amqw.a((Object) agqz);
        String b = agxj.b(agqz.f);
        if (!this.c.contains(b)) {
            return false;
        }
        int i;
        if (!agqz.b()) {
            this.c.remove(b);
            this.a.b(b, this.b.a);
            if (agqz.b == agrc.FAILED) {
                this.i = true;
            }
        }
        int i2 = this.b.e;
        if (i2 > 0) {
            i2 -= this.c.size();
            i = this.b.e;
            if (i2 != i) {
                int i3 = (i2 * 100) / i;
                if (agqz.b()) {
                    i3 += agqz.a() / this.b.e;
                }
                if (i3 == 0) {
                    if (agqz.d > 0) {
                        i3 = 1;
                    }
                }
                i = Math.min(99, i3);
                if (i > this.e) {
                    this.e = i;
                }
            } else {
                this.e = 100;
            }
            this.h = i2;
        }
        i2 = this.b.e - this.g;
        if (i2 > 0) {
            i = i2 - this.c.size();
            if (i == i2) {
                this.f = 100;
            } else {
                int i4 = (i * 100) / i2;
                if (agqz.b()) {
                    i4 += agqz.a() / i2;
                }
                if (i4 == 0) {
                    if (agqz.d > 0) {
                        i4 = 1;
                    }
                }
                int min = Math.min(99, i4);
                if (min > this.f) {
                    this.f = min;
                }
            }
            this.h = i + this.g;
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
            int i = this.b.e;
            if (i > 0) {
                this.h = i - this.c.size();
                this.e = (this.h * 100) / this.b.e;
            }
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

    private final synchronized int e() {
        return this.g;
    }

    /* Access modifiers changed, original: final */
    public final agqh c() {
        if (this.d == null) {
            this.d = new agqh(this.b, d(), e(), this.e, this.f, this.i);
        }
        return this.d;
    }
}

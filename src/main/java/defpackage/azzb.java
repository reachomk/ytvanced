package defpackage;

/* renamed from: azzb */
class azzb implements azyl {
    private final azyl a;
    private final long b;
    private final long c;
    private long d;
    private long e;

    public azzb(azyl azyl, long j) {
        if (azyl.e() < Long.MAX_VALUE) {
            amqw.a(j <= azyl.e() - (azyl.d() - azyl.c()));
        }
        this.a = azyl;
        this.b = azyl.d();
        this.c = j;
    }

    public final synchronized long e() {
        return Long.MAX_VALUE;
    }

    public final synchronized int a(byte[] bArr, int i, int i2) {
        int a;
        amqw.a(bArr.length - i >= i2, (Object) "Cannot read into a buffer smaller than given length");
        i2 = (int) Math.min((long) i2, this.c - this.d);
        if (this.b + this.d != this.a.d()) {
            this.a.f();
            long c = (this.b - this.a.c()) + this.d;
            while (c > 0) {
                c -= this.a.a(c);
            }
        }
        a = this.a.a(bArr, i, i2);
        this.d += (long) a;
        return a;
    }

    public final synchronized void b() {
        this.e = this.d;
    }

    public final synchronized long c() {
        return this.e;
    }

    public final synchronized long d() {
        return this.d;
    }

    public final synchronized void f() {
        this.d = this.e;
    }

    public final synchronized long a(long j) {
        j = Math.min(j, this.c - this.d);
        if (this.b + this.d != this.a.d()) {
            this.a.f();
            long c = (this.b - this.a.c()) + this.d;
            while (c > 0) {
                c -= this.a.a(c);
            }
        }
        j = this.a.a(j);
        this.d += j;
        return j;
    }

    public final synchronized long a() {
        return this.c;
    }

    public final synchronized boolean g() {
        return this.d < this.c;
    }

    public final synchronized void close() {
        this.a.close();
    }
}

package defpackage;

/* renamed from: trk */
final class trk {
    private long a = 0;
    private long b;
    private long c;
    private long d;

    trk() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(long j) {
        this.a += j;
        this.d += j;
        long j2 = 0;
        if (j > 0) {
            j2 = this.b + j;
            this.b = j2;
        } else {
            this.b = 0;
        }
        this.c = Math.max(this.c, j2);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        this.b = 0;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized long b() {
        long j;
        j = this.d;
        this.d = 0;
        return j;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized long c() {
        return this.d;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void d() {
        this.d = 0;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized long a(int i) {
        if (i == 1) {
            return this.a;
        } else if (i != 2) {
            return this.c;
        } else {
            return this.b;
        }
    }
}

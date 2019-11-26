package defpackage;

/* renamed from: nsa */
final class nsa implements nsb {
    private final long a;
    private final int b;
    private final long c;

    public nsa(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        j = -1;
        if (j2 != -1) {
            j = a(j2);
        }
        this.c = j;
    }

    public final boolean a() {
        return this.c != -1;
    }

    public final long b(long j) {
        return this.c != -1 ? this.a + ((j * ((long) this.b)) / 8000000) : 0;
    }

    public final long a(long j) {
        return (Math.max(0, j - this.a) * 8000000) / ((long) this.b);
    }

    public final long b() {
        return this.c;
    }
}

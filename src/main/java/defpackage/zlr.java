package defpackage;

/* renamed from: zlr */
public final class zlr implements zks {
    private long a;
    private long b;
    private long c;
    private final /* synthetic */ zld d;

    public zlr(zld zld) {
        this.d = zld;
    }

    public final void a(long j) {
        this.a++;
        c(j);
    }

    public final void b(long j) {
        this.b++;
        c(j);
    }

    private final void c(long j) {
        long j2 = j - this.c;
        if (j2 > 1000) {
            if (j2 <= 2000) {
                zld zld = this.d;
                float f = ((float) j2) / 1000.0f;
                zld.n = ((float) this.a) / f;
                zld.o = ((float) this.b) / f;
                zld.n();
            }
            this.c = j;
            this.a = 0;
            this.b = 0;
        }
    }

    public final void a(int i, int i2) {
        zld zld = this.d;
        zld.p = i;
        zld.q = i2;
        zld.n();
    }
}

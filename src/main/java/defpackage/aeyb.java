package defpackage;

/* renamed from: aeyb */
final class aeyb implements oaa {
    private final aexc a;
    private final oye b;
    private ovl c;
    private long d = -1;
    private boolean e;
    private long f;
    private long g;
    private int h;
    private long i;
    private long j;
    private int k;

    aeyb(aexc aexc) {
        oye oye = oye.a;
        this.a = aexc;
        this.b = oye;
    }

    public final long e() {
        return 0;
    }

    public final boolean f() {
        return false;
    }

    public final void a() {
        aajj c = this.a.c();
        this.f = ((long) c.B()) * 1000;
        this.g = ((long) c.C()) * 1000;
        this.h = c.D();
        this.i = ((long) c.L()) * 1000;
        this.j = ((long) c.M()) * 1000;
        a(false);
    }

    public final void a(oal[] oalArr, oun oun) {
        int i = 0;
        this.k = 0;
        while (i < oalArr.length) {
            if (oun.a(i) != null) {
                this.k += ozp.g(oalArr[i].a());
            }
            i++;
        }
        g().a(this.k);
    }

    public final void b() {
        a(true);
    }

    public final void c() {
        a(true);
    }

    private final synchronized ovl g() {
        if (this.c == null) {
            this.c = new ovl(false, this.a.c().y() << 10);
        }
        return this.c;
    }

    public final boolean a(long j, float f, boolean z) {
        long j2 = !z ? this.i : this.j;
        return j2 <= 0 || j >= j2;
    }

    public final boolean a(long j, float f) {
        long j2 = this.f;
        long j3 = this.g;
        if (j2 > j3) {
            if (j == 0 || this.d == -1) {
                this.d = this.b.a();
                j2 = this.g;
            } else {
                j2 = Math.min(j2, j3 + (((long) this.h) * (this.b.a() - this.d)));
            }
        }
        boolean z = false;
        int i = j <= j2 ? j < j2 ? 2 : 1 : 0;
        int e = g().e();
        int i2 = this.k;
        if (i == 2 || (i == 1 && this.e && e < i2)) {
            z = true;
        }
        this.e = z;
        return z;
    }

    private final void a(boolean z) {
        this.k = 0;
        this.e = false;
        this.d = -1;
        if (z) {
            synchronized (this) {
                this.c = null;
            }
        }
    }

    public final /* synthetic */ ouw d() {
        return g();
    }
}

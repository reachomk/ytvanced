package defpackage;

/* renamed from: nzz */
final class nzz {
    public final ooj a;
    public final Object b;
    public final opr[] c;
    public boolean d;
    public boolean e;
    public oac f;
    public nzz g;
    public opz h;
    public long i;
    private final boolean[] j;
    private final oao[] k;
    private final ous l;
    private final ool m;
    private ouu n;

    public nzz(oao[] oaoArr, long j, ous ous, ouw ouw, ool ool, oac oac) {
        this.k = oaoArr;
        long j2 = oac.b;
        this.i = j - j2;
        this.l = ous;
        this.m = ool;
        ook ook = oac.a;
        this.b = ook.a;
        this.f = oac;
        int length = oaoArr.length;
        this.c = new opr[length];
        this.j = new boolean[length];
        long j3 = oac.d;
        ooj a = ool.a(ook, ouw, j2);
        if (!(j3 == -9223372036854775807L || j3 == Long.MIN_VALUE)) {
            a = new onq(a, true, j3);
        }
        this.a = a;
    }

    public final long a(long j) {
        return j + this.i;
    }

    public final long b(long j) {
        return j - this.i;
    }

    public final boolean a() {
        boolean z = false;
        if (this.d) {
            if (!this.e) {
                z = true;
            } else if (this.a.d() != Long.MIN_VALUE) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final long b() {
        if (!this.d) {
            return this.f.b;
        }
        long d = this.e ? this.a.d() : Long.MIN_VALUE;
        return d == Long.MIN_VALUE ? this.f.e : d;
    }

    public final ouu a(float f, oau oau) {
        int i;
        ouu a = this.l.a(this.k, d(), this.f.a, oau);
        ouu ouu = this.n;
        if (ouu != null && ouu.c.a == a.c.a) {
            i = 0;
            while (i < a.c.a) {
                if (a.a(ouu, i)) {
                    i++;
                }
            }
            return null;
        }
        for (oum oum : a.c.a()) {
            if (oum != null) {
                oum.a(f);
            }
        }
        return a;
    }

    public final long a(ouu ouu, long j) {
        return a(ouu, j, false, new boolean[this.k.length]);
    }

    public final long a(ouu ouu, long j, boolean z, boolean[] zArr) {
        ouu ouu2 = ouu;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= ouu2.a) {
                break;
            }
            boolean[] zArr2 = this.j;
            if (z || !ouu2.a(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        opr[] oprArr = this.c;
        int i2 = 0;
        while (true) {
            oao[] oaoArr = this.k;
            if (i2 >= oaoArr.length) {
                break;
            }
            if (oaoArr[i2].a() == 6) {
                oprArr[i2] = null;
            }
            i2++;
        }
        h();
        this.n = ouu2;
        g();
        oun oun = ouu2.c;
        long a = this.a.a(oun.a(), this.j, this.c, zArr, j);
        opr[] oprArr2 = this.c;
        ouu ouu3 = (ouu) oxz.a(this.n);
        int i3 = 0;
        while (true) {
            oao[] oaoArr2 = this.k;
            if (i3 >= oaoArr2.length) {
                break;
            }
            if (oaoArr2[i3].a() == 6 && ouu3.a(i3)) {
                oprArr2[i3] = new oob();
            }
            i3++;
        }
        this.e = false;
        i2 = 0;
        while (true) {
            opr[] oprArr3 = this.c;
            if (i2 >= oprArr3.length) {
                return a;
            }
            if (oprArr3[i2] != null) {
                oxz.b(ouu2.a(i2));
                if (this.k[i2].a() != 6) {
                    this.e = true;
                }
            } else {
                oxz.b(oun.a(i2) == null);
            }
            i2++;
        }
    }

    public final void c() {
        h();
        this.n = null;
        long j = this.f.d;
        ool ool = this.m;
        ooj ooj = this.a;
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            ool.a(ooj);
            return;
        }
        try {
            ool.a(((onq) ooj).a);
        } catch (RuntimeException e) {
            oyp.b("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void a(nzz nzz) {
        if (nzz != this.g) {
            h();
            this.g = nzz;
            g();
        }
    }

    public final opz d() {
        return (opz) oxz.a(this.h);
    }

    public final ouu e() {
        return (ouu) oxz.a(this.n);
    }

    private final void g() {
        ouu ouu = this.n;
        if (f() && ouu != null) {
            for (int i = 0; i < ouu.a; i++) {
                boolean a = ouu.a(i);
                oum a2 = ouu.c.a(i);
                if (a && a2 != null) {
                    a2.a();
                }
            }
        }
    }

    private final void h() {
        ouu ouu = this.n;
        if (f() && ouu != null) {
            for (int i = 0; i < ouu.a; i++) {
                boolean a = ouu.a(i);
                oum a2 = ouu.c.a(i);
                if (a && a2 != null) {
                    a2.e();
                }
            }
        }
    }

    public final boolean f() {
        return this.g == null;
    }
}

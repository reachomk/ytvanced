package defpackage;

/* renamed from: tro */
public final class tro extends tqu {
    public double e = -1.0d;
    public double f = -1.0d;
    public long g;
    public final trk h = new trk();
    public final trk i = new trk();
    public final trn j = new trn();
    public final trk k = new trk();
    public int l;
    public final trk m = new trk();
    public int n = 1;
    public int o;
    public final tqs p = new tqs();
    public final tri q = new tri();
    public final tri r = new tri();
    public final tri s = new tri();

    /* Access modifiers changed, original: protected|final */
    public final int c() {
        return 2000;
    }

    public final void a(long j, double d, double d2, double d3, boolean z, boolean z2, int i, double d4) {
        tqw tqw;
        long j2 = j;
        double d5 = d;
        double d6 = d2;
        super.a(j, d, d4);
        if (z2) {
            this.c.a();
        }
        boolean z3 = true;
        if (j2 > 0) {
            int i2 = (int) j2;
            j2 = (long) i2;
            this.h.a(j2);
            Object obj = (d6 < 0.1d || d3 < 0.1d) ? null : 1;
            if (obj != null) {
                this.i.a(j2);
            }
            if (z) {
                this.g += j2;
                this.l += i2;
            }
            if (obj != null) {
                this.j.a(d5, j2);
            } else {
                this.j.a();
            }
            if (d5 >= tqw.HALF.f) {
                this.k.a(j2);
                trk trk = this.m;
                if (obj == null) {
                    j2 = 0;
                }
                trk.a(j2);
            }
        }
        this.f = Math.max(d6, this.f);
        double d7 = this.e;
        this.e = d7 != -1.0d ? Math.min(d6, d7) : d6;
        this.p.a.clear();
        this.p.a(tqv.AUDIBLE_MEASURABLE);
        this.p.a(tqv.BACKGROUNDED_MEASURABLE);
        this.p.a(tqv.COVERAGE_MEASURABLE);
        Object obj2 = d6 < 0.1d ? null : 1;
        if (d5 >= tqw.HALF.f) {
            this.p.a(tqv.VISIBLE_50_PERCENT);
        }
        if (a()) {
            this.p.a(tqv.VIEWABLE);
        }
        if (d6 >= 0.1d) {
            this.p.a(tqv.AUDIBLE);
        }
        if (d5 >= tqw.HALF.f && obj2 != null) {
            this.p.a(tqv.AUDIBLE_AND_VISIBLE_50_PERCENT);
        }
        if (a() && obj2 != null) {
            this.p.a(tqv.AUDIBLE_AND_VIEWABLE);
        }
        if (z) {
            this.p.a(tqv.FULLSCREEN);
        }
        if (d5 > 0.0d) {
            this.p.a(tqv.PARTIALLY_VIEWABLE);
        }
        if (d()) {
            this.p.a(tqv.GROUPM_DURATION_REACHED);
        }
        if (b()[tqw.FULL.ordinal()].longValue() >= 2000) {
            this.p.a(tqv.PMX_VIEWABLE);
        }
        int i3 = i / 1000;
        if (d5 >= tqw.FULL.f) {
            tqw = tqw.FULL;
        } else if (d5 >= tqw.THREE_QUARTER.f) {
            tqw = tqw.THREE_QUARTER;
        } else if (d5 >= tqw.HALF.f) {
            tqw = tqw.HALF;
        } else if (d5 >= tqw.QUARTER.f) {
            tqw = tqw.QUARTER;
        } else if (d5 <= tqw.NONE.f) {
            tqw = null;
        } else {
            tqw = tqw.NONE;
        }
        if (tqw == null) {
            this.q.a(i3, false);
            this.r.a(i3, false);
        } else {
            this.q.a(i3, tqw.ordinal() <= tqw.HALF.ordinal());
            this.r.a(i3, tqw.ordinal() <= tqw.FULL.ordinal());
        }
        tri tri = this.s;
        if (d6 < 0.1d) {
            z3 = false;
        }
        tri.a(i3, z3);
    }

    public final boolean d() {
        return a(f());
    }

    public final boolean a(long j) {
        boolean z = true;
        if (j < 15000) {
            int i = this.o;
            if (i > 0) {
                return j >= ((long) (i >> 1)) ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final boolean e() {
        return this.e >= 0.1d;
    }

    public final long f() {
        return this.h.a(1);
    }
}

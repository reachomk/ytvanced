package defpackage;

import android.util.Pair;

/* renamed from: oab */
final class oab {
    public oau a = oau.a;
    public int b;
    public boolean c;
    public nzz d;
    public nzz e;
    public nzz f;
    public int g;
    public Object h;
    private final oaw i = new oaw();
    private final oav j = new oav();
    private long k;
    private long l;

    public final boolean a(ooj ooj) {
        nzz nzz = this.f;
        return nzz != null && nzz.a == ooj;
    }

    public final void a(long j) {
        nzz nzz = this.f;
        if (nzz != null) {
            oxz.b(nzz.f());
            if (nzz.d) {
                nzz.a.a(nzz.b(j));
            }
        }
    }

    public final nzz a() {
        return !b() ? this.f : this.d;
    }

    public final boolean b() {
        return this.d != null;
    }

    public final nzz c() {
        nzz nzz = this.d;
        if (nzz != null) {
            if (nzz == this.e) {
                this.e = nzz.g;
            }
            nzz.c();
            int i = this.g - 1;
            this.g = i;
            if (i == 0) {
                this.f = null;
                nzz = this.d;
                this.h = nzz.b;
                this.l = nzz.f.a.d;
            }
            this.d = this.d.g;
        } else {
            nzz = this.f;
            this.d = nzz;
            this.e = nzz;
        }
        return this.d;
    }

    public final boolean a(nzz nzz) {
        boolean z = false;
        oxz.b(nzz != null);
        this.f = nzz;
        while (true) {
            nzz = nzz.g;
            if (nzz != null) {
                if (nzz == this.e) {
                    this.e = this.d;
                    z = true;
                }
                nzz.c();
                this.g--;
            } else {
                this.f.a(null);
                return z;
            }
        }
    }

    public final void a(boolean z) {
        nzz a = a();
        if (a != null) {
            this.h = z ? a.b : null;
            this.l = a.f.a.d;
            a.c();
            a(a);
        } else if (!z) {
            this.h = null;
        }
        this.d = null;
        this.f = null;
        this.e = null;
        this.g = 0;
    }

    public final oac a(oac oac) {
        long b;
        ook ook = oac.a;
        boolean a = oab.a(ook);
        boolean a2 = a(ook, a);
        this.a.a(oac.a.a, this.i);
        if (ook.a()) {
            b = this.i.b(ook.b, ook.c);
        } else {
            b = oac.d;
            if (b == -9223372036854775807L || b == Long.MIN_VALUE) {
                b = this.i.c;
            }
        }
        return new oac(ook, oac.b, oac.c, oac.d, b, a, a2);
    }

    public final ook a(Object obj, long j) {
        long j2;
        nzz a;
        int i = this.a.a(obj, this.i).b;
        Object obj2 = this.h;
        if (obj2 != null) {
            int a2 = this.a.a(obj2);
            if (a2 != -1 && this.a.a(a2, this.i).b == i) {
                j2 = this.l;
                return a(obj, j, j2);
            }
        }
        for (a = a(); a != null; a = a.g) {
            if (a.b.equals(obj)) {
                j2 = a.f.a.d;
                break;
            }
        }
        for (a = a(); a != null; a = a.g) {
            int a3 = this.a.a(a.b);
            if (a3 != -1 && this.a.a(a3, this.i).b == i) {
                j2 = a.f.a.d;
                break;
            }
        }
        j2 = this.k;
        this.k = 1 + j2;
        return a(obj, j, j2);
    }

    private final ook a(Object obj, long j, long j2) {
        this.a.a(obj, this.i);
        int a = this.i.a(j);
        if (a == -1) {
            return new ook(obj, j2, this.i.b(j));
        }
        return new ook(obj, a, this.i.b(a), j2);
    }

    public final boolean d() {
        nzz a = a();
        if (a != null) {
            int a2 = this.a.a(a.b);
            while (true) {
                nzz nzz;
                a2 = this.a.a(a2, this.i, this.j, this.b, this.c);
                while (true) {
                    nzz = a.g;
                    if (nzz != null && !a.f.f) {
                        a = nzz;
                    }
                }
                if (!(a2 == -1 || nzz == null || this.a.a(nzz.b) != a2)) {
                    a = nzz;
                }
            }
            boolean a3 = a(a);
            a.f = a(a.f);
            if (a3 && b()) {
                return false;
            }
        }
        return true;
    }

    public final oac a(nzz nzz, long j) {
        nzz nzz2 = nzz;
        oac oac = nzz2.f;
        long j2 = (nzz2.i + oac.e) - j;
        int a;
        if (oac.f) {
            a = this.a.a(this.a.a(oac.a.a), this.i, this.j, this.b, this.c);
            if (a == -1) {
                return null;
            }
            long j3;
            Object obj;
            int i = this.a.a(a, this.i, true).b;
            Object obj2 = this.i.a;
            long j4 = oac.a.d;
            long j5 = 0;
            if (this.a.a(i, this.j).f == a) {
                Pair a2 = this.a.a(this.j, this.i, i, -9223372036854775807L, Math.max(0, j2));
                if (a2 == null) {
                    return null;
                }
                long j6;
                Object obj3 = a2.first;
                long longValue = ((Long) a2.second).longValue();
                nzz2 = nzz2.g;
                if (nzz2 == null || !nzz2.b.equals(obj3)) {
                    j6 = this.k;
                    this.k = 1 + j6;
                } else {
                    j6 = nzz2.f.a.d;
                }
                j5 = longValue;
                j3 = j6;
                obj = obj3;
            } else {
                obj = obj2;
                j3 = j4;
            }
            j2 = j5;
            return a(a(obj, j2, j3), j2, j5);
        }
        ook ook = oac.a;
        this.a.a(ook.a, this.i);
        int i2;
        int a3;
        if (ook.a()) {
            i2 = ook.b;
            oqd oqd = this.i.e.d[i2];
            a = oqd.a;
            if (a == -1) {
                return null;
            }
            a3 = oqd.a(ook.c);
            if (a3 >= a) {
                j2 = oac.c;
                int i3 = this.i.e.b;
                return b(ook.a, j2, ook.d);
            } else if (!this.i.a(i2, a3)) {
                return null;
            } else {
                return a(ook.a, i2, a3, oac.c, ook.d);
            }
        }
        i2 = this.i.a(oac.d);
        if (i2 == -1) {
            return b(ook.a, oac.e, ook.d);
        }
        a3 = this.i.b(i2);
        if (!this.i.a(i2, a3)) {
            return null;
        }
        return a(ook.a, i2, a3, oac.e, ook.d);
    }

    public final oac a(ook ook, long j, long j2) {
        this.a.a(ook.a, this.i);
        if (!ook.a()) {
            return b(ook.a, j2, ook.d);
        } else if (!this.i.a(ook.b, ook.c)) {
            return null;
        } else {
            return a(ook.a, ook.b, ook.c, j, ook.d);
        }
    }

    private final oac a(Object obj, int i, int i2, long j, long j2) {
        ook ook = new ook(obj, i, i2, j2);
        long b = this.a.a(ook.a, this.i).b(ook.b, ook.c);
        if (i2 == this.i.b(i)) {
            long j3 = this.i.e.e;
        }
        return new oac(ook, 0, j, -9223372036854775807L, b, false, false);
    }

    private final oac b(Object obj, long j, long j2) {
        long j3;
        int b = this.i.b(j);
        Object obj2 = obj;
        ook ook = new ook(obj, j2, b);
        boolean a = oab.a(ook);
        boolean a2 = a(ook, a);
        long a3 = b != -1 ? this.i.a(b) : -9223372036854775807L;
        if (a3 == -9223372036854775807L || a3 == Long.MIN_VALUE) {
            j3 = this.i.c;
        } else {
            j3 = a3;
        }
        return new oac(ook, j, -9223372036854775807L, a3, j3, a, a2);
    }

    private static boolean a(ook ook) {
        return !ook.a() && ook.e == -1;
    }

    private final boolean a(ook ook, boolean z) {
        int a = this.a.a(ook.a);
        return !this.a.a(this.a.a(a, this.i).b, this.j).e && this.a.a(a, this.i, this.j, this.b, this.c) == -1 && z;
    }
}

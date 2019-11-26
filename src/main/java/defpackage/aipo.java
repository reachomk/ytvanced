package defpackage;

/* renamed from: aipo */
public final class aipo {
    public static awdw a(zzl zzl) {
        awdw awdw;
        if (zzl == null || zzl.b() == null) {
            awdw = awdw.E;
        } else {
            awdw = zzl.b().l;
            if (awdw == null) {
                return awdw.E;
            }
        }
        return awdw;
    }

    public static awde a(zyw zyw) {
        if (zyw == null || zyw.a() == null) {
            return null;
        }
        awde awde = zyw.a().s;
        if (awde == null) {
            awde = awde.s;
        }
        return awde;
    }

    public static aoum b(zzl zzl) {
        aoum aoum = aipo.a(zzl).d;
        return aoum == null ? aoum.d : aoum;
    }

    public static boolean c(zzl zzl) {
        return aipo.b(zzl).b > 0 && aipo.b(zzl).c;
    }

    public static long a(zzl zzl, long j) {
        int i = aipo.a(zzl).e;
        return i != 0 ? (long) i : j;
    }

    public static boolean a(zyw zyw, long j) {
        if (!(zyw == null || zyw.a() == null || (zyw.a().a & 1073741824) == 0)) {
            long f = aipo.f(zyw);
            awde awde = zyw.a().s;
            if (awde == null) {
                awde = awde.s;
            }
            if (awde.b && (j & f) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(zyw zyw) {
        if (zyw == null || zyw.a() == null) {
            return false;
        }
        awde awde = zyw.a().s;
        if (awde == null) {
            awde = awde.s;
        }
        return awde.b;
    }

    public static boolean c(zyw zyw) {
        if (zyw == null || zyw.a() == null) {
            return false;
        }
        awde awde = zyw.a().s;
        if (awde == null) {
            awde = awde.s;
        }
        return awde.c;
    }

    public static boolean d(zyw zyw) {
        if (zyw == null || zyw.a() == null) {
            return false;
        }
        awde awde = zyw.a().s;
        if (awde == null) {
            awde = awde.s;
        }
        return awde.d;
    }

    public static boolean d(zzl zzl) {
        return aipo.a(zzl).p;
    }

    public static boolean e(zzl zzl) {
        return aipo.a(zzl).j;
    }

    public static boolean f(zzl zzl) {
        return aipo.a(zzl).q;
    }

    public static boolean g(zzl zzl) {
        return aipo.a(zzl).u;
    }

    public static boolean e(zyw zyw) {
        awde a = aipo.a(zyw);
        return a != null && a.h;
    }

    public static boolean h(zzl zzl) {
        return aipo.a(zzl).v;
    }

    public static long f(zyw zyw) {
        awde a = aipo.a(zyw);
        if (a == null) {
            return 0;
        }
        return a.j;
    }

    public static boolean i(zzl zzl) {
        return aipo.a(zzl).x;
    }

    public static boolean j(zzl zzl) {
        return aipo.a(zzl).A;
    }

    public static boolean g(zyw zyw) {
        awde a = aipo.a(zyw);
        return a != null && a.n;
    }

    public static boolean h(zyw zyw) {
        awde a = aipo.a(zyw);
        return a != null && a.o;
    }
}

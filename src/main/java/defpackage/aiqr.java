package defpackage;

/* renamed from: aiqr */
public final class aiqr {
    public static boolean a(atdv atdv) {
        if (atdv != null) {
            int a = awah.a(atdv.b);
            if (a == 0 || a == 1) {
                return true;
            }
        }
        return false;
    }

    public static avsj b(atdv atdv) {
        if (atdv != null) {
            atdl atdl = atdv.k;
            if (atdl == null) {
                atdl = atdl.c;
            }
            if (atdl.a == 60572968) {
                avsj avsj;
                atdl atdl2 = atdv.k;
                if (atdl2 == null) {
                    atdl2 = atdl.c;
                }
                if (atdl2.a == 60572968) {
                    avsj = (avsj) atdl2.b;
                } else {
                    avsj = avsj.h;
                }
                return avsj;
            }
        }
        return null;
    }

    public static boolean c(atdv atdv) {
        if (atdv == null) {
            return false;
        }
        int a = awah.a(atdv.b);
        if (a == 0) {
            a = 1;
        }
        return a == 1 || a == 4 || a == 5 || a == 6;
    }

    public static boolean d(atdv atdv) {
        if (!(atdv == null || (atdv.a & 1024) == 0)) {
            apap apap;
            atdd atdd = atdv.i;
            if (atdd == null) {
                atdd = atdd.c;
            }
            if (atdd.a != 64657230) {
                apap = null;
            } else {
                atdd atdd2 = atdv.i;
                if (atdd2 == null) {
                    atdd2 = atdd.c;
                }
                if (atdd2.a == 64657230) {
                    apap = (apap) atdd2.b;
                } else {
                    apap = apap.d;
                }
            }
            if (apap != null && apap.b) {
                return true;
            }
        }
        return false;
    }

    public static apao e(atdv atdv) {
        if (!(aiqr.d(atdv) || atdv == null || (atdv.a & 1024) == 0)) {
            apap apap;
            atdd atdd = atdv.i;
            if (atdd == null) {
                atdd = atdd.c;
            }
            if (atdd.a == 64657230) {
                apap = (apap) atdd.b;
            } else {
                apap = apap.d;
            }
            if ((apap.a & 2) != 0) {
                apap apap2;
                atdd atdd2 = atdv.i;
                if (atdd2 == null) {
                    atdd2 = atdd.c;
                }
                if (atdd2.a == 64657230) {
                    apap2 = (apap) atdd2.b;
                } else {
                    apap2 = apap.d;
                }
                apao apao = apap2.c;
                if (apao == null) {
                    apao = apao.f;
                }
                return apao;
            }
        }
        return null;
    }

    public static boolean f(atdv atdv) {
        if (!(atdv == null || (atdv.a & 131072) == 0)) {
            int a = awah.a(atdv.b);
            if (a != 0 && a == 7) {
                return true;
            }
        }
        return false;
    }

    public static awdy g(atdv atdv) {
        if (!(atdv == null || (atdv.a & 32) == 0)) {
            awdy awdy;
            atdt atdt = atdv.f;
            if (atdt == null) {
                atdt = atdt.c;
            }
            if (atdt.a != 73238862) {
                awdy = null;
            } else {
                atdt atdt2 = atdv.f;
                if (atdt2 == null) {
                    atdt2 = atdt.c;
                }
                if (atdt2.a == 73238862) {
                    awdy = (awdy) atdt2.b;
                } else {
                    awdy = awdy.g;
                }
            }
            if (!(awdy == null || awdy.b.isEmpty())) {
                int i = awdy.a;
                if ((i & 4) == 0 || (i & 2) == 0) {
                    return null;
                }
                return awdy;
            }
        }
        return null;
    }

    public static boolean h(atdv atdv) {
        if (atdv == null || (atdv.a & 131072) == 0) {
            return false;
        }
        atdj atdj = atdv.m;
        if (atdj == null) {
            atdj = atdj.c;
        }
        aujn aujn = atdj.b;
        if (aujn == null) {
            aujn = aujn.f;
        }
        return aujn.e;
    }
}

package defpackage;

import android.net.Uri;

/* renamed from: aklb */
public final class aklb {
    public static boolean a(aygk aygk) {
        return aygk != null && aygk.b.size() > 0;
    }

    public static boolean b(aygk aygk) {
        if (aklb.a(aygk) && ((aygm) aygk.b.get(0)).d == ((aygm) aygk.b.get(0)).c) {
            return true;
        }
        return false;
    }

    public static aygm c(aygk aygk) {
        return aklb.a(aygk) ? (aygm) aygk.b.get(0) : null;
    }

    public static Uri d(aygk aygk) {
        aygm c = aklb.c(aygk);
        if (c == null) {
            return null;
        }
        return xvt.d(c.b);
    }

    public static Uri e(aygk aygk) {
        aygm f = aklb.f(aygk);
        if (f == null) {
            return null;
        }
        return xvt.d(f.b);
    }

    public static aygm f(aygk aygk) {
        if (!aklb.a(aygk)) {
            return null;
        }
        return (aygm) aygk.b.get(aygk.b.size() - 1);
    }

    public static aygm a(aygk aygk, int i) {
        if (!aklb.a(aygk)) {
            return null;
        }
        anyd anyd;
        if (i > 0) {
            for (aygm aygm : aygk.b) {
                if (aygm.c >= i) {
                    return aygm;
                }
            }
            i = aygk.b.size();
            anyd = aygk.b;
            i--;
        } else {
            anyd = aygk.b;
            i = 0;
        }
        return (aygm) anyd.get(i);
    }

    public static Uri b(aygk aygk, int i) {
        aygm a = aklb.a(aygk, i);
        if (a == null) {
            return null;
        }
        return xvt.d(a.b);
    }

    public static aygm a(aygk aygk, int i, int i2) {
        aygm aygm = null;
        if (aklb.a(aygk)) {
            for (aygm aygm2 : aygk.b) {
                int i3 = aygm2.c;
                if (i3 > i && aygm2.d > i2) {
                    break;
                } else if (i3 <= i) {
                    if (aygm2.d <= i2) {
                        aygm = aygm2;
                    }
                }
            }
        }
        return aygm;
    }

    public static aygm b(aygk aygk, int i, int i2) {
        boolean z = true;
        int i3 = 0;
        amqw.a(i >= 0);
        if (i2 < 0) {
            z = false;
        }
        amqw.a(z);
        aygm aygm = null;
        if (aklb.a(aygk)) {
            for (aygm aygm2 : aygk.b) {
                int i4 = i - aygm2.c;
                int i5 = i2 - aygm2.d;
                i4 = (i4 * i4) + (i5 * i5);
                if (aygm == null || i4 < i3) {
                    aygm = aygm2;
                    i3 = i4;
                }
            }
        }
        return aygm;
    }

    public static Uri c(aygk aygk, int i, int i2) {
        aygm b = aklb.b(aygk, i, i2);
        return (b == null || (b.a & 1) == 0) ? null : xvt.d(b.b);
    }

    public static float g(aygk aygk) {
        float f = -1.0f;
        if (aklb.a(aygk)) {
            for (aygm aygm : aygk.b) {
                int i = aygm.d;
                if (i != 0) {
                    float f2 = ((float) aygm.c) / ((float) i);
                    if (f2 > f) {
                        f = f2;
                    }
                }
            }
        }
        return f;
    }

    public static aygk a(Uri uri) {
        if (uri == null) {
            return null;
        }
        aygj aygj = (aygj) aygk.f.createBuilder();
        aygl aygl = (aygl) aygm.e.createBuilder();
        aygl.a(uri.toString());
        aygj.a(aygl);
        return (aygk) ((anxl) aygj.build());
    }
}

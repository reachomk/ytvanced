package defpackage;

import android.util.Pair;

/* renamed from: oau */
public abstract class oau {
    public static final oau a = new oat();

    public abstract int a();

    public abstract int a(Object obj);

    public abstract Object a(int i);

    public abstract oav a(int i, oav oav, boolean z, long j);

    public abstract oaw a(int i, oaw oaw, boolean z);

    public abstract int b();

    public final boolean c() {
        return a() == 0;
    }

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            return i != a(z) ? i + 1 : -1;
        } else {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                if (i != a(z)) {
                    i++;
                } else {
                    i = b(z);
                }
                return i;
            }
            throw new IllegalStateException();
        }
    }

    public int a(boolean z) {
        return !c() ? a() - 1 : -1;
    }

    public int b(boolean z) {
        return c() ? -1 : 0;
    }

    public final oav a(int i, oav oav) {
        return a(i, oav, false);
    }

    public final oav a(int i, oav oav, boolean z) {
        return a(i, oav, z, 0);
    }

    public final int a(int i, oaw oaw, oav oav, int i2, boolean z) {
        int i3 = a(i, oaw).b;
        if (a(i3, oav).g != i) {
            return i + 1;
        }
        i = a(i3, i2, z);
        if (i != -1) {
            return a(i, oav).f;
        }
        return -1;
    }

    public final Pair a(oav oav, oaw oaw, int i, long j) {
        return (Pair) oxz.a(a(oav, oaw, i, j, 0));
    }

    public final Pair a(oav oav, oaw oaw, int i, long j, long j2) {
        oxz.a(i, a());
        a(i, oav, false, j2);
        if (j == -9223372036854775807L) {
            j = oav.h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        i = oav.f;
        long j3 = oav.j + j;
        long j4 = a(i, oaw, true).c;
        while (j4 != -9223372036854775807L && j3 >= j4 && i < oav.g) {
            j3 -= j4;
            i++;
            j4 = a(i, oaw, true).c;
        }
        return Pair.create(oxz.a(oaw.a), Long.valueOf(j3));
    }

    public oaw a(Object obj, oaw oaw) {
        return a(a(obj), oaw, true);
    }

    public final oaw a(int i, oaw oaw) {
        return a(i, oaw, false);
    }
}

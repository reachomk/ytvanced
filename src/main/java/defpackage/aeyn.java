package defpackage;

/* renamed from: aeyn */
final class aeyn extends oau {
    public final oau[] b;
    private final long[] c;
    private final long[] d;
    private final Object[] e;

    private static boolean a(oau oau) {
        if (oau != null) {
            int a = oau.a();
            if (a != 0) {
                if (a == 1 && oau.b() == 1) {
                    return false;
                }
                int b = oau.b();
                StringBuilder stringBuilder = new StringBuilder(75);
                stringBuilder.append("Child Timeline too complex: windowCount=");
                stringBuilder.append(a);
                stringBuilder.append(" periodCount=");
                stringBuilder.append(b);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return true;
    }

    public final int a() {
        return this.b.length;
    }

    public final oav a(int i, oav oav, boolean z, long j) {
        this.b[i].a(0, oav, z, j);
        oav.f = i;
        oav.g = i;
        j = this.c[i];
        if (j != 0) {
            j = (j * 1000) - oav.j;
            oav.h = j;
            if (j < 0) {
                oav.h = 0;
            } else {
                long j2 = oav.i;
                if (j2 != -9223372036854775807L && j > j2) {
                    oav.h = j2;
                }
            }
        }
        j = this.d[i];
        if (j != -1) {
            j = (j * 1000) - oav.j;
            if (oav.h > j) {
                oav.h = j;
            }
            if (oav.i > j) {
                oav.i = j;
            }
        }
        return oav;
    }

    public final int b() {
        return this.b.length;
    }

    public final oaw a(int i, oaw oaw, boolean z) {
        this.b[i].a(0, oaw, z);
        oaw.b = i;
        if (z) {
            oaw.a = this.e[i];
        }
        long j = this.d[i];
        if (j != -1) {
            oaw.c = j * 1000;
        }
        return oaw;
    }

    public final int a(Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.e;
            if (i >= objArr.length) {
                return -1;
            }
            if (objArr[i] == obj) {
                return i;
            }
            i++;
        }
    }

    public final Object a(int i) {
        return this.e[i];
    }

    /* synthetic */ aeyn(aeym aeym, aeym aeym2) {
        oau oau = aeym.e;
        oau oau2 = aeym2 != null ? aeym2.e : null;
        boolean a = aeyn.a(oau);
        boolean a2 = aeyn.a(oau2);
        if (a) {
            this.b = new oau[0];
            this.c = new long[0];
            this.d = this.c;
            this.e = new Object[0];
        } else if (a2) {
            this.b = new oau[]{oau};
            this.c = new long[]{aeym.b};
            this.d = new long[]{aeym.f};
            this.e = new Object[]{aeym};
        } else {
            this.b = new oau[]{oau, oau2};
            this.c = new long[]{aeym.b, aeym2.b};
            this.d = new long[]{aeym.f, aeym2.f};
            this.e = new Object[]{aeym, aeym2};
        }
    }
}

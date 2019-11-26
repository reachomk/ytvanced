package defpackage;

/* renamed from: bcta */
public final class bcta extends bcpt {
    private static final int e;
    public static final long serialVersionUID = 5472298452022250685L;
    private final bcpt f;
    private final bctd[] g = new bctd[(e + 1)];

    public static bcta a(bcpt bcpt) {
        if (bcpt instanceof bcta) {
            return (bcta) bcpt;
        }
        return new bcta(bcpt);
    }

    private bcta(bcpt bcpt) {
        super(bcpt.d);
        this.f = bcpt;
    }

    public final String a(long j) {
        return i(j).a(j);
    }

    public final int b(long j) {
        return i(j).b(j);
    }

    public final int c(long j) {
        return i(j).c(j);
    }

    public final boolean b() {
        return this.f.b();
    }

    public final long g(long j) {
        return this.f.g(j);
    }

    public final long h(long j) {
        return this.f.h(j);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj instanceof bcta ? this.f.equals(((bcta) obj).f) : false;
        } else {
            return true;
        }
    }

    private final bctd i(long j) {
        int i = (int) (j >> 32);
        bctd[] bctdArr = this.g;
        int i2 = e & i;
        bctd bctd = bctdArr[i2];
        if (bctd != null && ((int) (bctd.a >> 32)) == i) {
            return bctd;
        }
        j &= -4294967296L;
        bctd bctd2 = new bctd(this.f, j);
        long j2 = 4294967295L | j;
        bctd bctd3 = bctd2;
        while (true) {
            long g = this.f.g(j);
            if (g == j || g > j2) {
                bctdArr[i2] = bctd2;
            } else {
                bctd bctd4 = new bctd(this.f, g);
                bctd3.b = bctd4;
                bctd3 = bctd4;
                j = g;
            }
        }
        bctdArr[i2] = bctd2;
        return bctd2;
    }

    static {
        Integer integer;
        int intValue;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer != null) {
            int i = 0;
            for (intValue = integer.intValue() - 1; intValue > 0; intValue >>= 1) {
                i++;
            }
            intValue = 1 << i;
        } else {
            intValue = 512;
        }
        e = intValue - 1;
    }
}

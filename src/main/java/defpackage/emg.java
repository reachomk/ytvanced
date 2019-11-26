package defpackage;

/* renamed from: emg */
public final class emg {
    public static bcua a(zyw zyw, long j) {
        return emg.a(zyw, j, 2);
    }

    public static bcua a(zyw zyw, long j, int i) {
        awde awde = null;
        if (!(zyw == null || zyw.a() == null)) {
            awde = zyw.a().s;
            if (awde == null) {
                awde = awde.s;
            }
        }
        int i2 = 0;
        if (!((j & (awde != null ? awde.k : 0)) == 0 || awde == null)) {
            i2 = awde.l;
        }
        return new emf(i2, i);
    }
}

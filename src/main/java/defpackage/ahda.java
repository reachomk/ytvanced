package defpackage;

/* renamed from: ahda */
public final class ahda {
    public static avnm a(zyw zyw) {
        if (zyw == null || zyw.a() == null) {
            return null;
        }
        avnm avnm = zyw.a().l;
        if (avnm == null) {
            avnm = avnm.q;
        }
        return avnm;
    }

    public static boolean b(zyw zyw) {
        amqp c = amqp.c(ahda.a(zyw));
        return c.a() && ((avnm) c.b()).g;
    }

    public static boolean c(zyw zyw) {
        avnm a = ahda.a(zyw);
        return a != null && a.l;
    }

    public static boolean d(zyw zyw) {
        if (zyw == null || zyw.a() == null || (zyw.a().a & 1073741824) == 0) {
            return false;
        }
        awde awde = zyw.a().s;
        if (awde == null) {
            awde = awde.s;
        }
        return awde.p;
    }

    public static boolean e(zyw zyw) {
        if (zyw == null || zyw.a() == null || (zyw.a().a & 1073741824) == 0) {
            return false;
        }
        awde awde = zyw.a().s;
        if (awde == null) {
            awde = awde.s;
        }
        return awde.q;
    }
}

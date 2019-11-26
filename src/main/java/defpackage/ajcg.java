package defpackage;

/* renamed from: ajcg */
public final class ajcg {
    public static bctz a(bctz bctz, amqd amqd) {
        return bctz.c().c(new ajcj(amqd));
    }

    public static bcua a(zyw zyw, long j) {
        return ajcg.a(zyw, j, 2);
    }

    public static bcua a(zyw zyw, long j, int i) {
        if ((j & aipo.f(zyw)) == 0) {
            return ajci.a;
        }
        int i2;
        awde a = aipo.a(zyw);
        if (a == null) {
            i2 = 0;
        } else {
            i2 = a.f;
        }
        return new ajcl(i2, i);
    }

    public static bcua a() {
        return new ajck();
    }

    public static bcua b(zyw zyw, long j) {
        if ((j & aipo.f(zyw)) == 0) {
            return ajcn.a;
        }
        int i;
        awde a = aipo.a(zyw);
        if (a == null) {
            i = 0;
        } else {
            i = a.m;
        }
        return new ajcm(i);
    }

    public static void b() {
        throw new RuntimeException("Error in Observing class");
    }
}

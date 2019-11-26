package defpackage;

/* renamed from: wvi */
public final class wvi {
    public static azpb a(azpf azpf) {
        if ((azpf.a & 128) == 0) {
            return null;
        }
        azov azov = azpf.j;
        if (azov == null) {
            azov = azov.j;
        }
        azpb azpb = azov.h;
        if (azpb == null) {
            azpb = azpb.f;
        }
        return azpb;
    }

    public static double b(azpf azpf) {
        if ((azpf.a & 32) == 0) {
            return 0.0d;
        }
        azpd azpd = azpf.g;
        if (azpd == null) {
            azpd = azpd.g;
        }
        double d = (double) azpd.d;
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    public static long c(azpf azpf) {
        anxr access$000 = anxl.checkIsLite(azph.c);
        azpf.a(access$000);
        Object b = azpf.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return ((Long) b).longValue();
    }

    public static double d(azpf azpf) {
        double c = (double) wvi.c(azpf);
        Double.isNaN(c);
        return c / 1000000.0d;
    }

    public static void a(azpi azpi, long j) {
        wvi.a(azpi);
        if ((((azpf) azpi.instance).a & 32) != 0) {
            long j2 = azpi.c().d;
            double floor = Math.floor((double) (j / j2));
            anxr anxr = azph.c;
            long j3 = azpi.c().e;
            long j4 = azpi.c().f;
            double d = (double) j2;
            Double.isNaN(d);
            azpi.a(anxr, Long.valueOf(Math.max(j3, Math.min(j4, (long) (floor * d)))));
            azpi.a(azph.b, Boolean.valueOf(true));
        }
    }

    public static void a(azpi azpi) {
        if (!azpi.a(azph.b) || !((Boolean) azpi.b(azph.b)).booleanValue()) {
            azpi.a(azph.b, Boolean.valueOf(true));
            wvi.a(azpi, azpi.c().b);
        }
    }
}

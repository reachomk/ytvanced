package defpackage;

/* renamed from: ose */
public final class ose {
    public static final int a = ozp.f("GA94");

    public static void a(long j, oza oza, ofy[] ofyArr) {
        while (true) {
            int i = 1;
            if (oza.b() > 1) {
                int a = ose.a(oza);
                int a2 = ose.a(oza);
                int i2 = oza.b + a2;
                if (a2 == -1 || a2 > oza.b()) {
                    oyp.a("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i2 = oza.c;
                } else if (a == 4 && a2 >= 8) {
                    a = oza.d();
                    a2 = oza.e();
                    int k = a2 == 49 ? oza.k() : 0;
                    int d = oza.d();
                    if (a2 == 47) {
                        oza.d(1);
                    }
                    a = (a == 181 && ((a2 == 49 || a2 == 47) && d == 3)) ? 1 : 0;
                    if (a2 == 49) {
                        if (k != a) {
                            i = 0;
                        }
                        a &= i;
                    }
                    if (a != 0) {
                        ose.b(j, oza, ofyArr);
                    }
                }
                oza.c(i2);
            } else {
                return;
            }
        }
    }

    public static void b(long j, oza oza, ofy[] ofyArr) {
        int d = oza.d();
        if ((d & 64) != 0) {
            oza.d(1);
            d = (d & 31) * 3;
            int i = oza.b;
            for (ofy ofy : ofyArr) {
                oza.c(i);
                ofy.a(oza, d);
                ofy.a(j, 1, d, 0, null);
            }
        }
    }

    private static int a(oza oza) {
        int i = 0;
        while (oza.b() != 0) {
            int d = oza.d();
            i += d;
            if (d != 255) {
                return i;
            }
        }
        return -1;
    }
}

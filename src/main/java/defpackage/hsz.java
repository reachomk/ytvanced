package defpackage;

/* renamed from: hsz */
public final class hsz {
    public static int a(long j, long j2) {
        if (j == 0 || j2 == 0 || j2 > j) {
            return 0;
        }
        int c = hsz.c(j, j2);
        if (c >= 10) {
            return hsz.a(j, j2, c) ? 100 : c;
        } else {
            return 10;
        }
    }

    private static boolean a(long j, long j2, int i) {
        j2 = j - j2;
        return j >= 600 ? j <= 6000 ? i > 90 : j2 < 600 : j2 < 60 && i >= 10;
    }

    private static int c(long j, long j2) {
        return (int) ((((float) j2) / ((float) j)) * 100.0f);
    }

    public static float b(long j, long j2) {
        if (j == 0 || j2 == 0 || j2 > j || hsz.a(j, j2, hsz.c(j, j2))) {
            return 0.0f;
        }
        return (float) j2;
    }
}

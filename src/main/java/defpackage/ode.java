package defpackage;

/* renamed from: ode */
public final class ode {
    public static final int a = ozp.f("RIFF");
    public static final int b = ozp.f("WAVE");
    public static final int c = ozp.f("fmt ");

    public static int a(int i, int i2) {
        if (i != 1) {
            if (i == 3) {
                return i2 == 32 ? 4 : 0;
            } else {
                if (i != 65534) {
                    if (i != 6) {
                        return i != 7 ? 0 : 268435456;
                    } else {
                        return 536870912;
                    }
                }
            }
        }
        return ozp.b(i2);
    }

    static {
        ozp.f("data");
    }
}

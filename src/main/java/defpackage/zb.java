package defpackage;

/* renamed from: zb */
public final class zb {
    public static final yy a = new ze(null, false);
    public static final yy b = new ze(null, true);
    public static final yy c = new ze(zd.a, false);
    public static final yy d = new ze(zd.a, true);
    public static final yy e = new ze(za.a, false);
    public static final yy f = zh.a;

    static int a(int i) {
        return i != 0 ? (i == 1 || i == 2) ? 0 : 2 : 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }
}

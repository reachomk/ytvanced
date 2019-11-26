package defpackage;

/* renamed from: afhz */
public final class afhz {
    public static boolean a(int i) {
        if (!(i == 1 || i == 2 || i == 3)) {
            switch (i) {
                case 10000:
                case 10001:
                case 10002:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static String b(int i) {
        if (i == 1) {
            return "i";
        }
        if (i == 2) {
            return "m";
        }
        if (i == 3) {
            return "a";
        }
        switch (i) {
            case 10000:
                return "s";
            case 10001:
                return "r";
            case 10002:
                return "v";
            default:
                return null;
        }
    }
}

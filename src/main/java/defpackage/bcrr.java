package defpackage;

/* renamed from: bcrr */
public final class bcrr {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder stringBuilder = new StringBuilder(79);
        stringBuilder.append("The calculation caused an overflow: ");
        stringBuilder.append(j);
        stringBuilder.append(" + ");
        stringBuilder.append(j2);
        throw new ArithmeticException(stringBuilder.toString());
    }

    public static long a(long j, int i) {
        String str = " * ";
        String str2 = "Multiplication overflows a long: ";
        StringBuilder stringBuilder;
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            stringBuilder = new StringBuilder(67);
            stringBuilder.append(str2);
            stringBuilder.append(j);
            stringBuilder.append(str);
            stringBuilder.append(i);
            throw new ArithmeticException(stringBuilder.toString());
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            stringBuilder = new StringBuilder(67);
            stringBuilder.append(str2);
            stringBuilder.append(j);
            stringBuilder.append(str);
            stringBuilder.append(i);
            throw new ArithmeticException(stringBuilder.toString());
        }
    }

    public static int a(long j) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("Value cannot fit in an int: ");
        stringBuilder.append(j);
        throw new ArithmeticException(stringBuilder.toString());
    }

    public static void a(bcpn bcpn, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new bcpy(bcpn.a(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return (obj == null || obj2 == null) ? false : obj.equals(obj2);
    }
}

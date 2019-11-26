package defpackage;

/* renamed from: cph */
public final class cph {
    public zr a = new zr(8);
    public zr b = new zr(8);

    static int a(long j) {
        return (char) ((int) j);
    }

    static int b(long j) {
        return (int) ((j >> 18) & 255);
    }

    public static int c(long j) {
        return j != 0 ? (int) ((j >> 16) & 3) : 3;
    }

    static long a(long j, int i) {
        if (i >= 0 && i <= 65535) {
            return j | ((long) i);
        }
        StringBuilder stringBuilder = new StringBuilder(83);
        stringBuilder.append("Sequence must be non-negative and no greater than 65535 actual sequence ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

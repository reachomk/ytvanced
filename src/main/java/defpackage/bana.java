package defpackage;

/* renamed from: bana */
public final class bana {
    public static int a(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        StringBuilder stringBuilder = new StringBuilder(98);
        stringBuilder.append("A cast to int has gone wrong. Please contact the mp4parser discussion group (");
        stringBuilder.append(j);
        stringBuilder.append(")");
        throw new RuntimeException(stringBuilder.toString());
    }
}

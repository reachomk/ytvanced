package defpackage;

/* renamed from: xru */
public final class xru {
    public static int a(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        String format;
        if (i < 0) {
            format = String.format("index (%s) must not be negative", new Object[]{Integer.valueOf(i)});
        } else if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            format = String.format("index (%s) must not be greater than size (%s)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
        throw new IndexOutOfBoundsException(format);
    }
}

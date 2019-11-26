package defpackage;

/* renamed from: bdhm */
public final class bdhm {
    public static int a(int i) {
        if (i >= 0 && i <= 7) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum AlignItems");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

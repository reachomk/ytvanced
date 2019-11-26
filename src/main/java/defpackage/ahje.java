package defpackage;

/* renamed from: ahje */
public final class ahje {
    public static boolean a(int i, int... iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(int i) {
        return ahje.a(i, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14);
    }
}

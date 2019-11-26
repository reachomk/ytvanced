package defpackage;

import java.util.Arrays;

/* renamed from: vrd */
public abstract class vrd {
    public static final vrd a = vrd.a(0, 0, 0);

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public static vrd a(int i, int i2, int i3) {
        return new vrp(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vrd) {
            vrd vrd = (vrd) obj;
            if (a() == vrd.a() && b() == vrd.b() && c() == vrd.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Integer.valueOf(b()), Integer.valueOf(c())});
    }

    public final String toString() {
        int a = a();
        int b = b();
        int c = c();
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("AdCountMetadata[");
        stringBuilder.append(a);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(b);
        stringBuilder.append(str);
        stringBuilder.append(c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

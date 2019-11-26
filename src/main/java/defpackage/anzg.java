package defpackage;

/* renamed from: anzg */
public final class anzg {
    public static int a(anxp anxp) {
        aoae aoae = anxp.h.a;
        int b = aoae.b();
        int i = 0;
        if (b == 1) {
            return ((anxs) aoae.b(0).getKey()).b;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected only one extension, saw ");
        stringBuilder.append(b);
        if (b != 0) {
            stringBuilder.append(": ");
            int b2 = aoae.b() < 3 ? aoae.b() : 3;
            while (i < b2) {
                if (i > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(((anxs) aoae.b(i).getKey()).b);
                i++;
            }
            if (b > 3) {
                stringBuilder.append("...");
            }
        }
        throw new IllegalStateException(stringBuilder.toString());
    }
}

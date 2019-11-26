package defpackage;

/* renamed from: aifa */
public final class aifa {
    public static final Class[] a(aife aife, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkc.class};
        } else if (i == 0) {
            aife.c();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

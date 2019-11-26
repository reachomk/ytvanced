package defpackage;

/* renamed from: ahlz */
public final class ahlz {
    public static final Class[] a(ahkw ahkw, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkf.class, ahkn.class};
        } else if (i == 0) {
            ahkw.a((ahjn) obj);
            return null;
        } else if (i == 1) {
            ahkw.a((ahkf) obj);
            return null;
        } else if (i == 2) {
            ahkw.a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

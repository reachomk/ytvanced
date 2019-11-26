package defpackage;

/* renamed from: uqo */
public final class uqo {
    public static final Class[] a(uqt uqt, Object obj, int i) {
        if (i == -1) {
            return new Class[]{uyx.class, uyw.class, afqf.class};
        } else if (i == 0) {
            uqt.a((uyx) obj);
            return null;
        } else if (i == 1) {
            uqt.a((uyw) obj);
            return null;
        } else if (i == 2) {
            uqt.a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

package defpackage;

/* renamed from: xwu */
public final class xwu {
    public static final Class[] a(xxp xxp, Object obj, int i) {
        if (i == -1) {
            return new Class[]{zyg.class};
        } else if (i == 0) {
            xxp.a((zyg) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

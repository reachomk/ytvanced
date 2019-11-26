package defpackage;

/* renamed from: jua */
final class jua {
    static final Class[] a(juv juv, Object obj, int i) {
        if (i == -1) {
            return new Class[]{gzx.class};
        } else if (i == 0) {
            juv.a((gzx) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

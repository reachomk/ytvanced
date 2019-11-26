package defpackage;

/* renamed from: zp */
public final class zp {
    public static void a(Object obj, StringBuilder stringBuilder) {
        if (obj != null) {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0) {
                simpleName = obj.getClass().getName();
                int lastIndexOf = simpleName.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
            }
            stringBuilder.append(simpleName);
            stringBuilder.append('{');
            stringBuilder.append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
        stringBuilder.append("null");
    }
}

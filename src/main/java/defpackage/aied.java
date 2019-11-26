package defpackage;

/* renamed from: aied */
public final class aied {
    public static String a(aahr aahr) {
        if (aahr == null) {
            return "N/A";
        }
        StringBuilder stringBuilder = new StringBuilder(aahr.e);
        stringBuilder.append(' ');
        stringBuilder.append(aahr.e());
        if (aahr.E()) {
            stringBuilder.append(' ');
            stringBuilder.append(aahr.f());
            stringBuilder.append('x');
            stringBuilder.append(aahr.g());
            int i = aahr.i();
            if (i > 0) {
                stringBuilder.append('@');
                stringBuilder.append(i);
            }
        }
        if (aahr.x()) {
            stringBuilder.append(" [acc]");
        }
        return stringBuilder.toString();
    }
}

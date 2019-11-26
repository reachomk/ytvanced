package defpackage;

/* renamed from: amyc */
public abstract class amyc {
    public static final amyc a = new amyb();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LogSite{ class=");
        stringBuilder.append(a());
        stringBuilder.append(", method=");
        stringBuilder.append(b());
        stringBuilder.append(", line=");
        stringBuilder.append(c());
        if (d() != null) {
            stringBuilder.append(", file=");
            stringBuilder.append(d());
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    @Deprecated
    public static amyc a(String str, String str2, int i, String str3) {
        return new amye(str, str2, i, str3);
    }
}

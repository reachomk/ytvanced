package defpackage;

/* renamed from: acxf */
public class acxf {
    public azfa a;

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder((simpleName.length() + 2) + valueOf.length());
        stringBuilder.append(simpleName);
        stringBuilder.append(": ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    @Deprecated
    public static acxf a(azfa azfa) {
        return new acxc(azfa);
    }
}

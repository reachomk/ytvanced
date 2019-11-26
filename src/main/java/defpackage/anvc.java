package defpackage;

/* renamed from: anvc */
final class anvc {
    public final String a;
    public final boolean b;

    public anvc(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 9);
        stringBuilder.append("{");
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

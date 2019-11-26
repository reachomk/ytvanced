package defpackage;

/* renamed from: pcy */
public final class pcy {
    public final String a;
    public final boolean b;

    public pcy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
        stringBuilder.append("{");
        stringBuilder.append(str);
        stringBuilder.append("}");
        stringBuilder.append(z);
        return stringBuilder.toString();
    }
}

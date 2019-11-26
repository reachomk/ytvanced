package defpackage;

/* renamed from: ciw */
public final class ciw {
    public int a;
    public final int b;

    public ciw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("Entry{count=");
        stringBuilder.append(i);
        stringBuilder.append(", offset=");
        stringBuilder.append(i2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

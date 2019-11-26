package defpackage;

/* renamed from: alxs */
public final class alxs {
    public final String a;
    public final int b;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            stringBuilder.append("pcen:");
            stringBuilder.append(this.a);
        }
        if (this.b != 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append("tag:");
            int i = this.b;
            int i2 = i - 1;
            if (i != 0) {
                stringBuilder.append(i2);
            } else {
                throw null;
            }
        }
        return stringBuilder.toString();
    }

    public alxs(String str, int i) {
        this.a = str;
        this.b = i;
    }
}

package defpackage;

/* renamed from: afjs */
public final class afjs {
    public static final afjs a = new afjs(-1, -1);
    public final int b;
    public final int c;

    public afjs(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof afjs) {
            afjs afjs = (afjs) obj;
            return this.b == afjs.b && this.c == afjs.c;
        }
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}

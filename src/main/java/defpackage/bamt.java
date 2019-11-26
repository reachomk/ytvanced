package defpackage;

/* renamed from: bamt */
public final class bamt {
    public final int a;
    public final short b;

    public bamt(int i, short s) {
        this.a = i;
        this.b = s;
    }

    public final String toString() {
        int i = this.a;
        short s = this.b;
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("{availableBitrate=");
        stringBuilder.append(i);
        stringBuilder.append(", targetRateShare=");
        stringBuilder.append(s);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bamt bamt = (bamt) obj;
            return this.a == bamt.a && this.b == bamt.b;
        }
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}

package defpackage;

/* renamed from: afin */
public final class afin {
    public final int a;
    public final int b;
    public final long c;

    public afin(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afin) {
            afin afin = (afin) obj;
            if (afin.a == this.a && afin.b == this.b && afin.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        StringBuilder stringBuilder = new StringBuilder(66);
        stringBuilder.append("RawBandwidthSample(");
        stringBuilder.append(i);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(i2);
        stringBuilder.append(str);
        stringBuilder.append(j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

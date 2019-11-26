package defpackage;

/* renamed from: bamx */
public final class bamx {
    public long a;
    public final int b;

    public bamx(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        StringBuilder stringBuilder = new StringBuilder(74);
        stringBuilder.append("Entry{sampleCount=");
        stringBuilder.append(j);
        stringBuilder.append(", groupDescriptionIndex=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bamx bamx = (bamx) obj;
            return this.b == bamx.b && this.a == bamx.a;
        }
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b;
    }
}

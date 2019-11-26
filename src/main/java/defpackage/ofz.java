package defpackage;

/* renamed from: ofz */
public final class ofz {
    public static final ofz a = new ofz(0, 0);
    public final long b;
    public final long c;

    public ofz(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("[timeUs=");
        stringBuilder.append(j);
        stringBuilder.append(", position=");
        stringBuilder.append(j2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ofz ofz = (ofz) obj;
            return this.b == ofz.b && this.c == ofz.c;
        }
    }

    public final int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }
}

package defpackage;

/* renamed from: ckd */
public final class ckd {
    public long a;
    public final long b;

    public ckd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(61);
        stringBuilder.append("Entry{count=");
        stringBuilder.append(j);
        stringBuilder.append(", delta=");
        stringBuilder.append(j2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

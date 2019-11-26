package defpackage;

/* renamed from: cjz */
public final class cjz {
    public long a;
    public int b;
    public int c;
    public long d;

    public final String toString() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        long j2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(137);
        stringBuilder.append("SubsampleEntry{subsampleSize=");
        stringBuilder.append(j);
        stringBuilder.append(", subsamplePriority=");
        stringBuilder.append(i);
        stringBuilder.append(", discardable=");
        stringBuilder.append(i2);
        stringBuilder.append(", reserved=");
        stringBuilder.append(j2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

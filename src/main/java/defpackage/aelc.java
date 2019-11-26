package defpackage;

/* renamed from: aelc */
final class aelc {
    public final int a;
    public final long b;
    public final StringBuilder c = new StringBuilder();
    public long d = -1;
    public long e = -1;
    public long f;
    public long g;
    public aequ h = aequ.a;
    public long i = -1;
    public long j = -1;
    public String k;

    aelc(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.d;
        long j3 = this.f;
        long j4 = this.g;
        aequ aequ = this.h;
        long j5 = aequ.b;
        int i2 = aequ.c;
        long j6 = this.i;
        long j7 = this.j;
        long j8 = j6;
        String str = this.k;
        long j9 = j7;
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 391) + valueOf.length());
        stringBuilder.append("RequestInfo requestNumber=");
        stringBuilder.append(i);
        stringBuilder.append(" startTimeMs=");
        stringBuilder.append(j);
        stringBuilder.append(" resolvedLengthBytes=");
        stringBuilder.append(j2);
        stringBuilder.append(" lastRecordedTime=");
        stringBuilder.append(j3);
        stringBuilder.append(" lastRecordedDataKB=");
        stringBuilder.append(j3);
        stringBuilder.append(" accumulatedBytes=");
        stringBuilder.append(j4);
        stringBuilder.append(" startBandwidthEstimateWithSource=(");
        stringBuilder.append(j5);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(") durationMs=");
        stringBuilder.append(j8);
        stringBuilder.append(" connectTimeMs=");
        stringBuilder.append(j9);
        stringBuilder.append(" errorCode=");
        stringBuilder.append(str);
        stringBuilder.append(" encodedReadData=");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}

package defpackage;

/* renamed from: aezf */
final class aezf extends aett {
    public final String a;
    public volatile long g;

    aezf(String str, String str2, String str3, long j, long j2, String str4) {
        String str5 = str3;
        int i = 0;
        if (!("event_start".equalsIgnoreCase(str3) || "event_predict_start".equalsIgnoreCase(str3))) {
            i = !"event_stop".equalsIgnoreCase(str3) ? !"event_continue".equalsIgnoreCase(str3) ? -1 : 1 : 2;
        }
        super(str, i, j, j2, str4);
        this.a = str2;
        this.g = -9223372036854775807L;
    }

    public final long a() {
        long b = afan.b(this.g, this.d);
        return b == -9223372036854775807L ? -1 : b;
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        int i = this.c;
        long a = a();
        long j = this.e;
        long j2 = this.g;
        long j3 = this.d;
        String str3 = this.f;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 195) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("CuePoint identifier=");
        stringBuilder.append(str);
        stringBuilder.append(", type=");
        stringBuilder.append(str2);
        stringBuilder.append(", event=");
        stringBuilder.append(i);
        stringBuilder.append(", breakStartTimeMs=");
        stringBuilder.append(a);
        stringBuilder.append(", durationMs=");
        stringBuilder.append(j);
        stringBuilder.append(", cueTimeMs=");
        stringBuilder.append(j2);
        stringBuilder.append(", timeOffsetMs=");
        stringBuilder.append(j3);
        stringBuilder.append(", context=");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }
}

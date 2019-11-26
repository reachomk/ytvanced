package defpackage;

/* renamed from: aepa */
public abstract class aepa {
    public abstract long a();

    public abstract long b();

    public static aepa a(long j, long j2) {
        if (j2 < j) {
            afpc.a(1, afpf.onesie, "end_timestamp_less_than_start_timestamp");
            j2 = j;
        }
        return new aeou(j, j2);
    }
}

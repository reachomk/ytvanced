package defpackage;

/* renamed from: aepb */
public abstract class aepb {
    public abstract long a();

    public abstract long b();

    public static aepb a(long j, long j2) {
        if (j > j2) {
            afpc.a(1, afpf.onesie, "start_byte_greater_than_end_byte");
        }
        return new aeot(j, j2);
    }

    public final boolean a(long j) {
        return a() <= j && b() > j;
    }
}

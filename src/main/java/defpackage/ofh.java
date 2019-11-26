package defpackage;

/* renamed from: ofh */
public final class ofh {
    public static final ofh a = new ofh(-3, -9223372036854775807L, -1);
    public final int b;
    public final long c;
    public final long d;

    private ofh(int i, long j, long j2) {
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public static ofh a(long j, long j2) {
        return new ofh(-1, j, j2);
    }

    public static ofh b(long j, long j2) {
        return new ofh(-2, j, j2);
    }

    public static ofh a(long j) {
        return new ofh(0, -9223372036854775807L, j);
    }
}

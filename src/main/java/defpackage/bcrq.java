package defpackage;

/* renamed from: bcrq */
public abstract class bcrq extends bcrk {
    public final long a;
    private final bcpx c;

    public bcrq(bcpm bcpm, long j) {
        super(bcpm);
        this.a = j;
        this.c = new bcrt(this, bcpm.a());
    }

    public abstract long a(long j, long j2);

    public final bcpx d() {
        return this.c;
    }
}

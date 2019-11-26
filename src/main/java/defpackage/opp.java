package defpackage;

/* renamed from: opp */
final class opp {
    public final long a;
    public final long b;
    public boolean c;
    public out d;
    public opp e;

    public opp(long j, int i) {
        this.a = j;
        this.b = j + ((long) i);
    }

    public final int a(long j) {
        return (int) (j - this.a);
    }

    public final opp a() {
        this.d = null;
        opp opp = this.e;
        this.e = null;
        return opp;
    }
}

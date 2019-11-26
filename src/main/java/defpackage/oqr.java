package defpackage;

/* renamed from: oqr */
public abstract class oqr extends oqh {
    public final long m;

    public oqr(ovi ovi, ovm ovm, nzw nzw, int i, Object obj, long j, long j2, long j3) {
        super(ovi, ovm, 1, nzw, i, obj, j, j2);
        oxz.a((Object) nzw);
        this.m = j3;
    }

    public abstract boolean e();

    public long d() {
        long j = this.m;
        return j != -1 ? j + 1 : -1;
    }
}

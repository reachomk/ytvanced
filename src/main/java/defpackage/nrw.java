package defpackage;

/* renamed from: nrw */
abstract class nrw {
    public final nrs a;
    public long b = -1;

    protected nrw(nrs nrs) {
        this.a = nrs;
    }

    public abstract void a(nwz nwz, long j);

    public abstract boolean a(nwz nwz);

    public final void b(nwz nwz, long j) {
        if (a(nwz)) {
            a(nwz, j);
        }
    }
}

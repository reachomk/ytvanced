package defpackage;

/* renamed from: nwm */
public final class nwm implements nrq {
    private final /* synthetic */ long a;
    private final /* synthetic */ long b;
    private final /* synthetic */ nwj c;

    public nwm(nwj nwj, long j, long j2) {
        this.c = nwj;
        this.a = j;
        this.b = j2;
    }

    public final boolean a() {
        return true;
    }

    public final long b(long j) {
        return this.b + this.c.b[nxf.a(this.c.a, (j * this.a) / 1000000, true)];
    }
}

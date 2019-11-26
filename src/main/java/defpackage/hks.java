package defpackage;

/* renamed from: hks */
public final class hks {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    private hks(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
    }

    public static hks a(agqy agqy) {
        boolean z = agqy == null || agqy.i();
        boolean z2 = agqy != null && agqy.u() == agqs.PLAYABLE;
        boolean z3 = (agqy == null || agqy.i() || (!agqy.p() && !agqy.k() && agqy.l())) ? false : true;
        boolean z4 = agqy != null && agqy.m();
        return new hks(z, z2, z3, z4, agqy != null ? agqy.q() : 0);
    }

    public static hks a(agqj agqj) {
        boolean z = agqj == null;
        boolean z2 = agqj != null && agqj.e();
        return new hks(z, z2, true, true, agqj != null ? agqj.f() : 0);
    }

    public static hks a(agqx agqx) {
        return hks.a((agqj) agqx);
    }
}

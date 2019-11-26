package defpackage;

/* renamed from: bbgz */
final class bbgz implements bbci {
    private final /* synthetic */ bauw a;
    private final /* synthetic */ bbha b;

    bbgz(bbha bbha, bauw bauw) {
        this.b = bbha;
        this.a = bauw;
    }

    public final bbcf a() {
        if (!this.b.e) {
            return bbcf.d;
        }
        bbcf b = this.b.b(this.a);
        boolean z = true;
        if (!(b.equals(bbcf.d) || this.b.a(this.a).equals(bbgr.f))) {
            z = false;
        }
        amrw.a(z, "Can not apply both retry and hedging policy for the method '%s'", this.a);
        return b;
    }
}

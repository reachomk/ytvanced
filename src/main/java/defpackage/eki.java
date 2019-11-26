package defpackage;

/* renamed from: eki */
public final class eki {
    public final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public eki(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.b = bcaa;
        this.a = bcaa2;
        this.c = bcaa3;
    }

    public final boolean a() {
        return ((ekh) this.c.get()).g();
    }

    public final boolean b() {
        return ((ahdm) this.b.get()).b() ? ((agwc) this.a.get()).b().k().a().isEmpty() ^ 1 : false;
    }

    public final boolean c() {
        return ((ahdm) this.b.get()).b() ? ((agwc) this.a.get()).b().k().c().isEmpty() ^ 1 : false;
    }

    public final boolean d() {
        return ((ahdm) this.b.get()).b() ? ((agwc) this.a.get()).b().n().a().isEmpty() ^ 1 : false;
    }

    public final boolean a(String str) {
        return d() && ((agwc) this.a.get()).b().n().a(str) != null;
    }

    public final boolean e() {
        return ((ahdm) this.b.get()).b() ? ((agwc) this.a.get()).b().o().a().isEmpty() ^ 1 : false;
    }

    public final boolean f() {
        return ((ahdm) this.b.get()).b() && !((agwc) this.a.get()).b().o().e(agqr.a(avmy.OFFLINE_CANDIDATE_TYPE_MAIN_DOWNLOAD_RECOMMENDATIONS)).isEmpty();
    }

    public final boolean g() {
        return e() && f() && !((e() && ((agwc) this.a.get()).b().o().a().size() > ((agwc) this.a.get()).b().o().b().size()) || c() || d());
    }
}

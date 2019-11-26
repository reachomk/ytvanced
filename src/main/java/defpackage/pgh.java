package defpackage;

/* renamed from: pgh */
final class pgh extends pex {
    private final /* synthetic */ pgi d;

    pgh(pgi pgi, pgd pgd) {
        this.d = pgi;
        super(pgd);
    }

    public final void a() {
        pgi pgi = this.d;
        pgv.a();
        if (pgi.b()) {
            pgi.a("Inactivity, disconnecting from device AnalyticsService");
            pgi.d();
        }
    }
}

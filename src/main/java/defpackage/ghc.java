package defpackage;

/* renamed from: ghc */
final /* synthetic */ class ghc implements zkv {
    private final ghd a;

    ghc(ghd ghd) {
        this.a = ghd;
    }

    public final void a(zme zme) {
        ghd ghd = this.a;
        if (!ghd.e.isFinishing() && !ghd.e.isDestroyed()) {
            bacy a = ghd.a(zme);
            zki.a(a, zme);
            ghd.g.a((bacz) ((anxl) a.build()));
        }
    }
}

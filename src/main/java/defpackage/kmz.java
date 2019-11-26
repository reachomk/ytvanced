package defpackage;

/* renamed from: kmz */
final /* synthetic */ class kmz implements ete {
    private final kmw a;
    private final aphv b;

    kmz(kmw kmw, aphv aphv) {
        this.a = kmw;
        this.b = aphv;
    }

    public final void a() {
        kmw kmw = this.a;
        aphv aphv = this.b;
        ham ham = kmw.c.n;
        aphy aphy = (aphy) ((anxo) aphv.toBuilder());
        aphy.a(false);
        aphv = (aphv) ((anxl) aphy.build());
        if ((ham.a().a & 536870912) != 0) {
            anxl anxl = ham.a().F;
            if (anxl == null) {
                anxl = azdp.c;
            }
            azds azds = (azds) ((anxo) anxl.toBuilder());
            azds.a(aphv);
            azdp azdp = (azdp) ((anxl) azds.build());
            azdw azdw = (azdw) ((anxo) ham.a().toBuilder());
            azdw.copyOnWrite();
            azdt azdt = (azdt) azdw.instance;
            if (azdp != null) {
                azdt.F = azdp;
                azdt.a |= 536870912;
                ham.a((azdt) ((anxl) azdw.build()));
            } else {
                throw new NullPointerException();
            }
        }
        kmw.b.c();
    }
}

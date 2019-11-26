package defpackage;

/* renamed from: kmy */
final /* synthetic */ class kmy implements ete {
    private final kmw a;
    private final aphv b;

    kmy(kmw kmw, aphv aphv) {
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
        if ((ham.a().a & 268435456) != 0) {
            anxl anxl = ham.a().E;
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
                azdt.E = azdp;
                azdt.a |= 268435456;
                ham.a((azdt) ((anxl) azdw.build()));
            } else {
                throw new NullPointerException();
            }
        }
        kmw.a.c();
    }
}

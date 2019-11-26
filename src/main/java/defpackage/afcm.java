package defpackage;

/* renamed from: afcm */
final class afcm implements Runnable {
    private final /* synthetic */ afcn a;

    afcm(afcn afcn) {
        this.a = afcn;
    }

    public final void run() {
        afbo afbo = this.a.b;
        afdb afdb = afbo.t;
        afbo.t = null;
        if (afdb != null || this.a.b.s != null) {
            afbo = this.a.b;
            if (!afbo.z) {
                afkh afkh = afbo.p;
                if (afkh != null && !afkh.n()) {
                    this.a.b.a(true);
                    afbo = this.a.b;
                    afbo.a(new afif("surfaceunavailable", afbo.o(), this.a.a));
                }
            }
        }
    }
}

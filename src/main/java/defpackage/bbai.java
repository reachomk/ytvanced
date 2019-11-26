package defpackage;

/* renamed from: bbai */
final class bbai extends bbah {
    public final batz b;
    public final basr c = basr.a();
    private final /* synthetic */ bbac d;

    public final void b(bavx bavx) {
        super.b(bavx);
        synchronized (this.d.a) {
            bbac bbac = this.d;
            if (bbac.e != null) {
                boolean remove = bbac.g.remove(this);
                if (!this.d.a()) {
                    if (remove) {
                        bbac = this.d;
                        bbac.b.a(bbac.d);
                        bbac = this.d;
                        if (bbac.h != null) {
                            bbac.b.a(bbac.e);
                            this.d.e = null;
                        }
                    }
                }
            }
        }
        this.d.b.a();
    }

    /* synthetic */ bbai(bbac bbac, batz batz) {
        this.d = bbac;
        this.b = batz;
    }
}

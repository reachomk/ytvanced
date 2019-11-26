package defpackage;

/* renamed from: pqw */
final class pqw extends pjl {
    private final /* synthetic */ String a;
    private final /* synthetic */ pjr h;

    pqw(ptd ptd, String str, pjr pjr) {
        this.a = str;
        this.h = pjr;
        super(ptd);
    }

    public final void a(ppa ppa) {
        try {
            String str = this.a;
            pjr pjr = this.h;
            ppa.a((ptu) this);
            ppn ppn = (ppn) ppa.v();
            if (ppa.h()) {
                ppn.a(str, pjr);
            } else {
                ppa.a(2016);
            }
        } catch (IllegalStateException unused) {
            b();
        }
    }
}

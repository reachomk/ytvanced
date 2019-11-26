package defpackage;

/* renamed from: pqz */
final class pqz extends pjl {
    private final /* synthetic */ String a;
    private final /* synthetic */ String h;

    pqz(ptd ptd, String str, String str2) {
        this.a = str;
        this.h = str2;
        super(ptd);
    }

    public final void a(ppa ppa) {
        try {
            String str = this.a;
            String str2 = this.h;
            ppa.a((ptu) this);
            pjo pjo = new pjo();
            ppn ppn = (ppn) ppa.v();
            if (ppa.h()) {
                ppn.a(str, str2, pjo);
            } else {
                ppa.a(2016);
            }
        } catch (IllegalStateException unused) {
            b();
        }
    }
}

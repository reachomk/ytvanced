package defpackage;

/* renamed from: uyj */
final class uyj implements Runnable {
    private final /* synthetic */ ust a;
    private final /* synthetic */ aanv b;
    private final /* synthetic */ apxu c;
    private final /* synthetic */ uyh d;

    uyj(uyh uyh, ust ust, aanv aanv, apxu apxu) {
        this.d = uyh;
        this.a = ust;
        this.b = aanv;
        this.c = apxu;
    }

    public final void run() {
        afpt c;
        uyh uyh = this.d;
        ust ust = this.a;
        uue uue = new uue(ust.b(), this.b);
        apxu apxu = this.c;
        utv utv = (utv) uyh.b.get();
        boolean z = true;
        if (utv.a()) {
            c = utv.c();
            uyh.a("Signed in as new account", false, true);
        } else {
            c = null;
            z = false;
        }
        utv.a(ust);
        ((uud) uyh.c.get()).a(uue);
        uyh.a(uyz.FINISHED, apxu);
        uyh.f.c(new afqf(ust));
        uyh.f.c(new uug());
        uyh.d.execute(new uyi(uyh));
        boolean z2 = uyh.a;
        aoef aoef;
        asmz asmz;
        asmz asmz2;
        if (z2 && !z) {
            aoef = (aoef) aoec.e.createBuilder();
            aoef.a(2);
            aoxs a = abhm.a(uyh.g);
            if (a != null) {
                aoef.a(a);
            }
            asmz = (asmz) asmw.f.createBuilder();
            asmz.a(aoef);
            uyh.e.a((asmw) ((anxl) asmz.build()), uyh.a());
            aoeh aoeh = (aoeh) aoee.d.createBuilder();
            aoeh.a(2);
            asmz2 = (asmz) asmw.f.createBuilder();
            asmz2.a((aoee) ((anxl) aoeh.build()));
            uyh.e.a((asmw) ((anxl) asmz2.build()), afpt.g);
        } else if (z2 && z && c != null) {
            aoef = (aoef) aoec.e.createBuilder();
            aoef.a(5);
            asmz = (asmz) asmw.f.createBuilder();
            asmz.a((aoec) ((anxl) aoef.build()));
            uyh.e.a((asmw) ((anxl) asmz.build()), c);
            aoef = (aoef) aoec.e.createBuilder();
            aoef.a(5);
            asmz2 = (asmz) asmw.f.createBuilder();
            asmz2.a((aoec) ((anxl) aoef.build()));
            afpu afpu = (afpu) uyh.b.get();
            uyh.e.b((asmw) ((anxl) asmz2.build()), afpu.c(), uyh.a(), new afot(afpu.h(), afpu.g()));
        }
    }
}

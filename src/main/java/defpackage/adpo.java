package defpackage;

/* renamed from: adpo */
final /* synthetic */ class adpo implements bcvk {
    private final adpl a;

    adpo(adpl adpl) {
        this.a = adpl;
    }

    public final void a(Object obj) {
        adpl adpl = this.a;
        ahkf ahkf = (ahkf) obj;
        adit s = adpl.a.k.s();
        aafv aafv = ahkf.c;
        boolean z = false;
        if (!(aafv == null || aafv.h == null)) {
            z = true;
        }
        s.d(z);
        String str = null;
        if (z) {
            String str2 = ahkf.c.h.e;
            if (str2 != null) {
                str = str2;
            }
        }
        s.b(str);
        s.a(adpl.a.i.a());
        adpl.a.l.e_(s.a());
    }
}

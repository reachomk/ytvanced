package defpackage;

/* renamed from: ahia */
final /* synthetic */ class ahia implements bcvk {
    private final ahhu a;

    ahia(ahhu ahhu) {
        this.a = ahhu;
    }

    public final void a(Object obj) {
        ahhu ahhu = this.a;
        aetv aetv = (aetv) obj;
        aahr aahr = aetv.b;
        if (aahr == null) {
            aahr = aetv.c;
        }
        if (aahr != null && ahhu.b.get() != null) {
            acxt acxt = (acxt) ahhu.b.get();
            atyl atyl = (atyl) atyi.l.createBuilder();
            atyn atyn = (atyn) atyk.i.createBuilder();
            atyn.a(aahr.b());
            atyl.a(atyn);
            acxt.a((atyi) ((anxl) atyl.build()));
        }
    }
}

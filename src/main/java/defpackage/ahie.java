package defpackage;

/* renamed from: ahie */
final /* synthetic */ class ahie implements bcvk {
    private final ahhu a;

    ahie(ahhu ahhu) {
        this.a = ahhu;
    }

    public final void a(Object obj) {
        ahhu ahhu = this.a;
        ahjq ahjq = (ahjq) obj;
        int b = (int) ahhu.a.b();
        if (ahhu.b.get() != null) {
            ahhu.a(ahjq);
            if (b > 0) {
                acxt acxt = (acxt) ahhu.b.get();
                atyl atyl = (atyl) atyi.l.createBuilder();
                atyn atyn = (atyn) atyk.i.createBuilder();
                atyn.copyOnWrite();
                atyk atyk = (atyk) atyn.instance;
                atyk.a |= 64;
                atyk.d = b;
                atyl.a(atyn);
                acxt.a((atyi) ((anxl) atyl.build()));
            }
            ahhu.b();
        }
    }
}

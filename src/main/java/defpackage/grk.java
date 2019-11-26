package defpackage;

/* renamed from: grk */
final /* synthetic */ class grk implements grv {
    private final grl a;

    grk(grl grl) {
        this.a = grl;
    }

    public final void a(aywd aywd, int i) {
        grl grl = this.a;
        grl.b.a(aywd);
        aywa a = grl.a(4);
        aywb aywb = (aywb) ayvz.c.createBuilder();
        aywb.copyOnWrite();
        ayvz ayvz = (ayvz) aywb.instance;
        ayvz.a |= 1;
        ayvz.b = i;
        a.copyOnWrite();
        ayvx ayvx = (ayvx) a.instance;
        ayvx.c = (anxl) aywb.build();
        ayvx.b = 3;
        grl.a((ayvx) ((anxl) a.build()));
    }
}

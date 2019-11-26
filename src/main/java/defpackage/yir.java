package defpackage;

/* renamed from: yir */
public final class yir {
    public final aadw a;
    public final yic b;

    public yir(aadw aadw, yic yic) {
        this.a = aadw;
        this.b = yic;
    }

    public final bbnc a(String str, bbmo bbmo, boolean z, yjd yjd) {
        bbmi bJ_;
        bbme a = this.a.b(str).a(bbme.a(new yiu(this, str)).a(new yit(this))).b(bbod.f).b(yiv.a).a(ampo.a);
        bbnv yiy = new yiy(this, str, z, yjd, bbmo);
        if (a instanceof bbpa) {
            bJ_ = ((bbpa) a).bJ_();
        } else {
            bJ_ = new bbsn(a);
        }
        bJ_ = bJ_.a(yiy);
        bbmo.getClass();
        bbnw yix = new yix(bbmo);
        bbmo.getClass();
        bbnw yja = new yja(bbmo);
        bbmo.getClass();
        bbnp yiz = new yiz(bbmo);
        bbmo.getClass();
        return bJ_.a(yix, yja, yiz, new yjc(bbmo));
    }
}

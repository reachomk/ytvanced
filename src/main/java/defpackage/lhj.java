package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: lhj */
final class lhj {
    public final lho a;
    public final bbzp b = bbzp.b();
    private final bbzt c = bbzt.b();

    lhj(enl enl, lho lho) {
        this.a = lho;
        ffs ffs = new ffs("PBPW");
        lhm lhm = new lhm();
        lhh lhh = (lhh) lho;
        Object a = lhh.a.a(lhh.a(), alux.a(lft.e));
        anjf.a(a, lhm, lhh.b);
        Object a2 = this.c.a(TimeUnit.MILLISECONDS).a(bbmt.a()).c(new lhi(this)).a(new lhl(this));
        bbow.a(a, "future is null");
        bbup bbup = new bbup(a);
        a = lft.e;
        bbow.a(a, "item is null");
        Object c = bbup.d(bbod.a(a)).a(bbzi.c).c(new lhk(enl));
        bbow.a(c, "other is null");
        bbow.a(a2, "source1 is null");
        bbow.a(c, "source2 is null");
        bbmi.a(a2, c).a(bbod.a, 2).b(this.b);
    }

    /* Access modifiers changed, original: final */
    public final void a(aikc aikc) {
        this.c.b_(aikc);
    }
}

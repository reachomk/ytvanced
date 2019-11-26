package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: spt */
final class spt extends cma {
    @cue(a = 13)
    public swf a;
    @cue(a = 13)
    public sxd b;
    @cue(a = 13)
    public bdhu c;
    @cue(a = 13)
    public syl d;
    @cue(a = 14)
    private final spv e = new spv();

    private spt() {
        super("TextComponent");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        cri cri2 = new cri();
        cri cri3 = new cri();
        cri cri4 = new cri();
        sqd.a(cmg, this.c, this.a, this.d, this.b, cri, cri2, cri3, cri4);
        spv spv = this.e;
        spv.c = (AtomicReference) cri.a;
        spv.d = (AtomicReference) cri2.a;
        spv.a = (AtomicReference) cri3.a;
        spv.b = (AtomicReference) cri4.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        bdhu bdhu = this.c;
        swf swf = this.a;
        syl syl = this.d;
        sxd sxd = this.b;
        spv spv = this.e;
        return sqd.a(cmg, bdhu, swf, syl, sxd, spv.c, spv.d, spv.a, spv.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        spv spv = (spv) crh;
        spv spv2 = (spv) crh2;
        spv2.a = spv.a;
        spv2.b = spv.b;
        spv2.c = spv.c;
        spv2.d = spv.d;
    }

    public static spw a(cmg cmg) {
        spw spw = new spw();
        spw.a(spw, cmg, new spt());
        return spw;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: spy */
final class spy extends cma {
    @cue(a = 13)
    public swf a;
    @cue(a = 13)
    public sxd b;
    @cue(a = 13)
    public bapq c;
    @cue(a = 13)
    public syl d;
    @cue(a = 14)
    private final sqa e = new sqa();

    private spy() {
        super("TextComponentFlat");
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
        spz.a(cmg, this.c, this.a, this.d, this.b, cri, cri2, cri3, cri4);
        sqa sqa = this.e;
        sqa.c = (AtomicReference) cri.a;
        sqa.d = (AtomicReference) cri2.a;
        sqa.a = (AtomicReference) cri3.a;
        sqa.b = (AtomicReference) cri4.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        bapq bapq = this.c;
        swf swf = this.a;
        syl syl = this.d;
        sxd sxd = this.b;
        sqa sqa = this.e;
        return spz.a(cmg, bapq, swf, syl, sxd, sqa.c, sqa.d, sqa.a, sqa.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        sqa sqa = (sqa) crh;
        sqa sqa2 = (sqa) crh2;
        sqa2.a = sqa.a;
        sqa2.b = sqa.b;
        sqa2.c = sqa.c;
        sqa2.d = sqa.d;
    }

    public static spx a(cmg cmg) {
        spx spx = new spx();
        spx.a(spx, cmg, new spy());
        return spx;
    }
}

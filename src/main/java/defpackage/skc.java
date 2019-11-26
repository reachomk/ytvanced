package defpackage;

/* renamed from: skc */
final class skc extends cma {
    @cue(a = 13)
    public bbmz a;
    @cue(a = 13)
    public swp b;
    @cue(a = 10)
    public cma c;
    @cue(a = 13)
    public swz d;
    @cue(a = 13)
    public syb e;

    public skc() {
        super("ElementsRootFlat");
    }

    /* Access modifiers changed, original: protected|final */
    public final csq a(cmg cmg, csq csq) {
        csq b = csq.b(csq);
        b.a(swz.class, this.d);
        b.a(swp.class, this.b);
        b.a(bbmz.class, this.a);
        b.a(syb.class, this.e);
        return b;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ cma g() {
        skc skc = (skc) super.g();
        cma cma = skc.c;
        skc.c = cma != null ? cma.g() : null;
        return skc;
    }
}

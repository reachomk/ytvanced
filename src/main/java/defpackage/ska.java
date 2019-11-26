package defpackage;

/* renamed from: ska */
final class ska extends cma {
    @cue(a = 13)
    public bbmz a;
    @cue(a = 13)
    public swp b;
    @cue(a = 10)
    public cma c;
    @cue(a = 13)
    public sns d;
    @cue(a = 13)
    public syb e;

    public ska() {
        super("ElementsRoot");
    }

    /* Access modifiers changed, original: protected|final */
    public final csq a(cmg cmg, csq csq) {
        csq b = csq.b(csq);
        b.a(sns.class, this.d);
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
        ska ska = (ska) super.g();
        cma cma = ska.c;
        ska.c = cma != null ? cma.g() : null;
        return ska;
    }
}

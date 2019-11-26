package defpackage;

/* renamed from: taj */
public final class taj extends cma {
    @cue(a = 13)
    public tao a;
    @cue(a = 14)
    private final tal b = new tal();

    public taj() {
        super("ElementDeferredLayout");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        try {
            cri.a = this.a.a(swk.i().a());
            this.b.a = (cma) cri.a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        cma cma = this.b.a;
        return cma != null ? cma.g() : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        ((tal) crh2).a = ((tal) crh).a;
    }
}

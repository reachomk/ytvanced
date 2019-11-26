package defpackage;

/* renamed from: akzt */
public final class akzt extends cma {
    @cue(a = 13)
    public akzz a;
    @cue(a = 14)
    private final akzv b = new akzv();

    private akzt() {
        super("YouTubeElement");
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
        ((akzv) crh2).a = ((akzv) crh).a;
    }

    public static akzs a(cmg cmg) {
        akzs akzs = new akzs();
        akzs.a(akzs, cmg, new akzt());
        return akzs;
    }
}

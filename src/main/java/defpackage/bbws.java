package defpackage;

/* renamed from: bbws */
public final class bbws extends bblt {
    private final bbmu a;
    private final bbnv b;

    public bbws(bbmu bbmu, bbnv bbnv) {
        this.a = bbmu;
        this.b = bbnv;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bblv bblv) {
        bbwr bbwr = new bbwr(bblv, this.b);
        bblv.a(bbwr);
        this.a.a(bbwr);
    }
}

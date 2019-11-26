package defpackage;

/* renamed from: bbui */
public final class bbui extends bblt implements bbpa {
    private final bbmm a;
    private final bbnv b;

    public bbui(bbmm bbmm, bbnv bbnv) {
        this.a = bbmm;
        this.b = bbnv;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bblv bblv) {
        this.a.b(new bbuh(bblv, this.b));
    }

    public final bbmi bJ_() {
        return new bbud(this.a, this.b);
    }
}

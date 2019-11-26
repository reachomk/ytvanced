package defpackage;

/* renamed from: bbrs */
public final class bbrs extends bblt {
    private final bbmg a;
    private final bbnv b;

    public bbrs(bbmg bbmg, bbnv bbnv) {
        this.a = bbmg;
        this.b = bbnv;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bblv bblv) {
        bbrr bbrr = new bbrr(bblv, this.b);
        bblv.a(bbrr);
        this.a.b(bbrr);
    }
}

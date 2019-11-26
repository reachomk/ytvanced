package defpackage;

/* renamed from: bbdt */
final class bbdt extends bbct {
    private final /* synthetic */ bbeb a;
    private final /* synthetic */ bbdr b;

    bbdt(bbdr bbdr, bbeb bbeb) {
        this.b = bbdr;
        this.a = bbeb;
    }

    /* Access modifiers changed, original: final */
    public final void a(bbcm bbcm) {
        this.b.b.s.remove(bbcm);
        batm.b(this.b.b.D.c, bbcm);
        this.b.b.k();
    }

    /* Access modifiers changed, original: final */
    public final void a(bass bass) {
        this.b.a(bass);
        bbdr bbdr = this.b;
        if (bbdr == bbdr.b.p) {
            bbdr.a.a(this.a, bass);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(bbcm bbcm) {
        this.b.b.N.a(bbcm, true);
    }

    /* Access modifiers changed, original: final */
    public final void c(bbcm bbcm) {
        this.b.b.N.a(bbcm, false);
    }
}

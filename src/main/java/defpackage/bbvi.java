package defpackage;

/* renamed from: bbvi */
public final class bbvi extends bbsp {
    private final bbmn b;
    private final int c;

    public bbvi(bbmm bbmm, bbmn bbmn, int i) {
        super(bbmm);
        this.b = bbmn;
        this.c = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmo bbmo) {
        bbmn bbmn = this.b;
        if (bbmn instanceof bbyd) {
            this.a.b(bbmo);
            return;
        }
        this.a.b(new bbvh(bbmo, bbmn.a(), this.c));
    }
}

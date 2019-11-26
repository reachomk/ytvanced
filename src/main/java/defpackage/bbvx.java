package defpackage;

/* renamed from: bbvx */
public final class bbvx extends bbsp {
    private final bbnv b;
    private final int c;

    public bbvx(bbmm bbmm, bbnv bbnv, int i) {
        super(bbmm);
        this.b = bbnv;
        this.c = i;
    }

    public final void a(bbmo bbmo) {
        if (!bbvr.a(this.a, bbmo, this.b)) {
            this.a.b(new bbvz(bbmo, this.b, this.c));
        }
    }
}

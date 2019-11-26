package defpackage;

/* renamed from: bbuc */
public final class bbuc extends bbsp {
    private final bbnv b;
    private final int c;
    private final int d;

    public bbuc(bbmm bbmm, bbnv bbnv, int i, int i2) {
        super(bbmm);
        this.b = bbnv;
        this.c = i;
        this.d = i2;
    }

    public final void a(bbmo bbmo) {
        if (!bbvr.a(this.a, bbmo, this.b)) {
            this.a.b(new bbue(bbmo, this.b, this.c, this.d));
        }
    }
}

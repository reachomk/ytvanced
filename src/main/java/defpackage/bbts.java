package defpackage;

/* renamed from: bbts */
public final class bbts extends bbsp {
    private final bbnw b;
    private final bbnw c;
    private final bbnp d;
    private final bbnp e;

    public bbts(bbmm bbmm, bbnw bbnw, bbnw bbnw2, bbnp bbnp, bbnp bbnp2) {
        super(bbmm);
        this.b = bbnw;
        this.c = bbnw2;
        this.d = bbnp;
        this.e = bbnp2;
    }

    public final void a(bbmo bbmo) {
        this.a.b(new bbtr(bbmo, this.b, this.c, this.d, this.e));
    }
}

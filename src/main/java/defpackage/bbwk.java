package defpackage;

/* renamed from: bbwk */
public final class bbwk extends bbsp {
    private final bbnr b;
    private final bbmm c;

    public bbwk(bbmm bbmm, bbnr bbnr, bbmm bbmm2) {
        super(bbmm);
        this.b = bbnr;
        this.c = bbmm2;
    }

    public final void a(bbmo bbmo) {
        bbzg bbzg = new bbzg(bbmo);
        bbnc bbwm = new bbwm(bbzg, this.b);
        bbzg.a(bbwm);
        this.c.b(new bbwj(bbwm));
        this.a.b(bbwm);
    }
}

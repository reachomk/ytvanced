package defpackage;

/* renamed from: bbta */
public final class bbta extends bbsp {
    private final bbnv b;
    private final int c;
    private final int d = 2;

    public final void a(bbmo bbmo) {
        if (!bbvr.a(this.a, bbmo, this.b)) {
            int i = this.d;
            boolean z = true;
            if (i == 1) {
                this.a.b(new bbtb(new bbzg(bbmo), this.b, this.c));
                return;
            }
            bbmm bbmm = this.a;
            bbnv bbnv = this.b;
            int i2 = this.c;
            if (i != 3) {
                z = false;
            }
            bbmm.b(new bbsz(bbmo, bbnv, i2, z));
        }
    }

    public bbta(bbmm bbmm, bbnv bbnv, int i) {
        super(bbmm);
        this.b = bbnv;
        this.c = Math.max(8, i);
    }
}

package defpackage;

/* renamed from: fhe */
final /* synthetic */ class fhe implements fgv {
    private final fhb a;
    private final fhh b;
    private final int c;
    private final fgs d;

    fhe(fhb fhb, fhh fhh, int i, fgs fgs) {
        this.a = fhb;
        this.b = fhh;
        this.c = i;
        this.d = fgs;
    }

    public final void a() {
        fhb fhb = this.a;
        fhh fhh = this.b;
        int i = this.c;
        fgs fgs = this.d;
        if (fhh.g != 2 && fhh.c.contains(fgs)) {
            int i2 = fhh.g;
            if (i2 != 1) {
                if (i2 == 3) {
                    if (!(fhh.f + 1 == i || i == 0 || i == 4)) {
                        return;
                    }
                }
                return;
            } else if (fhh.f + 1 != i) {
                return;
            }
            fhh.a(fgs);
            String.valueOf(fgs).length();
            if (!fhh.a()) {
                fhb.a.post(new fhf(fhb, i, fhh));
            }
        }
    }
}

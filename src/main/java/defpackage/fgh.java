package defpackage;

/* renamed from: fgh */
final /* synthetic */ class fgh implements fgv {
    private final fgc a;
    private final fgu b;
    private final int c;
    private final fgs d;

    fgh(fgc fgc, fgu fgu, int i, fgs fgs) {
        this.a = fgc;
        this.b = fgu;
        this.c = i;
        this.d = fgs;
    }

    public final void a() {
        fgc fgc = this.a;
        fgu fgu = this.b;
        int i = this.c;
        fgs fgs = this.d;
        if (fgu.e != 2 && fgu.c.contains(fgs)) {
            int i2 = fgu.e;
            if (i2 != 1) {
                if (i2 == 3) {
                    if (!(fgu.d + 1 == i || i == 0 || i == 4)) {
                        return;
                    }
                }
                return;
            } else if (fgu.d + 1 != i) {
                return;
            }
            fgu.a(fgs);
            String.valueOf(fgs).length();
            if (!fgu.a()) {
                fgc.a.post(new fgi(fgc, i, fgu));
            }
        }
    }
}

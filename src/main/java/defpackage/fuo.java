package defpackage;

/* renamed from: fuo */
final /* synthetic */ class fuo implements xar {
    private final fuj a;

    fuo(fuj fuj) {
        this.a = fuj;
    }

    public final void accept(Object obj) {
        fuj fuj = this.a;
        aaff aaff = (aaff) obj;
        ajrr ajrr = aaff.a;
        if (ajrr == null) {
            fuj.a.d();
        } else {
            acvx t = fuj.b.t();
            if (t != null) {
                t.a(ajrr.d);
            }
            ajru ajru = aaff.a.a;
            akbi akbi = ajru != null ? ajru.c : null;
            if (akbi != null) {
                kmc kmc = fuj.a;
                acvx t2 = fuj.b.t();
                if (kmc.a(akbi)) {
                    kmc.d();
                    return;
                }
                kmc.a(akbi, t2);
            }
        }
    }
}

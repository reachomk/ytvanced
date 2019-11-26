package defpackage;

/* renamed from: euz */
final /* synthetic */ class euz implements zn {
    private final eux a;

    euz(eux eux) {
        this.a = eux;
    }

    public final void a(Object obj) {
        eux eux = this.a;
        axxf axxf = (axxf) obj;
        if (!(eux.d == null || (axxf.a & 4) == 0)) {
            axxh axxh = axxf.d;
            if (axxh == null) {
                axxh = axxh.c;
            }
            if (axxh.a == 65153809) {
                axxh = axxf.d;
                if (axxh == null) {
                    axxh = axxh.c;
                }
                if (((axxh.a == 65153809 ? (aphg) axxh.b : aphg.s).a & 262144) != 0) {
                    aphg aphg;
                    acvx acvx = eux.d;
                    axxh axxh2 = axxf.d;
                    if (axxh2 == null) {
                        axxh2 = axxh.c;
                    }
                    if (axxh2.a == 65153809) {
                        aphg = (aphg) axxh2.b;
                    } else {
                        aphg = aphg.s;
                    }
                    acvx.a(3, new acvs(aphg.r), null);
                }
            }
        }
        if (eux.a.c()) {
            eux.a(axxf.b);
        }
    }
}

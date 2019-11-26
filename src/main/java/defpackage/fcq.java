package defpackage;

/* renamed from: fcq */
final class fcq implements albc {
    private final acvx a;
    private final xsc b;
    private final aaas c;
    private final albc d;
    private final auuc e;
    private long f;

    public fcq(aaas aaas, xsc xsc, acwa acwa, auuc auuc, acvx acvx, albc albc) {
        this.c = (aaas) amqw.a((Object) aaas);
        this.b = (xsc) amqw.a((Object) xsc);
        this.e = (auuc) amqw.a((Object) auuc);
        if (acvx == null) {
            acvx = acwa.t();
        }
        this.a = acvx;
        this.d = albc;
        this.f = 0;
    }

    private final void a(auue auue) {
        if (auue != null) {
            aphg aphg = auue.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 262144) != 0) {
                acvx acvx = this.a;
                aphg aphg2 = auue.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                acvx.a(aphg2.r.d(), null);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        albg albg = (albg) obj;
        albc albc = this.d;
        if (albc != null) {
            albc.a(albg, i);
        }
        if (this.f != 0) {
            long a = this.b.a();
            long j = this.f;
            auuc auuc = this.e;
            if (a - j >= ((long) auuc.o) && (auuc.a & 8192) != 0) {
                aaas aaas = this.c;
                apxu apxu = auuc.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
            this.f = 0;
        }
    }
}

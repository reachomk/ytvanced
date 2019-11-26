package defpackage;

/* renamed from: aleq */
public final class aleq extends aleg {
    private final aaas a;

    public aleq(alpo alpo, alel alel, aaas aaas) {
        super(alpo, alel);
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void c() {
        aphj aphj = ((aomb) this.d).j;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg;
        if ((aphj.a & 1) == 0) {
            aphj = ((aomb) this.d).g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj = ((aomb) this.d).g;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                a(aphg);
            }
            return;
        }
        aphj = ((aomb) this.d).j;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        a(aphg);
    }

    private final void a(aphg aphg) {
        int i = aphg.a;
        aaas aaas;
        apxu apxu;
        if ((i & 2048) != 0) {
            aaas = this.a;
            apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        } else if ((i & 4096) != 0) {
            aaas = this.a;
            apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}

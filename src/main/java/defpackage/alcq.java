package defpackage;

/* renamed from: alcq */
final class alcq implements albc {
    private final /* synthetic */ ayhz a;
    private final /* synthetic */ alcr b;

    alcq(alcr alcr, ayhz ayhz) {
        this.b = alcr;
        this.a = ayhz;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        apxu apxu = null;
        awok awok;
        awok awok2;
        if (i != 1) {
            awok = this.a.b;
            if (awok == null) {
                awok = awok.f;
            }
            if ((awok.a & 8) != 0) {
                awok2 = this.a.b;
                if (awok2 == null) {
                    awok2 = awok.f;
                }
                apxu = awok2.e;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            aaas aaas = this.b.a;
            apxu apxu2 = this.a.m;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas.a(apxu2, acwi.a(this.a));
        } else {
            awok = this.a.b;
            if (awok == null) {
                awok = awok.f;
            }
            if ((awok.a & 4) != 0) {
                awok2 = this.a.b;
                if (awok2 == null) {
                    awok2 = awok.f;
                }
                apxu = awok2.d;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
        }
        this.b.a.a(apxu, acwi.a(this.a));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ayhz ayhz = this.a;
        if ((ayhz.a & 1) != 0) {
            aaas aaas = this.b.a;
            awok awok = ayhz.b;
            if (awok == null) {
                awok = awok.f;
            }
            aabd.a(aaas, awok.c, acwi.a(this.a));
        }
    }
}

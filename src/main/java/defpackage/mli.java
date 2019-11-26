package defpackage;

/* renamed from: mli */
public final class mli implements abkh {
    private final zyw a;
    private final mlb b;

    public mli(zyw zyw, mlb mlb) {
        this.a = zyw;
        this.b = mlb;
    }

    public final void a(abkg abkg) {
        if (foh.C(this.a)) {
            atot atot = (atot) atou.d.createBuilder();
            boolean a = this.b.a();
            atot.copyOnWrite();
            atou atou = (atou) atot.instance;
            atou.a |= 1;
            atou.b = a;
            int b = this.b.b();
            atot.copyOnWrite();
            atou = (atou) atot.instance;
            atou.a |= 2;
            atou.c = b;
            abkg.q = (atou) ((anxl) atot.build());
        }
    }
}

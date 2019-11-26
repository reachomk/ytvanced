package defpackage;

import android.util.Rational;

/* renamed from: fki */
final /* synthetic */ class fki implements ajkk {
    private final fkj a;

    fki(fkj fkj) {
        this.a = fkj;
    }

    public final void a(int i, int i2) {
        fkj fkj = this.a;
        fkp f = fkj.f();
        Rational rational = new Rational(i, i2);
        if (!amqq.a(f.h, rational)) {
            f.j = true;
            f.h = rational;
        }
        fkj.f().a();
    }
}

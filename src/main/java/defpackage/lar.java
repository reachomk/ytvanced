package defpackage;

/* renamed from: lar */
public final class lar extends kzs {
    public lar(aaas aaas, xci xci, aaff aaff) {
        super(aaas, xci, aaff, aaff.a.c.e);
    }

    public final amuw a(amuw amuw) {
        aphj aphj = ((aqiy) this.a).c;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) == 0) {
            return amwp.a;
        }
        aaas aaas = this.e;
        aphj aphj2 = ((aqiy) this.a).c;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg aphg = aphj2.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        return amuw.a(new jfh(aaas, aphg));
    }

    public final CharSequence e() {
        arml arml;
        aqiy aqiy = (aqiy) this.a;
        if ((aqiy.a & 1) != 0) {
            arml = aqiy.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return xvd.a(ajqy.a(arml));
    }
}

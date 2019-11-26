package defpackage;

/* renamed from: aeno */
final class aeno implements aenl {
    private double a = -1.0d;

    aeno() {
    }

    public final double a() {
        return this.a;
    }

    public final void a(double d) {
        double d2 = this.a;
        if (d2 >= 0.0d) {
            this.a = (d2 * 0.8500000238418579d) + (d * 0.1499999761581421d);
        } else {
            this.a = d;
        }
    }
}

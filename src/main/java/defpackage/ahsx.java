package defpackage;

/* renamed from: ahsx */
public final class ahsx implements ahsv {
    public final double a() {
        return 1000.0d;
    }

    public final boolean b() {
        return true;
    }

    public final double a(double d) {
        double d2;
        d = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
        if (d > 0.5d) {
            d = Math.exp((d - 7.52071416d) / 0.17883277d) + 0.28466892d;
            d2 = 12.0d;
        } else {
            d *= d;
            d2 = 3.0d;
        }
        return d / d2;
    }

    public final double b(double d) {
        d = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
        return d > 0.08333333333333333d ? (Math.log((d * 12.0d) - 14.89059456d) * 0.17883277d) + 0.55991073d : Math.sqrt(d * 3.0d);
    }
}

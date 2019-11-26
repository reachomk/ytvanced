package defpackage;

/* renamed from: ahsz */
public final class ahsz implements ahsv {
    public final double a() {
        return 10000.0d;
    }

    public final boolean b() {
        return true;
    }

    public final double a(double d) {
        d = Math.pow(((Double) a.clamp(Double.valueOf(d))).doubleValue(), 0.012683313515655966d);
        return Math.pow(Math.max(0.0d, (-0.8359375d + d) / (18.8515625d - (d * 18.6875d))), 6.277394636015326d);
    }

    public final double b(double d) {
        d = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
        return Math.pow(((Math.pow(d, 0.1593017578125d) * 18.8515625d) + 0.8359375d) / ((Math.pow(d, 0.1593017578125d) * 18.6875d) + 1.0d), 78.84375d);
    }
}

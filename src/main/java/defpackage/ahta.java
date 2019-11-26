package defpackage;

/* renamed from: ahta */
public final /* synthetic */ class ahta implements ahte {
    private final ahsy a;
    private final double b;

    public ahta(ahsy ahsy, double d) {
        this.a = ahsy;
        this.b = d;
    }

    public final double a(int i, double d) {
        ahsy ahsy = this.a;
        double d2 = this.b;
        ahsv ahsv = ahsy.b;
        double d3 = (double) i;
        Double.isNaN(d3);
        return Double.min(1.0d, ahsv.b((d3 / d) * d2));
    }
}

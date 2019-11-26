package defpackage;

/* renamed from: ahtd */
final /* synthetic */ class ahtd implements ahte {
    private final ahth a;
    private final ahtc b;

    ahtd(ahth ahth, ahtc ahtc) {
        this.a = ahth;
        this.b = ahtc;
    }

    public final double a(int i, double d) {
        ahth ahth = this.a;
        ahtc ahtc = this.b;
        double d2 = (double) (((float) i) * 10000.0f);
        Double.isNaN(d2);
        float f = (float) (d2 / d);
        if (f < ahth.c) {
            f = ahth.a.a(f);
        } else {
            f = ahth.b.a(f);
        }
        return (double) (f / ahtc.e);
    }
}

package defpackage;

import android.util.Range;

/* renamed from: ahtb */
public final /* synthetic */ class ahtb implements ahte {
    private final ahsy a;

    public ahtb(ahsy ahsy) {
        this.a = ahsy;
    }

    public final double a(int i, double d) {
        ahsy ahsy = this.a;
        Range range = ahsy.h;
        ahsv ahsv = ahsy.a;
        double d2 = (double) i;
        Double.isNaN(d2);
        return ((Double) range.clamp(Double.valueOf(ahsv.a(d2 / d) * ahsy.a.a()))).doubleValue() / 10000.0d;
    }
}

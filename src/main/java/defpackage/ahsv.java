package defpackage;

import android.util.Range;

/* renamed from: ahsv */
public interface ahsv {
    public static final Range a;
    public static final Range b;

    static {
        Double valueOf = Double.valueOf(0.0d);
        a = new Range(valueOf, Double.valueOf(1.0d));
        b = new Range(valueOf, Double.valueOf(Double.MAX_VALUE));
    }

    double a();

    double a(double d);

    double b(double d);

    boolean b();
}

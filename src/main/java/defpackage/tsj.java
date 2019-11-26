package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: tsj */
public final class tsj {
    public final double a = 100.0d;
    public final double b = 18.0d;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public boolean k = true;
    public boolean l = false;
    public double m = 0.0d;
    private final double n = 0.005d;
    private final double o = 0.005d;

    public static boolean a(double d, double d2, double d3, double d4) {
        return d2 > 0.0d && (d3 < d4 ? d > d4 : d < d4);
    }

    public final tsj a(tsi tsi) {
        this.c.add(tsi);
        return this;
    }

    public final tsj a() {
        this.l = true;
        return this;
    }

    public final tsj a(double d) {
        if (d != this.f) {
            this.f = d;
            this.i = d;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                tsi tsi = (tsi) it.next();
                tsi.a(this);
                tsi.a(d);
            }
        }
        return this;
    }

    public final tsj b(double d) {
        if (d != this.j) {
            this.j = d;
            this.i = this.f;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((tsi) it.next()).a(this);
            }
        }
        return this;
    }

    public final boolean b() {
        boolean z = false;
        if (Math.abs(this.g) <= this.n) {
            if (Math.abs(this.j - this.f) <= this.o) {
                z = true;
            } else if (this.a != 0.0d) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }
}

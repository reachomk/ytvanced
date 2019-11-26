package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: cvg */
public final class cvg {
    private static int j;
    public cvi a;
    public final cvf b = new cvf();
    public final cvf c = new cvf();
    public final cvf d = new cvf();
    public double e;
    public double f;
    public boolean g = true;
    public double h = 0.0d;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    private final double k = 0.005d;
    private final double l = 0.005d;

    public cvg() {
        j++;
        a(cvi.c);
    }

    public final cvg a(cvi cvi) {
        if (cvi != null) {
            this.a = cvi;
            return this;
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    public final double a() {
        return this.b.a;
    }

    public final cvg a(double d) {
        if (this.f == d && b()) {
            return this;
        }
        this.e = a();
        this.f = d;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((cvh) it.next()).d();
        }
        return this;
    }

    public final boolean b() {
        boolean z = false;
        if (Math.abs(this.b.b) <= this.k) {
            if (Math.abs(this.f - this.b.a) <= this.l) {
                z = true;
            } else if (this.a.b != 0.0d) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }
}

package defpackage;

import java.util.Random;

/* renamed from: xsw */
public final class xsw {
    public final xsy a;
    public long b = 0;
    private final xsc c;
    private final Random d = new Random();
    private long e;

    public final boolean a() {
        long j = this.b;
        Object obj = null;
        if (j < this.a.c) {
            if (j == 0) {
                this.e = this.c.b();
            }
            double nextDouble = this.d.nextDouble();
            xsy xsy = this.a;
            nextDouble += 1.0d;
            double d = (double) xsy.a;
            Double.isNaN(d);
            j = Math.min((long) ((nextDouble * d) * Math.pow(xsy.e, (double) this.b)), this.a.b);
            long j2 = this.a.d;
            if (j2 >= 0) {
                j = Math.min(j, j2 - (this.c.b() - this.e));
            }
            if (j >= this.a.a) {
                obj = Long.valueOf(j);
            }
        }
        if (obj != null) {
            try {
                String.valueOf(obj).length();
                this.c.a(obj.longValue());
                this.b++;
                obj.longValue();
                return true;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                xtl.a("Thread interrupted", e);
            }
        }
        return false;
    }

    public final long b() {
        return this.b != 0 ? this.c.b() - this.e : 0;
    }

    /* synthetic */ xsw(xsy xsy, xsc xsc) {
        this.a = xsy;
        this.c = xsc;
    }
}

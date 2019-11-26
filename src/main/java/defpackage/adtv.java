package defpackage;

import java.util.concurrent.Executor;

/* renamed from: adtv */
public final class adtv implements adyb {
    private final adas a;
    private final adzb b;
    private final Executor c;
    private final xci d;
    private final acum e;

    public adtv(adas adas, adzb adzb, Executor executor, xci xci, acum acum) {
        this.a = adas;
        this.b = adzb;
        this.c = executor;
        this.d = xci;
        this.e = acum;
    }

    public final adxz a() {
        return new adyr(this.a, new adyw(this.b, this.c, this.d), this.b, this.e);
    }
}

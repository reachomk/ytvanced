package defpackage;

/* renamed from: acib */
public final class acib {
    public double a;
    public long b;
    public long c;
    private final double d;
    private int e;

    public acib() {
        this(10);
    }

    public acib(int i) {
        amqw.a(i > 0);
        this.d = (double) i;
        a();
    }

    public final void a() {
        this.a = 0.0d;
        this.e = 0;
        long nanoTime = System.nanoTime();
        this.b = nanoTime;
        this.c = nanoTime;
    }

    public final void a(double d) {
        this.c = System.nanoTime();
        int i = this.e;
        if (i == 0) {
            this.a = d;
        } else {
            double d2 = this.a;
            this.a = d2 + ((d - d2) / this.d);
        }
        this.e = i + 1;
    }
}

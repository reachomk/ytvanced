package defpackage;

/* renamed from: aevi */
public final class aevi {
    private int a = -1;
    private long b = -1;
    private long c = -1;
    private int d = -1;

    public aevi(aevj aevj) {
        this.a = aevj.a;
        this.b = aevj.b;
        this.c = aevj.c;
        this.d = aevj.d;
    }

    public final aevj a() {
        return new aevj(this.a, this.b, this.c, this.d);
    }

    public final aevi a(int i) {
        boolean z = true;
        if (i < 0 && i != -1) {
            z = false;
        }
        amqw.a(z);
        this.a = i;
        return this;
    }

    public final aevi a(long j) {
        boolean z = true;
        if (j < 0 && j != -1) {
            z = false;
        }
        amqw.a(z);
        this.c = j;
        return this;
    }

    public final aevi a(double d) {
        a((long) (d * 1000000.0d));
        return this;
    }

    public final aevi b(long j) {
        boolean z = true;
        if (j < 0 && j != -1) {
            z = false;
        }
        amqw.a(z);
        this.b = j;
        return this;
    }

    public final aevi b(int i) {
        boolean z = true;
        if (i < 0 && i != -1) {
            z = false;
        }
        amqw.a(z);
        this.d = i;
        return this;
    }

    public final aevi c(int i) {
        boolean z = true;
        amqw.a(i >= 0);
        if (this.c < 0) {
            z = false;
        }
        amqw.a(z);
        double d = (double) this.c;
        Double.isNaN(d);
        d /= 1000000.0d;
        double d2 = (double) i;
        Double.isNaN(d2);
        this.d = (int) ((d * d2) / 8.0d);
        return this;
    }
}

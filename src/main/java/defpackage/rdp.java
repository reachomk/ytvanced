package defpackage;

/* renamed from: rdp */
public abstract class rdp {
    private static volatile boolean d = false;
    public int a;
    public int b = 100;
    public rdr c;

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static rdp a(byte[] bArr, int i, int i2) {
        rds rds = new rds(bArr, i, i2);
        try {
            rds.c(i2);
            return rds;
        } catch (rfk e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int f(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a();

    public abstract rgh a(rgu rgu, reg reg);

    public abstract void a(int i);

    public abstract double b();

    public abstract boolean b(int i);

    public abstract float c();

    public abstract int c(int i);

    public abstract long d();

    public abstract void d(int i);

    public abstract long e();

    public abstract void e(int i);

    public abstract int f();

    public abstract long g();

    public abstract int h();

    public abstract boolean i();

    public abstract String j();

    public abstract String k();

    public abstract rdg l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract long s();

    public abstract boolean t();

    public abstract int u();

    private rdp() {
    }

    /* synthetic */ rdp(byte b) {
    }
}

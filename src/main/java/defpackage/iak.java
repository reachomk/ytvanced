package defpackage;

/* renamed from: iak */
final class iak implements iah {
    private static final iag a = new iag(4);
    private final int b;

    public final awbe a() {
        awbe a = a.a();
        int i = this.b;
        a.copyOnWrite();
        awbf awbf = (awbf) a.instance;
        if (i != 0) {
            awbf.a |= 16;
            awbf.f = i - 1;
            return a;
        }
        throw new NullPointerException();
    }

    iak(int i) {
        this.b = i;
    }
}
